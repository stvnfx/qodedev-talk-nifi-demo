package za.steven.spring.event;

import za.steven.spring.twitter.TwitterMessage;

public class UpdateDevTalkEvent {
    TwitterMessage twitterMessage;

    public UpdateDevTalkEvent(TwitterMessage twitterMessage) {
        this.twitterMessage = twitterMessage;
    }

    public TwitterMessage getTwitterMessage() {
        return twitterMessage;
    }

    public void setTwitterMessage(TwitterMessage twitterMessage) {
        this.twitterMessage = twitterMessage;
    }
}
