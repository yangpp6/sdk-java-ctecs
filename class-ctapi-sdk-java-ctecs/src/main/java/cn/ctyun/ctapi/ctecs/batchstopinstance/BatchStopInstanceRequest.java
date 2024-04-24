package cn.ctyun.ctapi.ctecs.batchstopinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-关闭多台云主机>
 * Request: BatchStopInstanceRequest
 */
public class BatchStopInstanceRequest extends CTRequest {
    public BatchStopInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/batch-stop-instances");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BatchStopInstanceRequest withBody(BatchStopInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
