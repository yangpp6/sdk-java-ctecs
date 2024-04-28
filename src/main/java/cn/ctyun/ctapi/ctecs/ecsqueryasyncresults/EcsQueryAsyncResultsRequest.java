package cn.ctyun.ctapi.ctecs.ecsqueryasyncresults;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-批量查询异步任务的结果>
 * Request: EcsQueryAsyncResultsRequest
 */
public class EcsQueryAsyncResultsRequest extends CTRequest {
    public EcsQueryAsyncResultsRequest() {
        super("POST", "application/json", "/v4/ecs/query-async-results");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsQueryAsyncResultsRequest withBody(EcsQueryAsyncResultsRequestBody body) {
        this.body = body;
        return this;
    }
}
