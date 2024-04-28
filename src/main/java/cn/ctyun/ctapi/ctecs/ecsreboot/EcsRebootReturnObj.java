package cn.ctyun.ctapi.ctecs.ecsreboot;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-重启一台云主机>
 * Entity: EcsRebootReturnObj
 */
public class EcsRebootReturnObj {
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
    public EcsRebootReturnObj withJobID(String jobID) {
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
