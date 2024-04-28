package cn.ctyun.ctapi.ctecs.ecsliteresetpassword;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <轻量型云主机修改密码>
 * Request: EcsLiteResetPasswordRequest
 */
public class EcsLiteResetPasswordRequest extends CTRequest {
    public EcsLiteResetPasswordRequest() {
        super("POST", "application/json", "/v4/ecs/lite/reset-password");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsLiteResetPasswordRequest withBody(EcsLiteResetPasswordRequestBody body) {
        this.body = body;
        return this;
    }
}
