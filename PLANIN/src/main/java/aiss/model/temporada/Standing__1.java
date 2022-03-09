
package aiss.model.temporada;

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
    "change",
    "comments",
    "competitor",
    "current_outcome",
    "draw",
    "goals_against",
    "goals_diff",
    "goals_for",
    "loss",
    "played",
    "points",
    "points_per_game",
    "rank",
    "win"
})
@Generated("jsonschema2pojo")
public class Standing__1 {

    @JsonProperty("change")
    private Integer change;
    @JsonProperty("comments")
    private List<Comment__1> comments = null;
    @JsonProperty("competitor")
    private Competitor competitor;
    @JsonProperty("current_outcome")
    private String currentOutcome;
    @JsonProperty("draw")
    private Integer draw;
    @JsonProperty("goals_against")
    private Integer goalsAgainst;
    @JsonProperty("goals_diff")
    private Integer goalsDiff;
    @JsonProperty("goals_for")
    private Integer goalsFor;
    @JsonProperty("loss")
    private Integer loss;
    @JsonProperty("played")
    private Integer played;
    @JsonProperty("points")
    private Integer points;
    @JsonProperty("points_per_game")
    private Double pointsPerGame;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("win")
    private Integer win;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("change")
    public Integer getChange() {
        return change;
    }

    @JsonProperty("change")
    public void setChange(Integer change) {
        this.change = change;
    }

    @JsonProperty("comments")
    public List<Comment__1> getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(List<Comment__1> comments) {
        this.comments = comments;
    }

    @JsonProperty("competitor")
    public Competitor getCompetitor() {
        return competitor;
    }

    @JsonProperty("competitor")
    public void setCompetitor(Competitor competitor) {
        this.competitor = competitor;
    }

    @JsonProperty("current_outcome")
    public String getCurrentOutcome() {
        return currentOutcome;
    }

    @JsonProperty("current_outcome")
    public void setCurrentOutcome(String currentOutcome) {
        this.currentOutcome = currentOutcome;
    }

    @JsonProperty("draw")
    public Integer getDraw() {
        return draw;
    }

    @JsonProperty("draw")
    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    @JsonProperty("goals_against")
    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    @JsonProperty("goals_against")
    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    @JsonProperty("goals_diff")
    public Integer getGoalsDiff() {
        return goalsDiff;
    }

    @JsonProperty("goals_diff")
    public void setGoalsDiff(Integer goalsDiff) {
        this.goalsDiff = goalsDiff;
    }

    @JsonProperty("goals_for")
    public Integer getGoalsFor() {
        return goalsFor;
    }

    @JsonProperty("goals_for")
    public void setGoalsFor(Integer goalsFor) {
        this.goalsFor = goalsFor;
    }

    @JsonProperty("loss")
    public Integer getLoss() {
        return loss;
    }

    @JsonProperty("loss")
    public void setLoss(Integer loss) {
        this.loss = loss;
    }

    @JsonProperty("played")
    public Integer getPlayed() {
        return played;
    }

    @JsonProperty("played")
    public void setPlayed(Integer played) {
        this.played = played;
    }

    @JsonProperty("points")
    public Integer getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(Integer points) {
        this.points = points;
    }

    @JsonProperty("points_per_game")
    public Double getPointsPerGame() {
        return pointsPerGame;
    }

    @JsonProperty("points_per_game")
    public void setPointsPerGame(Double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("win")
    public Integer getWin() {
        return win;
    }

    @JsonProperty("win")
    public void setWin(Integer win) {
        this.win = win;
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
