package cn.ctyun.ctapi.ctecs.livereiszeinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <云主机热变配>
 * Request: LiveReiszeInstanceRequest
 */
public class LiveReiszeInstanceRequest extends CTRequest {
    public LiveReiszeInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/live-resize");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public LiveReiszeInstanceRequest withBody(LiveReiszeInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
