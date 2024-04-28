package cn.ctyun.ctapi.ctecs.ecsaffinitygroupecslist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机组内的云主机>
 * Request: EcsAffinityGroupEcsListRequest
 */
public class EcsAffinityGroupEcsListRequest extends CTRequest {
    public EcsAffinityGroupEcsListRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group/ecs-list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsAffinityGroupEcsListRequest withBody(EcsAffinityGroupEcsListRequestBody body) {
        this.body = body;
        return this;
    }
}
