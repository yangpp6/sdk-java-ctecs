package cn.ctyun.ctapi.ctecs.ecsagentbatchaction;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <操作云主机监控插件>
 * Entity: EcsAgentBatchActionResults
 */
public class EcsAgentBatchActionResults {
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;
    /**
     * status
     * qga命令执行状态，执行状态有<br />-1: 调用云助手失败，未执行命令，<br />0: 命令执行成功，有返回值，<br />1: 命令执行成功，无返回值，<br />2: 命令执行失败，有返回值，<br />3: 命令执行失败，无返回值，<br />4: 命令执行超时，需通过查询命令执行结果接口异步查询
     */
    private Integer status;
    /**
     * result
     * 具体信息
     */
    private String result;
    /**
     * pid
     * 执行命令的进程ID
     */
    private Integer pid;
    /**
     * code
     * 业务状态码
     */
    private Integer code;
    /**
     * msg
     * 提示信息
     */
    private String msg;

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public EcsAgentBatchActionResults withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set status
     * @param status qga命令执行状态，执行状态有<br />-1: 调用云助手失败，未执行命令，<br />0: 命令执行成功，有返回值，<br />1: 命令执行成功，无返回值，<br />2: 命令执行失败，有返回值，<br />3: 命令执行失败，无返回值，<br />4: 命令执行超时，需通过查询命令执行结果接口异步查询
     * @return this
     */
    public EcsAgentBatchActionResults withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set result
     * @param result 具体信息
     * @return this
     */
    public EcsAgentBatchActionResults withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * set pid
     * @param pid 执行命令的进程ID
     * @return this
     */
    public EcsAgentBatchActionResults withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * set code
     * @param code 业务状态码
     * @return this
     */
    public EcsAgentBatchActionResults withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * set msg
     * @param msg 提示信息
     * @return this
     */
    public EcsAgentBatchActionResults withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
