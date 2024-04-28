package cn.ctyun.ctapi.ctecs.unsubscribeinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-释放云主机>
 * Request: UnsubscribeInstanceRequest
 */
public class UnsubscribeInstanceRequest extends CTRequest {
    public UnsubscribeInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/unsubscribe-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public UnsubscribeInstanceRequest withBody(UnsubscribeInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
