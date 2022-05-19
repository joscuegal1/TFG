
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
    "assists",
    "chances_created",
    "clearances",
    "corner_kicks",
    "crosses_successful",
    "crosses_total",
    "defensive_blocks",
    "diving_saves",
    "dribbles_completed",
    "fouls_committed",
    "goals_by_head",
    "goals_by_penalty",
    "goals_conceded",
    "goals_scored",
    "interceptions",
    "long_passes_successful",
    "long_passes_total",
    "long_passes_unsuccessful",
    "loss_of_possession",
    "minutes_played",
    "offsides",
    "own_goals",
    "passes_successful",
    "passes_total",
    "passes_unsuccessful",
    "penalties_faced",
    "penalties_missed",
    "penalties_saved",
    "red_cards",
    "shots_blocked",
    "shots_faced_saved",
    "shots_faced_total",
    "shots_off_target",
    "shots_on_target",
    "substituted_in",
    "substituted_out",
    "tackles_successful",
    "tackles_total",
    "was_fouled",
    "yellow_cards",
    "yellow_red_cards"
})
@Generated("jsonschema2pojo")
public class Statistics__1 {

    @JsonProperty("assists")
    private Integer assists;
    @JsonProperty("chances_created")
    private Integer chancesCreated;
    @JsonProperty("clearances")
    private Integer clearances;
    @JsonProperty("corner_kicks")
    private Integer cornerKicks;
    @JsonProperty("crosses_successful")
    private Integer crossesSuccessful;
    @JsonProperty("crosses_total")
    private Integer crossesTotal;
    @JsonProperty("defensive_blocks")
    private Integer defensiveBlocks;
    @JsonProperty("diving_saves")
    private Integer divingSaves;
    @JsonProperty("dribbles_completed")
    private Integer dribblesCompleted;
    @JsonProperty("fouls_committed")
    private Integer foulsCommitted;
    @JsonProperty("goals_by_head")
    private Integer goalsByHead;
    @JsonProperty("goals_by_penalty")
    private Integer goalsByPenalty;
    @JsonProperty("goals_conceded")
    private Integer goalsConceded;
    @JsonProperty("goals_scored")
    private Integer goalsScored;
    @JsonProperty("interceptions")
    private Integer interceptions;
    @JsonProperty("long_passes_successful")
    private Integer longPassesSuccessful;
    @JsonProperty("long_passes_total")
    private Integer longPassesTotal;
    @JsonProperty("long_passes_unsuccessful")
    private Integer longPassesUnsuccessful;
    @JsonProperty("loss_of_possession")
    private Integer lossOfPossession;
    @JsonProperty("minutes_played")
    private Integer minutesPlayed;
    @JsonProperty("offsides")
    private Integer offsides;
    @JsonProperty("own_goals")
    private Integer ownGoals;
    @JsonProperty("passes_successful")
    private Integer passesSuccessful;
    @JsonProperty("passes_total")
    private Integer passesTotal;
    @JsonProperty("passes_unsuccessful")
    private Integer passesUnsuccessful;
    @JsonProperty("penalties_faced")
    private Integer penaltiesFaced;
    @JsonProperty("penalties_missed")
    private Integer penaltiesMissed;
    @JsonProperty("penalties_saved")
    private Integer penaltiesSaved;
    @JsonProperty("red_cards")
    private Integer redCards;
    @JsonProperty("shots_blocked")
    private Integer shotsBlocked;
    @JsonProperty("shots_faced_saved")
    private Integer shotsFacedSaved;
    @JsonProperty("shots_faced_total")
    private Integer shotsFacedTotal;
    @JsonProperty("shots_off_target")
    private Integer shotsOffTarget;
    @JsonProperty("shots_on_target")
    private Integer shotsOnTarget;
    @JsonProperty("substituted_in")
    private Integer substitutedIn;
    @JsonProperty("substituted_out")
    private Integer substitutedOut;
    @JsonProperty("tackles_successful")
    private Integer tacklesSuccessful;
    @JsonProperty("tackles_total")
    private Integer tacklesTotal;
    @JsonProperty("was_fouled")
    private Integer wasFouled;
    @JsonProperty("yellow_cards")
    private Integer yellowCards;
    @JsonProperty("yellow_red_cards")
    private Integer yellowRedCards;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("assists")
    public Integer getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    @JsonProperty("chances_created")
    public Integer getChancesCreated() {
        return chancesCreated;
    }

    @JsonProperty("chances_created")
    public void setChancesCreated(Integer chancesCreated) {
        this.chancesCreated = chancesCreated;
    }

    @JsonProperty("clearances")
    public Integer getClearances() {
        return clearances;
    }

    @JsonProperty("clearances")
    public void setClearances(Integer clearances) {
        this.clearances = clearances;
    }

    @JsonProperty("corner_kicks")
    public Integer getCornerKicks() {
        return cornerKicks;
    }

    @JsonProperty("corner_kicks")
    public void setCornerKicks(Integer cornerKicks) {
        this.cornerKicks = cornerKicks;
    }

    @JsonProperty("crosses_successful")
    public Integer getCrossesSuccessful() {
        return crossesSuccessful;
    }

    @JsonProperty("crosses_successful")
    public void setCrossesSuccessful(Integer crossesSuccessful) {
        this.crossesSuccessful = crossesSuccessful;
    }

    @JsonProperty("crosses_total")
    public Integer getCrossesTotal() {
        return crossesTotal;
    }

    @JsonProperty("crosses_total")
    public void setCrossesTotal(Integer crossesTotal) {
        this.crossesTotal = crossesTotal;
    }

    @JsonProperty("defensive_blocks")
    public Integer getDefensiveBlocks() {
        return defensiveBlocks;
    }

    @JsonProperty("defensive_blocks")
    public void setDefensiveBlocks(Integer defensiveBlocks) {
        this.defensiveBlocks = defensiveBlocks;
    }

    @JsonProperty("diving_saves")
    public Integer getDivingSaves() {
        return divingSaves;
    }

    @JsonProperty("diving_saves")
    public void setDivingSaves(Integer divingSaves) {
        this.divingSaves = divingSaves;
    }

    @JsonProperty("dribbles_completed")
    public Integer getDribblesCompleted() {
        return dribblesCompleted;
    }

    @JsonProperty("dribbles_completed")
    public void setDribblesCompleted(Integer dribblesCompleted) {
        this.dribblesCompleted = dribblesCompleted;
    }

    @JsonProperty("fouls_committed")
    public Integer getFoulsCommitted() {
        return foulsCommitted;
    }

    @JsonProperty("fouls_committed")
    public void setFoulsCommitted(Integer foulsCommitted) {
        this.foulsCommitted = foulsCommitted;
    }

    @JsonProperty("goals_by_head")
    public Integer getGoalsByHead() {
        return goalsByHead;
    }

    @JsonProperty("goals_by_head")
    public void setGoalsByHead(Integer goalsByHead) {
        this.goalsByHead = goalsByHead;
    }

    @JsonProperty("goals_by_penalty")
    public Integer getGoalsByPenalty() {
        return goalsByPenalty;
    }

    @JsonProperty("goals_by_penalty")
    public void setGoalsByPenalty(Integer goalsByPenalty) {
        this.goalsByPenalty = goalsByPenalty;
    }

    @JsonProperty("goals_conceded")
    public Integer getGoalsConceded() {
        return goalsConceded;
    }

    @JsonProperty("goals_conceded")
    public void setGoalsConceded(Integer goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    @JsonProperty("goals_scored")
    public Integer getGoalsScored() {
        return goalsScored;
    }

    @JsonProperty("goals_scored")
    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    @JsonProperty("interceptions")
    public Integer getInterceptions() {
        return interceptions;
    }

    @JsonProperty("interceptions")
    public void setInterceptions(Integer interceptions) {
        this.interceptions = interceptions;
    }

    @JsonProperty("long_passes_successful")
    public Integer getLongPassesSuccessful() {
        return longPassesSuccessful;
    }

    @JsonProperty("long_passes_successful")
    public void setLongPassesSuccessful(Integer longPassesSuccessful) {
        this.longPassesSuccessful = longPassesSuccessful;
    }

    @JsonProperty("long_passes_total")
    public Integer getLongPassesTotal() {
        return longPassesTotal;
    }

    @JsonProperty("long_passes_total")
    public void setLongPassesTotal(Integer longPassesTotal) {
        this.longPassesTotal = longPassesTotal;
    }

    @JsonProperty("long_passes_unsuccessful")
    public Integer getLongPassesUnsuccessful() {
        return longPassesUnsuccessful;
    }

    @JsonProperty("long_passes_unsuccessful")
    public void setLongPassesUnsuccessful(Integer longPassesUnsuccessful) {
        this.longPassesUnsuccessful = longPassesUnsuccessful;
    }

    @JsonProperty("loss_of_possession")
    public Integer getLossOfPossession() {
        return lossOfPossession;
    }

    @JsonProperty("loss_of_possession")
    public void setLossOfPossession(Integer lossOfPossession) {
        this.lossOfPossession = lossOfPossession;
    }

    @JsonProperty("minutes_played")
    public Integer getMinutesPlayed() {
        return minutesPlayed;
    }

    @JsonProperty("minutes_played")
    public void setMinutesPlayed(Integer minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    @JsonProperty("offsides")
    public Integer getOffsides() {
        return offsides;
    }

    @JsonProperty("offsides")
    public void setOffsides(Integer offsides) {
        this.offsides = offsides;
    }

    @JsonProperty("own_goals")
    public Integer getOwnGoals() {
        return ownGoals;
    }

    @JsonProperty("own_goals")
    public void setOwnGoals(Integer ownGoals) {
        this.ownGoals = ownGoals;
    }

    @JsonProperty("passes_successful")
    public Integer getPassesSuccessful() {
        return passesSuccessful;
    }

    @JsonProperty("passes_successful")
    public void setPassesSuccessful(Integer passesSuccessful) {
        this.passesSuccessful = passesSuccessful;
    }

    @JsonProperty("passes_total")
    public Integer getPassesTotal() {
        return passesTotal;
    }

    @JsonProperty("passes_total")
    public void setPassesTotal(Integer passesTotal) {
        this.passesTotal = passesTotal;
    }

    @JsonProperty("passes_unsuccessful")
    public Integer getPassesUnsuccessful() {
        return passesUnsuccessful;
    }

    @JsonProperty("passes_unsuccessful")
    public void setPassesUnsuccessful(Integer passesUnsuccessful) {
        this.passesUnsuccessful = passesUnsuccessful;
    }

    @JsonProperty("penalties_faced")
    public Integer getPenaltiesFaced() {
        return penaltiesFaced;
    }

    @JsonProperty("penalties_faced")
    public void setPenaltiesFaced(Integer penaltiesFaced) {
        this.penaltiesFaced = penaltiesFaced;
    }

    @JsonProperty("penalties_missed")
    public Integer getPenaltiesMissed() {
        return penaltiesMissed;
    }

    @JsonProperty("penalties_missed")
    public void setPenaltiesMissed(Integer penaltiesMissed) {
        this.penaltiesMissed = penaltiesMissed;
    }

    @JsonProperty("penalties_saved")
    public Integer getPenaltiesSaved() {
        return penaltiesSaved;
    }

    @JsonProperty("penalties_saved")
    public void setPenaltiesSaved(Integer penaltiesSaved) {
        this.penaltiesSaved = penaltiesSaved;
    }

    @JsonProperty("red_cards")
    public Integer getRedCards() {
        return redCards;
    }

    @JsonProperty("red_cards")
    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

    @JsonProperty("shots_blocked")
    public Integer getShotsBlocked() {
        return shotsBlocked;
    }

    @JsonProperty("shots_blocked")
    public void setShotsBlocked(Integer shotsBlocked) {
        this.shotsBlocked = shotsBlocked;
    }

    @JsonProperty("shots_faced_saved")
    public Integer getShotsFacedSaved() {
        return shotsFacedSaved;
    }

    @JsonProperty("shots_faced_saved")
    public void setShotsFacedSaved(Integer shotsFacedSaved) {
        this.shotsFacedSaved = shotsFacedSaved;
    }

    @JsonProperty("shots_faced_total")
    public Integer getShotsFacedTotal() {
        return shotsFacedTotal;
    }

    @JsonProperty("shots_faced_total")
    public void setShotsFacedTotal(Integer shotsFacedTotal) {
        this.shotsFacedTotal = shotsFacedTotal;
    }

    @JsonProperty("shots_off_target")
    public Integer getShotsOffTarget() {
        return shotsOffTarget;
    }

    @JsonProperty("shots_off_target")
    public void setShotsOffTarget(Integer shotsOffTarget) {
        this.shotsOffTarget = shotsOffTarget;
    }

    @JsonProperty("shots_on_target")
    public Integer getShotsOnTarget() {
        return shotsOnTarget;
    }

    @JsonProperty("shots_on_target")
    public void setShotsOnTarget(Integer shotsOnTarget) {
        this.shotsOnTarget = shotsOnTarget;
    }

    @JsonProperty("substituted_in")
    public Integer getSubstitutedIn() {
        return substitutedIn;
    }

    @JsonProperty("substituted_in")
    public void setSubstitutedIn(Integer substitutedIn) {
        this.substitutedIn = substitutedIn;
    }

    @JsonProperty("substituted_out")
    public Integer getSubstitutedOut() {
        return substitutedOut;
    }

    @JsonProperty("substituted_out")
    public void setSubstitutedOut(Integer substitutedOut) {
        this.substitutedOut = substitutedOut;
    }

    @JsonProperty("tackles_successful")
    public Integer getTacklesSuccessful() {
        return tacklesSuccessful;
    }

    @JsonProperty("tackles_successful")
    public void setTacklesSuccessful(Integer tacklesSuccessful) {
        this.tacklesSuccessful = tacklesSuccessful;
    }

    @JsonProperty("tackles_total")
    public Integer getTacklesTotal() {
        return tacklesTotal;
    }

    @JsonProperty("tackles_total")
    public void setTacklesTotal(Integer tacklesTotal) {
        this.tacklesTotal = tacklesTotal;
    }

    @JsonProperty("was_fouled")
    public Integer getWasFouled() {
        return wasFouled;
    }

    @JsonProperty("was_fouled")
    public void setWasFouled(Integer wasFouled) {
        this.wasFouled = wasFouled;
    }

    @JsonProperty("yellow_cards")
    public Integer getYellowCards() {
        return yellowCards;
    }

    @JsonProperty("yellow_cards")
    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    @JsonProperty("yellow_red_cards")
    public Integer getYellowRedCards() {
        return yellowRedCards;
    }

    @JsonProperty("yellow_red_cards")
    public void setYellowRedCards(Integer yellowRedCards) {
        this.yellowRedCards = yellowRedCards;
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
