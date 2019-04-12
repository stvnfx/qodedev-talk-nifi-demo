
package za.steven.spring.twitter;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Sizes_ implements Serializable
{

    @SerializedName("thumb")
    @Expose
    private Thumb_ thumb;
    @SerializedName("medium")
    @Expose
    private Medium___ medium;
    @SerializedName("small")
    @Expose
    private Small_ small;
    @SerializedName("large")
    @Expose
    private Large_ large;
    private final static long serialVersionUID = 1275466569981220866L;

    public Thumb_ getThumb() {
        return thumb;
    }

    public void setThumb(Thumb_ thumb) {
        this.thumb = thumb;
    }

    public Medium___ getMedium() {
        return medium;
    }

    public void setMedium(Medium___ medium) {
        this.medium = medium;
    }

    public Small_ getSmall() {
        return small;
    }

    public void setSmall(Small_ small) {
        this.small = small;
    }

    public Large_ getLarge() {
        return large;
    }

    public void setLarge(Large_ large) {
        this.large = large;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("thumb", thumb).append("medium", medium).append("small", small).append("large", large).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(small).append(thumb).append(large).append(medium).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sizes_) == false) {
            return false;
        }
        Sizes_ rhs = ((Sizes_) other);
        return new EqualsBuilder().append(small, rhs.small).append(thumb, rhs.thumb).append(large, rhs.large).append(medium, rhs.medium).isEquals();
    }

}
