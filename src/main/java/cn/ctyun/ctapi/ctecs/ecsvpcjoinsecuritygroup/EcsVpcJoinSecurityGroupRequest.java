package cn.ctyun.ctapi.ctecs.ecsvpcjoinsecuritygroup;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-绑定安全组>
 * Request: EcsVpcJoinSecurityGroupRequest
 */
public class EcsVpcJoinSecurityGroupRequest extends CTRequest {
    public EcsVpcJoinSecurityGroupRequest() {
        super("POST", "application/json", "/v4/ecs/vpc/join-security-group");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVpcJoinSecurityGroupRequest withBody(EcsVpcJoinSecurityGroupRequestBody body) {
        this.body = body;
        return this;
    }
}
