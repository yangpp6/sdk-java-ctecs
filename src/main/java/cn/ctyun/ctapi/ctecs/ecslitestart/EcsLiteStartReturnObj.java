package cn.ctyun.ctapi.ctecs.ecslitestart;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <轻量型云主机开机>
 * Entity: EcsLiteStartReturnObj
 */
public class EcsLiteStartReturnObj {
    /**
     * jobID
     * 开机任务ID
     */
    private String jobID;

    /**
     * set jobID
     * @param jobID 开机任务ID
     * @return this
     */
    public EcsLiteStartReturnObj withJobID(String jobID) {
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
