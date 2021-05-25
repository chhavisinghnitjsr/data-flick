package org.dataflick.model.job;


import com.fasterxml.jackson.annotation.*;
import org.dataflick.controller.request.DataSourceRequest;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "database",
        "schema",
        "table",
        "columns",
        "source",
        "target"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("database")
    private String database;
    @JsonProperty("schema")
    private String schema;
    @JsonProperty("table")
    private String table;
    @JsonProperty("columns")
    private List<String> columns = new ArrayList<String>();
    @JsonProperty("source")
    private DataSourceRequest source;
    @JsonProperty("target")
    private DataSourceRequest target;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Data() {
    }

    /**
     * @param schema
     * @param database
     * @param columns
     * @param source
     * @param table
     * @param target
     */
    public Data(String database, String schema, String table, List<String> columns, DataSourceRequest source, DataSourceRequest target) {
        super();
        this.database = database;
        this.schema = schema;
        this.table = table;
        this.columns = columns;
        this.source = source;
        this.target = target;
    }

    @JsonProperty("database")
    public String getDatabase() {
        return database;
    }

    @JsonProperty("database")
    public void setDatabase(String database) {
        this.database = database;
    }

    public org.dataflick.model.job.Data withDatabase(String database) {
        this.database = database;
        return this;
    }

    @JsonProperty("schema")
    public String getSchema() {
        return schema;
    }

    @JsonProperty("schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }

    public org.dataflick.model.job.Data withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    @JsonProperty("table")
    public String getTable() {
        return table;
    }

    @JsonProperty("table")
    public void setTable(String table) {
        this.table = table;
    }

    public org.dataflick.model.job.Data withTable(String table) {
        this.table = table;
        return this;
    }

    @JsonProperty("columns")
    public List<String> getColumns() {
        return columns;
    }

    @JsonProperty("columns")
    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public org.dataflick.model.job.Data withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    @JsonProperty("source")
    public DataSourceRequest getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(DataSourceRequest source) {
        this.source = source;
    }

    public org.dataflick.model.job.Data withSource(DataSourceRequest source) {
        this.source = source;
        return this;
    }

    @JsonProperty("target")
    public DataSourceRequest getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(DataSourceRequest target) {
        this.target = target;
    }

    public org.dataflick.model.job.Data withTarget(DataSourceRequest target) {
        this.target = target;
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

    public org.dataflick.model.job.Data withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(org.dataflick.model.job.Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("database");
        sb.append('=');
        sb.append(((this.database == null) ? "<null>" : this.database));
        sb.append(',');
        sb.append("schema");
        sb.append('=');
        sb.append(((this.schema == null) ? "<null>" : this.schema));
        sb.append(',');
        sb.append("table");
        sb.append('=');
        sb.append(((this.table == null) ? "<null>" : this.table));
        sb.append(',');
        sb.append("columns");
        sb.append('=');
        sb.append(((this.columns == null) ? "<null>" : this.columns));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null) ? "<null>" : this.source));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null) ? "<null>" : this.target));
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
        result = ((result * 31) + ((this.schema == null) ? 0 : this.schema.hashCode()));
        result = ((result * 31) + ((this.database == null) ? 0 : this.database.hashCode()));
        result = ((result * 31) + ((this.columns == null) ? 0 : this.columns.hashCode()));
        result = ((result * 31) + ((this.source == null) ? 0 : this.source.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.table == null) ? 0 : this.table.hashCode()));
        result = ((result * 31) + ((this.target == null) ? 0 : this.target.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof org.dataflick.model.job.Data) == false) {
            return false;
        }
        org.dataflick.model.job.Data rhs = ((org.dataflick.model.job.Data) other);
        return ((((((((this.schema == rhs.schema) || ((this.schema != null) && this.schema.equals(rhs.schema))) && ((this.database == rhs.database) || ((this.database != null) && this.database.equals(rhs.database)))) && ((this.columns == rhs.columns) || ((this.columns != null) && this.columns.equals(rhs.columns)))) && ((this.source == rhs.source) || ((this.source != null) && this.source.equals(rhs.source)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.table == rhs.table) || ((this.table != null) && this.table.equals(rhs.table)))) && ((this.target == rhs.target) || ((this.target != null) && this.target.equals(rhs.target))));
    }

}
