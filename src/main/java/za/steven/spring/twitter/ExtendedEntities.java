
package za.steven.spring.twitter;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ExtendedEntities implements Serializable
{

    @SerializedName("media")
    @Expose
    private List<Medium__> media = null;
    private final static long serialVersionUID = -2446948965465351428L;

    public List<Medium__> getMedia() {
        return media;
    }

    public void setMedia(List<Medium__> media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("media", media).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(media).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtendedEntities) == false) {
            return false;
        }
        ExtendedEntities rhs = ((ExtendedEntities) other);
        return new EqualsBuilder().append(media, rhs.media).isEquals();
    }

}
