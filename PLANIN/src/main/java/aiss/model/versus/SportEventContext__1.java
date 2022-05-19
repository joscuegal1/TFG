
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
    "category",
    "competition",
    "groups",
    "round",
    "season",
    "sport",
    "stage"
})
@Generated("jsonschema2pojo")
public class SportEventContext__1 {

    @JsonProperty("category")
    private Category__1 category;
    @JsonProperty("competition")
    private Competition__1 competition;
    @JsonProperty("groups")
    private List<Group__1> groups = null;
    @JsonProperty("round")
    private Round__1 round;
    @JsonProperty("season")
    private Season__1 season;
    @JsonProperty("sport")
    private Sport__1 sport;
    @JsonProperty("stage")
    private Stage__1 stage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("category")
    public Category__1 getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category__1 category) {
        this.category = category;
    }

    @JsonProperty("competition")
    public Competition__1 getCompetition() {
        return competition;
    }

    @JsonProperty("competition")
    public void setCompetition(Competition__1 competition) {
        this.competition = competition;
    }

    @JsonProperty("groups")
    public List<Group__1> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<Group__1> groups) {
        this.groups = groups;
    }

    @JsonProperty("round")
    public Round__1 getRound() {
        return round;
    }

    @JsonProperty("round")
    public void setRound(Round__1 round) {
        this.round = round;
    }

    @JsonProperty("season")
    public Season__1 getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(Season__1 season) {
        this.season = season;
    }

    @JsonProperty("sport")
    public Sport__1 getSport() {
        return sport;
    }

    @JsonProperty("sport")
    public void setSport(Sport__1 sport) {
        this.sport = sport;
    }

    @JsonProperty("stage")
    public Stage__1 getStage() {
        return stage;
    }

    @JsonProperty("stage")
    public void setStage(Stage__1 stage) {
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
