
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
    "away_score",
    "home_score",
    "number",
    "type"
})
@Generated("jsonschema2pojo")
public class PeriodScore {

    @JsonProperty("away_score")
    private Integer awayScore;
    @JsonProperty("home_score")
    private Integer homeScore;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("away_score")
    public Integer getAwayScore() {
        return awayScore;
    }

    @JsonProperty("away_score")
    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    @JsonProperty("home_score")
    public Integer getHomeScore() {
        return homeScore;
    }

    @JsonProperty("home_score")
    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
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
