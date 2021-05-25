package org.dataflick.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.dataflick.model.indicators.Indicator;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * @see org.dataflick.entity.IndicatorSuitesEntity
 */

@Entity
@Table(name = "indicators")
public class IndicatorEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    private String id;
    @Column(name = "template_key")
    private String templateKey;
    @Column(name = "name")
    private String name;
    @Column(name = "execution_order")
    private long executionOrder;
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "is_default")
    private boolean isDefault;
    @Column(name = "exit_on_error")
    private boolean exitOnError;
    @Column(name = "config", columnDefinition = "TEXT")
    private String config;

    @ManyToMany(mappedBy = "indicators", fetch = FetchType.LAZY)
    private Set<IndicatorSuitesEntity> indicatorSuites;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public Set<IndicatorSuitesEntity> getSuites() {
        return indicatorSuites;
    }

    public void setSuites(Set<IndicatorSuitesEntity> suites) {
        this.indicatorSuites = suites;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("key")
    public String getTemplateKey() {
        return templateKey;
    }

    @JsonProperty("key")
    public void setTemplateKey(String templateKey) {
        this.templateKey = templateKey;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("key")
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
    public String getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(String config) {
        this.config = config;
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
        if (!(other instanceof IndicatorEntity)) {
            return false;
        }
        IndicatorEntity rhs = ((IndicatorEntity) other);
        return (Objects.equals(this.id, rhs.id))
                && (Objects.equals(this.name, rhs.name))
                && (this.isActive == rhs.isActive)
                && (this.isDefault == rhs.isDefault)
                && (Objects.equals(this.config, rhs.config))
                && (Objects.equals(this.templateKey, rhs.templateKey))
                && (this.executionOrder == rhs.executionOrder)
                && (this.exitOnError == rhs.exitOnError);
    }
}
