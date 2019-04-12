
package za.steven.spring.twitter;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class User_ implements Serializable
{

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("screen_name")
    @Expose
    private String screenName;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("translator_type")
    @Expose
    private String translatorType;
    @SerializedName("protected")
    @Expose
    private Boolean _protected;
    @SerializedName("verified")
    @Expose
    private Boolean verified;
    @SerializedName("followers_count")
    @Expose
    private Long followersCount;
    @SerializedName("friends_count")
    @Expose
    private Long friendsCount;
    @SerializedName("listed_count")
    @Expose
    private Long listedCount;
    @SerializedName("favourites_count")
    @Expose
    private Long favouritesCount;
    @SerializedName("statuses_count")
    @Expose
    private Long statusesCount;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("utc_offset")
    @Expose
    private Object utcOffset;
    @SerializedName("time_zone")
    @Expose
    private Object timeZone;
    @SerializedName("geo_enabled")
    @Expose
    private Boolean geoEnabled;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("contributors_enabled")
    @Expose
    private Boolean contributorsEnabled;
    @SerializedName("is_translator")
    @Expose
    private Boolean isTranslator;
    @SerializedName("profile_background_color")
    @Expose
    private String profileBackgroundColor;
    @SerializedName("profile_background_image_url")
    @Expose
    private String profileBackgroundImageUrl;
    @SerializedName("profile_background_image_url_https")
    @Expose
    private String profileBackgroundImageUrlHttps;
    @SerializedName("profile_background_tile")
    @Expose
    private Boolean profileBackgroundTile;
    @SerializedName("profile_link_color")
    @Expose
    private String profileLinkColor;
    @SerializedName("profile_sidebar_border_color")
    @Expose
    private String profileSidebarBorderColor;
    @SerializedName("profile_sidebar_fill_color")
    @Expose
    private String profileSidebarFillColor;
    @SerializedName("profile_text_color")
    @Expose
    private String profileTextColor;
    @SerializedName("profile_use_background_image")
    @Expose
    private Boolean profileUseBackgroundImage;
    @SerializedName("profile_image_url")
    @Expose
    private String profileImageUrl;
    @SerializedName("profile_image_url_https")
    @Expose
    private String profileImageUrlHttps;
    @SerializedName("profile_banner_url")
    @Expose
    private String profileBannerUrl;
    @SerializedName("default_profile")
    @Expose
    private Boolean defaultProfile;
    @SerializedName("default_profile_image")
    @Expose
    private Boolean defaultProfileImage;
    @SerializedName("following")
    @Expose
    private Object following;
    @SerializedName("follow_request_sent")
    @Expose
    private Object followRequestSent;
    @SerializedName("notifications")
    @Expose
    private Object notifications;
    private final static long serialVersionUID = -7623905741935490957L;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTranslatorType() {
        return translatorType;
    }

    public void setTranslatorType(String translatorType) {
        this.translatorType = translatorType;
    }

    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Long getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
    }

    public Long getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(Long friendsCount) {
        this.friendsCount = friendsCount;
    }

    public Long getListedCount() {
        return listedCount;
    }

    public void setListedCount(Long listedCount) {
        this.listedCount = listedCount;
    }

    public Long getFavouritesCount() {
        return favouritesCount;
    }

    public void setFavouritesCount(Long favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public Long getStatusesCount() {
        return statusesCount;
    }

    public void setStatusesCount(Long statusesCount) {
        this.statusesCount = statusesCount;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Object getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(Object utcOffset) {
        this.utcOffset = utcOffset;
    }

    public Object getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(Object timeZone) {
        this.timeZone = timeZone;
    }

    public Boolean getGeoEnabled() {
        return geoEnabled;
    }

    public void setGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Boolean getContributorsEnabled() {
        return contributorsEnabled;
    }

    public void setContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    public Boolean getIsTranslator() {
        return isTranslator;
    }

    public void setIsTranslator(Boolean isTranslator) {
        this.isTranslator = isTranslator;
    }

    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    public Boolean getProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    public void setProfileBackgroundTile(Boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    public String getProfileTextColor() {
        return profileTextColor;
    }

    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    public Boolean getProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    public String getProfileBannerUrl() {
        return profileBannerUrl;
    }

    public void setProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
    }

    public Boolean getDefaultProfile() {
        return defaultProfile;
    }

    public void setDefaultProfile(Boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    public Boolean getDefaultProfileImage() {
        return defaultProfileImage;
    }

    public void setDefaultProfileImage(Boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    public Object getFollowing() {
        return following;
    }

    public void setFollowing(Object following) {
        this.following = following;
    }

    public Object getFollowRequestSent() {
        return followRequestSent;
    }

    public void setFollowRequestSent(Object followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    public Object getNotifications() {
        return notifications;
    }

    public void setNotifications(Object notifications) {
        this.notifications = notifications;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("idStr", idStr).append("name", name).append("screenName", screenName).append("location", location).append("url", url).append("description", description).append("translatorType", translatorType).append("_protected", _protected).append("verified", verified).append("followersCount", followersCount).append("friendsCount", friendsCount).append("listedCount", listedCount).append("favouritesCount", favouritesCount).append("statusesCount", statusesCount).append("createdAt", createdAt).append("utcOffset", utcOffset).append("timeZone", timeZone).append("geoEnabled", geoEnabled).append("lang", lang).append("contributorsEnabled", contributorsEnabled).append("isTranslator", isTranslator).append("profileBackgroundColor", profileBackgroundColor).append("profileBackgroundImageUrl", profileBackgroundImageUrl).append("profileBackgroundImageUrlHttps", profileBackgroundImageUrlHttps).append("profileBackgroundTile", profileBackgroundTile).append("profileLinkColor", profileLinkColor).append("profileSidebarBorderColor", profileSidebarBorderColor).append("profileSidebarFillColor", profileSidebarFillColor).append("profileTextColor", profileTextColor).append("profileUseBackgroundImage", profileUseBackgroundImage).append("profileImageUrl", profileImageUrl).append("profileImageUrlHttps", profileImageUrlHttps).append("profileBannerUrl", profileBannerUrl).append("defaultProfile", defaultProfile).append("defaultProfileImage", defaultProfileImage).append("following", following).append("followRequestSent", followRequestSent).append("notifications", notifications).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isTranslator).append(friendsCount).append(profileUseBackgroundImage).append(profileBackgroundColor).append(followRequestSent).append(location).append(profileBannerUrl).append(favouritesCount).append(screenName).append(profileImageUrl).append(timeZone).append(profileSidebarBorderColor).append(defaultProfileImage).append(lang).append(id).append(following).append(profileSidebarFillColor).append(createdAt).append(verified).append(description).append(name).append(contributorsEnabled).append(profileBackgroundImageUrlHttps).append(profileImageUrlHttps).append(geoEnabled).append(listedCount).append(_protected).append(url).append(idStr).append(profileBackgroundTile).append(profileLinkColor).append(translatorType).append(notifications).append(utcOffset).append(followersCount).append(profileTextColor).append(profileBackgroundImageUrl).append(statusesCount).append(defaultProfile).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User_) == false) {
            return false;
        }
        User_ rhs = ((User_) other);
        return new EqualsBuilder().append(isTranslator, rhs.isTranslator).append(friendsCount, rhs.friendsCount).append(profileUseBackgroundImage, rhs.profileUseBackgroundImage).append(profileBackgroundColor, rhs.profileBackgroundColor).append(followRequestSent, rhs.followRequestSent).append(location, rhs.location).append(profileBannerUrl, rhs.profileBannerUrl).append(favouritesCount, rhs.favouritesCount).append(screenName, rhs.screenName).append(profileImageUrl, rhs.profileImageUrl).append(timeZone, rhs.timeZone).append(profileSidebarBorderColor, rhs.profileSidebarBorderColor).append(defaultProfileImage, rhs.defaultProfileImage).append(lang, rhs.lang).append(id, rhs.id).append(following, rhs.following).append(profileSidebarFillColor, rhs.profileSidebarFillColor).append(createdAt, rhs.createdAt).append(verified, rhs.verified).append(description, rhs.description).append(name, rhs.name).append(contributorsEnabled, rhs.contributorsEnabled).append(profileBackgroundImageUrlHttps, rhs.profileBackgroundImageUrlHttps).append(profileImageUrlHttps, rhs.profileImageUrlHttps).append(geoEnabled, rhs.geoEnabled).append(listedCount, rhs.listedCount).append(_protected, rhs._protected).append(url, rhs.url).append(idStr, rhs.idStr).append(profileBackgroundTile, rhs.profileBackgroundTile).append(profileLinkColor, rhs.profileLinkColor).append(translatorType, rhs.translatorType).append(notifications, rhs.notifications).append(utcOffset, rhs.utcOffset).append(followersCount, rhs.followersCount).append(profileTextColor, rhs.profileTextColor).append(profileBackgroundImageUrl, rhs.profileBackgroundImageUrl).append(statusesCount, rhs.statusesCount).append(defaultProfile, rhs.defaultProfile).isEquals();
    }

}
