package cn.ctyun.ctapi.ctecs.updatenetworkspec;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-更新云主机网络>
 * Request: UpdateNetworkSpecRequest
 */
public class UpdateNetworkSpecRequest extends CTRequest {
    public UpdateNetworkSpecRequest() {
        super("POST", "application/json", "/v4/ecs/update-network-spec");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public UpdateNetworkSpecRequest withBody(UpdateNetworkSpecRequestBody body) {
        this.body = body;
        return this;
    }
}
