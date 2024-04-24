package cn.ctyun.ctapi.ctecs.ecsagentbatchaction;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <操作云主机监控插件>
 * Request: EcsAgentBatchActionRequest
 */
public class EcsAgentBatchActionRequest extends CTRequest {
    public EcsAgentBatchActionRequest() {
        super("POST", "application/json", "/v4/ecs/agent/batch-action");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsAgentBatchActionRequest withBody(EcsAgentBatchActionRequestBody body) {
        this.body = body;
        return this;
    }
}
