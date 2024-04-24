package cn.ctyun.ctapi.ctecs.stopinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-关闭一台云主机>
 * Request: StopInstanceRequest
 */
public class StopInstanceRequest extends CTRequest {
    public StopInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/stop-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public StopInstanceRequest withBody(StopInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
