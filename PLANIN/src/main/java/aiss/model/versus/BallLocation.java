
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
    "order",
    "qualifier",
    "x",
    "y"
})
@Generated("jsonschema2pojo")
public class BallLocation {

    @JsonProperty("order")
    private Integer order;
    @JsonProperty("qualifier")
    private String qualifier;
    @JsonProperty("x")
    private Integer x;
    @JsonProperty("y")
    private Integer y;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    @JsonProperty("qualifier")
    public String getQualifier() {
        return qualifier;
    }

    @JsonProperty("qualifier")
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    @JsonProperty("x")
    public Integer getX() {
        return x;
    }

    @JsonProperty("x")
    public void setX(Integer x) {
        this.x = x;
    }

    @JsonProperty("y")
    public Integer getY() {
        return y;
    }

    @JsonProperty("y")
    public void setY(Integer y) {
        this.y = y;
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
