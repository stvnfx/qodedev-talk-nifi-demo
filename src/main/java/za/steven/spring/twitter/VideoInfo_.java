
package za.steven.spring.twitter;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class VideoInfo_ implements Serializable
{

    @SerializedName("aspect_ratio")
    @Expose
    private List<Long> aspectRatio = null;
    @SerializedName("duration_millis")
    @Expose
    private Long durationMillis;
    @SerializedName("variants")
    @Expose
    private List<Variant_> variants = null;
    private final static long serialVersionUID = 8253923530042633690L;

    public List<Long> getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(List<Long> aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public Long getDurationMillis() {
        return durationMillis;
    }

    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    public List<Variant_> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant_> variants) {
        this.variants = variants;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("aspectRatio", aspectRatio).append("durationMillis", durationMillis).append("variants", variants).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(variants).append(aspectRatio).append(durationMillis).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VideoInfo_) == false) {
            return false;
        }
        VideoInfo_ rhs = ((VideoInfo_) other);
        return new EqualsBuilder().append(variants, rhs.variants).append(aspectRatio, rhs.aspectRatio).append(durationMillis, rhs.durationMillis).isEquals();
    }

}
