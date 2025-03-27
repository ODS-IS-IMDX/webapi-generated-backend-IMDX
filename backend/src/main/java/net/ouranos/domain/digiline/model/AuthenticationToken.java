package net.ouranos.domain.digiline.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * AuthenticationToken
 */

@JsonTypeName("authentication.Token")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-22T17:25:08.603945900+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class AuthenticationToken {

  private String accessToken;

  private String refreshToken;

  public AuthenticationToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * アクセストークン
   * @return accessToken
   */
  
  @Schema(name = "accessToken", example = "eyJhbGciOiJSUzI1NiIsImtpZCI6IjAzZDA3YmJjM2Q3NWM2OTQyNzUxMGY2MTc0ZWIyZjE2NTQ3ZDRhN2QiLCJ0eXAiOiJKV1QifQ.eyJvcGVyYXRvcl9pZCI6IjBmMWViYTkwLTgzOWYtNDA1OS1iOWNiLTcwY2JhZjQ5MDIzOSIsImlzcyI6Imh0dHBzOi8vc2VjdXJldG9rZW4uZ29vZ2xlLmNvbS9kYXRhLXNwYWNlcy1kZXYtajh3bHB1N2oiLCJhdWQiOiJkYXRhLXNwYWNlcy1kZXYtajh3bHB1N2oiLCJhdXRoX3RpbWUiOjE2OTc3NjU3OTEsInVzZXJfaWQiOiI4NmMzNDE2Yy00MDA0LTRjNGUtYTNlNy00MGJiNjY5YTZmNWIiLCJzdWIiOiI4NmMzNDE2Yy00MDA0LTRjNGUtYTNlNy00MGJiNjY5YTZmNWIiLCJpYXQiOjE2OTc3NjU3OTEsImV4cCI6MTY5Nzc2OTM5MSwiZW1haWwiOiJ0ZXN0ZG90ZF90ZXN0QHNhbXBsZS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImZpcmViYXNlIjp7ImlkZW50aXRpZXMiOnsiZW1haWwiOlsidGVzdGRvdGRfdGVzdEBzYW1wbGUuY29tIl19LCJzaWduX2luX3Byb3ZpZGVyIjoicGFzc3dvcmQifX0.mAe7NTKTiKY-pGYZxvjBejIMpgfgBTz4ymGM2jMDpwBT2aRQCAcV0a2__n3ewgBl1kwR66OcsDq6CbXHu33zRiBGbYehy0aotTb0C81DIGnD__n0w8eYuoXhvp3z2ScOfOPBhCvoA9Eg1Yvk3rgpfQa8eFGCOp1-_RQuiaXo8IqRbg9xgCbo6xaxSvgeup-OHv0tR7IwDmauwCT-RCeU0WxHn6i2YKgUrULFIZSoF8WQuPL0HKEl4-jJbOP2TASTpLyshCDeECq4AaWercYf36A2DZ6udhJSO-lKwPtb5QjGJQbVKd_SINdoMvI2oHvuhzPz5MK4StMCumZ02AZ9sw", description = "アクセストークン", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accessToken")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AuthenticationToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * リフレッシュトークン
   * @return refreshToken
   */
  
  @Schema(name = "refreshToken", example = "AMf-vBwoYSJKlMfMCujrEBT3FgWmObWOgMtSp8gWj0R4FSWb6XB88kjxdPojhiL8KXjtONi51kG5hNGmvhwmW0Fkoczq8gcOtBUpKBJdagzBKPGGXGuVLuNBH9RkN-CBtKV6FrHVc8exdtQeeSnaGOs-rLYo0EizEyPN_Ysul2NNh2nkwjABgQ-o0_nZxCPZ1gNPtlnd1dZr5hAlIwNn-nO_sI9lIH8LXX04TX_GfzC3tJZj0EXTUeiyUYjv38jRaEf6iBu77zuE", description = "リフレッシュトークン", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refreshToken")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationToken authenticationToken = (AuthenticationToken) o;
    return Objects.equals(this.accessToken, authenticationToken.accessToken) &&
        Objects.equals(this.refreshToken, authenticationToken.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, refreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationToken {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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

