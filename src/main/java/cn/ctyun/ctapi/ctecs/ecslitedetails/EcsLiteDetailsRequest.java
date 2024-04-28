package cn.ctyun.ctapi.ctecs.ecslitedetails;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <查询轻量型云主机详情>
 * Request: EcsLiteDetailsRequest
 */
public class EcsLiteDetailsRequest extends CTRequest {
    public EcsLiteDetailsRequest() {
        super("GET", "application/json", "/v4/ecs/lite/details");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsLiteDetailsRequest withBody(EcsLiteDetailsRequestBody body) {
        this.body = body;
        return this;
    }
}
