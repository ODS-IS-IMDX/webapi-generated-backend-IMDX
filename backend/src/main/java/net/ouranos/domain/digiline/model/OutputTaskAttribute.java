package net.ouranos.domain.digiline.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ファイル作成状況結果
 */

@Schema(name = "output_task_attribute", description = "ファイル作成状況結果")
@JsonTypeName("output_task_attribute")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-10T11:04:09.616808300+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class OutputTaskAttribute {

  private String error;

  private String filePath;

  /**
   * タスク状況
   */
  public enum TaskStatusEnum {
    _0("0"),
    
    _1("1"),
    
    _2("2"),
    
    _9("9");

    private String value;

    TaskStatusEnum(String value) {
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
    public static TaskStatusEnum fromValue(String value) {
      for (TaskStatusEnum b : TaskStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TaskStatusEnum taskStatus;

  public OutputTaskAttribute error(String error) {
    this.error = error;
    return this;
  }

  /**
   * エラー内容
   * @return error
  */
  
  @Schema(name = "error", example = "ファイル作成に失敗しました。", description = "エラー内容", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public OutputTaskAttribute filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * ファイル格納先
   * @return filePath
  */
  
  @Schema(name = "filePath", example = "https://xxxx/ccc.zip", description = "ファイル格納先", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filePath")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public OutputTaskAttribute taskStatus(TaskStatusEnum taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }

  /**
   * タスク状況
   * @return taskStatus
  */
  
  @Schema(name = "taskStatus", example = "2", description = "タスク状況", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskStatus")
  public TaskStatusEnum getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(TaskStatusEnum taskStatus) {
    this.taskStatus = taskStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputTaskAttribute outputTaskAttribute = (OutputTaskAttribute) o;
    return Objects.equals(this.error, outputTaskAttribute.error) &&
        Objects.equals(this.filePath, outputTaskAttribute.filePath) &&
        Objects.equals(this.taskStatus, outputTaskAttribute.taskStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, filePath, taskStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputTaskAttribute {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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

