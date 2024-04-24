package cn.ctyun.ctapi.ctecs.ecsportsassignsecondaryprivateips;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-网卡关联辅助私网Ips>
 * Request: EcsPortsAssignSecondaryPrivateIpsRequest
 */
public class EcsPortsAssignSecondaryPrivateIpsRequest extends CTRequest {
    public EcsPortsAssignSecondaryPrivateIpsRequest() {
        super("POST", "application/json", "/v4/ecs/ports/assign-secondary-private-ips");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsPortsAssignSecondaryPrivateIpsRequest withBody(EcsPortsAssignSecondaryPrivateIpsRequestBody body) {
        this.body = body;
        return this;
    }
}
