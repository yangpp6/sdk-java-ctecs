package cn.ctyun.ctapi.ctecs.ecssfsattach;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <云主机挂载文件系统>
 * Entity: EcsSfsAttachReturnObj
 */
public class EcsSfsAttachReturnObj {
    /**
     * jobID
     * 任务ID
     */
    private String jobID;

    /**
     * set jobID
     * @param jobID 任务ID
     * @return this
     */
    public EcsSfsAttachReturnObj withJobID(String jobID) {
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
