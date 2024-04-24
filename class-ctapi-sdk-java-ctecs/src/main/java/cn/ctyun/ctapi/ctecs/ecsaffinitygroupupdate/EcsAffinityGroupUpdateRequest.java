package cn.ctyun.ctapi.ctecs.ecsaffinitygroupupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-更新云主机组信息>
 * Request: EcsAffinityGroupUpdateRequest
 */
public class EcsAffinityGroupUpdateRequest extends CTRequest {
    public EcsAffinityGroupUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group-update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsAffinityGroupUpdateRequest withBody(EcsAffinityGroupUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
