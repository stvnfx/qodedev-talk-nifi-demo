
package za.steven.spring.twitter;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Entities__ implements Serializable
{

    @SerializedName("hashtags")
    @Expose
    private List<Hashtag__> hashtags = null;
    @SerializedName("urls")
    @Expose
    private List<Object> urls = null;
    @SerializedName("user_mentions")
    @Expose
    private List<UserMention> userMentions = null;
    @SerializedName("symbols")
    @Expose
    private List<Object> symbols = null;
    private final static long serialVersionUID = 998174093857341163L;

    public List<Hashtag__> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag__> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getUrls() {
        return urls;
    }

    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    public List<UserMention> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<UserMention> userMentions) {
        this.userMentions = userMentions;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("hashtags", hashtags).append("urls", urls).append("userMentions", userMentions).append("symbols", symbols).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(symbols).append(urls).append(hashtags).append(userMentions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entities__) == false) {
            return false;
        }
        Entities__ rhs = ((Entities__) other);
        return new EqualsBuilder().append(symbols, rhs.symbols).append(urls, rhs.urls).append(hashtags, rhs.hashtags).append(userMentions, rhs.userMentions).isEquals();
    }

}
