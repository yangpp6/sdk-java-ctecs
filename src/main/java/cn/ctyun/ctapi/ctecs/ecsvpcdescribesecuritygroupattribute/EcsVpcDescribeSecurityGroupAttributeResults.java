package cn.ctyun.ctapi.ctecs.ecsvpcdescribesecuritygroupattribute;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询用户安全组详情>
 * Entity: EcsVpcDescribeSecurityGroupAttributeResults
 */
public class EcsVpcDescribeSecurityGroupAttributeResults {
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
     * instanceName
     * 云主机名称
     */
    private String instanceName;
    /**
     * azName
     * 可用区名称
     */
    private String azName;
    /**
     * snapshotName
     * 云主机快照名称
     */
    private String snapshotName;
    /**
     * instanceStatus
     * 云主机状态，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中，<br />error: 错误，<br />snapshotting: 快照创建中
     */
    private String instanceStatus;
    /**
     * snapshotStatus
     * 云主机快照状态，<br />pending: 创建中, <br />available: 可用， <br />restoring: 恢复中，<br />error：错误
     */
    private String snapshotStatus;
    /**
     * snapshotDescription
     * 云主机快照描述
     */
    private String snapshotDescription;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;
    /**
     * createdTime
     * 创建时间
     */
    private String createdTime;
    /**
     * updatedTime
     * 更新时间
     */
    private String updatedTime;
    /**
     * imageID
     * 云主机镜像ID
     */
    private String imageID;
    /**
     * memory
     * 云主机内存大小，单位 MB
     */
    private Integer memory;
    /**
     * cpu
     * 云主机cpu核数
     */
    private Integer cpu;
    /**
     * flavorID
     * 云主机规格ID
     */
    private String flavorID;
    /**
     * members
     * 云主机的云硬盘及其快照详细信息
     */
    private EcsVpcDescribeSecurityGroupAttributeMembers[] members;

    /**
     * set snapshotID
     * @param snapshotID 云主机快照ID
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set snapshotName
     * @param snapshotName 云主机快照名称
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    /**
     * set instanceStatus
     * @param instanceStatus 云主机状态，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中，<br />error: 错误，<br />snapshotting: 快照创建中
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set snapshotStatus
     * @param snapshotStatus 云主机快照状态，<br />pending: 创建中, <br />available: 可用， <br />restoring: 恢复中，<br />error：错误
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
        return this;
    }

    /**
     * set snapshotDescription
     * @param snapshotDescription 云主机快照描述
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set createdTime
     * @param createdTime 创建时间
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set updatedTime
     * @param updatedTime 更新时间
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * set imageID
     * @param imageID 云主机镜像ID
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    /**
     * set memory
     * @param memory 云主机内存大小，单位 MB
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * set cpu
     * @param cpu 云主机cpu核数
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * set flavorID
     * @param flavorID 云主机规格ID
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withFlavorID(String flavorID) {
        this.flavorID = flavorID;
        return this;
    }

    /**
     * set members
     * @param members 云主机的云硬盘及其快照详细信息
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeResults withMembers(EcsVpcDescribeSecurityGroupAttributeMembers[] members) {
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

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public String getSnapshotName() {
        return snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public String getSnapshotStatus() {
        return snapshotStatus;
    }

    public void setSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
    }

    public String getSnapshotDescription() {
        return snapshotDescription;
    }

    public void setSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public String getFlavorID() {
        return flavorID;
    }

    public void setFlavorID(String flavorID) {
        this.flavorID = flavorID;
    }

    public EcsVpcDescribeSecurityGroupAttributeMembers[] getMembers() {
        return members;
    }

    public void setMembers(EcsVpcDescribeSecurityGroupAttributeMembers[] members) {
        this.members = members;
    }
}
