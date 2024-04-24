package cn.ctyun.ctapi.ctecs.ecsflavornetworkupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机修改带宽或规格>
 * Request: EcsFlavorNetworkUpdateRequest
 */
public class EcsFlavorNetworkUpdateRequest extends CTRequest {
    public EcsFlavorNetworkUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/flavor-network-update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsFlavorNetworkUpdateRequest withBody(EcsFlavorNetworkUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
