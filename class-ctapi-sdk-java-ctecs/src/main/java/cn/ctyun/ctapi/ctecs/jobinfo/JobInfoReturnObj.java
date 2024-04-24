package cn.ctyun.ctapi.ctecs.jobinfo;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询异步任务状态>
 * Entity: JobInfoReturnObj
 */
public class JobInfoReturnObj {
    /**
     * jobID
     * 异步任务ID
     */
    private String jobID;
    /**
     * status
     * 任务状态 (0:执行中 1:执行成功 2:执行失败)
     */
    private Integer status;
    /**
     * jobStatus
     * job任务状态(executing:执行中, success:执行成功, fail:执行失败)
     */
    private String jobStatus;
    /**
     * fields
     * 任务信息
     */
    private Object fields;

    /**
     * set jobID
     * @param jobID 异步任务ID
     * @return this
     */
    public JobInfoReturnObj withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    /**
     * set status
     * @param status 任务状态 (0:执行中 1:执行成功 2:执行失败)
     * @return this
     */
    public JobInfoReturnObj withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set jobStatus
     * @param jobStatus job任务状态(executing:执行中, success:执行成功, fail:执行失败)
     * @return this
     */
    public JobInfoReturnObj withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * set fields
     * @param fields 任务信息
     * @return this
     */
    public JobInfoReturnObj withFields(Object fields) {
        this.fields = fields;
        return this;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Object getFields() {
        return fields;
    }

    public void setFields(Object fields) {
        this.fields = fields;
    }
}
