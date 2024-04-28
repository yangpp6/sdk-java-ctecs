package cn.ctyun.ctapi.ctecs.batchrebootinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-重启多台云主机>
 * Request: BatchRebootInstanceRequest
 */
public class BatchRebootInstanceRequest extends CTRequest {
    public BatchRebootInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/batch-reboot-instances");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BatchRebootInstanceRequest withBody(BatchRebootInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
