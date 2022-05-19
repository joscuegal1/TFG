
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
    "aggregate_away_score",
    "aggregate_home_score",
    "aggregate_winner_id",
    "away_normaltime_score",
    "away_overtime_score",
    "away_score",
    "ball_locations",
    "clock",
    "decided_by_fed",
    "home_normaltime_score",
    "home_overtime_score",
    "home_score",
    "match_situation",
    "match_status",
    "match_tie",
    "period_scores",
    "scout_abandoned",
    "status",
    "winner_id"
})
@Generated("jsonschema2pojo")
public class SportEventStatus {

    @JsonProperty("aggregate_away_score")
    private Integer aggregateAwayScore;
    @JsonProperty("aggregate_home_score")
    private Integer aggregateHomeScore;
    @JsonProperty("aggregate_winner_id")
    private String aggregateWinnerId;
    @JsonProperty("away_normaltime_score")
    private Integer awayNormaltimeScore;
    @JsonProperty("away_overtime_score")
    private Integer awayOvertimeScore;
    @JsonProperty("away_score")
    private Integer awayScore;
    @JsonProperty("ball_locations")
    private List<BallLocation> ballLocations = null;
    @JsonProperty("clock")
    private Clock clock;
    @JsonProperty("decided_by_fed")
    private Boolean decidedByFed;
    @JsonProperty("home_normaltime_score")
    private Integer homeNormaltimeScore;
    @JsonProperty("home_overtime_score")
    private Integer homeOvertimeScore;
    @JsonProperty("home_score")
    private Integer homeScore;
    @JsonProperty("match_situation")
    private MatchSituation matchSituation;
    @JsonProperty("match_status")
    private String matchStatus;
    @JsonProperty("match_tie")
    private Boolean matchTie;
    @JsonProperty("period_scores")
    private List<PeriodScore> periodScores = null;
    @JsonProperty("scout_abandoned")
    private Boolean scoutAbandoned;
    @JsonProperty("status")
    private String status;
    @JsonProperty("winner_id")
    private String winnerId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("aggregate_away_score")
    public Integer getAggregateAwayScore() {
        return aggregateAwayScore;
    }

    @JsonProperty("aggregate_away_score")
    public void setAggregateAwayScore(Integer aggregateAwayScore) {
        this.aggregateAwayScore = aggregateAwayScore;
    }

    @JsonProperty("aggregate_home_score")
    public Integer getAggregateHomeScore() {
        return aggregateHomeScore;
    }

    @JsonProperty("aggregate_home_score")
    public void setAggregateHomeScore(Integer aggregateHomeScore) {
        this.aggregateHomeScore = aggregateHomeScore;
    }

    @JsonProperty("aggregate_winner_id")
    public String getAggregateWinnerId() {
        return aggregateWinnerId;
    }

    @JsonProperty("aggregate_winner_id")
    public void setAggregateWinnerId(String aggregateWinnerId) {
        this.aggregateWinnerId = aggregateWinnerId;
    }

    @JsonProperty("away_normaltime_score")
    public Integer getAwayNormaltimeScore() {
        return awayNormaltimeScore;
    }

    @JsonProperty("away_normaltime_score")
    public void setAwayNormaltimeScore(Integer awayNormaltimeScore) {
        this.awayNormaltimeScore = awayNormaltimeScore;
    }

    @JsonProperty("away_overtime_score")
    public Integer getAwayOvertimeScore() {
        return awayOvertimeScore;
    }

    @JsonProperty("away_overtime_score")
    public void setAwayOvertimeScore(Integer awayOvertimeScore) {
        this.awayOvertimeScore = awayOvertimeScore;
    }

    @JsonProperty("away_score")
    public Integer getAwayScore() {
        return awayScore;
    }

    @JsonProperty("away_score")
    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    @JsonProperty("ball_locations")
    public List<BallLocation> getBallLocations() {
        return ballLocations;
    }

    @JsonProperty("ball_locations")
    public void setBallLocations(List<BallLocation> ballLocations) {
        this.ballLocations = ballLocations;
    }

    @JsonProperty("clock")
    public Clock getClock() {
        return clock;
    }

    @JsonProperty("clock")
    public void setClock(Clock clock) {
        this.clock = clock;
    }

    @JsonProperty("decided_by_fed")
    public Boolean getDecidedByFed() {
        return decidedByFed;
    }

    @JsonProperty("decided_by_fed")
    public void setDecidedByFed(Boolean decidedByFed) {
        this.decidedByFed = decidedByFed;
    }

    @JsonProperty("home_normaltime_score")
    public Integer getHomeNormaltimeScore() {
        return homeNormaltimeScore;
    }

    @JsonProperty("home_normaltime_score")
    public void setHomeNormaltimeScore(Integer homeNormaltimeScore) {
        this.homeNormaltimeScore = homeNormaltimeScore;
    }

    @JsonProperty("home_overtime_score")
    public Integer getHomeOvertimeScore() {
        return homeOvertimeScore;
    }

    @JsonProperty("home_overtime_score")
    public void setHomeOvertimeScore(Integer homeOvertimeScore) {
        this.homeOvertimeScore = homeOvertimeScore;
    }

    @JsonProperty("home_score")
    public Integer getHomeScore() {
        return homeScore;
    }

    @JsonProperty("home_score")
    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    @JsonProperty("match_situation")
    public MatchSituation getMatchSituation() {
        return matchSituation;
    }

    @JsonProperty("match_situation")
    public void setMatchSituation(MatchSituation matchSituation) {
        this.matchSituation = matchSituation;
    }

    @JsonProperty("match_status")
    public String getMatchStatus() {
        return matchStatus;
    }

    @JsonProperty("match_status")
    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    @JsonProperty("match_tie")
    public Boolean getMatchTie() {
        return matchTie;
    }

    @JsonProperty("match_tie")
    public void setMatchTie(Boolean matchTie) {
        this.matchTie = matchTie;
    }

    @JsonProperty("period_scores")
    public List<PeriodScore> getPeriodScores() {
        return periodScores;
    }

    @JsonProperty("period_scores")
    public void setPeriodScores(List<PeriodScore> periodScores) {
        this.periodScores = periodScores;
    }

    @JsonProperty("scout_abandoned")
    public Boolean getScoutAbandoned() {
        return scoutAbandoned;
    }

    @JsonProperty("scout_abandoned")
    public void setScoutAbandoned(Boolean scoutAbandoned) {
        this.scoutAbandoned = scoutAbandoned;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("winner_id")
    public String getWinnerId() {
        return winnerId;
    }

    @JsonProperty("winner_id")
    public void setWinnerId(String winnerId) {
        this.winnerId = winnerId;
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
