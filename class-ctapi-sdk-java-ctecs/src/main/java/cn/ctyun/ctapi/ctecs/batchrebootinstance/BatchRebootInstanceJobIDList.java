package cn.ctyun.ctapi.ctecs.batchrebootinstance;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-重启多台云主机>
 * Entity: BatchRebootInstanceJobIDList
 */
public class BatchRebootInstanceJobIDList {
    /**
     * jobID
     * 重启任务ID，您可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9271&data=87">查询多个异步任务的结果</a>来查询操作是否成功
     */
    private String jobID;
    /**
     * instanceID
     * 对应任务云主机ID
     */
    private String instanceID;

    /**
     * set jobID
     * @param jobID 重启任务ID，您可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9271&data=87">查询多个异步任务的结果</a>来查询操作是否成功
     * @return this
     */
    public BatchRebootInstanceJobIDList withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 对应任务云主机ID
     * @return this
     */
    public BatchRebootInstanceJobIDList withInstanceID(String instanceID) {
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
