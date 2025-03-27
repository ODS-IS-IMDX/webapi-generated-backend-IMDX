package net.ouranos.domain.digiline.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * AuthenticationInformation
 */

@JsonTypeName("authentication.Information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-22T17:25:08.603945900+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class AuthenticationInformation {

  private String accountPassword;

  private String operatorAccountId;

  public AuthenticationInformation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuthenticationInformation(String accountPassword, String operatorAccountId) {
    this.accountPassword = accountPassword;
    this.operatorAccountId = operatorAccountId;
  }

  public AuthenticationInformation accountPassword(String accountPassword) {
    this.accountPassword = accountPassword;
    return this;
  }

  /**
   * 認証アカウントパスワード
   * @return accountPassword
   */
  @NotNull 
  @Schema(name = "accountPassword", example = "password", description = "認証アカウントパスワード", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accountPassword")
  public String getAccountPassword() {
    return accountPassword;
  }

  public void setAccountPassword(String accountPassword) {
    this.accountPassword = accountPassword;
  }

  public AuthenticationInformation operatorAccountId(String operatorAccountId) {
    this.operatorAccountId = operatorAccountId;
    return this;
  }

  /**
   * 認証アカウントID
   * @return operatorAccountId
   */
  @NotNull 
  @Schema(name = "operatorAccountId", example = "account1234", description = "認証アカウントID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operatorAccountId")
  public String getOperatorAccountId() {
    return operatorAccountId;
  }

  public void setOperatorAccountId(String operatorAccountId) {
    this.operatorAccountId = operatorAccountId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationInformation authenticationInformation = (AuthenticationInformation) o;
    return Objects.equals(this.accountPassword, authenticationInformation.accountPassword) &&
        Objects.equals(this.operatorAccountId, authenticationInformation.operatorAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountPassword, operatorAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationInformation {\n");
    sb.append("    accountPassword: ").append(toIndentedString(accountPassword)).append("\n");
    sb.append("    operatorAccountId: ").append(toIndentedString(operatorAccountId)).append("\n");
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

