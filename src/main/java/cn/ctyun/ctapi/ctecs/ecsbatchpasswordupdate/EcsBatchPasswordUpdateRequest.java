package cn.ctyun.ctapi.ctecs.ecsbatchpasswordupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-更新多台云主机的密码>
 * Request: EcsBatchPasswordUpdateRequest
 */
public class EcsBatchPasswordUpdateRequest extends CTRequest {
    public EcsBatchPasswordUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/batch-password-update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBatchPasswordUpdateRequest withBody(EcsBatchPasswordUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
