package cn.ctyun.ctapi.ctecs.ecslitereboot;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <轻量型云主机重启>
 * Request: EcsLiteRebootRequest
 */
public class EcsLiteRebootRequest extends CTRequest {
    public EcsLiteRebootRequest() {
        super("POST", "application/json", "/v4/ecs/lite/reboot");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsLiteRebootRequest withBody(EcsLiteRebootRequestBody body) {
        this.body = body;
        return this;
    }
}
