
package za.steven.spring.twitter;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ExtendedTweet implements Serializable
{

    @SerializedName("full_text")
    @Expose
    private String fullText;
    @SerializedName("display_text_range")
    @Expose
    private List<Long> displayTextRange = null;
    @SerializedName("entities")
    @Expose
    private Entities entities;
    @SerializedName("extended_entities")
    @Expose
    private ExtendedEntities extendedEntities;
    private final static long serialVersionUID = -5854928103979506187L;

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public List<Long> getDisplayTextRange() {
        return displayTextRange;
    }

    public void setDisplayTextRange(List<Long> displayTextRange) {
        this.displayTextRange = displayTextRange;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public ExtendedEntities getExtendedEntities() {
        return extendedEntities;
    }

    public void setExtendedEntities(ExtendedEntities extendedEntities) {
        this.extendedEntities = extendedEntities;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fullText", fullText).append("displayTextRange", displayTextRange).append("entities", entities).append("extendedEntities", extendedEntities).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fullText).append(displayTextRange).append(extendedEntities).append(entities).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtendedTweet) == false) {
            return false;
        }
        ExtendedTweet rhs = ((ExtendedTweet) other);
        return new EqualsBuilder().append(fullText, rhs.fullText).append(displayTextRange, rhs.displayTextRange).append(extendedEntities, rhs.extendedEntities).append(entities, rhs.entities).isEquals();
    }

}
