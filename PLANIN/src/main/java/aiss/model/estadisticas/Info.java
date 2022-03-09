
package aiss.model.estadisticas;

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
    "competition_status",
    "venue_reduced_capacity",
    "venue_reduced_capacity_max"
})
@Generated("jsonschema2pojo")
public class Info {

    @JsonProperty("competition_status")
    private String competitionStatus;
    @JsonProperty("venue_reduced_capacity")
    private Boolean venueReducedCapacity;
    @JsonProperty("venue_reduced_capacity_max")
    private Integer venueReducedCapacityMax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("competition_status")
    public String getCompetitionStatus() {
        return competitionStatus;
    }

    @JsonProperty("competition_status")
    public void setCompetitionStatus(String competitionStatus) {
        this.competitionStatus = competitionStatus;
    }

    @JsonProperty("venue_reduced_capacity")
    public Boolean getVenueReducedCapacity() {
        return venueReducedCapacity;
    }

    @JsonProperty("venue_reduced_capacity")
    public void setVenueReducedCapacity(Boolean venueReducedCapacity) {
        this.venueReducedCapacity = venueReducedCapacity;
    }

    @JsonProperty("venue_reduced_capacity_max")
    public Integer getVenueReducedCapacityMax() {
        return venueReducedCapacityMax;
    }

    @JsonProperty("venue_reduced_capacity_max")
    public void setVenueReducedCapacityMax(Integer venueReducedCapacityMax) {
        this.venueReducedCapacityMax = venueReducedCapacityMax;
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
