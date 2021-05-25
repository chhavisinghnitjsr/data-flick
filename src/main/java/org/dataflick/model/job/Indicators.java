package org.dataflick.model.job;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "group"
})
@Generated("jsonschema2pojo")
public class Indicators {

    @JsonProperty("name")
    private List<Object> name = new ArrayList<Object>();
    @JsonProperty("group")
    private List<Object> group = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Indicators() {
    }

    /**
     * @param name
     * @param group
     */
    public Indicators(List<Object> name, List<Object> group) {
        super();
        this.name = name;
        this.group = group;
    }

    @JsonProperty("name")
    public List<Object> getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(List<Object> name) {
        this.name = name;
    }

    public Indicators withName(List<Object> name) {
        this.name = name;
        return this;
    }

    @JsonProperty("group")
    public List<Object> getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(List<Object> group) {
        this.group = group;
    }

    public Indicators withGroup(List<Object> group) {
        this.group = group;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Indicators withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Indicators.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null) ? "<null>" : this.group));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.group == null) ? 0 : this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Indicators) == false) {
            return false;
        }
        Indicators rhs = ((Indicators) other);
        return ((((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.group == rhs.group) || ((this.group != null) && this.group.equals(rhs.group))));
    }

}
