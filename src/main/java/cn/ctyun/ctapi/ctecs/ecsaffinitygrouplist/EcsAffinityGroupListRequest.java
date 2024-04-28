package cn.ctyun.ctapi.ctecs.ecsaffinitygrouplist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机组列表或者详情>
 * Request: EcsAffinityGroupListRequest
 */
public class EcsAffinityGroupListRequest extends CTRequest {
    public EcsAffinityGroupListRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group-list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsAffinityGroupListRequest withBody(EcsAffinityGroupListRequestBody body) {
        this.body = body;
        return this;
    }
}
