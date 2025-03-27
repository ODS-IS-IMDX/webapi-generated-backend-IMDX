package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ouranos.domain.digiline.model.EventInformationAttributeEventListInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * イベント情報モデル
 */

@Schema(name = "event_information_attribute", description = "イベント情報モデル")
@JsonTypeName("event_information_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T11:59:31.262009200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class EventInformationAttribute {

  @Valid
  private List<@Valid EventInformationAttributeEventListInner> eventList = new ArrayList<>();

  public EventInformationAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EventInformationAttribute(List<@Valid EventInformationAttributeEventListInner> eventList) {
    this.eventList = eventList;
  }

  public EventInformationAttribute eventList(List<@Valid EventInformationAttributeEventListInner> eventList) {
    this.eventList = eventList;
    return this;
  }

  public EventInformationAttribute addEventListItem(EventInformationAttributeEventListInner eventListItem) {
    if (this.eventList == null) {
      this.eventList = new ArrayList<>();
    }
    this.eventList.add(eventListItem);
    return this;
  }

  /**
   * イベント空間情報モデルリスト
   * @return eventList
  */
  @NotNull @Valid 
  @Schema(name = "eventList", description = "イベント空間情報モデルリスト", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventList")
  public List<@Valid EventInformationAttributeEventListInner> getEventList() {
    return eventList;
  }

  public void setEventList(List<@Valid EventInformationAttributeEventListInner> eventList) {
    this.eventList = eventList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventInformationAttribute eventInformationAttribute = (EventInformationAttribute) o;
    return Objects.equals(this.eventList, eventInformationAttribute.eventList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventInformationAttribute {\n");
    sb.append("    eventList: ").append(toIndentedString(eventList)).append("\n");
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

