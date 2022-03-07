
package aiss.model.soccer;

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
    "category",
    "competitor",
    "generated_at",
    "jerseys",
    "manager",
    "players",
    "sport",
    "venue"
})
@Generated("jsonschema2pojo")
public class Soccer {

    @JsonProperty("category")
    private Category category;
    @JsonProperty("competitor")
    private Competitor competitor;
    @JsonProperty("generated_at")
    private String generatedAt;
    @JsonProperty("jerseys")
    private List<Jersey> jerseys = null;
    @JsonProperty("manager")
    private Manager manager;
    @JsonProperty("players")
    private List<Player> players = null;
    @JsonProperty("sport")
    private Sport sport;
    @JsonProperty("venue")
    private Venue venue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("competitor")
    public Competitor getCompetitor() {
        return competitor;
    }

    @JsonProperty("competitor")
    public void setCompetitor(Competitor competitor) {
        this.competitor = competitor;
    }

    @JsonProperty("generated_at")
    public String getGeneratedAt() {
        return generatedAt;
    }

    @JsonProperty("generated_at")
    public void setGeneratedAt(String generatedAt) {
        this.generatedAt = generatedAt;
    }

    @JsonProperty("jerseys")
    public List<Jersey> getJerseys() {
        return jerseys;
    }

    @JsonProperty("jerseys")
    public void setJerseys(List<Jersey> jerseys) {
        this.jerseys = jerseys;
    }

    @JsonProperty("manager")
    public Manager getManager() {
        return manager;
    }

    @JsonProperty("manager")
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @JsonProperty("players")
    public List<Player> getPlayers() {
        return players;
    }

    @JsonProperty("players")
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @JsonProperty("sport")
    public Sport getSport() {
        return sport;
    }

    @JsonProperty("sport")
    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @JsonProperty("venue")
    public Venue getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(Venue venue) {
        this.venue = venue;
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
