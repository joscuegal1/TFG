
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
    "periods",
    "totals"
})
@Generated("jsonschema2pojo")
public class Statistics__5 {

    @JsonProperty("periods")
    private List<Period__1> periods = null;
    @JsonProperty("totals")
    private Totals__1 totals;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("periods")
    public List<Period__1> getPeriods() {
        return periods;
    }

    @JsonProperty("periods")
    public void setPeriods(List<Period__1> periods) {
        this.periods = periods;
    }

    @JsonProperty("totals")
    public Totals__1 getTotals() {
        return totals;
    }

    @JsonProperty("totals")
    public void setTotals(Totals__1 totals) {
        this.totals = totals;
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
