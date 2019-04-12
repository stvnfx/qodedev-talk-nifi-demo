package za.steven.spring;

import com.google.common.eventbus.Subscribe;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import za.steven.spring.event.*;
import za.steven.spring.twitter.TwitterMessage;

import java.util.ArrayList;
import java.util.List;

@Route
@PWA(name = "Apache Nifi with Vaadin Flow & Spring", shortName = "Devtalkdemo")
@Push
@Theme( value = Lumo.class, variant = Lumo.DARK)
public class MainView extends VerticalLayout {

    Grid<TwitterMessage> gridFirehose = new Grid<>();
    Grid<TwitterMessage> gridDevTalk = new Grid<>();

    private List<TwitterMessage> twitterMessagesFirehose = new ArrayList<>();
    private List<TwitterMessage> twitterMessagesDevTalk = new ArrayList<>();

    private UI ui;

    public MainView(@Autowired MessageBean bean) {
        add(buildLayout());
    }

    private Component buildLayout() {
        VerticalLayout layout = new VerticalLayout();
        gridFirehose.addColumn(TwitterMessage -> TwitterMessage.getUser().getName()).setHeader("User").setWidth("50px");
        gridFirehose.addColumn(TwitterMessage -> TwitterMessage.getText()).setHeader("Message");
        gridFirehose.setItems(twitterMessagesFirehose);

        gridDevTalk.addColumn(TwitterMessage -> TwitterMessage.getUser().getName()).setHeader("User").setWidth("50px");
        gridDevTalk.addColumn(TwitterMessage -> TwitterMessage.getText()).setHeader("Message");
        gridDevTalk.setItems(twitterMessagesDevTalk);

        layout.add(gridFirehose);
        layout.add(gridDevTalk);

        return layout;
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        this.ui = attachEvent.getUI();
        EventBusFactory.getEventBus().register(this);
    }

    @Subscribe
    public void firehoseEvent(UpdateFirehoseEvent event) {
        ui.access(() -> {
            twitterMessagesFirehose.add(event.getTwitterMessage());
            gridFirehose.getDataProvider().refreshAll();
        });
    }

    @Subscribe
    public void firehoseRestEvent(UpdateRestFirehoseEvent event) {
        ui.access(() -> {
            Notification.show("Nifi Firehose Complete Event").setPosition(Notification.Position.BOTTOM_END);
        });
    }

    @Subscribe
    public void devtalkEvent(UpdateDevTalkEvent event) {
        ui.access(() -> {
            twitterMessagesDevTalk.add(event.getTwitterMessage());
            gridDevTalk.getDataProvider().refreshAll();
            Notification.show("Nifi #qodedevtalk Complete Event").setPosition(Notification.Position.BOTTOM_START);
        });
    }

    @Subscribe
    public void devtalkRestEvent(UpdateRestDevTalkEvent event) {
        ui.access(() -> {
            Notification.show("Nifi #qodedevtalk Complete Event").setPosition(Notification.Position.BOTTOM_END);
        });
    }

    @Subscribe
    public void updateFailure(UpdateFailureEvent event) {
        ui.access(() -> {
            Notification.show("Some sort of failure").setPosition(Notification.Position.MIDDLE);
        });
    }
}
