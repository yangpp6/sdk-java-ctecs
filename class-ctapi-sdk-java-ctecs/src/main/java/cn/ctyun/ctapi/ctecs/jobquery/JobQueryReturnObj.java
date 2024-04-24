package cn.ctyun.ctapi.ctecs.jobquery;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个异步任务的结果>
 * Entity: JobQueryReturnObj
 */
public class JobQueryReturnObj {
    /**
     * jobList
     * 异步任务列表
     */
    private JobQueryJobList[] jobList;

    /**
     * set jobList
     * @param jobList 异步任务列表
     * @return this
     */
    public JobQueryReturnObj withJobList(JobQueryJobList[] jobList) {
        this.jobList = jobList;
        return this;
    }

    public JobQueryJobList[] getJobList() {
        return jobList;
    }

    public void setJobList(JobQueryJobList[] jobList) {
        this.jobList = jobList;
    }
}
