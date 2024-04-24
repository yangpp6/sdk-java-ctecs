package cn.ctyun.ctapi.ctecs.affinitygroupbindvm;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机组中添加单台云主机>
 * Request: AffinityGroupBindVmRequest
 */
public class AffinityGroupBindVmRequest extends CTRequest {
    public AffinityGroupBindVmRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group/bind-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public AffinityGroupBindVmRequest withBody(AffinityGroupBindVmRequestBody body) {
        this.body = body;
        return this;
    }
}
