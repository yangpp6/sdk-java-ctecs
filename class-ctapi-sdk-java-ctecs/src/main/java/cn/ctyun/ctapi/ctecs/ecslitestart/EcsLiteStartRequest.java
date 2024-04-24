package cn.ctyun.ctapi.ctecs.ecslitestart;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <轻量型云主机开机>
 * Request: EcsLiteStartRequest
 */
public class EcsLiteStartRequest extends CTRequest {
    public EcsLiteStartRequest() {
        super("POST", "application/json", "/v4/ecs/lite/start");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsLiteStartRequest withBody(EcsLiteStartRequestBody body) {
        this.body = body;
        return this;
    }
}
