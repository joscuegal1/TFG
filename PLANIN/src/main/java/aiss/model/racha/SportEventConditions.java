
package aiss.model.racha;

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
    "attendance",
    "comment",
    "ground",
    "referees",
    "weather"
})
@Generated("jsonschema2pojo")
public class SportEventConditions {

    @JsonProperty("attendance")
    private Attendance attendance;
    @JsonProperty("comment")
    private Comment comment;
    @JsonProperty("ground")
    private Ground ground;
    @JsonProperty("referees")
    private List<Referee> referees = null;
    @JsonProperty("weather")
    private Weather weather;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("attendance")
    public Attendance getAttendance() {
        return attendance;
    }

    @JsonProperty("attendance")
    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    @JsonProperty("comment")
    public Comment getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    @JsonProperty("ground")
    public Ground getGround() {
        return ground;
    }

    @JsonProperty("ground")
    public void setGround(Ground ground) {
        this.ground = ground;
    }

    @JsonProperty("referees")
    public List<Referee> getReferees() {
        return referees;
    }

    @JsonProperty("referees")
    public void setReferees(List<Referee> referees) {
        this.referees = referees;
    }

    @JsonProperty("weather")
    public Weather getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(Weather weather) {
        this.weather = weather;
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
