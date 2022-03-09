
package aiss.model.estadisticas;

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
    "average_ball_possession",
    "cards_given",
    "corner_kicks",
    "free_kicks",
    "goals_by_foot",
    "goals_by_head",
    "goals_conceded",
    "goals_conceded_first_half",
    "goals_conceded_second_half",
    "goals_scored",
    "goals_scored_first_half",
    "goals_scored_second_half",
    "matches_played",
    "offsides",
    "penalties_missed",
    "red_cards",
    "shots_blocked",
    "shots_off_target",
    "shots_on_bar",
    "shots_on_post",
    "shots_on_target",
    "shots_total",
    "yellow_cards",
    "yellow_red_cards"
})
@Generated("jsonschema2pojo")
public class Statistics__1 {

    @JsonProperty("average_ball_possession")
    private Integer averageBallPossession;
    @JsonProperty("cards_given")
    private Integer cardsGiven;
    @JsonProperty("corner_kicks")
    private Integer cornerKicks;
    @JsonProperty("free_kicks")
    private Integer freeKicks;
    @JsonProperty("goals_by_foot")
    private Integer goalsByFoot;
    @JsonProperty("goals_by_head")
    private Integer goalsByHead;
    @JsonProperty("goals_conceded")
    private Integer goalsConceded;
    @JsonProperty("goals_conceded_first_half")
    private Integer goalsConcededFirstHalf;
    @JsonProperty("goals_conceded_second_half")
    private Integer goalsConcededSecondHalf;
    @JsonProperty("goals_scored")
    private Integer goalsScored;
    @JsonProperty("goals_scored_first_half")
    private Integer goalsScoredFirstHalf;
    @JsonProperty("goals_scored_second_half")
    private Integer goalsScoredSecondHalf;
    @JsonProperty("matches_played")
    private Integer matchesPlayed;
    @JsonProperty("offsides")
    private Integer offsides;
    @JsonProperty("penalties_missed")
    private Integer penaltiesMissed;
    @JsonProperty("red_cards")
    private Integer redCards;
    @JsonProperty("shots_blocked")
    private Integer shotsBlocked;
    @JsonProperty("shots_off_target")
    private Integer shotsOffTarget;
    @JsonProperty("shots_on_bar")
    private Integer shotsOnBar;
    @JsonProperty("shots_on_post")
    private Integer shotsOnPost;
    @JsonProperty("shots_on_target")
    private Integer shotsOnTarget;
    @JsonProperty("shots_total")
    private Integer shotsTotal;
    @JsonProperty("yellow_cards")
    private Integer yellowCards;
    @JsonProperty("yellow_red_cards")
    private Integer yellowRedCards;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("average_ball_possession")
    public Integer getAverageBallPossession() {
        return averageBallPossession;
    }

    @JsonProperty("average_ball_possession")
    public void setAverageBallPossession(Integer averageBallPossession) {
        this.averageBallPossession = averageBallPossession;
    }

    @JsonProperty("cards_given")
    public Integer getCardsGiven() {
        return cardsGiven;
    }

    @JsonProperty("cards_given")
    public void setCardsGiven(Integer cardsGiven) {
        this.cardsGiven = cardsGiven;
    }

    @JsonProperty("corner_kicks")
    public Integer getCornerKicks() {
        return cornerKicks;
    }

    @JsonProperty("corner_kicks")
    public void setCornerKicks(Integer cornerKicks) {
        this.cornerKicks = cornerKicks;
    }

    @JsonProperty("free_kicks")
    public Integer getFreeKicks() {
        return freeKicks;
    }

    @JsonProperty("free_kicks")
    public void setFreeKicks(Integer freeKicks) {
        this.freeKicks = freeKicks;
    }

    @JsonProperty("goals_by_foot")
    public Integer getGoalsByFoot() {
        return goalsByFoot;
    }

    @JsonProperty("goals_by_foot")
    public void setGoalsByFoot(Integer goalsByFoot) {
        this.goalsByFoot = goalsByFoot;
    }

    @JsonProperty("goals_by_head")
    public Integer getGoalsByHead() {
        return goalsByHead;
    }

    @JsonProperty("goals_by_head")
    public void setGoalsByHead(Integer goalsByHead) {
        this.goalsByHead = goalsByHead;
    }

    @JsonProperty("goals_conceded")
    public Integer getGoalsConceded() {
        return goalsConceded;
    }

    @JsonProperty("goals_conceded")
    public void setGoalsConceded(Integer goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    @JsonProperty("goals_conceded_first_half")
    public Integer getGoalsConcededFirstHalf() {
        return goalsConcededFirstHalf;
    }

    @JsonProperty("goals_conceded_first_half")
    public void setGoalsConcededFirstHalf(Integer goalsConcededFirstHalf) {
        this.goalsConcededFirstHalf = goalsConcededFirstHalf;
    }

    @JsonProperty("goals_conceded_second_half")
    public Integer getGoalsConcededSecondHalf() {
        return goalsConcededSecondHalf;
    }

    @JsonProperty("goals_conceded_second_half")
    public void setGoalsConcededSecondHalf(Integer goalsConcededSecondHalf) {
        this.goalsConcededSecondHalf = goalsConcededSecondHalf;
    }

    @JsonProperty("goals_scored")
    public Integer getGoalsScored() {
        return goalsScored;
    }

    @JsonProperty("goals_scored")
    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    @JsonProperty("goals_scored_first_half")
    public Integer getGoalsScoredFirstHalf() {
        return goalsScoredFirstHalf;
    }

    @JsonProperty("goals_scored_first_half")
    public void setGoalsScoredFirstHalf(Integer goalsScoredFirstHalf) {
        this.goalsScoredFirstHalf = goalsScoredFirstHalf;
    }

    @JsonProperty("goals_scored_second_half")
    public Integer getGoalsScoredSecondHalf() {
        return goalsScoredSecondHalf;
    }

    @JsonProperty("goals_scored_second_half")
    public void setGoalsScoredSecondHalf(Integer goalsScoredSecondHalf) {
        this.goalsScoredSecondHalf = goalsScoredSecondHalf;
    }

    @JsonProperty("matches_played")
    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    @JsonProperty("matches_played")
    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    @JsonProperty("offsides")
    public Integer getOffsides() {
        return offsides;
    }

    @JsonProperty("offsides")
    public void setOffsides(Integer offsides) {
        this.offsides = offsides;
    }

    @JsonProperty("penalties_missed")
    public Integer getPenaltiesMissed() {
        return penaltiesMissed;
    }

    @JsonProperty("penalties_missed")
    public void setPenaltiesMissed(Integer penaltiesMissed) {
        this.penaltiesMissed = penaltiesMissed;
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

    @JsonProperty("shots_off_target")
    public Integer getShotsOffTarget() {
        return shotsOffTarget;
    }

    @JsonProperty("shots_off_target")
    public void setShotsOffTarget(Integer shotsOffTarget) {
        this.shotsOffTarget = shotsOffTarget;
    }

    @JsonProperty("shots_on_bar")
    public Integer getShotsOnBar() {
        return shotsOnBar;
    }

    @JsonProperty("shots_on_bar")
    public void setShotsOnBar(Integer shotsOnBar) {
        this.shotsOnBar = shotsOnBar;
    }

    @JsonProperty("shots_on_post")
    public Integer getShotsOnPost() {
        return shotsOnPost;
    }

    @JsonProperty("shots_on_post")
    public void setShotsOnPost(Integer shotsOnPost) {
        this.shotsOnPost = shotsOnPost;
    }

    @JsonProperty("shots_on_target")
    public Integer getShotsOnTarget() {
        return shotsOnTarget;
    }

    @JsonProperty("shots_on_target")
    public void setShotsOnTarget(Integer shotsOnTarget) {
        this.shotsOnTarget = shotsOnTarget;
    }

    @JsonProperty("shots_total")
    public Integer getShotsTotal() {
        return shotsTotal;
    }

    @JsonProperty("shots_total")
    public void setShotsTotal(Integer shotsTotal) {
        this.shotsTotal = shotsTotal;
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
