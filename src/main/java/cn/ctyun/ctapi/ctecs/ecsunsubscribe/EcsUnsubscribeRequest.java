package cn.ctyun.ctapi.ctecs.ecsunsubscribe;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-释放云主机>
 * Request: EcsUnsubscribeRequest
 */
public class EcsUnsubscribeRequest extends CTRequest {
    public EcsUnsubscribeRequest() {
        super("POST", "application/json", "/v4/ecs/unsubscribe");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsUnsubscribeRequest withBody(EcsUnsubscribeRequestBody body) {
        this.body = body;
        return this;
    }
}
