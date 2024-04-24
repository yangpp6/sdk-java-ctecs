package cn.ctyun.ctapi.ctecs.ecslitelist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <查询轻量型云主机列表>
 * Request: EcsLiteListRequest
 */
public class EcsLiteListRequest extends CTRequest {
    public EcsLiteListRequest() {
        super("POST", "application/json", "/v4/ecs/lite/list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsLiteListRequest withBody(EcsLiteListRequestBody body) {
        this.body = body;
        return this;
    }
}
