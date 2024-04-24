package cn.ctyun.ctapi.ctecs.ecsaffinitygroupbindone;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机组中添加单台云主机>
 * Request: EcsAffinityGroupBindOneRequest
 */
public class EcsAffinityGroupBindOneRequest extends CTRequest {
    public EcsAffinityGroupBindOneRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group/bind-one");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsAffinityGroupBindOneRequest withBody(EcsAffinityGroupBindOneRequestBody body) {
        this.body = body;
        return this;
    }
}
