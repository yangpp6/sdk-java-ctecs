package cn.ctyun.ctapi.ctecs.ecsqueryasyncresults;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量查询异步任务的结果>
 * Entity: EcsQueryAsyncResultsReturnObj
 */
public class EcsQueryAsyncResultsReturnObj {
    /**
     * jobList
     * 异步任务列表
     */
    private EcsQueryAsyncResultsJobList[] jobList;

    /**
     * set jobList
     * @param jobList 异步任务列表
     * @return this
     */
    public EcsQueryAsyncResultsReturnObj withJobList(EcsQueryAsyncResultsJobList[] jobList) {
        this.jobList = jobList;
        return this;
    }

    public EcsQueryAsyncResultsJobList[] getJobList() {
        return jobList;
    }

    public void setJobList(EcsQueryAsyncResultsJobList[] jobList) {
        this.jobList = jobList;
    }
}
