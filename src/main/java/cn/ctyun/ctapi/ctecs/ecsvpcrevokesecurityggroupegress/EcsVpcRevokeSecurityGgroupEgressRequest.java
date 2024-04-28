package cn.ctyun.ctapi.ctecs.ecsvpcrevokesecurityggroupegress;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-删除一条出方向安全组规则>
 * Request: EcsVpcRevokeSecurityGgroupEgressRequest
 */
public class EcsVpcRevokeSecurityGgroupEgressRequest extends CTRequest {
    public EcsVpcRevokeSecurityGgroupEgressRequest() {
        super("POST", "application/json", "/v4/ecs/vpc/revoke-security-group-egress");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVpcRevokeSecurityGgroupEgressRequest withBody(EcsVpcRevokeSecurityGgroupEgressRequestBody body) {
        this.body = body;
        return this;
    }
}
