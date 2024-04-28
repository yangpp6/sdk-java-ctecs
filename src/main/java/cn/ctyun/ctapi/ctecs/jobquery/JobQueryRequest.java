package cn.ctyun.ctapi.ctecs.jobquery;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个异步任务的结果>
 * Request: JobQueryRequest
 */
public class JobQueryRequest extends CTRequest {
    public JobQueryRequest() {
        super("POST", "application/json", "/v4/ecs/job/query");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public JobQueryRequest withBody(JobQueryRequestBody body) {
        this.body = body;
        return this;
    }
}
