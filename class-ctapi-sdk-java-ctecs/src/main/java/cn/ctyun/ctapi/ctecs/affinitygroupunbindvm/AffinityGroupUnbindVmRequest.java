package cn.ctyun.ctapi.ctecs.affinitygroupunbindvm;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机组中删除单台云主机>
 * Request: AffinityGroupUnbindVmRequest
 */
public class AffinityGroupUnbindVmRequest extends CTRequest {
    public AffinityGroupUnbindVmRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group/unbind-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public AffinityGroupUnbindVmRequest withBody(AffinityGroupUnbindVmRequestBody body) {
        this.body = body;
        return this;
    }
}
