package org.dataflick.controller.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.dataflick.core.Format;
import org.dataflick.core.Type;

import javax.annotation.Generated;
import java.util.Map;

import static java.lang.System.identityHashCode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "url",
        "params",
        "type",
        "format"
})
@Generated("jsonschema2pojo")
public class DataSourceRequest {

    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("params")
    private Map<String, String> params;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("format")
    private Format format;

    /**
     * No args constructor for use in serialization
     */
    public DataSourceRequest() {
    }

    /**
     * @param format
     * @param name
     * @param params
     * @param type
     * @param url
     */
    public DataSourceRequest(String name, String url, Map<String, String>  params, Type type, Format format) {
        super();
        this.name = name;
        this.url = url;
        this.params = params;
        this.type = type;
        this.format = format;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public DataSourceRequest withName(String name) {
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

    public DataSourceRequest withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("params")
    public Map<String, String>  getParams() {
        return params;
    }

    @JsonProperty("params")
    public void setParams(Map<String, String>  params) {
        this.params = params;
    }

    public DataSourceRequest withParams(Map<String, String> params) {
        this.params = params;
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

    public DataSourceRequest withType(Type type) {
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

    public DataSourceRequest withFormat(Format format) {
        this.format = format;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataSourceRequest.class.getName()).append('@').append(Integer.toHexString(identityHashCode(this))).append('[');
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
        sb.append(((this.params == null) ? "<null>" : this.params));
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
        result = ((result * 31) + ((this.params == null) ? 0 : this.params.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.url == null) ? 0 : this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataSourceRequest) == false) {
            return false;
        }
        DataSourceRequest rhs = ((DataSourceRequest) other);
        return (((((((this.format == rhs.format) || ((this.format != null) && this.format.equals(rhs.format))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))))
                && ((this.params == rhs.params) || ((this.params != null) && this.params.equals(rhs.params)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.url == rhs.url) || ((this.url != null) && this.url.equals(rhs.url)))));
    }

}
