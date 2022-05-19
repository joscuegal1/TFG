
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
    "competitors",
    "generated_at",
    "last_meetings",
    "next_meetings"
})
@Generated("jsonschema2pojo")
public class Versus {

    @JsonProperty("competitors")
    private List<Competitor> competitors = null;
    @JsonProperty("generated_at")
    private String generatedAt;
    @JsonProperty("last_meetings")
    private List<LastMeeting> lastMeetings = null;
    @JsonProperty("next_meetings")
    private List<NextMeeting> nextMeetings = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("competitors")
    public List<Competitor> getCompetitors() {
        return competitors;
    }

    @JsonProperty("competitors")
    public void setCompetitors(List<Competitor> competitors) {
        this.competitors = competitors;
    }

    @JsonProperty("generated_at")
    public String getGeneratedAt() {
        return generatedAt;
    }

    @JsonProperty("generated_at")
    public void setGeneratedAt(String generatedAt) {
        this.generatedAt = generatedAt;
    }

    @JsonProperty("last_meetings")
    public List<LastMeeting> getLastMeetings() {
        return lastMeetings;
    }

    @JsonProperty("last_meetings")
    public void setLastMeetings(List<LastMeeting> lastMeetings) {
        this.lastMeetings = lastMeetings;
    }

    @JsonProperty("next_meetings")
    public List<NextMeeting> getNextMeetings() {
        return nextMeetings;
    }

    @JsonProperty("next_meetings")
    public void setNextMeetings(List<NextMeeting> nextMeetings) {
        this.nextMeetings = nextMeetings;
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
