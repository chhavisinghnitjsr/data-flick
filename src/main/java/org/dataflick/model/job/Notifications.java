package org.dataflick.model.job;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "recipient_address"
})
@Generated("jsonschema2pojo")
public class Notifications {

    @JsonProperty("recipient_address")
    private List<Object> recipientAddress = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Notifications() {
    }

    /**
     * @param recipientAddress
     */
    public Notifications(List<Object> recipientAddress) {
        super();
        this.recipientAddress = recipientAddress;
    }

    @JsonProperty("recipient_address")
    public List<Object> getRecipientAddress() {
        return recipientAddress;
    }

    @JsonProperty("recipient_address")
    public void setRecipientAddress(List<Object> recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public Notifications withRecipientAddress(List<Object> recipientAddress) {
        this.recipientAddress = recipientAddress;
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

    public Notifications withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Notifications.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("recipientAddress");
        sb.append('=');
        sb.append(((this.recipientAddress == null) ? "<null>" : this.recipientAddress));
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
        result = ((result * 31) + ((this.recipientAddress == null) ? 0 : this.recipientAddress.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Notifications) == false) {
            return false;
        }
        Notifications rhs = ((Notifications) other);
        return (((this.recipientAddress == rhs.recipientAddress) || ((this.recipientAddress != null) && this.recipientAddress.equals(rhs.recipientAddress))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
