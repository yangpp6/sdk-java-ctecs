package cn.ctyun.ctapi.ctecs.ecsportsattach;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-网卡绑定云主机>
 * Request: EcsPortsAttachRequest
 */
public class EcsPortsAttachRequest extends CTRequest {
    public EcsPortsAttachRequest() {
        super("POST", "application/json", "/v4/ecs/ports/attach");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsPortsAttachRequest withBody(EcsPortsAttachRequestBody body) {
        this.body = body;
        return this;
    }
}
