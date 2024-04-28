package cn.ctyun.ctapi.ctecs.backuppolicylistinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份策略绑定云主机信息>
 * Entity: BackupPolicyListInstancesInstancePolicies
 */
public class BackupPolicyListInstancesInstancePolicies {
    /**
     * status
     * 云主机状态
     */
    private String status;
    /**
     * attachedVolumes
     * 云主机所关联的云硬盘ID列表
     */
    private String[] attachedVolumes;
    /**
     * displayName
     * 云主机显示名称
     */
    private String displayName;
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * instanceName
     * 云主机名称
     */
    private String instanceName;
    /**
     * createTime
     * 创建时间
     */
    private String createTime;
    /**
     * updateTime
     * 更新时间
     */
    private String updateTime;

    /**
     * set status
     * @param status 云主机状态
     * @return this
     */
    public BackupPolicyListInstancesInstancePolicies withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * set attachedVolumes
     * @param attachedVolumes 云主机所关联的云硬盘ID列表
     * @return this
     */
    public BackupPolicyListInstancesInstancePolicies withAttachedVolumes(String[] attachedVolumes) {
        this.attachedVolumes = attachedVolumes;
        return this;
    }

    /**
     * set displayName
     * @param displayName 云主机显示名称
     * @return this
     */
    public BackupPolicyListInstancesInstancePolicies withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public BackupPolicyListInstancesInstancePolicies withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public BackupPolicyListInstancesInstancePolicies withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称
     * @return this
     */
    public BackupPolicyListInstancesInstancePolicies withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set createTime
     * @param createTime 创建时间
     * @return this
     */
    public BackupPolicyListInstancesInstancePolicies withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set updateTime
     * @param updateTime 更新时间
     * @return this
     */
    public BackupPolicyListInstancesInstancePolicies withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getAttachedVolumes() {
        return attachedVolumes;
    }

    public void setAttachedVolumes(String[] attachedVolumes) {
        this.attachedVolumes = attachedVolumes;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
