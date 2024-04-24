package cn.ctyun.ctapi.ctecs.ecsvolumeattach;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-为云主机挂载云硬盘>
 * Entity: EcsVolumeAttachReturnObj
 */
public class EcsVolumeAttachReturnObj {
    /**
     * jobID
     * 异步任务ID
     */
    private String jobID;

    /**
     * set jobID
     * @param jobID 异步任务ID
     * @return this
     */
    public EcsVolumeAttachReturnObj withJobID(String jobID) {
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
