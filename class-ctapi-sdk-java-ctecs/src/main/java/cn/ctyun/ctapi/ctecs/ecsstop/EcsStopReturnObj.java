package cn.ctyun.ctapi.ctecs.ecsstop;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-关闭一台云主机>
 * Entity: EcsStopReturnObj
 */
public class EcsStopReturnObj {
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
    public EcsStopReturnObj withJobID(String jobID) {
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
