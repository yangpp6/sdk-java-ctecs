package cn.ctyun.ctapi.ctecs.ecsportsdetach;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-网卡解绑云主机>
 * Request: EcsPortsDetachRequest
 */
public class EcsPortsDetachRequest extends CTRequest {
    public EcsPortsDetachRequest() {
        super("POST", "application/json", "/v4/ecs/ports/detach");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsPortsDetachRequest withBody(EcsPortsDetachRequestBody body) {
        this.body = body;
        return this;
    }
}
