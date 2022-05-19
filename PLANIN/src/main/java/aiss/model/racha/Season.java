
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
    "competition_id",
    "disabled",
    "end_date",
    "id",
    "name",
    "start_date",
    "year"
})
@Generated("jsonschema2pojo")
public class Season {

    @JsonProperty("competition_id")
    private String competitionId;
    @JsonProperty("disabled")
    private Boolean disabled;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("year")
    private String year;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("competition_id")
    public String getCompetitionId() {
        return competitionId;
    }

    @JsonProperty("competition_id")
    public void setCompetitionId(String competitionId) {
        this.competitionId = competitionId;
    }

    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    @JsonProperty("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @JsonProperty("end_date")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
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
