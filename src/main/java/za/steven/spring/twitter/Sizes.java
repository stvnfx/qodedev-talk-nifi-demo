
package za.steven.spring.twitter;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Sizes implements Serializable
{

    @SerializedName("thumb")
    @Expose
    private Thumb thumb;
    @SerializedName("medium")
    @Expose
    private Medium_ medium;
    @SerializedName("small")
    @Expose
    private Small small;
    @SerializedName("large")
    @Expose
    private Large large;
    private final static long serialVersionUID = 6658425731353352671L;

    public Thumb getThumb() {
        return thumb;
    }

    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

    public Medium_ getMedium() {
        return medium;
    }

    public void setMedium(Medium_ medium) {
        this.medium = medium;
    }

    public Small getSmall() {
        return small;
    }

    public void setSmall(Small small) {
        this.small = small;
    }

    public Large getLarge() {
        return large;
    }

    public void setLarge(Large large) {
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
        if ((other instanceof Sizes) == false) {
            return false;
        }
        Sizes rhs = ((Sizes) other);
        return new EqualsBuilder().append(small, rhs.small).append(thumb, rhs.thumb).append(large, rhs.large).append(medium, rhs.medium).isEquals();
    }

}
