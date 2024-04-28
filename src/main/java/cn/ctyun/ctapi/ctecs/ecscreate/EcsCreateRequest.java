package cn.ctyun.ctapi.ctecs.ecscreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建一台按量付费或者包年包月云主机>
 * Request: EcsCreateRequest
 */
public class EcsCreateRequest extends CTRequest {
    public EcsCreateRequest() {
        super("POST", "application/json", "/v4/ecs/create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsCreateRequest withBody(EcsCreateRequestBody body) {
        this.body = body;
        return this;
    }
}
