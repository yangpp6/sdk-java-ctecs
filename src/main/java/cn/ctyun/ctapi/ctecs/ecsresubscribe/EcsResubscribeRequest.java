package cn.ctyun.ctapi.ctecs.ecsresubscribe;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-续订一台包周期的云主机>
 * Request: EcsResubscribeRequest
 */
public class EcsResubscribeRequest extends CTRequest {
    public EcsResubscribeRequest() {
        super("POST", "application/json", "/v4/ecs/resubscribe");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsResubscribeRequest withBody(EcsResubscribeRequestBody body) {
        this.body = body;
        return this;
    }
}
