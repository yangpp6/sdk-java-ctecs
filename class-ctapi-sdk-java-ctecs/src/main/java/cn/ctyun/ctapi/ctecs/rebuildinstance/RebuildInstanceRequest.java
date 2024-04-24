package cn.ctyun.ctapi.ctecs.rebuildinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-重装一台云主机>
 * Request: RebuildInstanceRequest
 */
public class RebuildInstanceRequest extends CTRequest {
    public RebuildInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/rebuild-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public RebuildInstanceRequest withBody(RebuildInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
