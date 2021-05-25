package org.dataflick.model.indicators;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "key",
        "execution_order",
        "is_active",
        "exit_on_error",
        "config"
})
@Generated("jsonschema2pojo")
public class IndicatorsTemplate {

    @JsonProperty("id")
    private String id;
    @JsonProperty("key")
    private String key;
    @JsonProperty("execution_order")
    private long executionOrder;
    @JsonProperty("is_active")
    private boolean isActive;
    @JsonProperty("exit_on_error")
    private boolean exitOnError;
    @JsonProperty("config")
    private Config config;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("execution_order")
    public long getExecutionOrder() {
        return executionOrder;
    }

    @JsonProperty("execution_order")
    public void setExecutionOrder(long executionOrder) {
        this.executionOrder = executionOrder;
    }

    @JsonProperty("is_active")
    public boolean isIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("exit_on_error")
    public boolean isExitOnError() {
        return exitOnError;
    }

    @JsonProperty("exit_on_error")
    public void setExitOnError(boolean exitOnError) {
        this.exitOnError = exitOnError;
    }

    @JsonProperty("config")
    public Config getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(Config config) {
        this.config = config;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IndicatorsTemplate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null) ? "<null>" : this.key));
        sb.append(',');
        sb.append("executionOrder");
        sb.append('=');
        sb.append(this.executionOrder);
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(this.isActive);
        sb.append(',');
        sb.append("exitOnError");
        sb.append('=');
        sb.append(this.exitOnError);
        sb.append(',');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null) ? "<null>" : this.config));
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
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + (this.isActive ? 1 : 0));
        result = ((result * 31) + ((this.config == null) ? 0 : this.config.hashCode()));
        result = ((result * 31) + ((this.key == null) ? 0 : this.key.hashCode()));
        result = ((result * 31) + ((int) (this.executionOrder ^ (this.executionOrder >>> 32))));
        result = ((result * 31) + (this.exitOnError ? 1 : 0));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IndicatorsTemplate) == false) {
            return false;
        }
        IndicatorsTemplate rhs = ((IndicatorsTemplate) other);
        return ((((((((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && (this.isActive == rhs.isActive)) && ((this.config == rhs.config) || ((this.config != null) && this.config.equals(rhs.config)))) && ((this.key == rhs.key) || ((this.key != null) && this.key.equals(rhs.key)))) && (this.executionOrder == rhs.executionOrder)) && (this.exitOnError == rhs.exitOnError));
    }

}
