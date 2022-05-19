
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
    "generated_at",
    "summaries"
})
@Generated("jsonschema2pojo")
public class Racha {

    @JsonProperty("generated_at")
    private String generatedAt;
    @JsonProperty("summaries")
    private List<Summary> summaries = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("generated_at")
    public String getGeneratedAt() {
        return generatedAt;
    }

    @JsonProperty("generated_at")
    public void setGeneratedAt(String generatedAt) {
        this.generatedAt = generatedAt;
    }

    @JsonProperty("summaries")
    public List<Summary> getSummaries() {
        return summaries;
    }

    @JsonProperty("summaries")
    public void setSummaries(List<Summary> summaries) {
        this.summaries = summaries;
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
