package cn.ctyun.ctapi.ctecs.ecsnetworkspecupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机修改带宽>
 * Request: EcsNetworkSpecUpdateRequest
 */
public class EcsNetworkSpecUpdateRequest extends CTRequest {
    public EcsNetworkSpecUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/network-spec-update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsNetworkSpecUpdateRequest withBody(EcsNetworkSpecUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
