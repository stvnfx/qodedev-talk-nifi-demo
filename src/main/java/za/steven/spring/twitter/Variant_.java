
package za.steven.spring.twitter;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Variant_ implements Serializable
{

    @SerializedName("bitrate")
    @Expose
    private Long bitrate;
    @SerializedName("content_type")
    @Expose
    private String contentType;
    @SerializedName("url")
    @Expose
    private String url;
    private final static long serialVersionUID = 3426683933121278358L;

    public Long getBitrate() {
        return bitrate;
    }

    public void setBitrate(Long bitrate) {
        this.bitrate = bitrate;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bitrate", bitrate).append("contentType", contentType).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bitrate).append(contentType).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Variant_) == false) {
            return false;
        }
        Variant_ rhs = ((Variant_) other);
        return new EqualsBuilder().append(bitrate, rhs.bitrate).append(contentType, rhs.contentType).append(url, rhs.url).isEquals();
    }

}
