package cn.ctyun.ctapi.ctecs.ecslitecreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <创建轻量型云主机>
 * Request: EcsLiteCreateRequest
 */
public class EcsLiteCreateRequest extends CTRequest {
    public EcsLiteCreateRequest() {
        super("POST", "application/json", "/v4/ecs/lite/create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsLiteCreateRequest withBody(EcsLiteCreateRequestBody body) {
        this.body = body;
        return this;
    }
}
