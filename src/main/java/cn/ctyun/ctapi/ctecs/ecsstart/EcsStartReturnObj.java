package cn.ctyun.ctapi.ctecs.ecsstart;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-开启一台云主机>
 * Entity: EcsStartReturnObj
 */
public class EcsStartReturnObj {
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
    public EcsStartReturnObj withJobID(String jobID) {
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
