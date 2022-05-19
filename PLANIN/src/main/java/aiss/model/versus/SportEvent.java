
package aiss.model.versus;

import java.util.HashMap;
import java.util.List;
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
    "channels",
    "competitors",
    "coverage",
    "id",
    "replaced_by",
    "resume_time",
    "sport_event_conditions",
    "sport_event_context",
    "start_time",
    "start_time_confirmed",
    "venue"
})
@Generated("jsonschema2pojo")
public class SportEvent {

    @JsonProperty("channels")
    private List<Channel> channels = null;
    @JsonProperty("competitors")
    private List<Competitor__1> competitors = null;
    @JsonProperty("coverage")
    private Coverage coverage;
    @JsonProperty("id")
    private String id;
    @JsonProperty("replaced_by")
    private String replacedBy;
    @JsonProperty("resume_time")
    private String resumeTime;
    @JsonProperty("sport_event_conditions")
    private SportEventConditions sportEventConditions;
    @JsonProperty("sport_event_context")
    private SportEventContext sportEventContext;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("start_time_confirmed")
    private Boolean startTimeConfirmed;
    @JsonProperty("venue")
    private Venue venue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("channels")
    public List<Channel> getChannels() {
        return channels;
    }

    @JsonProperty("channels")
    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    @JsonProperty("competitors")
    public List<Competitor__1> getCompetitors() {
        return competitors;
    }

    @JsonProperty("competitors")
    public void setCompetitors(List<Competitor__1> competitors) {
        this.competitors = competitors;
    }

    @JsonProperty("coverage")
    public Coverage getCoverage() {
        return coverage;
    }

    @JsonProperty("coverage")
    public void setCoverage(Coverage coverage) {
        this.coverage = coverage;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("replaced_by")
    public String getReplacedBy() {
        return replacedBy;
    }

    @JsonProperty("replaced_by")
    public void setReplacedBy(String replacedBy) {
        this.replacedBy = replacedBy;
    }

    @JsonProperty("resume_time")
    public String getResumeTime() {
        return resumeTime;
    }

    @JsonProperty("resume_time")
    public void setResumeTime(String resumeTime) {
        this.resumeTime = resumeTime;
    }

    @JsonProperty("sport_event_conditions")
    public SportEventConditions getSportEventConditions() {
        return sportEventConditions;
    }

    @JsonProperty("sport_event_conditions")
    public void setSportEventConditions(SportEventConditions sportEventConditions) {
        this.sportEventConditions = sportEventConditions;
    }

    @JsonProperty("sport_event_context")
    public SportEventContext getSportEventContext() {
        return sportEventContext;
    }

    @JsonProperty("sport_event_context")
    public void setSportEventContext(SportEventContext sportEventContext) {
        this.sportEventContext = sportEventContext;
    }

    @JsonProperty("start_time")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("start_time")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("start_time_confirmed")
    public Boolean getStartTimeConfirmed() {
        return startTimeConfirmed;
    }

    @JsonProperty("start_time_confirmed")
    public void setStartTimeConfirmed(Boolean startTimeConfirmed) {
        this.startTimeConfirmed = startTimeConfirmed;
    }

    @JsonProperty("venue")
    public Venue getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
