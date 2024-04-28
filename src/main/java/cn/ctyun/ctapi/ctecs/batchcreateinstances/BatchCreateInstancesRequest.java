package cn.ctyun.ctapi.ctecs.batchcreateinstances;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-批量创建云主机>
 * Request: BatchCreateInstancesRequest
 */
public class BatchCreateInstancesRequest extends CTRequest {
    public BatchCreateInstancesRequest() {
        super("POST", "application/json", "/v4/ecs/batch-create-instances");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BatchCreateInstancesRequest withBody(BatchCreateInstancesRequestBody body) {
        this.body = body;
        return this;
    }
}
