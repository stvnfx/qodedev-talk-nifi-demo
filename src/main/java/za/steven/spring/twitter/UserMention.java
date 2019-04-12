
package za.steven.spring.twitter;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class UserMention implements Serializable
{

    @SerializedName("screen_name")
    @Expose
    private String screenName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("indices")
    @Expose
    private List<Long> indices = null;
    private final static long serialVersionUID = -6047911734806305960L;

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Long> getIndices() {
        return indices;
    }

    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("screenName", screenName).append("name", name).append("id", id).append("idStr", idStr).append("indices", indices).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(name).append(screenName).append(indices).append(idStr).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserMention) == false) {
            return false;
        }
        UserMention rhs = ((UserMention) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(screenName, rhs.screenName).append(indices, rhs.indices).append(idStr, rhs.idStr).isEquals();
    }

}
