package cn.ctyun.ctapi.ctecs.ecssnapshotdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照详情>
 * Entity: EcsSnapshotDetailsResults
 */
public class EcsSnapshotDetailsResults {
    /**
     * snapshotID
     * 云主机快照ID
     */
    private String snapshotID;
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;
    /**
     * azName
     * 可用区名称
     */
    private String azName;
    /**
     * instanceSnapshotName
     * 云主机快照名称
     */
    private String instanceSnapshotName;
    /**
     * isMaz
     * 是否适用MAZ
     */
    private Boolean isMaz;
    /**
     * instanceStatus
     * 云主机状态，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中
     */
    private String instanceStatus;
    /**
     * customerID
     * 用户ID
     */
    private String customerID;
    /**
     * status
     * 云主机快照状态
     */
    private String status;
    /**
     * description
     * 云主机快照描述
     */
    private String description;
    /**
     * isPaas
     * is_paas
     */
    private Boolean isPaas;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;
    /**
     * deletedTime
     * 删除时间
     */
    private Integer deletedTime;
    /**
     * expiredTime
     * 到期时间
     */
    private Integer expiredTime;
    /**
     * createAt
     * 创建时间
     */
    private String createAt;
    /**
     * updateAt
     * 更新时间
     */
    private String updateAt;
    /**
     * members
     * 云硬盘及其快照详细信息
     */
    private EcsSnapshotDetailsMembers[] members;

    /**
     * set snapshotID
     * @param snapshotID 云主机快照ID
     * @return this
     */
    public EcsSnapshotDetailsResults withSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public EcsSnapshotDetailsResults withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称
     * @return this
     */
    public EcsSnapshotDetailsResults withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set instanceSnapshotName
     * @param instanceSnapshotName 云主机快照名称
     * @return this
     */
    public EcsSnapshotDetailsResults withInstanceSnapshotName(String instanceSnapshotName) {
        this.instanceSnapshotName = instanceSnapshotName;
        return this;
    }

    /**
     * set isMaz
     * @param isMaz 是否适用MAZ
     * @return this
     */
    public EcsSnapshotDetailsResults withIsMaz(Boolean isMaz) {
        this.isMaz = isMaz;
        return this;
    }

    /**
     * set instanceStatus
     * @param instanceStatus 云主机状态，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中
     * @return this
     */
    public EcsSnapshotDetailsResults withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set customerID
     * @param customerID 用户ID
     * @return this
     */
    public EcsSnapshotDetailsResults withCustomerID(String customerID) {
        this.customerID = customerID;
        return this;
    }

    /**
     * set status
     * @param status 云主机快照状态
     * @return this
     */
    public EcsSnapshotDetailsResults withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * set description
     * @param description 云主机快照描述
     * @return this
     */
    public EcsSnapshotDetailsResults withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set isPaas
     * @param isPaas is_paas
     * @return this
     */
    public EcsSnapshotDetailsResults withIsPaas(Boolean isPaas) {
        this.isPaas = isPaas;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public EcsSnapshotDetailsResults withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set deletedTime
     * @param deletedTime 删除时间
     * @return this
     */
    public EcsSnapshotDetailsResults withDeletedTime(Integer deletedTime) {
        this.deletedTime = deletedTime;
        return this;
    }

    /**
     * set expiredTime
     * @param expiredTime 到期时间
     * @return this
     */
    public EcsSnapshotDetailsResults withExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * set createAt
     * @param createAt 创建时间
     * @return this
     */
    public EcsSnapshotDetailsResults withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * set updateAt
     * @param updateAt 更新时间
     * @return this
     */
    public EcsSnapshotDetailsResults withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * set members
     * @param members 云硬盘及其快照详细信息
     * @return this
     */
    public EcsSnapshotDetailsResults withMembers(EcsSnapshotDetailsMembers[] members) {
        this.members = members;
        return this;
    }

    public String getSnapshotID() {
        return snapshotID;
    }

    public void setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public String getInstanceSnapshotName() {
        return instanceSnapshotName;
    }

    public void setInstanceSnapshotName(String instanceSnapshotName) {
        this.instanceSnapshotName = instanceSnapshotName;
    }

    public Boolean getIsMaz() {
        return isMaz;
    }

    public void setIsMaz(Boolean isMaz) {
        this.isMaz = isMaz;
    }

    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsPaas() {
        return isPaas;
    }

    public void setIsPaas(Boolean isPaas) {
        this.isPaas = isPaas;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public Integer getDeletedTime() {
        return deletedTime;
    }

    public void setDeletedTime(Integer deletedTime) {
        this.deletedTime = deletedTime;
    }

    public Integer getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public EcsSnapshotDetailsMembers[] getMembers() {
        return members;
    }

    public void setMembers(EcsSnapshotDetailsMembers[] members) {
        this.members = members;
    }
}
