package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 埋設物情報取得受付結果
 */

@Schema(name = "facility_output_task_attribute", description = "埋設物情報取得受付結果")
@JsonTypeName("facility_output_task_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T11:59:31.262009200+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class FacilityOutputTaskAttribute {

  private String taskId;

  public FacilityOutputTaskAttribute() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FacilityOutputTaskAttribute(String taskId) {
    this.taskId = taskId;
  }

  public FacilityOutputTaskAttribute taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * タスクID
   * @return taskId
  */
  @NotNull 
  @Schema(name = "taskId", example = "000000000000000001", description = "タスクID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taskId")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacilityOutputTaskAttribute facilityOutputTaskAttribute = (FacilityOutputTaskAttribute) o;
    return Objects.equals(this.taskId, facilityOutputTaskAttribute.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacilityOutputTaskAttribute {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

