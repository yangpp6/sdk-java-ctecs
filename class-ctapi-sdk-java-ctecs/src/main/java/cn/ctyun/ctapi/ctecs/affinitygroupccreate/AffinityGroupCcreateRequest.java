package cn.ctyun.ctapi.ctecs.affinitygroupccreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建云主机组>
 * Request: AffinityGroupCcreateRequest
 */
public class AffinityGroupCcreateRequest extends CTRequest {
    public AffinityGroupCcreateRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group/create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public AffinityGroupCcreateRequest withBody(AffinityGroupCcreateRequestBody body) {
        this.body = body;
        return this;
    }
}
