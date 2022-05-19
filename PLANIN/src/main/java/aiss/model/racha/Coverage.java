
package aiss.model.racha;

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
    "competition_properties",
    "group_properties",
    "sport_event_properties",
    "type"
})
@Generated("jsonschema2pojo")
public class Coverage {

    @JsonProperty("competition_properties")
    private CompetitionProperties competitionProperties;
    @JsonProperty("group_properties")
    private GroupProperties groupProperties;
    @JsonProperty("sport_event_properties")
    private SportEventProperties sportEventProperties;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("competition_properties")
    public CompetitionProperties getCompetitionProperties() {
        return competitionProperties;
    }

    @JsonProperty("competition_properties")
    public void setCompetitionProperties(CompetitionProperties competitionProperties) {
        this.competitionProperties = competitionProperties;
    }

    @JsonProperty("group_properties")
    public GroupProperties getGroupProperties() {
        return groupProperties;
    }

    @JsonProperty("group_properties")
    public void setGroupProperties(GroupProperties groupProperties) {
        this.groupProperties = groupProperties;
    }

    @JsonProperty("sport_event_properties")
    public SportEventProperties getSportEventProperties() {
        return sportEventProperties;
    }

    @JsonProperty("sport_event_properties")
    public void setSportEventProperties(SportEventProperties sportEventProperties) {
        this.sportEventProperties = sportEventProperties;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
