package cn.ctyun.ctapi.ctecs.ecslitestop;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <轻量型云主机关机>
 * Entity: EcsLiteStopReturnObj
 */
public class EcsLiteStopReturnObj {
    /**
     * jobID
     * 关机任务ID
     */
    private String jobID;

    /**
     * set jobID
     * @param jobID 关机任务ID
     * @return this
     */
    public EcsLiteStopReturnObj withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }
}
