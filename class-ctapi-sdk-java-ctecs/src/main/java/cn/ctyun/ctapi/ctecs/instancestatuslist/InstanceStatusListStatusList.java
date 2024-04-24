package cn.ctyun.ctapi.ctecs.instancestatuslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取多台云主机状态>
 * Entity: InstanceStatusListStatusList
 */
public class InstanceStatusListStatusList {
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;
    /**
     * instanceStatus
     * 云主机状态，取值范围：<br />backuping: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中，<br />error: 错误，<br />snapshotting: 快照创建中
     */
    private String instanceStatus;

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public InstanceStatusListStatusList withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set instanceStatus
     * @param instanceStatus 云主机状态，取值范围：<br />backuping: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中，<br />error: 错误，<br />snapshotting: 快照创建中
     * @return this
     */
    public InstanceStatusListStatusList withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }
}
