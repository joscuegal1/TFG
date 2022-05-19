
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
public class LastMeeting {

    @JsonProperty("sport_event")
    private SportEvent sportEvent;
    @JsonProperty("sport_event_status")
    private SportEventStatus sportEventStatus;
    @JsonProperty("statistics")
    private Statistics statistics;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sport_event")
    public SportEvent getSportEvent() {
        return sportEvent;
    }

    @JsonProperty("sport_event")
    public void setSportEvent(SportEvent sportEvent) {
        this.sportEvent = sportEvent;
    }

    @JsonProperty("sport_event_status")
    public SportEventStatus getSportEventStatus() {
        return sportEventStatus;
    }

    @JsonProperty("sport_event_status")
    public void setSportEventStatus(SportEventStatus sportEventStatus) {
        this.sportEventStatus = sportEventStatus;
    }

    @JsonProperty("statistics")
    public Statistics getStatistics() {
        return statistics;
    }

    @JsonProperty("statistics")
    public void setStatistics(Statistics statistics) {
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
