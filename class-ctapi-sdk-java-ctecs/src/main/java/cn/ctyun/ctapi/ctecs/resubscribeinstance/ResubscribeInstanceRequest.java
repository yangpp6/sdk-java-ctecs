package cn.ctyun.ctapi.ctecs.resubscribeinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-续订云主机>
 * Request: ResubscribeInstanceRequest
 */
public class ResubscribeInstanceRequest extends CTRequest {
    public ResubscribeInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/resubscribe-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public ResubscribeInstanceRequest withBody(ResubscribeInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
