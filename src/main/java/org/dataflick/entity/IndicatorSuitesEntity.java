package org.dataflick.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * @see org.dataflick.model.indicators.suites.IndicatorSuites
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "is_default",
        "is_active",
        "indicators"
})

@Entity
@Table(name = "indicator_suites")
public class IndicatorSuitesEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "is_default")
    private boolean isDefault;
    @Column(name = "is_active")
    private boolean isActive;


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "indicator_to_suites",
            joinColumns = {@JoinColumn(referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(referencedColumnName = "id")}
    )
    private Set<IndicatorEntity> indicators;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
    public Set<IndicatorEntity> getIndicators() {
        return indicators;
    }

    @JsonProperty("indicators")
    public void setIndicators(Set<IndicatorEntity> indicators) {
        this.indicators = indicators;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IndicatorSuitesEntity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result * 31) + (this.isActive ? 1 : 0));
        result = ((result * 31) + ((this.indicators == null) ? 0 : this.indicators.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IndicatorSuitesEntity) == false) {
            return false;
        }
        IndicatorSuitesEntity rhs = ((IndicatorSuitesEntity) other);
        return Objects.equals(this.name, rhs.name)
                && (this.isDefault == rhs.isDefault)
                && (this.isActive == rhs.isActive)
                && (Objects.equals(this.indicators, rhs.indicators));
    }

}

