package cn.ctyun.ctapi.ctecs.ecslitestop;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <轻量型云主机关机>
 * Request: EcsLiteStopRequest
 */
public class EcsLiteStopRequest extends CTRequest {
    public EcsLiteStopRequest() {
        super("POST", "application/json", "/v4/ecs/lite/stop");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsLiteStopRequest withBody(EcsLiteStopRequestBody body) {
        this.body = body;
        return this;
    }
}
