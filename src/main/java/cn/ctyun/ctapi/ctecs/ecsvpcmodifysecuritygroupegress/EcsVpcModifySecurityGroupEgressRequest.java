package cn.ctyun.ctapi.ctecs.ecsvpcmodifysecuritygroupegress;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-修改安全组出方向规则描述>
 * Request: EcsVpcModifySecurityGroupEgressRequest
 */
public class EcsVpcModifySecurityGroupEgressRequest extends CTRequest {
    public EcsVpcModifySecurityGroupEgressRequest() {
        super("POST", "application/json", "/v4/ecs/vpc/modify-security-group-egress");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVpcModifySecurityGroupEgressRequest withBody(EcsVpcModifySecurityGroupEgressRequestBody body) {
        this.body = body;
        return this;
    }
}
