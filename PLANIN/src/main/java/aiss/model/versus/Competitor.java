
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
    "abbreviation",
    "age_group",
    "country",
    "country_code",
    "form",
    "gender",
    "id",
    "name",
    "other_season_id",
    "qualifier",
    "virtual"
})
@Generated("jsonschema2pojo")
public class Competitor {

    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("age_group")
    private String ageGroup;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("form")
    private String form;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("other_season_id")
    private String otherSeasonId;
    @JsonProperty("qualifier")
    private String qualifier;
    @JsonProperty("virtual")
    private Boolean virtual;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("age_group")
    public String getAgeGroup() {
        return ageGroup;
    }

    @JsonProperty("age_group")
    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("form")
    public String getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(String form) {
        this.form = form;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
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

    @JsonProperty("other_season_id")
    public String getOtherSeasonId() {
        return otherSeasonId;
    }

    @JsonProperty("other_season_id")
    public void setOtherSeasonId(String otherSeasonId) {
        this.otherSeasonId = otherSeasonId;
    }

    @JsonProperty("qualifier")
    public String getQualifier() {
        return qualifier;
    }

    @JsonProperty("qualifier")
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    @JsonProperty("virtual")
    public Boolean getVirtual() {
        return virtual;
    }

    @JsonProperty("virtual")
    public void setVirtual(Boolean virtual) {
        this.virtual = virtual;
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
