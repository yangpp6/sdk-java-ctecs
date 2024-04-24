package cn.ctyun.ctapi.ctecs.batchresetpassword;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-批量重置云主机密码>
 * Request: BatchResetPasswordRequest
 */
public class BatchResetPasswordRequest extends CTRequest {
    public BatchResetPasswordRequest() {
        super("POST", "application/json", "/v4/ecs/batch-reset-password");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BatchResetPasswordRequest withBody(BatchResetPasswordRequestBody body) {
        this.body = body;
        return this;
    }
}
