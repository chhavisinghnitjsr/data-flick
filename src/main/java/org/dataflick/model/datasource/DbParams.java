package org.dataflick.model.datasource;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "user",
        "password",
        "database",
        "schema",
        "table",
        "columns"
})
@Generated("jsonschema2pojo")
public class DbParams implements DsParams {

    @JsonProperty("user")
    private String user;
    @JsonProperty("password")
    private String password;
    @JsonProperty("database")
    private String database;
    @JsonProperty("schema")
    private String schema;
    @JsonProperty("table")
    private String table;
    @JsonProperty("columns")
    private List<String> columns = new ArrayList<String>();
    @JsonIgnore
    private Map<String, String> additionalProperties = new HashMap<String, String>();

    /**
     * No args constructor for use in serialization
     */
    public DbParams() {
    }

    /**
     * @param schema
     * @param database
     * @param columns
     * @param user
     * @param password
     * @param table
     */
    public DbParams(String user, String password, String database, String schema, String table, List<String> columns) {
        super();
        this.user = user;
        this.password = password;
        this.database = database;
        this.schema = schema;
        this.table = table;
        this.columns = columns;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public DbParams withUser(String user) {
        this.user = user;
        return this;
    }

    @JsonProperty("password")
    public String getpassword() {
        return password;
    }

    @JsonProperty("password")
    public void setpassword(String password) {
        this.password = password;
    }

    public DbParams withpassword(String password) {
        this.password = password;
        return this;
    }

    @JsonProperty("database")
    public String getDatabase() {
        return database;
    }

    @JsonProperty("database")
    public void setDatabase(String database) {
        this.database = database;
    }

    public DbParams withDatabase(String database) {
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

    public DbParams withSchema(String schema) {
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

    public DbParams withTable(String table) {
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

    public DbParams withColumns(List<String> columns) {
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

    public DbParams withAdditionalProperty(String name, String value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DbParams.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null) ? "<null>" : this.user));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null) ? "<null>" : this.password));
        sb.append(',');
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
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.user == null) ? 0 : this.user.hashCode()));
        result = ((result * 31) + ((this.password == null) ? 0 : this.password.hashCode()));
        result = ((result * 31) + ((this.table == null) ? 0 : this.table.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DbParams) == false) {
            return false;
        }
        DbParams rhs = ((DbParams) other);
        return ((((((((this.schema == rhs.schema) || ((this.schema != null) && this.schema.equals(rhs.schema))) && ((this.database == rhs.database) || ((this.database != null) && this.database.equals(rhs.database)))) && ((this.columns == rhs.columns) || ((this.columns != null) && this.columns.equals(rhs.columns)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.user == rhs.user) || ((this.user != null) && this.user.equals(rhs.user)))) && ((this.password == rhs.password) || ((this.password != null) && this.password.equals(rhs.password)))) && ((this.table == rhs.table) || ((this.table != null) && this.table.equals(rhs.table))));
    }

}
