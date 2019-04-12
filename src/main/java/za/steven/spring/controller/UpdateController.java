package za.steven.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.steven.spring.EventBusFactory;
import za.steven.spring.event.*;

@RestController
@RequestMapping("/api")
public class UpdateController {
    @RequestMapping(value = "/updateFirehose", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean updateFirehose() {
        EventBusFactory.getEventBus().post(new UpdateRestFirehoseEvent());
        return true;
    }

    @RequestMapping(value = "/updateDevtalk", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean updateDevTalk() {
        EventBusFactory.getEventBus().post(new UpdateRestDevTalkEvent());
        return true;
    }

    @RequestMapping(value = "/updateFailure", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean updateFailure() {
        EventBusFactory.getEventBus().post(new UpdateFailureEvent());
        return true;
    }
}
