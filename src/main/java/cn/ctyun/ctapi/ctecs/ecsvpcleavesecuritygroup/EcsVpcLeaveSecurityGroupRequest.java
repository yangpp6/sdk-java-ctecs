package cn.ctyun.ctapi.ctecs.ecsvpcleavesecuritygroup;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-解绑安全组>
 * Request: EcsVpcLeaveSecurityGroupRequest
 */
public class EcsVpcLeaveSecurityGroupRequest extends CTRequest {
    public EcsVpcLeaveSecurityGroupRequest() {
        super("POST", "application/json", "/v4/ecs/vpc/leave-security-group");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVpcLeaveSecurityGroupRequest withBody(EcsVpcLeaveSecurityGroupRequestBody body) {
        this.body = body;
        return this;
    }
}
