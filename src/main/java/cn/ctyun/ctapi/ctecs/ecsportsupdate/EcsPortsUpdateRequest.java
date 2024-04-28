package cn.ctyun.ctapi.ctecs.ecsportsupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-修改网卡属性>
 * Request: EcsPortsUpdateRequest
 */
public class EcsPortsUpdateRequest extends CTRequest {
    public EcsPortsUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/ports/update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsPortsUpdateRequest withBody(EcsPortsUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
