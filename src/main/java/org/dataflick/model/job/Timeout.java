package org.dataflick.model.job;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "attempt_duration_seconds"
})
@Generated("jsonschema2pojo")
public class Timeout {

    @JsonProperty("attempt_duration_seconds")
    private String attemptDurationSeconds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Timeout() {
    }

    /**
     * @param attemptDurationSeconds
     */
    public Timeout(String attemptDurationSeconds) {
        super();
        this.attemptDurationSeconds = attemptDurationSeconds;
    }

    @JsonProperty("attempt_duration_seconds")
    public String getAttemptDurationSeconds() {
        return attemptDurationSeconds;
    }

    @JsonProperty("attempt_duration_seconds")
    public void setAttemptDurationSeconds(String attemptDurationSeconds) {
        this.attemptDurationSeconds = attemptDurationSeconds;
    }

    public Timeout withAttemptDurationSeconds(String attemptDurationSeconds) {
        this.attemptDurationSeconds = attemptDurationSeconds;
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

    public Timeout withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Timeout.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attemptDurationSeconds");
        sb.append('=');
        sb.append(((this.attemptDurationSeconds == null) ? "<null>" : this.attemptDurationSeconds));
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
        result = ((result * 31) + ((this.attemptDurationSeconds == null) ? 0 : this.attemptDurationSeconds.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Timeout) == false) {
            return false;
        }
        Timeout rhs = ((Timeout) other);
        return (((this.attemptDurationSeconds == rhs.attemptDurationSeconds) || ((this.attemptDurationSeconds != null) && this.attemptDurationSeconds.equals(rhs.attemptDurationSeconds))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
