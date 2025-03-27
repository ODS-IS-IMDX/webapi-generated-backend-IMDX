/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package net.ouranos.application.digiline.controller;

import net.ouranos.domain.digiline.model.Error;
import net.ouranos.domain.digiline.model.FacilityOutputTask;
import net.ouranos.domain.digiline.model.FacilityReception;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-12T16:17:29.389688600+09:00[Asia/Tokyo]", comments = "Generator version: 7.9.0")
@Validated
@Tag(name = "INDX_0010.地下埋設物照会業務", description = "the INDX_0010.地下埋設物照会業務 API")
public interface FacilityOutputTaskApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /facility-output-task : GUF_0030.埋設物情報取得受付
     * 指定した範囲内に存在する埋設物情報取得依頼を受け付ける。
     *
     * @param facilityReception 埋設物情報取得受付リクエスト (required)
     * @return 依頼受付成功 (status code 200)
     *         or リクエスト不正 (status code 400)
     *         or アクセス権限不正 (status code 403)
     *         or システムエラー (status code 500)
     *         or タイムアウトエラー (status code 504)
     */
    @Operation(
        operationId = "facilityOutputTaskPut",
        summary = "GUF_0030.埋設物情報取得受付",
        description = "指定した範囲内に存在する埋設物情報取得依頼を受け付ける。",
        tags = { "INDX_0010.地下埋設物照会業務" }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/facility-output-task",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    ResponseEntity<Object> facilityOutputTaskPut(@Parameter(name = "X-Tracking", description = "トラッキングID", in = ParameterIn.HEADER) @RequestHeader(value = "X-Tracking", required = false) UUID xTracking,
        @Parameter(name = "FacilityReception", description = "埋設物情報取得受付リクエスト", required = true) @Valid @RequestBody FacilityReception facilityReception
    ); 

}
