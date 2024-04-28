package cn.ctyun.ctapi.ctecs.affinitygrouplist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机组列表或者详情>
 * Request: AffinityGroupListRequest
 */
public class AffinityGroupListRequest extends CTRequest {
    public AffinityGroupListRequest() {
        super("POST", "application/json", "/v4/ecs/affinity-group/list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public AffinityGroupListRequest withBody(AffinityGroupListRequestBody body) {
        this.body = body;
        return this;
    }
}
