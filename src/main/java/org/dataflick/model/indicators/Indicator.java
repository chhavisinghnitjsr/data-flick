package org.dataflick.model.indicators;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @see org.dataflick.entity.IndicatorEntity
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "template_key",
        "name",
        "is_active",
        "is_default",
        "execution_order",
        "exit_on_error",
        "config"
})
public class Indicator {

    @JsonProperty("id")
    private String id;
    @JsonProperty("template_key")
    private String templateKey;
    @JsonProperty("name")
    private String name;
    @JsonProperty("execution_order")
    private long executionOrder;
    @JsonProperty("is_active")
    private boolean isActive;
    @JsonProperty("is_default")
    private boolean isDefault;
    @JsonProperty("exit_on_error")
    private boolean exitOnError;
    @JsonProperty("config")
    private Config config;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("template_key")
    public String getTemplateKey() {
        return templateKey;
    }

    @JsonProperty("template_key")
    public void setTemplateKey(String templateKey) {
        this.templateKey = templateKey;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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

    @JsonProperty("is_default")
    public boolean IsDefault() {
        return isDefault;
    }

    @JsonProperty("is_default")
    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
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
        sb.append(Indicator.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.templateKey == null) ? "<null>" : this.templateKey));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("executionOrder");
        sb.append('=');
        sb.append(this.executionOrder);
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(this.isActive);
        sb.append(',');
        sb.append("isDefault");
        sb.append('=');
        sb.append(this.isDefault);
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
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + (this.isActive ? 1 : 0));
        result = ((result * 31) + (this.isDefault ? 1 : 0));
        result = ((result * 31) + ((this.config == null) ? 0 : this.config.hashCode()));
        result = ((result * 31) + ((this.templateKey == null) ? 0 : this.templateKey.hashCode()));
        result = ((result * 31) + ((int) (this.executionOrder ^ (this.executionOrder >>> 32))));
        result = ((result * 31) + (this.exitOnError ? 1 : 0));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Indicator) == false) {
            return false;
        }
        Indicator rhs = ((Indicator) other);
        return (Objects.equals(this.id, rhs.id))
                && (Objects.equals(this.name, rhs.name))
                && (Objects.equals(this.additionalProperties, rhs.additionalProperties))
                && (this.isActive == rhs.isActive)
                && (this.isDefault == rhs.isDefault)
                && (Objects.equals(this.config, rhs.config))
                && (Objects.equals(this.templateKey, rhs.templateKey))
                && (this.executionOrder == rhs.executionOrder)
                && (this.exitOnError == rhs.exitOnError);
    }

}
