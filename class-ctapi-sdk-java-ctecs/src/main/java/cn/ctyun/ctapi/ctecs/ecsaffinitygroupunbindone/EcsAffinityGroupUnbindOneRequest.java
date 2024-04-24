package cn.ctyun.ctapi.ctecs.ecsaffinitygroupunbindone;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机组中删除单台云主机>
 * Request: EcsAffinityGroupUnbindOneRequest
 */
public class EcsAffinityGroupUnbindOneRequest extends CTRequest {
    public EcsAffinityGroupUnbindOneRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group/unbind-one");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsAffinityGroupUnbindOneRequest withBody(EcsAffinityGroupUnbindOneRequestBody body) {
        this.body = body;
        return this;
    }
}
