
package aiss.model.temporada;

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
    "comments",
    "group_name",
    "id",
    "live",
    "name",
    "parent_group_id",
    "stage",
    "standings"
})
@Generated("jsonschema2pojo")
public class Group {

    @JsonProperty("comments")
    private List<Comment> comments = null;
    @JsonProperty("group_name")
    private String groupName;
    @JsonProperty("id")
    private String id;
    @JsonProperty("live")
    private Boolean live;
    @JsonProperty("name")
    private String name;
    @JsonProperty("parent_group_id")
    private String parentGroupId;
    @JsonProperty("stage")
    private Stage stage;
    @JsonProperty("standings")
    private List<Standing__1> standings = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("comments")
    public List<Comment> getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @JsonProperty("group_name")
    public String getGroupName() {
        return groupName;
    }

    @JsonProperty("group_name")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("live")
    public Boolean getLive() {
        return live;
    }

    @JsonProperty("live")
    public void setLive(Boolean live) {
        this.live = live;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("parent_group_id")
    public String getParentGroupId() {
        return parentGroupId;
    }

    @JsonProperty("parent_group_id")
    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    @JsonProperty("stage")
    public Stage getStage() {
        return stage;
    }

    @JsonProperty("stage")
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @JsonProperty("standings")
    public List<Standing__1> getStandings() {
        return standings;
    }

    @JsonProperty("standings")
    public void setStandings(List<Standing__1> standings) {
        this.standings = standings;
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
