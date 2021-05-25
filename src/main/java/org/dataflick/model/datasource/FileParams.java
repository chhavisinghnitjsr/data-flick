package org.dataflick.model.datasource;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class FileParams implements DsParams {

    @JsonProperty("schema")
    private String schema;
    @JsonProperty("columns")
    private List<String> columns = new ArrayList<String>();
    @JsonIgnore
    private Map<String, String> additionalProperties = new HashMap<String, String>();

    @JsonProperty("schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }

    @JsonProperty("schema")
    public String getSchema() {
        return schema;
    }

    @JsonProperty("columns")
    public List<String> getColumns() {
        return columns;
    }

    @JsonProperty("columns")
    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public FileParams withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    @JsonAnyGetter
    public Map<String, String> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, String value) {
        this.additionalProperties.put(name, value);
    }

    public FileParams withAdditionalProperty(String name, String value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FileParams.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("columns");
        sb.append('=');
        sb.append(((this.columns == null) ? "<null>" : this.columns));
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
        result = ((result * 31) + ((this.columns == null) ? 0 : this.columns.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FileParams) == false) {
            return false;
        }
        FileParams rhs = ((FileParams) other);
        return (Objects.equals(this.columns, rhs.columns)
                && Objects.equals(this.additionalProperties, rhs.additionalProperties));
    }
}
