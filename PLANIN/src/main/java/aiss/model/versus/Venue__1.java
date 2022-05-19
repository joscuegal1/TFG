
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
    "capacity",
    "changed",
    "city_name",
    "country_code",
    "country_name",
    "id",
    "map_coordinates",
    "name",
    "reduced_capacity",
    "reduced_capacity_max"
})
@Generated("jsonschema2pojo")
public class Venue__1 {

    @JsonProperty("capacity")
    private Integer capacity;
    @JsonProperty("changed")
    private Boolean changed;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("id")
    private String id;
    @JsonProperty("map_coordinates")
    private String mapCoordinates;
    @JsonProperty("name")
    private String name;
    @JsonProperty("reduced_capacity")
    private Boolean reducedCapacity;
    @JsonProperty("reduced_capacity_max")
    private Integer reducedCapacityMax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("capacity")
    public Integer getCapacity() {
        return capacity;
    }

    @JsonProperty("capacity")
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @JsonProperty("changed")
    public Boolean getChanged() {
        return changed;
    }

    @JsonProperty("changed")
    public void setChanged(Boolean changed) {
        this.changed = changed;
    }

    @JsonProperty("city_name")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("city_name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("country_name")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("map_coordinates")
    public String getMapCoordinates() {
        return mapCoordinates;
    }

    @JsonProperty("map_coordinates")
    public void setMapCoordinates(String mapCoordinates) {
        this.mapCoordinates = mapCoordinates;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("reduced_capacity")
    public Boolean getReducedCapacity() {
        return reducedCapacity;
    }

    @JsonProperty("reduced_capacity")
    public void setReducedCapacity(Boolean reducedCapacity) {
        this.reducedCapacity = reducedCapacity;
    }

    @JsonProperty("reduced_capacity_max")
    public Integer getReducedCapacityMax() {
        return reducedCapacityMax;
    }

    @JsonProperty("reduced_capacity_max")
    public void setReducedCapacityMax(Integer reducedCapacityMax) {
        this.reducedCapacityMax = reducedCapacityMax;
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
