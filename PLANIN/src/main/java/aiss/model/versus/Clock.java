
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
    "played",
    "stoppage_time_announced",
    "stoppage_time_played"
})
@Generated("jsonschema2pojo")
public class Clock {

    @JsonProperty("played")
    private String played;
    @JsonProperty("stoppage_time_announced")
    private String stoppageTimeAnnounced;
    @JsonProperty("stoppage_time_played")
    private String stoppageTimePlayed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("played")
    public String getPlayed() {
        return played;
    }

    @JsonProperty("played")
    public void setPlayed(String played) {
        this.played = played;
    }

    @JsonProperty("stoppage_time_announced")
    public String getStoppageTimeAnnounced() {
        return stoppageTimeAnnounced;
    }

    @JsonProperty("stoppage_time_announced")
    public void setStoppageTimeAnnounced(String stoppageTimeAnnounced) {
        this.stoppageTimeAnnounced = stoppageTimeAnnounced;
    }

    @JsonProperty("stoppage_time_played")
    public String getStoppageTimePlayed() {
        return stoppageTimePlayed;
    }

    @JsonProperty("stoppage_time_played")
    public void setStoppageTimePlayed(String stoppageTimePlayed) {
        this.stoppageTimePlayed = stoppageTimePlayed;
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
