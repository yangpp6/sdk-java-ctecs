package cn.ctyun.ctapi.ctecs.ecsrebuild;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-重装一台云主机>
 * Entity: EcsRebuildReturnObj
 */
public class EcsRebuildReturnObj {
    /**
     * jobID
     * 重装任务ID
     */
    private String jobID;

    /**
     * set jobID
     * @param jobID 重装任务ID
     * @return this
     */
    public EcsRebuildReturnObj withJobID(String jobID) {
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
