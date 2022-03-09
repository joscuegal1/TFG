
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
    "groups",
    "points_draw",
    "points_loss",
    "points_win",
    "round",
    "tie_break_rule",
    "type"
})
@Generated("jsonschema2pojo")
public class Standing {

    @JsonProperty("groups")
    private List<Group> groups = null;
    @JsonProperty("points_draw")
    private Integer pointsDraw;
    @JsonProperty("points_loss")
    private Integer pointsLoss;
    @JsonProperty("points_win")
    private Integer pointsWin;
    @JsonProperty("round")
    private Integer round;
    @JsonProperty("tie_break_rule")
    private String tieBreakRule;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("groups")
    public List<Group> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @JsonProperty("points_draw")
    public Integer getPointsDraw() {
        return pointsDraw;
    }

    @JsonProperty("points_draw")
    public void setPointsDraw(Integer pointsDraw) {
        this.pointsDraw = pointsDraw;
    }

    @JsonProperty("points_loss")
    public Integer getPointsLoss() {
        return pointsLoss;
    }

    @JsonProperty("points_loss")
    public void setPointsLoss(Integer pointsLoss) {
        this.pointsLoss = pointsLoss;
    }

    @JsonProperty("points_win")
    public Integer getPointsWin() {
        return pointsWin;
    }

    @JsonProperty("points_win")
    public void setPointsWin(Integer pointsWin) {
        this.pointsWin = pointsWin;
    }

    @JsonProperty("round")
    public Integer getRound() {
        return round;
    }

    @JsonProperty("round")
    public void setRound(Integer round) {
        this.round = round;
    }

    @JsonProperty("tie_break_rule")
    public String getTieBreakRule() {
        return tieBreakRule;
    }

    @JsonProperty("tie_break_rule")
    public void setTieBreakRule(String tieBreakRule) {
        this.tieBreakRule = tieBreakRule;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
