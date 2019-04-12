
package za.steven.spring.twitter;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Hashtag implements Serializable
{

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("indices")
    @Expose
    private List<Long> indices = null;
    private final static long serialVersionUID = -348117805835696240L;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Long> getIndices() {
        return indices;
    }

    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("text", text).append("indices", indices).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(text).append(indices).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hashtag) == false) {
            return false;
        }
        Hashtag rhs = ((Hashtag) other);
        return new EqualsBuilder().append(text, rhs.text).append(indices, rhs.indices).isEquals();
    }

}
