package cn.ctyun.ctapi.ctecs.ecsvpcmodifysecuritygroupingress;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-修改安全组入方向规则描述>
 * Request: EcsVpcModifySecurityGroupIngressRequest
 */
public class EcsVpcModifySecurityGroupIngressRequest extends CTRequest {
    public EcsVpcModifySecurityGroupIngressRequest() {
        super("POST", "application/json", "/v4/ecs/vpc/modify-security-group-ingress");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVpcModifySecurityGroupIngressRequest withBody(EcsVpcModifySecurityGroupIngressRequestBody body) {
        this.body = body;
        return this;
    }
}
