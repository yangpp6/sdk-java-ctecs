package cn.ctyun.ctapi.ctecs.ecsstart;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-开启一台云主机>
 * Request: EcsStartRequest
 */
public class EcsStartRequest extends CTRequest {
    public EcsStartRequest() {
        super("POST", "application/json", "/v4/ecs/start");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsStartRequest withBody(EcsStartRequestBody body) {
        this.body = body;
        return this;
    }
}
