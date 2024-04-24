package cn.ctyun.ctapi.ctecs.ecsagentbatchdetails;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <查询云主机监控插件信息>
 * Request: EcsAgentBatchDetailsRequest
 */
public class EcsAgentBatchDetailsRequest extends CTRequest {
    public EcsAgentBatchDetailsRequest() {
        super("POST", "application/json", "/v4/ecs/agent/batch-details");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsAgentBatchDetailsRequest withBody(EcsAgentBatchDetailsRequestBody body) {
        this.body = body;
        return this;
    }
}
