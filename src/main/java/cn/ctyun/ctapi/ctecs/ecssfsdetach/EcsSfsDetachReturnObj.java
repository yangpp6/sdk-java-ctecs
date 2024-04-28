package cn.ctyun.ctapi.ctecs.ecssfsdetach;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <云主机卸载文件系统>
 * Entity: EcsSfsDetachReturnObj
 */
public class EcsSfsDetachReturnObj {
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
    public EcsSfsDetachReturnObj withJobID(String jobID) {
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
