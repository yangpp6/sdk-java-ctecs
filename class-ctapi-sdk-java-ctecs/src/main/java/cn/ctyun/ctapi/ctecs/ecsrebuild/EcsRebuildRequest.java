package cn.ctyun.ctapi.ctecs.ecsrebuild;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-重装一台云主机>
 * Request: EcsRebuildRequest
 */
public class EcsRebuildRequest extends CTRequest {
    public EcsRebuildRequest() {
        super("POST", "application/json", "/v4/ecs/rebuild");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsRebuildRequest withBody(EcsRebuildRequestBody body) {
        this.body = body;
        return this;
    }
}
