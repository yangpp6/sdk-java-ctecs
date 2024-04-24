package cn.ctyun.ctapi.ctecs.batchrebuildinstance;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-重装多台云主机>
 * Entity: BatchRebuildInstanceJobIDList
 */
public class BatchRebuildInstanceJobIDList {
    /**
     * jobID
     * 重装任务ID
     */
    private String jobID;
    /**
     * instanceID
     * 对应任务云主机ID
     */
    private String instanceID;

    /**
     * set jobID
     * @param jobID 重装任务ID
     * @return this
     */
    public BatchRebuildInstanceJobIDList withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 对应任务云主机ID
     * @return this
     */
    public BatchRebuildInstanceJobIDList withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }
}
