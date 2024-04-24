package cn.ctyun.ctapi.ctecs.liveresizeflavorlist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <查询云主机支持的热变配规格信息>
 * Request: LiveResizeFlavorListRequest
 */
public class LiveResizeFlavorListRequest extends CTRequest {
    public LiveResizeFlavorListRequest() {
        super("POST", "application/json", "/v4/ecs/flavor/live-resize-list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public LiveResizeFlavorListRequest withBody(LiveResizeFlavorListRequestBody body) {
        this.body = body;
        return this;
    }
}
