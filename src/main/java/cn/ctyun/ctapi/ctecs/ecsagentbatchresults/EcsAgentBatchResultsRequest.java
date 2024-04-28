package cn.ctyun.ctapi.ctecs.ecsagentbatchresults;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <查询云主机监控插件操作结果>
 * Request: EcsAgentBatchResultsRequest
 */
public class EcsAgentBatchResultsRequest extends CTRequest {
    public EcsAgentBatchResultsRequest() {
        super("POST", "application/json", "/v4/ecs/agent/batch-results");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsAgentBatchResultsRequest withBody(EcsAgentBatchResultsRequestBody body) {
        this.body = body;
        return this;
    }
}
