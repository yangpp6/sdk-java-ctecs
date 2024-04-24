package cn.ctyun.ctapi.ctecs.ecsvpccreatesecuritygroupingress;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建安全组入向规则>
 * Request: EcsVpcCreateSecurityGroupIngressRequest
 */
public class EcsVpcCreateSecurityGroupIngressRequest extends CTRequest {
    public EcsVpcCreateSecurityGroupIngressRequest() {
        super("POST", "application/json", "/v4/ecs/vpc/create-security-group-ingress");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVpcCreateSecurityGroupIngressRequest withBody(EcsVpcCreateSecurityGroupIngressRequestBody body) {
        this.body = body;
        return this;
    }
}
