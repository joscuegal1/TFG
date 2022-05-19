
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
    "ballspotting",
    "basic_play_by_play",
    "basic_player_stats",
    "basic_team_stats",
    "commentary",
    "deeper_play_by_play",
    "deeper_player_stats",
    "deeper_team_stats",
    "extended_player_stats",
    "extended_team_stats",
    "fun_facts",
    "game_clock",
    "goal_scorers",
    "lineups",
    "lineups_availability",
    "probabilities",
    "scores"
})
@Generated("jsonschema2pojo")
public class SportEventProperties {

    @JsonProperty("ballspotting")
    private Boolean ballspotting;
    @JsonProperty("basic_play_by_play")
    private Boolean basicPlayByPlay;
    @JsonProperty("basic_player_stats")
    private Boolean basicPlayerStats;
    @JsonProperty("basic_team_stats")
    private Boolean basicTeamStats;
    @JsonProperty("commentary")
    private Boolean commentary;
    @JsonProperty("deeper_play_by_play")
    private Boolean deeperPlayByPlay;
    @JsonProperty("deeper_player_stats")
    private Boolean deeperPlayerStats;
    @JsonProperty("deeper_team_stats")
    private Boolean deeperTeamStats;
    @JsonProperty("extended_player_stats")
    private Boolean extendedPlayerStats;
    @JsonProperty("extended_team_stats")
    private Boolean extendedTeamStats;
    @JsonProperty("fun_facts")
    private Boolean funFacts;
    @JsonProperty("game_clock")
    private Boolean gameClock;
    @JsonProperty("goal_scorers")
    private Boolean goalScorers;
    @JsonProperty("lineups")
    private Boolean lineups;
    @JsonProperty("lineups_availability")
    private String lineupsAvailability;
    @JsonProperty("probabilities")
    private Boolean probabilities;
    @JsonProperty("scores")
    private String scores;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ballspotting")
    public Boolean getBallspotting() {
        return ballspotting;
    }

    @JsonProperty("ballspotting")
    public void setBallspotting(Boolean ballspotting) {
        this.ballspotting = ballspotting;
    }

    @JsonProperty("basic_play_by_play")
    public Boolean getBasicPlayByPlay() {
        return basicPlayByPlay;
    }

    @JsonProperty("basic_play_by_play")
    public void setBasicPlayByPlay(Boolean basicPlayByPlay) {
        this.basicPlayByPlay = basicPlayByPlay;
    }

    @JsonProperty("basic_player_stats")
    public Boolean getBasicPlayerStats() {
        return basicPlayerStats;
    }

    @JsonProperty("basic_player_stats")
    public void setBasicPlayerStats(Boolean basicPlayerStats) {
        this.basicPlayerStats = basicPlayerStats;
    }

    @JsonProperty("basic_team_stats")
    public Boolean getBasicTeamStats() {
        return basicTeamStats;
    }

    @JsonProperty("basic_team_stats")
    public void setBasicTeamStats(Boolean basicTeamStats) {
        this.basicTeamStats = basicTeamStats;
    }

    @JsonProperty("commentary")
    public Boolean getCommentary() {
        return commentary;
    }

    @JsonProperty("commentary")
    public void setCommentary(Boolean commentary) {
        this.commentary = commentary;
    }

    @JsonProperty("deeper_play_by_play")
    public Boolean getDeeperPlayByPlay() {
        return deeperPlayByPlay;
    }

    @JsonProperty("deeper_play_by_play")
    public void setDeeperPlayByPlay(Boolean deeperPlayByPlay) {
        this.deeperPlayByPlay = deeperPlayByPlay;
    }

    @JsonProperty("deeper_player_stats")
    public Boolean getDeeperPlayerStats() {
        return deeperPlayerStats;
    }

    @JsonProperty("deeper_player_stats")
    public void setDeeperPlayerStats(Boolean deeperPlayerStats) {
        this.deeperPlayerStats = deeperPlayerStats;
    }

    @JsonProperty("deeper_team_stats")
    public Boolean getDeeperTeamStats() {
        return deeperTeamStats;
    }

    @JsonProperty("deeper_team_stats")
    public void setDeeperTeamStats(Boolean deeperTeamStats) {
        this.deeperTeamStats = deeperTeamStats;
    }

    @JsonProperty("extended_player_stats")
    public Boolean getExtendedPlayerStats() {
        return extendedPlayerStats;
    }

    @JsonProperty("extended_player_stats")
    public void setExtendedPlayerStats(Boolean extendedPlayerStats) {
        this.extendedPlayerStats = extendedPlayerStats;
    }

    @JsonProperty("extended_team_stats")
    public Boolean getExtendedTeamStats() {
        return extendedTeamStats;
    }

    @JsonProperty("extended_team_stats")
    public void setExtendedTeamStats(Boolean extendedTeamStats) {
        this.extendedTeamStats = extendedTeamStats;
    }

    @JsonProperty("fun_facts")
    public Boolean getFunFacts() {
        return funFacts;
    }

    @JsonProperty("fun_facts")
    public void setFunFacts(Boolean funFacts) {
        this.funFacts = funFacts;
    }

    @JsonProperty("game_clock")
    public Boolean getGameClock() {
        return gameClock;
    }

    @JsonProperty("game_clock")
    public void setGameClock(Boolean gameClock) {
        this.gameClock = gameClock;
    }

    @JsonProperty("goal_scorers")
    public Boolean getGoalScorers() {
        return goalScorers;
    }

    @JsonProperty("goal_scorers")
    public void setGoalScorers(Boolean goalScorers) {
        this.goalScorers = goalScorers;
    }

    @JsonProperty("lineups")
    public Boolean getLineups() {
        return lineups;
    }

    @JsonProperty("lineups")
    public void setLineups(Boolean lineups) {
        this.lineups = lineups;
    }

    @JsonProperty("lineups_availability")
    public String getLineupsAvailability() {
        return lineupsAvailability;
    }

    @JsonProperty("lineups_availability")
    public void setLineupsAvailability(String lineupsAvailability) {
        this.lineupsAvailability = lineupsAvailability;
    }

    @JsonProperty("probabilities")
    public Boolean getProbabilities() {
        return probabilities;
    }

    @JsonProperty("probabilities")
    public void setProbabilities(Boolean probabilities) {
        this.probabilities = probabilities;
    }

    @JsonProperty("scores")
    public String getScores() {
        return scores;
    }

    @JsonProperty("scores")
    public void setScores(String scores) {
        this.scores = scores;
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
