package org.dataflick.model.datasource;

import com.fasterxml.jackson.annotation.*;
import org.dataflick.core.Format;
import org.dataflick.core.Type;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "url",
        "params",
        "type",
        "format"
})
@Generated("jsonschema2pojo")
public class DataSource {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("params")
    private DsParams dbParams;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("format")
    private Format format;

    /**
     * No args constructor for use in serialization
     */
    public DataSource() {
    }

    /**
     * @param format
     * @param name
     * @param dsParams
     * @param type
     * @param url
     */
    public DataSource(String id, String name, String url, DbParams dsParams, Type type, Format format) {
        super();
        this.id = id;
        this.name = name;
        this.url = url;
        this.dbParams = dsParams;
        this.type = type;
        this.format = format;
    }

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

    public DataSource withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public DataSource withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("params")
    public DsParams getParams() {
        return dbParams;
    }

    @JsonProperty("params")
    public void setParams(DsParams dsParams) {
        this.dbParams = dsParams;
    }

    public DataSource withParams(DbParams dsParams) {
        this.dbParams = dsParams;
        return this;
    }

    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public DataSource withType(Type type) {
        this.type = type;
        return this;
    }

    @JsonProperty("format")
    public Format getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(Format format) {
        this.format = format;
    }

    public DataSource withFormat(Format format) {
        this.format = format;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataSource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null) ? "<null>" : this.url));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.dbParams == null) ? "<null>" : this.dbParams));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null) ? "<null>" : this.format));
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
        result = ((result * 31) + ((this.format == null) ? 0 : this.format.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.dbParams == null) ? 0 : this.dbParams.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.url == null) ? 0 : this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataSource) == false) {
            return false;
        }
        DataSource rhs = ((DataSource) other);
        return (((((((this.format == rhs.format) || ((this.format != null) && this.format.equals(rhs.format))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))))
                && ((this.dbParams == rhs.dbParams) || ((this.dbParams != null) && this.dbParams.equals(rhs.dbParams)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.url == rhs.url) || ((this.url != null) && this.url.equals(rhs.url)))));
    }

}
