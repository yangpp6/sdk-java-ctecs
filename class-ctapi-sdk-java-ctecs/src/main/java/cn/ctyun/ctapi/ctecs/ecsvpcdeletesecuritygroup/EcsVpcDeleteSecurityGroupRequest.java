package cn.ctyun.ctapi.ctecs.ecsvpcdeletesecuritygroup;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-删除安全组>
 * Request: EcsVpcDeleteSecurityGroupRequest
 */
public class EcsVpcDeleteSecurityGroupRequest extends CTRequest {
    public EcsVpcDeleteSecurityGroupRequest() {
        super("POST", "application/json", "/v4/ecs/vpc/delete-security-group");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVpcDeleteSecurityGroupRequest withBody(EcsVpcDeleteSecurityGroupRequestBody body) {
        this.body = body;
        return this;
    }
}
