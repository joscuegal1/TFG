
package aiss.model.racha;

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
    "category",
    "competition",
    "groups",
    "round",
    "season",
    "sport",
    "stage"
})
@Generated("jsonschema2pojo")
public class SportEventContext {

    @JsonProperty("category")
    private Category category;
    @JsonProperty("competition")
    private Competition competition;
    @JsonProperty("groups")
    private List<Group> groups = null;
    @JsonProperty("round")
    private Round round;
    @JsonProperty("season")
    private Season season;
    @JsonProperty("sport")
    private Sport sport;
    @JsonProperty("stage")
    private Stage stage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("competition")
    public Competition getCompetition() {
        return competition;
    }

    @JsonProperty("competition")
    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    @JsonProperty("groups")
    public List<Group> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @JsonProperty("round")
    public Round getRound() {
        return round;
    }

    @JsonProperty("round")
    public void setRound(Round round) {
        this.round = round;
    }

    @JsonProperty("season")
    public Season getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(Season season) {
        this.season = season;
    }

    @JsonProperty("sport")
    public Sport getSport() {
        return sport;
    }

    @JsonProperty("sport")
    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @JsonProperty("stage")
    public Stage getStage() {
        return stage;
    }

    @JsonProperty("stage")
    public void setStage(Stage stage) {
        this.stage = stage;
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
