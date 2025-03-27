package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 埋設物情報取得受付依頼
 */

@Schema(name = "facilityReception", description = "埋設物情報取得受付依頼")
@JsonTypeName("facilityReception")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-12T16:17:29.389688600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
public class FacilityReception {

  @Valid
  private List<String> infraCompanyIdList = new ArrayList<>();

  private Integer returnZoomLevel;

  @Valid
  private List<String> sidList = new ArrayList<>();

  private String updateDate;

  public FacilityReception() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FacilityReception(List<String> sidList) {
    this.sidList = sidList;
  }

  public FacilityReception infraCompanyIdList(List<String> infraCompanyIdList) {
    this.infraCompanyIdList = infraCompanyIdList;
    return this;
  }

  public FacilityReception addInfraCompanyIdListItem(String infraCompanyIdListItem) {
    if (this.infraCompanyIdList == null) {
      this.infraCompanyIdList = new ArrayList<>();
    }
    this.infraCompanyIdList.add(infraCompanyIdListItem);
    return this;
  }

  /**
   * インフラ事業者ID（配列）
   * @return infraCompanyIdList
  */
  
  @Schema(name = "infraCompanyIdList", example = "[\"12345678901234567890\",\"12345678901234567891\"]", description = "インフラ事業者ID（配列）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("infraCompanyIdList")
  public List<String> getInfraCompanyIdList() {
    return infraCompanyIdList;
  }

  public void setInfraCompanyIdList(List<String> infraCompanyIdList) {
    this.infraCompanyIdList = infraCompanyIdList;
  }

  public FacilityReception returnZoomLevel(Integer returnZoomLevel) {
    this.returnZoomLevel = returnZoomLevel;
    return this;
  }

  /**
   * 返却ズームレベル
   * @return returnZoomLevel
  */
  
  @Schema(name = "returnZoomLevel", example = "23", description = "返却ズームレベル", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnZoomLevel")
  public Integer getReturnZoomLevel() {
    return returnZoomLevel;
  }

  public void setReturnZoomLevel(Integer returnZoomLevel) {
    this.returnZoomLevel = returnZoomLevel;
  }

  public FacilityReception sidList(List<String> sidList) {
    this.sidList = sidList;
    return this;
  }

  public FacilityReception addSidListItem(String sidListItem) {
    if (this.sidList == null) {
      this.sidList = new ArrayList<>();
    }
    this.sidList.add(sidListItem);
    return this;
  }

  /**
   * 空間ID（配列）
   * @return sidList
  */
  @NotNull 
  @Schema(name = "sidList", example = "[\"24/52/14882510/6607973\",\"24/52/14882404/6607859\"]", description = "空間ID（配列）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sidList")
  public List<String> getSidList() {
    return sidList;
  }

  public void setSidList(List<String> sidList) {
    this.sidList = sidList;
  }

  public FacilityReception updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * 更新日時
   * @return updateDate
  */
  
  @Schema(name = "updateDate", example = "2024/08/20 03:59:44", description = "更新日時", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateDate")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacilityReception facilityReception = (FacilityReception) o;
    return Objects.equals(this.infraCompanyIdList, facilityReception.infraCompanyIdList) &&
        Objects.equals(this.returnZoomLevel, facilityReception.returnZoomLevel) &&
        Objects.equals(this.sidList, facilityReception.sidList) &&
        Objects.equals(this.updateDate, facilityReception.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infraCompanyIdList, returnZoomLevel, sidList, updateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacilityReception {\n");
    sb.append("    infraCompanyIdList: ").append(toIndentedString(infraCompanyIdList)).append("\n");
    sb.append("    returnZoomLevel: ").append(toIndentedString(returnZoomLevel)).append("\n");
    sb.append("    sidList: ").append(toIndentedString(sidList)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

