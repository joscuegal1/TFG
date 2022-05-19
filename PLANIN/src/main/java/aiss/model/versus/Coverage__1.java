
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
    "competition_properties",
    "group_properties",
    "sport_event_properties",
    "type"
})
@Generated("jsonschema2pojo")
public class Coverage__1 {

    @JsonProperty("competition_properties")
    private CompetitionProperties__1 competitionProperties;
    @JsonProperty("group_properties")
    private GroupProperties__1 groupProperties;
    @JsonProperty("sport_event_properties")
    private SportEventProperties__1 sportEventProperties;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("competition_properties")
    public CompetitionProperties__1 getCompetitionProperties() {
        return competitionProperties;
    }

    @JsonProperty("competition_properties")
    public void setCompetitionProperties(CompetitionProperties__1 competitionProperties) {
        this.competitionProperties = competitionProperties;
    }

    @JsonProperty("group_properties")
    public GroupProperties__1 getGroupProperties() {
        return groupProperties;
    }

    @JsonProperty("group_properties")
    public void setGroupProperties(GroupProperties__1 groupProperties) {
        this.groupProperties = groupProperties;
    }

    @JsonProperty("sport_event_properties")
    public SportEventProperties__1 getSportEventProperties() {
        return sportEventProperties;
    }

    @JsonProperty("sport_event_properties")
    public void setSportEventProperties(SportEventProperties__1 sportEventProperties) {
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
