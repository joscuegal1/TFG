
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
    "cup_round_id",
    "cup_round_number_of_sport_events",
    "cup_round_sport_event_number",
    "name",
    "number",
    "other_sport_event_id"
})
@Generated("jsonschema2pojo")
public class Round {

    @JsonProperty("cup_round_id")
    private String cupRoundId;
    @JsonProperty("cup_round_number_of_sport_events")
    private Integer cupRoundNumberOfSportEvents;
    @JsonProperty("cup_round_sport_event_number")
    private Integer cupRoundSportEventNumber;
    @JsonProperty("name")
    private String name;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("other_sport_event_id")
    private String otherSportEventId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cup_round_id")
    public String getCupRoundId() {
        return cupRoundId;
    }

    @JsonProperty("cup_round_id")
    public void setCupRoundId(String cupRoundId) {
        this.cupRoundId = cupRoundId;
    }

    @JsonProperty("cup_round_number_of_sport_events")
    public Integer getCupRoundNumberOfSportEvents() {
        return cupRoundNumberOfSportEvents;
    }

    @JsonProperty("cup_round_number_of_sport_events")
    public void setCupRoundNumberOfSportEvents(Integer cupRoundNumberOfSportEvents) {
        this.cupRoundNumberOfSportEvents = cupRoundNumberOfSportEvents;
    }

    @JsonProperty("cup_round_sport_event_number")
    public Integer getCupRoundSportEventNumber() {
        return cupRoundSportEventNumber;
    }

    @JsonProperty("cup_round_sport_event_number")
    public void setCupRoundSportEventNumber(Integer cupRoundSportEventNumber) {
        this.cupRoundSportEventNumber = cupRoundSportEventNumber;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("other_sport_event_id")
    public String getOtherSportEventId() {
        return otherSportEventId;
    }

    @JsonProperty("other_sport_event_id")
    public void setOtherSportEventId(String otherSportEventId) {
        this.otherSportEventId = otherSportEventId;
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
