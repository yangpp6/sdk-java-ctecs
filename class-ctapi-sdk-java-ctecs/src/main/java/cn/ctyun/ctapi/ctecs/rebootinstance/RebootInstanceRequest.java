package cn.ctyun.ctapi.ctecs.rebootinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-重启一台云主机>
 * Request: RebootInstanceRequest
 */
public class RebootInstanceRequest extends CTRequest {
    public RebootInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/reboot-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public RebootInstanceRequest withBody(RebootInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
