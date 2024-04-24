package cn.ctyun.ctapi.ctecs.jobinfo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询异步任务状态>
 * Request: JobInfoRequest
 */
public class JobInfoRequest extends CTRequest {
    public JobInfoRequest() {
        super("GET", "application/json", "/v4/job/info");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public JobInfoRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set jobID
     * @param jobID 异步任务ID
     * @return this
     */
    public JobInfoRequest withJobID(String jobID) {
        queryParam.put("jobID", jobID);
        return this;
    }
}
