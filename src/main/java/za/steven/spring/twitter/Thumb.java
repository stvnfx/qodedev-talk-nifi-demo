
package za.steven.spring.twitter;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Thumb implements Serializable
{

    @SerializedName("w")
    @Expose
    private Long w;
    @SerializedName("h")
    @Expose
    private Long h;
    @SerializedName("resize")
    @Expose
    private String resize;
    private final static long serialVersionUID = 5065462330324777477L;

    public Long getW() {
        return w;
    }

    public void setW(Long w) {
        this.w = w;
    }

    public Long getH() {
        return h;
    }

    public void setH(Long h) {
        this.h = h;
    }

    public String getResize() {
        return resize;
    }

    public void setResize(String resize) {
        this.resize = resize;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("w", w).append("h", h).append("resize", resize).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(w).append(resize).append(h).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Thumb) == false) {
            return false;
        }
        Thumb rhs = ((Thumb) other);
        return new EqualsBuilder().append(w, rhs.w).append(resize, rhs.resize).append(h, rhs.h).isEquals();
    }

}
