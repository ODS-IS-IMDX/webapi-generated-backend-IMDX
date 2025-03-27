package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.FacilityInformationAttributeFacilitySidListInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 設備情報
 */

@Schema(name = "facility_information_attribute", description = "設備情報")
@JsonTypeName("facility_information_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T11:59:31.262009200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class FacilityInformationAttribute {

  private Boolean isFacilityExist;

  @Valid
  private List<@Valid FacilityInformationAttributeFacilitySidListInner> facilitySidList = new ArrayList<>();

  public FacilityInformationAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FacilityInformationAttribute(Boolean isFacilityExist, List<@Valid FacilityInformationAttributeFacilitySidListInner> facilitySidList) {
    this.isFacilityExist = isFacilityExist;
    this.facilitySidList = facilitySidList;
  }

  public FacilityInformationAttribute isFacilityExist(Boolean isFacilityExist) {
    this.isFacilityExist = isFacilityExist;
    return this;
  }

  /**
   * 埋設物存否
   * @return isFacilityExist
  */
  @NotNull 
  @Schema(name = "isFacilityExist", example = "true", description = "埋設物存否", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isFacilityExist")
  public Boolean getIsFacilityExist() {
    return isFacilityExist;
  }

  public void setIsFacilityExist(Boolean isFacilityExist) {
    this.isFacilityExist = isFacilityExist;
  }

  public FacilityInformationAttribute facilitySidList(List<@Valid FacilityInformationAttributeFacilitySidListInner> facilitySidList) {
    this.facilitySidList = facilitySidList;
    return this;
  }

  public FacilityInformationAttribute addFacilitySidListItem(FacilityInformationAttributeFacilitySidListInner facilitySidListItem) {
    if (this.facilitySidList == null) {
      this.facilitySidList = new ArrayList<>();
    }
    this.facilitySidList.add(facilitySidListItem);
    return this;
  }

  /**
   * 設備空間情報リスト
   * @return facilitySidList
  */
  @NotNull @Valid 
  @Schema(name = "facilitySidList", description = "設備空間情報リスト", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("facilitySidList")
  public List<@Valid FacilityInformationAttributeFacilitySidListInner> getFacilitySidList() {
    return facilitySidList;
  }

  public void setFacilitySidList(List<@Valid FacilityInformationAttributeFacilitySidListInner> facilitySidList) {
    this.facilitySidList = facilitySidList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacilityInformationAttribute facilityInformationAttribute = (FacilityInformationAttribute) o;
    return Objects.equals(this.isFacilityExist, facilityInformationAttribute.isFacilityExist) &&
        Objects.equals(this.facilitySidList, facilityInformationAttribute.facilitySidList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFacilityExist, facilitySidList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacilityInformationAttribute {\n");
    sb.append("    isFacilityExist: ").append(toIndentedString(isFacilityExist)).append("\n");
    sb.append("    facilitySidList: ").append(toIndentedString(facilitySidList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

