package cn.ctyun.ctapi.ctecs.ecsqueryasyncresult;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询一个异步任务的结果>
 * Request: EcsQueryAsyncResultRequest
 */
public class EcsQueryAsyncResultRequest extends CTRequest {
    public EcsQueryAsyncResultRequest() {
        super("GET", "application/json", "/v4/ecs/query-async-result");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsQueryAsyncResultRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set jobID
     * @param jobID 异步任务ID
     * @return this
     */
    public EcsQueryAsyncResultRequest withJobID(String jobID) {
        queryParam.put("jobID", jobID);
        return this;
    }
}
