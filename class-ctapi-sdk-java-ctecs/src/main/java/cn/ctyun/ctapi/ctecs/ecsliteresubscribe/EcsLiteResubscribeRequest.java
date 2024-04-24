package cn.ctyun.ctapi.ctecs.ecsliteresubscribe;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <续订轻量型云主机>
 * Request: EcsLiteResubscribeRequest
 */
public class EcsLiteResubscribeRequest extends CTRequest {
    public EcsLiteResubscribeRequest() {
        super("POST", "application/json", "/v4/ecs/lite/resubscribe");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsLiteResubscribeRequest withBody(EcsLiteResubscribeRequestBody body) {
        this.body = body;
        return this;
    }
}
