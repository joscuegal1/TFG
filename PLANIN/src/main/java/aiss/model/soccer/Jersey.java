
package aiss.model.soccer;

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
    "base",
    "horizontal_stripes",
    "horizontal_stripes_color",
    "number",
    "shirt_type",
    "sleeve",
    "sleeve_detail",
    "split",
    "split_color",
    "squares",
    "squares_color",
    "stripes",
    "stripes_color",
    "type"
})
@Generated("jsonschema2pojo")
public class Jersey {

    @JsonProperty("base")
    private String base;
    @JsonProperty("horizontal_stripes")
    private Boolean horizontalStripes;
    @JsonProperty("horizontal_stripes_color")
    private String horizontalStripesColor;
    @JsonProperty("number")
    private String number;
    @JsonProperty("shirt_type")
    private String shirtType;
    @JsonProperty("sleeve")
    private String sleeve;
    @JsonProperty("sleeve_detail")
    private String sleeveDetail;
    @JsonProperty("split")
    private Boolean split;
    @JsonProperty("split_color")
    private String splitColor;
    @JsonProperty("squares")
    private Boolean squares;
    @JsonProperty("squares_color")
    private String squaresColor;
    @JsonProperty("stripes")
    private Boolean stripes;
    @JsonProperty("stripes_color")
    private String stripesColor;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    @JsonProperty("horizontal_stripes")
    public Boolean getHorizontalStripes() {
        return horizontalStripes;
    }

    @JsonProperty("horizontal_stripes")
    public void setHorizontalStripes(Boolean horizontalStripes) {
        this.horizontalStripes = horizontalStripes;
    }

    @JsonProperty("horizontal_stripes_color")
    public String getHorizontalStripesColor() {
        return horizontalStripesColor;
    }

    @JsonProperty("horizontal_stripes_color")
    public void setHorizontalStripesColor(String horizontalStripesColor) {
        this.horizontalStripesColor = horizontalStripesColor;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("shirt_type")
    public String getShirtType() {
        return shirtType;
    }

    @JsonProperty("shirt_type")
    public void setShirtType(String shirtType) {
        this.shirtType = shirtType;
    }

    @JsonProperty("sleeve")
    public String getSleeve() {
        return sleeve;
    }

    @JsonProperty("sleeve")
    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }

    @JsonProperty("sleeve_detail")
    public String getSleeveDetail() {
        return sleeveDetail;
    }

    @JsonProperty("sleeve_detail")
    public void setSleeveDetail(String sleeveDetail) {
        this.sleeveDetail = sleeveDetail;
    }

    @JsonProperty("split")
    public Boolean getSplit() {
        return split;
    }

    @JsonProperty("split")
    public void setSplit(Boolean split) {
        this.split = split;
    }

    @JsonProperty("split_color")
    public String getSplitColor() {
        return splitColor;
    }

    @JsonProperty("split_color")
    public void setSplitColor(String splitColor) {
        this.splitColor = splitColor;
    }

    @JsonProperty("squares")
    public Boolean getSquares() {
        return squares;
    }

    @JsonProperty("squares")
    public void setSquares(Boolean squares) {
        this.squares = squares;
    }

    @JsonProperty("squares_color")
    public String getSquaresColor() {
        return squaresColor;
    }

    @JsonProperty("squares_color")
    public void setSquaresColor(String squaresColor) {
        this.squaresColor = squaresColor;
    }

    @JsonProperty("stripes")
    public Boolean getStripes() {
        return stripes;
    }

    @JsonProperty("stripes")
    public void setStripes(Boolean stripes) {
        this.stripes = stripes;
    }

    @JsonProperty("stripes_color")
    public String getStripesColor() {
        return stripesColor;
    }

    @JsonProperty("stripes_color")
    public void setStripesColor(String stripesColor) {
        this.stripesColor = stripesColor;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
