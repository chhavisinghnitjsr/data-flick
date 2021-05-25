package org.dataflick.model.indicators.suites;


import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import org.dataflick.model.indicators.Indicator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @see org.dataflick.entity.IndicatorSuitesEntity
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "is_default",
        "is_active",
        "indicators"
})

public class IndicatorSuites {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("is_default")
    private boolean isDefault;
    @JsonProperty("is_active")
    private boolean isActive;
    @JsonProperty("indicators")
    private Set<Indicator> indicators = new HashSet<>();
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }


    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }
    
    @JsonProperty("is_default")
    public boolean isIsDefault() {
        return isDefault;
    }

    @JsonProperty("is_default")
    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    @JsonProperty("is_active")
    public boolean isIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("indicators")
    public Set<Indicator> getIndicators() {
        return indicators;
    }

    @JsonProperty("indicators")
    public void setIndicators(Set<Indicator> indicators) {
        this.indicators = indicators;
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
        sb.append(IndicatorSuites.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("isDefault");
        sb.append('=');
        sb.append(this.isDefault);
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(this.isActive);
        sb.append(',');
        sb.append("indicators");
        sb.append('=');
        sb.append(((this.indicators == null) ? "<null>" : this.indicators));
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
        result = ((result * 31) + (this.isDefault ? 1 : 0));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + (this.isActive ? 1 : 0));
        result = ((result * 31) + ((this.indicators == null) ? 0 : this.indicators.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IndicatorSuites) == false) {
            return false;
        }
        IndicatorSuites rhs = ((IndicatorSuites) other);
        return ((((((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))) && (this.isDefault == rhs.isDefault)) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && (this.isActive == rhs.isActive)) && ((this.indicators == rhs.indicators) || ((this.indicators != null) && this.indicators.equals(rhs.indicators))));
    }

}

