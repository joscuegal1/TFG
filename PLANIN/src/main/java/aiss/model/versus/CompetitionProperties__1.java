
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
    "missing_players",
    "player_transfer_history",
    "schedules",
    "season_player_statistics",
    "season_probabilities",
    "season_stats_leaders",
    "season_team_statistics",
    "standings",
    "team_squads"
})
@Generated("jsonschema2pojo")
public class CompetitionProperties__1 {

    @JsonProperty("brackets")
    private Boolean brackets;
    @JsonProperty("missing_players")
    private Boolean missingPlayers;
    @JsonProperty("player_transfer_history")
    private Boolean playerTransferHistory;
    @JsonProperty("schedules")
    private Boolean schedules;
    @JsonProperty("season_player_statistics")
    private Boolean seasonPlayerStatistics;
    @JsonProperty("season_probabilities")
    private Boolean seasonProbabilities;
    @JsonProperty("season_stats_leaders")
    private Boolean seasonStatsLeaders;
    @JsonProperty("season_team_statistics")
    private Boolean seasonTeamStatistics;
    @JsonProperty("standings")
    private String standings;
    @JsonProperty("team_squads")
    private Boolean teamSquads;
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

    @JsonProperty("missing_players")
    public Boolean getMissingPlayers() {
        return missingPlayers;
    }

    @JsonProperty("missing_players")
    public void setMissingPlayers(Boolean missingPlayers) {
        this.missingPlayers = missingPlayers;
    }

    @JsonProperty("player_transfer_history")
    public Boolean getPlayerTransferHistory() {
        return playerTransferHistory;
    }

    @JsonProperty("player_transfer_history")
    public void setPlayerTransferHistory(Boolean playerTransferHistory) {
        this.playerTransferHistory = playerTransferHistory;
    }

    @JsonProperty("schedules")
    public Boolean getSchedules() {
        return schedules;
    }

    @JsonProperty("schedules")
    public void setSchedules(Boolean schedules) {
        this.schedules = schedules;
    }

    @JsonProperty("season_player_statistics")
    public Boolean getSeasonPlayerStatistics() {
        return seasonPlayerStatistics;
    }

    @JsonProperty("season_player_statistics")
    public void setSeasonPlayerStatistics(Boolean seasonPlayerStatistics) {
        this.seasonPlayerStatistics = seasonPlayerStatistics;
    }

    @JsonProperty("season_probabilities")
    public Boolean getSeasonProbabilities() {
        return seasonProbabilities;
    }

    @JsonProperty("season_probabilities")
    public void setSeasonProbabilities(Boolean seasonProbabilities) {
        this.seasonProbabilities = seasonProbabilities;
    }

    @JsonProperty("season_stats_leaders")
    public Boolean getSeasonStatsLeaders() {
        return seasonStatsLeaders;
    }

    @JsonProperty("season_stats_leaders")
    public void setSeasonStatsLeaders(Boolean seasonStatsLeaders) {
        this.seasonStatsLeaders = seasonStatsLeaders;
    }

    @JsonProperty("season_team_statistics")
    public Boolean getSeasonTeamStatistics() {
        return seasonTeamStatistics;
    }

    @JsonProperty("season_team_statistics")
    public void setSeasonTeamStatistics(Boolean seasonTeamStatistics) {
        this.seasonTeamStatistics = seasonTeamStatistics;
    }

    @JsonProperty("standings")
    public String getStandings() {
        return standings;
    }

    @JsonProperty("standings")
    public void setStandings(String standings) {
        this.standings = standings;
    }

    @JsonProperty("team_squads")
    public Boolean getTeamSquads() {
        return teamSquads;
    }

    @JsonProperty("team_squads")
    public void setTeamSquads(Boolean teamSquads) {
        this.teamSquads = teamSquads;
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
