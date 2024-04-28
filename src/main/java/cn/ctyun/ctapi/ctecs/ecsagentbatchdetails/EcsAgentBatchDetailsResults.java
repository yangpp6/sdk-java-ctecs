package cn.ctyun.ctapi.ctecs.ecsagentbatchdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询云主机监控插件信息>
 * Entity: EcsAgentBatchDetailsResults
 */
public class EcsAgentBatchDetailsResults {
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;
    /**
     * instanceStatus
     * 云主机状态,云主机的状态有<br />0: Unknown，<br />1: Running，<br />2: Stop，<br />3: Delete
     */
    private Integer instanceStatus;
    /**
     * systemType
     * 云主机的系统类型,有linux和windows
     */
    private String systemType;
    /**
     * systemArch
     * 云主机的CPU架构,CPU架构有<br />amd64: AMD64、x86-64、x64，<br />arm64: ARM64、AARCH6
     */
    private String systemArch;
    /**
     * agentName
     * 安装的agent名称,有zabbix/telegraf/empty
     */
    private String agentName;
    /**
     * agentVersion
     * Agent版本
     */
    private String agentVersion;
    /**
     * isLatestVersion
     * Agent版本是否最新
     */
    private Boolean isLatestVersion;
    /**
     * agentStatus
     * Agent状态,Agent状态有<br />0: Unknow，<br />1: Running，<br />2: Stop，<br />3: Error，<br />4: NetworkError
     */
    private Integer agentStatus;
    /**
     * errMsg
     * 异常描述信息
     */
    private String errMsg;
    /**
     * lastReport
     * 最后一次心跳时间
     */
    private Integer lastReport;
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
    public EcsAgentBatchDetailsResults withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set instanceStatus
     * @param instanceStatus 云主机状态,云主机的状态有<br />0: Unknown，<br />1: Running，<br />2: Stop，<br />3: Delete
     * @return this
     */
    public EcsAgentBatchDetailsResults withInstanceStatus(Integer instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set systemType
     * @param systemType 云主机的系统类型,有linux和windows
     * @return this
     */
    public EcsAgentBatchDetailsResults withSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }

    /**
     * set systemArch
     * @param systemArch 云主机的CPU架构,CPU架构有<br />amd64: AMD64、x86-64、x64，<br />arm64: ARM64、AARCH6
     * @return this
     */
    public EcsAgentBatchDetailsResults withSystemArch(String systemArch) {
        this.systemArch = systemArch;
        return this;
    }

    /**
     * set agentName
     * @param agentName 安装的agent名称,有zabbix/telegraf/empty
     * @return this
     */
    public EcsAgentBatchDetailsResults withAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * set agentVersion
     * @param agentVersion Agent版本
     * @return this
     */
    public EcsAgentBatchDetailsResults withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * set isLatestVersion
     * @param isLatestVersion Agent版本是否最新
     * @return this
     */
    public EcsAgentBatchDetailsResults withIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }

    /**
     * set agentStatus
     * @param agentStatus Agent状态,Agent状态有<br />0: Unknow，<br />1: Running，<br />2: Stop，<br />3: Error，<br />4: NetworkError
     * @return this
     */
    public EcsAgentBatchDetailsResults withAgentStatus(Integer agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * set errMsg
     * @param errMsg 异常描述信息
     * @return this
     */
    public EcsAgentBatchDetailsResults withErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

    /**
     * set lastReport
     * @param lastReport 最后一次心跳时间
     * @return this
     */
    public EcsAgentBatchDetailsResults withLastReport(Integer lastReport) {
        this.lastReport = lastReport;
        return this;
    }

    /**
     * set code
     * @param code 业务状态码
     * @return this
     */
    public EcsAgentBatchDetailsResults withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * set msg
     * @param msg 提示信息
     * @return this
     */
    public EcsAgentBatchDetailsResults withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public Integer getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(Integer instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public String getSystemArch() {
        return systemArch;
    }

    public void setSystemArch(String systemArch) {
        this.systemArch = systemArch;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public Boolean getIsLatestVersion() {
        return isLatestVersion;
    }

    public void setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
    }

    public Integer getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(Integer agentStatus) {
        this.agentStatus = agentStatus;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Integer getLastReport() {
        return lastReport;
    }

    public void setLastReport(Integer lastReport) {
        this.lastReport = lastReport;
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
