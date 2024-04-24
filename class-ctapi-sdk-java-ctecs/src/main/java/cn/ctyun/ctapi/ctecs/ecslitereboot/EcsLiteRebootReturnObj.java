package cn.ctyun.ctapi.ctecs.ecslitereboot;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <轻量型云主机重启>
 * Entity: EcsLiteRebootReturnObj
 */
public class EcsLiteRebootReturnObj {
    /**
     * jobID
     * 重启任务ID
     */
    private String jobID;

    /**
     * set jobID
     * @param jobID 重启任务ID
     * @return this
     */
    public EcsLiteRebootReturnObj withJobID(String jobID) {
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
