package cn.ctyun.ctapi.ctecs.affinitygrouplistvm;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机组内的云主机>
 * Request: AffinityGroupListVmRequest
 */
public class AffinityGroupListVmRequest extends CTRequest {
    public AffinityGroupListVmRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group/list-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public AffinityGroupListVmRequest withBody(AffinityGroupListVmRequestBody body) {
        this.body = body;
        return this;
    }
}
