package cn.ctyun.ctapi.ctecs.ecsagentbatchresults;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询云主机监控插件操作结果>
 * Entity: EcsAgentBatchResultsPidInfo
 */
public class EcsAgentBatchResultsPidInfo {
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;
    /**
     * pid
     * 执行命令的进程ID
     */
    private Integer pid;

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public EcsAgentBatchResultsPidInfo withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set pid
     * @param pid 执行命令的进程ID
     * @return this
     */
    public EcsAgentBatchResultsPidInfo withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
