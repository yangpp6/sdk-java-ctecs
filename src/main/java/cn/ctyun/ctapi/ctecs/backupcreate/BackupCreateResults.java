package cn.ctyun.ctapi.ctecs.backupcreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份>
 * Entity: BackupCreateResults
 */
public class BackupCreateResults {
    /**
     * instanceBackupID
     * 云主机备份ID
     */
    private String instanceBackupID;
    /**
     * instanceBackupName
     * 云主机备份名称
     */
    private String instanceBackupName;
    /**
     * instanceBackupStatus
     * 备份状态，取值范围：<br />CREATING: 备份创建中, <br />ACTIVE: 可用， <br />RESTORING: 备份恢复中，<br />DELETING: 删除中，<br />EXPIRED：到期，<br />ERROR：错误
     */
    private String instanceBackupStatus;
    /**
     * instanceBackupDescription
     * 云主机备份描述
     */
    private String instanceBackupDescription;
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
     * repositoryID
     * 云主机备份存储库ID
     */
    private String repositoryID;
    /**
     * repositoryName
     * 云主机备份存储库名称
     */
    private String repositoryName;
    /**
     * diskTotalSize
     * 云盘总容量大小，单位为GB
     */
    private Integer diskTotalSize;
    /**
     * usedSize
     * 云硬盘备份已使用大小
     */
    private Integer usedSize;
    /**
     * createdTime
     * 创建时间
     */
    private String createdTime;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;

    /**
     * set instanceBackupID
     * @param instanceBackupID 云主机备份ID
     * @return this
     */
    public BackupCreateResults withInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
        return this;
    }

    /**
     * set instanceBackupName
     * @param instanceBackupName 云主机备份名称
     * @return this
     */
    public BackupCreateResults withInstanceBackupName(String instanceBackupName) {
        this.instanceBackupName = instanceBackupName;
        return this;
    }

    /**
     * set instanceBackupStatus
     * @param instanceBackupStatus 备份状态，取值范围：<br />CREATING: 备份创建中, <br />ACTIVE: 可用， <br />RESTORING: 备份恢复中，<br />DELETING: 删除中，<br />EXPIRED：到期，<br />ERROR：错误
     * @return this
     */
    public BackupCreateResults withInstanceBackupStatus(String instanceBackupStatus) {
        this.instanceBackupStatus = instanceBackupStatus;
        return this;
    }

    /**
     * set instanceBackupDescription
     * @param instanceBackupDescription 云主机备份描述
     * @return this
     */
    public BackupCreateResults withInstanceBackupDescription(String instanceBackupDescription) {
        this.instanceBackupDescription = instanceBackupDescription;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public BackupCreateResults withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称
     * @return this
     */
    public BackupCreateResults withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set repositoryID
     * @param repositoryID 云主机备份存储库ID
     * @return this
     */
    public BackupCreateResults withRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
        return this;
    }

    /**
     * set repositoryName
     * @param repositoryName 云主机备份存储库名称
     * @return this
     */
    public BackupCreateResults withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * set diskTotalSize
     * @param diskTotalSize 云盘总容量大小，单位为GB
     * @return this
     */
    public BackupCreateResults withDiskTotalSize(Integer diskTotalSize) {
        this.diskTotalSize = diskTotalSize;
        return this;
    }

    /**
     * set usedSize
     * @param usedSize 云硬盘备份已使用大小
     * @return this
     */
    public BackupCreateResults withUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
        return this;
    }

    /**
     * set createdTime
     * @param createdTime 创建时间
     * @return this
     */
    public BackupCreateResults withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public BackupCreateResults withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    public String getInstanceBackupID() {
        return instanceBackupID;
    }

    public void setInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
    }

    public String getInstanceBackupName() {
        return instanceBackupName;
    }

    public void setInstanceBackupName(String instanceBackupName) {
        this.instanceBackupName = instanceBackupName;
    }

    public String getInstanceBackupStatus() {
        return instanceBackupStatus;
    }

    public void setInstanceBackupStatus(String instanceBackupStatus) {
        this.instanceBackupStatus = instanceBackupStatus;
    }

    public String getInstanceBackupDescription() {
        return instanceBackupDescription;
    }

    public void setInstanceBackupDescription(String instanceBackupDescription) {
        this.instanceBackupDescription = instanceBackupDescription;
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

    public String getRepositoryID() {
        return repositoryID;
    }

    public void setRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public Integer getDiskTotalSize() {
        return diskTotalSize;
    }

    public void setDiskTotalSize(Integer diskTotalSize) {
        this.diskTotalSize = diskTotalSize;
    }

    public Integer getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }
}
