package cn.ctyun.ctapi.ctecs.ecsliteupdatespec;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <变配轻量型云主机>
 * Request: EcsLiteUpdateSpecRequest
 */
public class EcsLiteUpdateSpecRequest extends CTRequest {
    public EcsLiteUpdateSpecRequest() {
        super("POST", "application/json", "/v4/ecs/lite/update-spec");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsLiteUpdateSpecRequest withBody(EcsLiteUpdateSpecRequestBody body) {
        this.body = body;
        return this;
    }
}
