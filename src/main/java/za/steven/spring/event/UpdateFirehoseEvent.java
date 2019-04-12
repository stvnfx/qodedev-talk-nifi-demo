package za.steven.spring.event;

import za.steven.spring.twitter.TwitterMessage;

public class UpdateFirehoseEvent {
    TwitterMessage twitterMessage;

    public UpdateFirehoseEvent(TwitterMessage twitterMessage) {
        this.twitterMessage = twitterMessage;
    }

    public TwitterMessage getTwitterMessage() {
        return twitterMessage;
    }

    public void setTwitterMessage(TwitterMessage twitterMessage) {
        this.twitterMessage = twitterMessage;
    }
}
