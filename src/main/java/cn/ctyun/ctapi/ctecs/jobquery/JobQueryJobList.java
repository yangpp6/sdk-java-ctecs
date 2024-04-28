package cn.ctyun.ctapi.ctecs.jobquery;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个异步任务的结果>
 * Entity: JobQueryJobList
 */
public class JobQueryJobList {
    /**
     * jobID
     * 异步任务ID
     */
    private String jobID;
    /**
     * jobStatus
     * 任务执行状态，取值范围：<br />0：执行中,<br />1：执行成功,<br />2：执行失败
     */
    private Integer jobStatus;

    /**
     * set jobID
     * @param jobID 异步任务ID
     * @return this
     */
    public JobQueryJobList withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    /**
     * set jobStatus
     * @param jobStatus 任务执行状态，取值范围：<br />0：执行中,<br />1：执行成功,<br />2：执行失败
     * @return this
     */
    public JobQueryJobList withJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public Integer getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }
}
