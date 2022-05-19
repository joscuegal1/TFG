
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
    "ball_possession",
    "cards_given",
    "corner_kicks",
    "fouls",
    "free_kicks",
    "goal_kicks",
    "injuries",
    "offsides",
    "penalties_missed",
    "red_cards",
    "shots_blocked",
    "shots_off_target",
    "shots_on_target",
    "shots_saved",
    "shots_total",
    "substitutions",
    "throw_ins",
    "yellow_cards",
    "yellow_red_cards"
})
@Generated("jsonschema2pojo")
public class Statistics__4 {

    @JsonProperty("ball_possession")
    private Integer ballPossession;
    @JsonProperty("cards_given")
    private Integer cardsGiven;
    @JsonProperty("corner_kicks")
    private Integer cornerKicks;
    @JsonProperty("fouls")
    private Integer fouls;
    @JsonProperty("free_kicks")
    private Integer freeKicks;
    @JsonProperty("goal_kicks")
    private Integer goalKicks;
    @JsonProperty("injuries")
    private Integer injuries;
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
    @JsonProperty("shots_on_target")
    private Integer shotsOnTarget;
    @JsonProperty("shots_saved")
    private Integer shotsSaved;
    @JsonProperty("shots_total")
    private Integer shotsTotal;
    @JsonProperty("substitutions")
    private Integer substitutions;
    @JsonProperty("throw_ins")
    private Integer throwIns;
    @JsonProperty("yellow_cards")
    private Integer yellowCards;
    @JsonProperty("yellow_red_cards")
    private Integer yellowRedCards;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ball_possession")
    public Integer getBallPossession() {
        return ballPossession;
    }

    @JsonProperty("ball_possession")
    public void setBallPossession(Integer ballPossession) {
        this.ballPossession = ballPossession;
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

    @JsonProperty("fouls")
    public Integer getFouls() {
        return fouls;
    }

    @JsonProperty("fouls")
    public void setFouls(Integer fouls) {
        this.fouls = fouls;
    }

    @JsonProperty("free_kicks")
    public Integer getFreeKicks() {
        return freeKicks;
    }

    @JsonProperty("free_kicks")
    public void setFreeKicks(Integer freeKicks) {
        this.freeKicks = freeKicks;
    }

    @JsonProperty("goal_kicks")
    public Integer getGoalKicks() {
        return goalKicks;
    }

    @JsonProperty("goal_kicks")
    public void setGoalKicks(Integer goalKicks) {
        this.goalKicks = goalKicks;
    }

    @JsonProperty("injuries")
    public Integer getInjuries() {
        return injuries;
    }

    @JsonProperty("injuries")
    public void setInjuries(Integer injuries) {
        this.injuries = injuries;
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

    @JsonProperty("shots_on_target")
    public Integer getShotsOnTarget() {
        return shotsOnTarget;
    }

    @JsonProperty("shots_on_target")
    public void setShotsOnTarget(Integer shotsOnTarget) {
        this.shotsOnTarget = shotsOnTarget;
    }

    @JsonProperty("shots_saved")
    public Integer getShotsSaved() {
        return shotsSaved;
    }

    @JsonProperty("shots_saved")
    public void setShotsSaved(Integer shotsSaved) {
        this.shotsSaved = shotsSaved;
    }

    @JsonProperty("shots_total")
    public Integer getShotsTotal() {
        return shotsTotal;
    }

    @JsonProperty("shots_total")
    public void setShotsTotal(Integer shotsTotal) {
        this.shotsTotal = shotsTotal;
    }

    @JsonProperty("substitutions")
    public Integer getSubstitutions() {
        return substitutions;
    }

    @JsonProperty("substitutions")
    public void setSubstitutions(Integer substitutions) {
        this.substitutions = substitutions;
    }

    @JsonProperty("throw_ins")
    public Integer getThrowIns() {
        return throwIns;
    }

    @JsonProperty("throw_ins")
    public void setThrowIns(Integer throwIns) {
        this.throwIns = throwIns;
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
