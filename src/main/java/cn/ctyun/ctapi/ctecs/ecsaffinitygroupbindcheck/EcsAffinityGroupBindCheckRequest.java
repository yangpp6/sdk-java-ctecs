package cn.ctyun.ctapi.ctecs.ecsaffinitygroupbindcheck;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机加入主机组校验>
 * Request: EcsAffinityGroupBindCheckRequest
 */
public class EcsAffinityGroupBindCheckRequest extends CTRequest {
    public EcsAffinityGroupBindCheckRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group/bind-check");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsAffinityGroupBindCheckRequest withBody(EcsAffinityGroupBindCheckRequestBody body) {
        this.body = body;
        return this;
    }
}
