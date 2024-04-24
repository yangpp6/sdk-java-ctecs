package cn.ctyun.ctapi.ctecs.ecsqueryasyncresult;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一个异步任务的结果>
 * Entity: EcsQueryAsyncResultReturnObj
 */
public class EcsQueryAsyncResultReturnObj {
    /**
     * jobStatus
     * 任务执行状态，取值范围：<br />0（执行中），<br />1（执行成功），<br />2（执行失败）
     */
    private Integer jobStatus;

    /**
     * set jobStatus
     * @param jobStatus 任务执行状态，取值范围：<br />0（执行中），<br />1（执行成功），<br />2（执行失败）
     * @return this
     */
    public EcsQueryAsyncResultReturnObj withJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    public Integer getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }
}
