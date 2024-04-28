package cn.ctyun.ctapi.ctecs.ecsvpccreatesecuritygroupegress;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建安全组出向规则>
 * Request: EcsVpcCreateSecurityGroupEgressRequest
 */
public class EcsVpcCreateSecurityGroupEgressRequest extends CTRequest {
    public EcsVpcCreateSecurityGroupEgressRequest() {
        super("POST", "application/json", "/v4/ecs/vpc/create-security-group-egress");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVpcCreateSecurityGroupEgressRequest withBody(EcsVpcCreateSecurityGroupEgressRequestBody body) {
        this.body = body;
        return this;
    }
}
