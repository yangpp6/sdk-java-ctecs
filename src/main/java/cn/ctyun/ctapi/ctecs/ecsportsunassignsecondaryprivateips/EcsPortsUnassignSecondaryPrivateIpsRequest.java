package cn.ctyun.ctapi.ctecs.ecsportsunassignsecondaryprivateips;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-网卡解绑辅助私网IPs>
 * Request: EcsPortsUnassignSecondaryPrivateIpsRequest
 */
public class EcsPortsUnassignSecondaryPrivateIpsRequest extends CTRequest {
    public EcsPortsUnassignSecondaryPrivateIpsRequest() {
        super("POST", "application/json", "/v4/ecs/ports/unassign-secondary-private-ips");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsPortsUnassignSecondaryPrivateIpsRequest withBody(EcsPortsUnassignSecondaryPrivateIpsRequestBody body) {
        this.body = body;
        return this;
    }
}
