package cn.ctyun.ctapi.ctecs.batchupdateinstances;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机>
 * Request: BatchUpdateInstancesRequest
 */
public class BatchUpdateInstancesRequest extends CTRequest {
    public BatchUpdateInstancesRequest() {
        super("POST", "application/json", "/v4/ecs/batch-update-instances");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BatchUpdateInstancesRequest withBody(BatchUpdateInstancesRequestBody body) {
        this.body = body;
        return this;
    }
}
