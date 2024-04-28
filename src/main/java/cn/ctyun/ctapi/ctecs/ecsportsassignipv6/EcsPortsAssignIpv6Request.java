package cn.ctyun.ctapi.ctecs.ecsportsassignipv6;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-网卡关联多个IPv6地址>
 * Request: EcsPortsAssignIpv6Request
 */
public class EcsPortsAssignIpv6Request extends CTRequest {
    public EcsPortsAssignIpv6Request() {
        super("POST", "application/json", "/v4/ecs/ports/assign-ipv6");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsPortsAssignIpv6Request withBody(EcsPortsAssignIpv6RequestBody body) {
        this.body = body;
        return this;
    }
}
