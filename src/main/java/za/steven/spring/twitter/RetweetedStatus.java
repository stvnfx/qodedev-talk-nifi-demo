
package za.steven.spring.twitter;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class RetweetedStatus implements Serializable
{

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("display_text_range")
    @Expose
    private List<Long> displayTextRange = null;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("truncated")
    @Expose
    private Boolean truncated;
    @SerializedName("in_reply_to_status_id")
    @Expose
    private Object inReplyToStatusId;
    @SerializedName("in_reply_to_status_id_str")
    @Expose
    private Object inReplyToStatusIdStr;
    @SerializedName("in_reply_to_user_id")
    @Expose
    private Object inReplyToUserId;
    @SerializedName("in_reply_to_user_id_str")
    @Expose
    private Object inReplyToUserIdStr;
    @SerializedName("in_reply_to_screen_name")
    @Expose
    private Object inReplyToScreenName;
    @SerializedName("user")
    @Expose
    private User_ user;
    @SerializedName("geo")
    @Expose
    private Object geo;
    @SerializedName("coordinates")
    @Expose
    private Object coordinates;
    @SerializedName("place")
    @Expose
    private Object place;
    @SerializedName("contributors")
    @Expose
    private Object contributors;
    @SerializedName("is_quote_status")
    @Expose
    private Boolean isQuoteStatus;
    @SerializedName("extended_tweet")
    @Expose
    private ExtendedTweet extendedTweet;
    @SerializedName("quote_count")
    @Expose
    private Long quoteCount;
    @SerializedName("reply_count")
    @Expose
    private Long replyCount;
    @SerializedName("retweet_count")
    @Expose
    private Long retweetCount;
    @SerializedName("favorite_count")
    @Expose
    private Long favoriteCount;
    @SerializedName("entities")
    @Expose
    private Entities_ entities;
    @SerializedName("favorited")
    @Expose
    private Boolean favorited;
    @SerializedName("retweeted")
    @Expose
    private Boolean retweeted;
    @SerializedName("possibly_sensitive")
    @Expose
    private Boolean possiblySensitive;
    @SerializedName("filter_level")
    @Expose
    private String filterLevel;
    @SerializedName("lang")
    @Expose
    private String lang;
    private final static long serialVersionUID = 6074730952535789024L;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Long> getDisplayTextRange() {
        return displayTextRange;
    }

    public void setDisplayTextRange(List<Long> displayTextRange) {
        this.displayTextRange = displayTextRange;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public User_ getUser() {
        return user;
    }

    public void setUser(User_ user) {
        this.user = user;
    }

    public Object getGeo() {
        return geo;
    }

    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public Object getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public Object getPlace() {
        return place;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public Object getContributors() {
        return contributors;
    }

    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    public Boolean getIsQuoteStatus() {
        return isQuoteStatus;
    }

    public void setIsQuoteStatus(Boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
    }

    public ExtendedTweet getExtendedTweet() {
        return extendedTweet;
    }

    public void setExtendedTweet(ExtendedTweet extendedTweet) {
        this.extendedTweet = extendedTweet;
    }

    public Long getQuoteCount() {
        return quoteCount;
    }

    public void setQuoteCount(Long quoteCount) {
        this.quoteCount = quoteCount;
    }

    public Long getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Long replyCount) {
        this.replyCount = replyCount;
    }

    public Long getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(Long retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Long getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Entities_ getEntities() {
        return entities;
    }

    public void setEntities(Entities_ entities) {
        this.entities = entities;
    }

    public Boolean getFavorited() {
        return favorited;
    }

    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public Boolean getRetweeted() {
        return retweeted;
    }

    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    public Boolean getPossiblySensitive() {
        return possiblySensitive;
    }

    public void setPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    public String getFilterLevel() {
        return filterLevel;
    }

    public void setFilterLevel(String filterLevel) {
        this.filterLevel = filterLevel;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("createdAt", createdAt).append("id", id).append("idStr", idStr).append("text", text).append("displayTextRange", displayTextRange).append("source", source).append("truncated", truncated).append("inReplyToStatusId", inReplyToStatusId).append("inReplyToStatusIdStr", inReplyToStatusIdStr).append("inReplyToUserId", inReplyToUserId).append("inReplyToUserIdStr", inReplyToUserIdStr).append("inReplyToScreenName", inReplyToScreenName).append("user", user).append("geo", geo).append("coordinates", coordinates).append("place", place).append("contributors", contributors).append("isQuoteStatus", isQuoteStatus).append("extendedTweet", extendedTweet).append("quoteCount", quoteCount).append("replyCount", replyCount).append("retweetCount", retweetCount).append("favoriteCount", favoriteCount).append("entities", entities).append("favorited", favorited).append("retweeted", retweeted).append("possiblySensitive", possiblySensitive).append("filterLevel", filterLevel).append("lang", lang).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(retweeted).append(replyCount).append(inReplyToUserIdStr).append(retweetCount).append(quoteCount).append(truncated).append(lang).append(id).append(inReplyToStatusIdStr).append(createdAt).append(place).append(coordinates).append(contributors).append(text).append(filterLevel).append(geo).append(inReplyToScreenName).append(extendedTweet).append(entities).append(possiblySensitive).append(idStr).append(inReplyToStatusId).append(favoriteCount).append(source).append(displayTextRange).append(favorited).append(inReplyToUserId).append(user).append(isQuoteStatus).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RetweetedStatus) == false) {
            return false;
        }
        RetweetedStatus rhs = ((RetweetedStatus) other);
        return new EqualsBuilder().append(retweeted, rhs.retweeted).append(replyCount, rhs.replyCount).append(inReplyToUserIdStr, rhs.inReplyToUserIdStr).append(retweetCount, rhs.retweetCount).append(quoteCount, rhs.quoteCount).append(truncated, rhs.truncated).append(lang, rhs.lang).append(id, rhs.id).append(inReplyToStatusIdStr, rhs.inReplyToStatusIdStr).append(createdAt, rhs.createdAt).append(place, rhs.place).append(coordinates, rhs.coordinates).append(contributors, rhs.contributors).append(text, rhs.text).append(filterLevel, rhs.filterLevel).append(geo, rhs.geo).append(inReplyToScreenName, rhs.inReplyToScreenName).append(extendedTweet, rhs.extendedTweet).append(entities, rhs.entities).append(possiblySensitive, rhs.possiblySensitive).append(idStr, rhs.idStr).append(inReplyToStatusId, rhs.inReplyToStatusId).append(favoriteCount, rhs.favoriteCount).append(source, rhs.source).append(displayTextRange, rhs.displayTextRange).append(favorited, rhs.favorited).append(inReplyToUserId, rhs.inReplyToUserId).append(user, rhs.user).append(isQuoteStatus, rhs.isQuoteStatus).isEquals();
    }

}
