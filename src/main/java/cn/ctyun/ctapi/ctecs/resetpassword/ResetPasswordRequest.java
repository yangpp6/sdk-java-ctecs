package cn.ctyun.ctapi.ctecs.resetpassword;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-重置云主机密码>
 * Request: ResetPasswordRequest
 */
public class ResetPasswordRequest extends CTRequest {
    public ResetPasswordRequest() {
        super("POST", "application/json", "/v4/ecs/reset-password");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public ResetPasswordRequest withBody(ResetPasswordRequestBody body) {
        this.body = body;
        return this;
    }
}
