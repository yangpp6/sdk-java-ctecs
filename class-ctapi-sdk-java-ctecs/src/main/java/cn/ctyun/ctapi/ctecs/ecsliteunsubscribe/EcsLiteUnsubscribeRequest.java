package cn.ctyun.ctapi.ctecs.ecsliteunsubscribe;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <退订轻量型云主机>
 * Request: EcsLiteUnsubscribeRequest
 */
public class EcsLiteUnsubscribeRequest extends CTRequest {
    public EcsLiteUnsubscribeRequest() {
        super("POST", "application/json", "/v4/ecs/lite/unsubscribe");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsLiteUnsubscribeRequest withBody(EcsLiteUnsubscribeRequestBody body) {
        this.body = body;
        return this;
    }
}
