
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
    "attendance",
    "comment",
    "ground",
    "referees",
    "weather"
})
@Generated("jsonschema2pojo")
public class SportEventConditions__1 {

    @JsonProperty("attendance")
    private Attendance__1 attendance;
    @JsonProperty("comment")
    private Comment__1 comment;
    @JsonProperty("ground")
    private Ground__1 ground;
    @JsonProperty("referees")
    private List<Referee__1> referees = null;
    @JsonProperty("weather")
    private Weather__1 weather;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("attendance")
    public Attendance__1 getAttendance() {
        return attendance;
    }

    @JsonProperty("attendance")
    public void setAttendance(Attendance__1 attendance) {
        this.attendance = attendance;
    }

    @JsonProperty("comment")
    public Comment__1 getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(Comment__1 comment) {
        this.comment = comment;
    }

    @JsonProperty("ground")
    public Ground__1 getGround() {
        return ground;
    }

    @JsonProperty("ground")
    public void setGround(Ground__1 ground) {
        this.ground = ground;
    }

    @JsonProperty("referees")
    public List<Referee__1> getReferees() {
        return referees;
    }

    @JsonProperty("referees")
    public void setReferees(List<Referee__1> referees) {
        this.referees = referees;
    }

    @JsonProperty("weather")
    public Weather__1 getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(Weather__1 weather) {
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
