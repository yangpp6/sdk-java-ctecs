package cn.ctyun.ctapi.ctecs.ecsportsunassignipv6;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-网卡解绑多个IPv6地址>
 * Request: EcsPortsUnassignIpv6Request
 */
public class EcsPortsUnassignIpv6Request extends CTRequest {
    public EcsPortsUnassignIpv6Request() {
        super("POST", "application/json", "/v4/ecs/ports/unassign-ipv6");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsPortsUnassignIpv6Request withBody(EcsPortsUnassignIpv6RequestBody body) {
        this.body = body;
        return this;
    }
}
