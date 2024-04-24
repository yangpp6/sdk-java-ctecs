package cn.ctyun.ctapi.ctecs.ecsaffinitygroupdelete;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-删除云主机组>
 * Request: EcsAffinityGroupDeleteRequest
 */
public class EcsAffinityGroupDeleteRequest extends CTRequest {
    public EcsAffinityGroupDeleteRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group-delete");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsAffinityGroupDeleteRequest withBody(EcsAffinityGroupDeleteRequestBody body) {
        this.body = body;
        return this;
    }
}
