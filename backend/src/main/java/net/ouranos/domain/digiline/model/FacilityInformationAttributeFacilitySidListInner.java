package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * 設備空間情報
 */

@Schema(name = "facility_information_attribute_facilitySidList_inner", description = "設備空間情報")
@JsonTypeName("facility_information_attribute_facilitySidList_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T11:59:31.262009200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class FacilityInformationAttributeFacilitySidListInner {

  /**
   * データ種別
   */
  public enum DataTypeEnum {
    UPDATE("Update"),
    
    DELETE("Delete");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DataTypeEnum fromValue(String value) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DataTypeEnum dataType;

  private Object facilityAttribute;

  private String infraCompanyId;

  private String objectId;

  private String objectName;

  @Valid
  private List<String> sidList = new ArrayList<>();

  public FacilityInformationAttributeFacilitySidListInner dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * データ種別
   * @return dataType
  */
  
  @Schema(name = "dataType", example = "Update", description = "データ種別", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataType")
  public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }

  public FacilityInformationAttributeFacilitySidListInner facilityAttribute(Object facilityAttribute) {
    this.facilityAttribute = facilityAttribute;
    return this;
  }

  /**
   * 設備属性
   * @return facilityAttribute
  */
  
  @Schema(name = "facilityAttribute", example = "{\"土被り\":\"5\",\"管の径\":\"15\",\"管の配置状況\":\"exist\"}", description = "設備属性", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("facilityAttribute")
  public Object getFacilityAttribute() {
    return facilityAttribute;
  }

  public void setFacilityAttribute(Object facilityAttribute) {
    this.facilityAttribute = facilityAttribute;
  }

  public FacilityInformationAttributeFacilitySidListInner infraCompanyId(String infraCompanyId) {
    this.infraCompanyId = infraCompanyId;
    return this;
  }

  /**
   * インフラ事業者ID
   * @return infraCompanyId
  */
  
  @Schema(name = "infraCompanyId", example = "12345678901234567890", description = "インフラ事業者ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("infraCompanyId")
  public String getInfraCompanyId() {
    return infraCompanyId;
  }

  public void setInfraCompanyId(String infraCompanyId) {
    this.infraCompanyId = infraCompanyId;
  }

  public FacilityInformationAttributeFacilitySidListInner objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * オブジェクトID
   * @return objectId
  */
  
  @Schema(name = "objectId", example = "A0001", description = "オブジェクトID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objectId")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public FacilityInformationAttributeFacilitySidListInner objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

  /**
   * オブジェクト名称
   * @return objectName
  */
  
  @Schema(name = "objectName", example = "管路", description = "オブジェクト名称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objectName")
  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  public FacilityInformationAttributeFacilitySidListInner sidList(List<String> sidList) {
    this.sidList = sidList;
    return this;
  }

  public FacilityInformationAttributeFacilitySidListInner addSidListItem(String sidListItem) {
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
  
  @Schema(name = "sidList", example = "[\"24/52/14882510/6607973\",\"24/52/14882404/6607859\"]", description = "空間ID（配列）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sidList")
  public List<String> getSidList() {
    return sidList;
  }

  public void setSidList(List<String> sidList) {
    this.sidList = sidList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacilityInformationAttributeFacilitySidListInner facilityInformationAttributeFacilitySidListInner = (FacilityInformationAttributeFacilitySidListInner) o;
    return Objects.equals(this.dataType, facilityInformationAttributeFacilitySidListInner.dataType) &&
        Objects.equals(this.facilityAttribute, facilityInformationAttributeFacilitySidListInner.facilityAttribute) &&
        Objects.equals(this.infraCompanyId, facilityInformationAttributeFacilitySidListInner.infraCompanyId) &&
        Objects.equals(this.objectId, facilityInformationAttributeFacilitySidListInner.objectId) &&
        Objects.equals(this.objectName, facilityInformationAttributeFacilitySidListInner.objectName) &&
        Objects.equals(this.sidList, facilityInformationAttributeFacilitySidListInner.sidList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, facilityAttribute, infraCompanyId, objectId, objectName, sidList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacilityInformationAttributeFacilitySidListInner {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    facilityAttribute: ").append(toIndentedString(facilityAttribute)).append("\n");
    sb.append("    infraCompanyId: ").append(toIndentedString(infraCompanyId)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    sidList: ").append(toIndentedString(sidList)).append("\n");
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

