
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
    "overall_conditions",
    "pitch_conditions"
})
@Generated("jsonschema2pojo")
public class Weather__1 {

    @JsonProperty("overall_conditions")
    private String overallConditions;
    @JsonProperty("pitch_conditions")
    private String pitchConditions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("overall_conditions")
    public String getOverallConditions() {
        return overallConditions;
    }

    @JsonProperty("overall_conditions")
    public void setOverallConditions(String overallConditions) {
        this.overallConditions = overallConditions;
    }

    @JsonProperty("pitch_conditions")
    public String getPitchConditions() {
        return pitchConditions;
    }

    @JsonProperty("pitch_conditions")
    public void setPitchConditions(String pitchConditions) {
        this.pitchConditions = pitchConditions;
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
