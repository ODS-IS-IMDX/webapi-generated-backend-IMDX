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
 * イベント空間情報モデル
 */

@Schema(name = "event_information_attribute_eventList_inner", description = "イベント空間情報モデル")
@JsonTypeName("event_information_attribute_eventList_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-21T16:18:05.502637100+09:00[Asia/Tokyo]", comments = "Generator version: 7.6.0")
public class EventInformationAttributeEventListInner {

  private Object eventAttribute;

  private String eventType;

  private String infraCompanyId;

  private Integer eventId;

  @Valid
  private List<String> sidList = new ArrayList<>();

  public EventInformationAttributeEventListInner eventAttribute(Object eventAttribute) {
    this.eventAttribute = eventAttribute;
    return this;
  }

  /**
   * イベント属性情報
   * @return eventAttribute
  */
  
  @Schema(name = "eventAttribute", example = "{\"停電件数\":\"140\",\"停電理由\":\"設備ヘの樹木等の接触\",\"復旧予定時刻\":\"20240912155125\"}", description = "イベント属性情報", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventAttribute")
  public Object getEventAttribute() {
    return eventAttribute;
  }

  public void setEventAttribute(Object eventAttribute) {
    this.eventAttribute = eventAttribute;
  }

  public EventInformationAttributeEventListInner eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * イベント種別
   * @return eventType
  */
  
  @Schema(name = "eventType", example = "サービス停止", description = "イベント種別", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public EventInformationAttributeEventListInner infraCompanyId(String infraCompanyId) {
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

  public EventInformationAttributeEventListInner eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * イベントID
   * @return eventId
  */
  
  @Schema(name = "eventId", example = "1", description = "イベントID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventId")
  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public EventInformationAttributeEventListInner sidList(List<String> sidList) {
    this.sidList = sidList;
    return this;
  }

  public EventInformationAttributeEventListInner addSidListItem(String sidListItem) {
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
  
  @Schema(name = "sidList", example = "[\"19/0/465068/206496\",\"19/0/465069/206496\"]", description = "空間ID（配列）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    EventInformationAttributeEventListInner eventInformationAttributeEventListInner = (EventInformationAttributeEventListInner) o;
    return Objects.equals(this.eventAttribute, eventInformationAttributeEventListInner.eventAttribute) &&
        Objects.equals(this.eventType, eventInformationAttributeEventListInner.eventType) &&
        Objects.equals(this.infraCompanyId, eventInformationAttributeEventListInner.infraCompanyId) &&
        Objects.equals(this.eventId, eventInformationAttributeEventListInner.eventId) &&
        Objects.equals(this.sidList, eventInformationAttributeEventListInner.sidList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventAttribute, eventType, infraCompanyId, eventId, sidList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventInformationAttributeEventListInner {\n");
    sb.append("    eventAttribute: ").append(toIndentedString(eventAttribute)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    infraCompanyId: ").append(toIndentedString(infraCompanyId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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

