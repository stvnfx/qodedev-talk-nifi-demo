
package za.steven.spring.twitter;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class AdditionalMediaInfo implements Serializable
{

    @SerializedName("monetizable")
    @Expose
    private Boolean monetizable;
    private final static long serialVersionUID = 2091153124976976489L;

    public Boolean getMonetizable() {
        return monetizable;
    }

    public void setMonetizable(Boolean monetizable) {
        this.monetizable = monetizable;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("monetizable", monetizable).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(monetizable).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalMediaInfo) == false) {
            return false;
        }
        AdditionalMediaInfo rhs = ((AdditionalMediaInfo) other);
        return new EqualsBuilder().append(monetizable, rhs.monetizable).isEquals();
    }

}
