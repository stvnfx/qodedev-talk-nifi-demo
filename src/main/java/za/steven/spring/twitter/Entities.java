
package za.steven.spring.twitter;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Entities implements Serializable
{

    @SerializedName("hashtags")
    @Expose
    private List<Hashtag> hashtags = null;
    @SerializedName("urls")
    @Expose
    private List<Object> urls = null;
    @SerializedName("user_mentions")
    @Expose
    private List<Object> userMentions = null;
    @SerializedName("symbols")
    @Expose
    private List<Object> symbols = null;
    @SerializedName("media")
    @Expose
    private List<Medium> media = null;
    private final static long serialVersionUID = 9049034760276187270L;

    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getUrls() {
        return urls;
    }

    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    public List<Object> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public List<Medium> getMedia() {
        return media;
    }

    public void setMedia(List<Medium> media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("hashtags", hashtags).append("urls", urls).append("userMentions", userMentions).append("symbols", symbols).append("media", media).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(symbols).append(urls).append(hashtags).append(media).append(userMentions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entities) == false) {
            return false;
        }
        Entities rhs = ((Entities) other);
        return new EqualsBuilder().append(symbols, rhs.symbols).append(urls, rhs.urls).append(hashtags, rhs.hashtags).append(media, rhs.media).append(userMentions, rhs.userMentions).isEquals();
    }

}
