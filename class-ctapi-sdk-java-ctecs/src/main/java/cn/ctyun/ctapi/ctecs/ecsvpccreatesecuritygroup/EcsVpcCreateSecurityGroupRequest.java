package cn.ctyun.ctapi.ctecs.ecsvpccreatesecuritygroup;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建安全组>
 * Request: EcsVpcCreateSecurityGroupRequest
 */
public class EcsVpcCreateSecurityGroupRequest extends CTRequest {
    public EcsVpcCreateSecurityGroupRequest() {
        super("POST", "application/json", "/v4/ecs/vpc/create-security-group");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVpcCreateSecurityGroupRequest withBody(EcsVpcCreateSecurityGroupRequestBody body) {
        this.body = body;
        return this;
    }
}
