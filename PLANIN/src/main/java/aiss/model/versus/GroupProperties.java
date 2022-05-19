
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
    "brackets",
    "cup",
    "group_stage",
    "league",
    "missing_players",
    "qualification",
    "results",
    "schedules",
    "standings"
})
@Generated("jsonschema2pojo")
public class GroupProperties {

    @JsonProperty("brackets")
    private Boolean brackets;
    @JsonProperty("cup")
    private Boolean cup;
    @JsonProperty("group_stage")
    private Boolean groupStage;
    @JsonProperty("league")
    private Boolean league;
    @JsonProperty("missing_players")
    private Boolean missingPlayers;
    @JsonProperty("qualification")
    private Boolean qualification;
    @JsonProperty("results")
    private Boolean results;
    @JsonProperty("schedules")
    private Boolean schedules;
    @JsonProperty("standings")
    private String standings;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("brackets")
    public Boolean getBrackets() {
        return brackets;
    }

    @JsonProperty("brackets")
    public void setBrackets(Boolean brackets) {
        this.brackets = brackets;
    }

    @JsonProperty("cup")
    public Boolean getCup() {
        return cup;
    }

    @JsonProperty("cup")
    public void setCup(Boolean cup) {
        this.cup = cup;
    }

    @JsonProperty("group_stage")
    public Boolean getGroupStage() {
        return groupStage;
    }

    @JsonProperty("group_stage")
    public void setGroupStage(Boolean groupStage) {
        this.groupStage = groupStage;
    }

    @JsonProperty("league")
    public Boolean getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(Boolean league) {
        this.league = league;
    }

    @JsonProperty("missing_players")
    public Boolean getMissingPlayers() {
        return missingPlayers;
    }

    @JsonProperty("missing_players")
    public void setMissingPlayers(Boolean missingPlayers) {
        this.missingPlayers = missingPlayers;
    }

    @JsonProperty("qualification")
    public Boolean getQualification() {
        return qualification;
    }

    @JsonProperty("qualification")
    public void setQualification(Boolean qualification) {
        this.qualification = qualification;
    }

    @JsonProperty("results")
    public Boolean getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(Boolean results) {
        this.results = results;
    }

    @JsonProperty("schedules")
    public Boolean getSchedules() {
        return schedules;
    }

    @JsonProperty("schedules")
    public void setSchedules(Boolean schedules) {
        this.schedules = schedules;
    }

    @JsonProperty("standings")
    public String getStandings() {
        return standings;
    }

    @JsonProperty("standings")
    public void setStandings(String standings) {
        this.standings = standings;
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
