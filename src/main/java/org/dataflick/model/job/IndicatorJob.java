package org.dataflick.model.job;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "data",
        "indicators",
        "reference_id",
        "job_name",
        "notification",
        "tags",
        "timeout"
})
@Generated("jsonschema2pojo")
public class IndicatorJob {

    @JsonProperty("data")
    private Data data;
    @JsonProperty("indicators")
    private Indicators indicators;
    @JsonProperty("reference_id")
    private String referenceId;
    @JsonProperty("job_name")
    private String jobName;
    @JsonProperty("notification")
    private Notifications notification;
    @JsonProperty("tags")
    private Set<String> tags;
    @JsonProperty("timeout")
    private Timeout timeout;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public IndicatorJob() {
    }

    /**
     * @param jobName
     * @param notification
     * @param data
     * @param indicators
     * @param referenceId
     * @param timeout
     * @param tags
     */
    public IndicatorJob(Data data, Indicators indicators, String referenceId, String jobName, Notifications notification, Set<String> tags, Timeout timeout) {
        super();
        this.data = data;
        this.indicators = indicators;
        this.referenceId = referenceId;
        this.jobName = jobName;
        this.notification = notification;
        this.tags = tags;
        this.timeout = timeout;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    public IndicatorJob withData(Data data) {
        this.data = data;
        return this;
    }

    @JsonProperty("indicators")
    public Indicators getIndicators() {
        return indicators;
    }

    @JsonProperty("indicators")
    public void setIndicators(Indicators indicators) {
        this.indicators = indicators;
    }

    public IndicatorJob withIndicators(Indicators indicators) {
        this.indicators = indicators;
        return this;
    }

    @JsonProperty("reference_id")
    public String getReferenceId() {
        return referenceId;
    }

    @JsonProperty("reference_id")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public IndicatorJob withReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    @JsonProperty("job_name")
    public String getJobName() {
        return jobName;
    }

    @JsonProperty("job_name")
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public IndicatorJob withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    @JsonProperty("notification")
    public Notifications getNotification() {
        return notification;
    }

    @JsonProperty("notification")
    public void setNotification(Notifications notification) {
        this.notification = notification;
    }

    public IndicatorJob withNotification(Notifications notification) {
        this.notification = notification;
        return this;
    }

    @JsonProperty("tags")
    public Set<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public IndicatorJob withTags(Set<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("timeout")
    public Timeout getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Timeout timeout) {
        this.timeout = timeout;
    }

    public IndicatorJob withTimeout(Timeout timeout) {
        this.timeout = timeout;
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

    public IndicatorJob withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IndicatorJob.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null) ? "<null>" : this.data));
        sb.append(',');
        sb.append("indicators");
        sb.append('=');
        sb.append(((this.indicators == null) ? "<null>" : this.indicators));
        sb.append(',');
        sb.append("referenceId");
        sb.append('=');
        sb.append(((this.referenceId == null) ? "<null>" : this.referenceId));
        sb.append(',');
        sb.append("jobName");
        sb.append('=');
        sb.append(((this.jobName == null) ? "<null>" : this.jobName));
        sb.append(',');
        sb.append("notification");
        sb.append('=');
        sb.append(((this.notification == null) ? "<null>" : this.notification));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null) ? "<null>" : this.tags));
        sb.append(',');
        sb.append("timeout");
        sb.append('=');
        sb.append(((this.timeout == null) ? "<null>" : this.timeout));
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
        result = ((result * 31) + ((this.jobName == null) ? 0 : this.jobName.hashCode()));
        result = ((result * 31) + ((this.notification == null) ? 0 : this.notification.hashCode()));
        result = ((result * 31) + ((this.data == null) ? 0 : this.data.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.indicators == null) ? 0 : this.indicators.hashCode()));
        result = ((result * 31) + ((this.referenceId == null) ? 0 : this.referenceId.hashCode()));
        result = ((result * 31) + ((this.timeout == null) ? 0 : this.timeout.hashCode()));
        result = ((result * 31) + ((this.tags == null) ? 0 : this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IndicatorJob) == false) {
            return false;
        }
        IndicatorJob rhs = ((IndicatorJob) other);
        return (((((((((this.jobName == rhs.jobName) || ((this.jobName != null) && this.jobName.equals(rhs.jobName))) && ((this.notification == rhs.notification) || ((this.notification != null) && this.notification.equals(rhs.notification)))) && ((this.data == rhs.data) || ((this.data != null) && this.data.equals(rhs.data)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.indicators == rhs.indicators) || ((this.indicators != null) && this.indicators.equals(rhs.indicators)))) && ((this.referenceId == rhs.referenceId) || ((this.referenceId != null) && this.referenceId.equals(rhs.referenceId)))) && ((this.timeout == rhs.timeout) || ((this.timeout != null) && this.timeout.equals(rhs.timeout)))) && ((this.tags == rhs.tags) || ((this.tags != null) && this.tags.equals(rhs.tags))));
    }

}

