package cn.ctyun.ctapi.ctecs.batchstartinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-开启多台云主机>
 * Request: BatchStartInstanceRequest
 */
public class BatchStartInstanceRequest extends CTRequest {
    public BatchStartInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/batch-start-instances");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BatchStartInstanceRequest withBody(BatchStartInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
