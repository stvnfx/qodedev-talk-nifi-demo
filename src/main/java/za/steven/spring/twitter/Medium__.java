
package za.steven.spring.twitter;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Medium__ implements Serializable
{

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("indices")
    @Expose
    private List<Long> indices = null;
    @SerializedName("additional_media_info")
    @Expose
    private AdditionalMediaInfo_ additionalMediaInfo;
    @SerializedName("media_url")
    @Expose
    private String mediaUrl;
    @SerializedName("media_url_https")
    @Expose
    private String mediaUrlHttps;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("display_url")
    @Expose
    private String displayUrl;
    @SerializedName("expanded_url")
    @Expose
    private String expandedUrl;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("video_info")
    @Expose
    private VideoInfo_ videoInfo;
    @SerializedName("sizes")
    @Expose
    private Sizes_ sizes;
    private final static long serialVersionUID = -6718182397238792679L;

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

    public List<Long> getIndices() {
        return indices;
    }

    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    public AdditionalMediaInfo_ getAdditionalMediaInfo() {
        return additionalMediaInfo;
    }

    public void setAdditionalMediaInfo(AdditionalMediaInfo_ additionalMediaInfo) {
        this.additionalMediaInfo = additionalMediaInfo;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getMediaUrlHttps() {
        return mediaUrlHttps;
    }

    public void setMediaUrlHttps(String mediaUrlHttps) {
        this.mediaUrlHttps = mediaUrlHttps;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public String getExpandedUrl() {
        return expandedUrl;
    }

    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VideoInfo_ getVideoInfo() {
        return videoInfo;
    }

    public void setVideoInfo(VideoInfo_ videoInfo) {
        this.videoInfo = videoInfo;
    }

    public Sizes_ getSizes() {
        return sizes;
    }

    public void setSizes(Sizes_ sizes) {
        this.sizes = sizes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("idStr", idStr).append("indices", indices).append("additionalMediaInfo", additionalMediaInfo).append("mediaUrl", mediaUrl).append("mediaUrlHttps", mediaUrlHttps).append("url", url).append("displayUrl", displayUrl).append("expandedUrl", expandedUrl).append("type", type).append("videoInfo", videoInfo).append("sizes", sizes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sizes).append(mediaUrl).append(videoInfo).append(additionalMediaInfo).append(type).append(url).append(mediaUrlHttps).append(idStr).append(displayUrl).append(id).append(indices).append(expandedUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Medium__) == false) {
            return false;
        }
        Medium__ rhs = ((Medium__) other);
        return new EqualsBuilder().append(sizes, rhs.sizes).append(mediaUrl, rhs.mediaUrl).append(videoInfo, rhs.videoInfo).append(additionalMediaInfo, rhs.additionalMediaInfo).append(type, rhs.type).append(url, rhs.url).append(mediaUrlHttps, rhs.mediaUrlHttps).append(idStr, rhs.idStr).append(displayUrl, rhs.displayUrl).append(id, rhs.id).append(indices, rhs.indices).append(expandedUrl, rhs.expandedUrl).isEquals();
    }

}
