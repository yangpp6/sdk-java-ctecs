package cn.ctyun.ctapi.ctecs.ecsaffinitygroupunbindinstances;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <云主机组批量移除云主机>
 * Request: EcsAffinityGroupUnbindInstancesRequest
 */
public class EcsAffinityGroupUnbindInstancesRequest extends CTRequest {
    public EcsAffinityGroupUnbindInstancesRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group/unbind-instances");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsAffinityGroupUnbindInstancesRequest withBody(EcsAffinityGroupUnbindInstancesRequestBody body) {
        this.body = body;
        return this;
    }
}
