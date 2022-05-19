
package aiss.model.versus;

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
    "sport_event",
    "sport_event_status",
    "statistics"
})
@Generated("jsonschema2pojo")
public class NextMeeting {

    @JsonProperty("sport_event")
    private SportEvent__1 sportEvent;
    @JsonProperty("sport_event_status")
    private SportEventStatus__1 sportEventStatus;
    @JsonProperty("statistics")
    private Statistics__5 statistics;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sport_event")
    public SportEvent__1 getSportEvent() {
        return sportEvent;
    }

    @JsonProperty("sport_event")
    public void setSportEvent(SportEvent__1 sportEvent) {
        this.sportEvent = sportEvent;
    }

    @JsonProperty("sport_event_status")
    public SportEventStatus__1 getSportEventStatus() {
        return sportEventStatus;
    }

    @JsonProperty("sport_event_status")
    public void setSportEventStatus(SportEventStatus__1 sportEventStatus) {
        this.sportEventStatus = sportEventStatus;
    }

    @JsonProperty("statistics")
    public Statistics__5 getStatistics() {
        return statistics;
    }

    @JsonProperty("statistics")
    public void setStatistics(Statistics__5 statistics) {
        this.statistics = statistics;
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
