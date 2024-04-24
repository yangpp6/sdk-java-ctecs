package cn.ctyun.ctapi.ctecs.ecsaffinitygroupcreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建云主机组>
 * Request: EcsAffinityGroupCreateRequest
 */
public class EcsAffinityGroupCreateRequest extends CTRequest {
    public EcsAffinityGroupCreateRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group-create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsAffinityGroupCreateRequest withBody(EcsAffinityGroupCreateRequestBody body) {
        this.body = body;
        return this;
    }
}
