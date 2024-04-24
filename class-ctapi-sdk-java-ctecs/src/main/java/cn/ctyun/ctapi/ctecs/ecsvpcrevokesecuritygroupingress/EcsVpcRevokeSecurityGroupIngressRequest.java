package cn.ctyun.ctapi.ctecs.ecsvpcrevokesecuritygroupingress;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-删除一条入方向安全组规则>
 * Request: EcsVpcRevokeSecurityGroupIngressRequest
 */
public class EcsVpcRevokeSecurityGroupIngressRequest extends CTRequest {
    public EcsVpcRevokeSecurityGroupIngressRequest() {
        super("POST", "application/json", "/v4/ecs/vpc/revoke-security-group-ingress");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVpcRevokeSecurityGroupIngressRequest withBody(EcsVpcRevokeSecurityGroupIngressRequestBody body) {
        this.body = body;
        return this;
    }
}
