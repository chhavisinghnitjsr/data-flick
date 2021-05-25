package org.dataflick.model.indicators;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sql",
        "threshold"
})
@Generated("jsonschema2pojo")
public class Config {

    @JsonProperty("sql")
    private String sql;
    @JsonProperty("threshold")
    private Threshold threshold;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sql")
    public String getSql() {
        return sql;
    }

    @JsonProperty("sql")
    public void setSql(String sql) {
        this.sql = sql;
    }

    @JsonProperty("threshold")
    public Threshold getThreshold() {
        return threshold;
    }

    @JsonProperty("threshold")
    public void setThreshold(Threshold threshold) {
        this.threshold = threshold;
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
        sb.append(Config.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sql");
        sb.append('=');
        sb.append(((this.sql == null)?"<null>":this.sql));
        sb.append(',');
        sb.append("threshold");
        sb.append('=');
        sb.append(((this.threshold == null)?"<null>":this.threshold));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.threshold == null)? 0 :this.threshold.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sql == null)? 0 :this.sql.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Config) == false) {
            return false;
        }
        Config rhs = ((Config) other);
        return ((((this.threshold == rhs.threshold)||((this.threshold!= null)&&this.threshold.equals(rhs.threshold)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sql == rhs.sql)||((this.sql!= null)&&this.sql.equals(rhs.sql))));
    }

}
