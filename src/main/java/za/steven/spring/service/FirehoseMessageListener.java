package za.steven.spring.service;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import za.steven.spring.EventBusFactory;
import za.steven.spring.event.UpdateDevTalkEvent;
import za.steven.spring.event.UpdateFirehoseEvent;
import za.steven.spring.event.UpdateRestFirehoseEvent;
import za.steven.spring.twitter.TwitterMessage;

import java.util.Base64;

@Service
public class FirehoseMessageListener {
    private static final Logger log = LoggerFactory.getLogger(FirehoseMessageListener.class);

    @RabbitListener(queues = "firehose")
    public void receiveMessage(final Message message) {
        try {
            TwitterMessage twitterMessage = new Gson().fromJson(new String(message.getBody()), TwitterMessage.class);
            log.info("Received message as firehose: {}", twitterMessage.getUser().getName());
            EventBusFactory.getEventBus().post(new UpdateFirehoseEvent(twitterMessage));
        } catch (Exception e) {
            log.info("Received message as firehose: {}", new String(message.getBody()));
        }
    }

    @RabbitListener(queues = "qodedevtalk")
    public void receiveMessageDevTalk(final Message message) {
        try {
            TwitterMessage twitterMessage = new Gson().fromJson(new String(message.getBody()), TwitterMessage.class);
            log.info("Received message as devtalk: {}", twitterMessage.getUser().getName());
            EventBusFactory.getEventBus().post(new UpdateDevTalkEvent(twitterMessage));
        } catch (Exception e) {
            log.info("Received message as devtalk: {}", new String(message.getBody()));
        }
    }
}
