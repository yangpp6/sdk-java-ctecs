package cn.ctyun.ctapi.ctecs.backuplist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份列表>
 * Entity: BackupListResults
 */
public class BackupListResults {
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
     * 云主机备份状态，取值范围：<br />CREATING: 备份创建中, <br />ACTIVE: 可用， <br />RESTORING: 备份恢复中，<br />DELETING: 删除中，<br />EXPIRED：到期，<br />ERROR：错误
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
     * repositoryExpired
     * 云主机备份存储库是否过期
     */
    private Boolean repositoryExpired;
    /**
     * repositoryFreeze
     * 存储库是否冻结
     */
    private Boolean repositoryFreeze;
    /**
     * diskTotalSize
     * 云盘总容量大小，单位为GB
     */
    private Integer diskTotalSize;
    /**
     * usedSize
     * 磁盘备份已使用大小
     */
    private Integer usedSize;
    /**
     * diskCount
     * 云盘数目
     */
    private Integer diskCount;
    /**
     * restoreFinishedTime
     * 备份恢复完成时间
     */
    private String restoreFinishedTime;
    /**
     * createdTime
     * 创建时间
     */
    private String createdTime;
    /**
     * finishedTime
     * 完成时间
     */
    private String finishedTime;
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
    public BackupListResults withInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
        return this;
    }

    /**
     * set instanceBackupName
     * @param instanceBackupName 云主机备份名称
     * @return this
     */
    public BackupListResults withInstanceBackupName(String instanceBackupName) {
        this.instanceBackupName = instanceBackupName;
        return this;
    }

    /**
     * set instanceBackupStatus
     * @param instanceBackupStatus 云主机备份状态，取值范围：<br />CREATING: 备份创建中, <br />ACTIVE: 可用， <br />RESTORING: 备份恢复中，<br />DELETING: 删除中，<br />EXPIRED：到期，<br />ERROR：错误
     * @return this
     */
    public BackupListResults withInstanceBackupStatus(String instanceBackupStatus) {
        this.instanceBackupStatus = instanceBackupStatus;
        return this;
    }

    /**
     * set instanceBackupDescription
     * @param instanceBackupDescription 云主机备份描述
     * @return this
     */
    public BackupListResults withInstanceBackupDescription(String instanceBackupDescription) {
        this.instanceBackupDescription = instanceBackupDescription;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public BackupListResults withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称
     * @return this
     */
    public BackupListResults withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set repositoryID
     * @param repositoryID 云主机备份存储库ID
     * @return this
     */
    public BackupListResults withRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
        return this;
    }

    /**
     * set repositoryName
     * @param repositoryName 云主机备份存储库名称
     * @return this
     */
    public BackupListResults withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * set repositoryExpired
     * @param repositoryExpired 云主机备份存储库是否过期
     * @return this
     */
    public BackupListResults withRepositoryExpired(Boolean repositoryExpired) {
        this.repositoryExpired = repositoryExpired;
        return this;
    }

    /**
     * set repositoryFreeze
     * @param repositoryFreeze 存储库是否冻结
     * @return this
     */
    public BackupListResults withRepositoryFreeze(Boolean repositoryFreeze) {
        this.repositoryFreeze = repositoryFreeze;
        return this;
    }

    /**
     * set diskTotalSize
     * @param diskTotalSize 云盘总容量大小，单位为GB
     * @return this
     */
    public BackupListResults withDiskTotalSize(Integer diskTotalSize) {
        this.diskTotalSize = diskTotalSize;
        return this;
    }

    /**
     * set usedSize
     * @param usedSize 磁盘备份已使用大小
     * @return this
     */
    public BackupListResults withUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
        return this;
    }

    /**
     * set diskCount
     * @param diskCount 云盘数目
     * @return this
     */
    public BackupListResults withDiskCount(Integer diskCount) {
        this.diskCount = diskCount;
        return this;
    }

    /**
     * set restoreFinishedTime
     * @param restoreFinishedTime 备份恢复完成时间
     * @return this
     */
    public BackupListResults withRestoreFinishedTime(String restoreFinishedTime) {
        this.restoreFinishedTime = restoreFinishedTime;
        return this;
    }

    /**
     * set createdTime
     * @param createdTime 创建时间
     * @return this
     */
    public BackupListResults withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set finishedTime
     * @param finishedTime 完成时间
     * @return this
     */
    public BackupListResults withFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public BackupListResults withProjectID(String projectID) {
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

    public Boolean getRepositoryExpired() {
        return repositoryExpired;
    }

    public void setRepositoryExpired(Boolean repositoryExpired) {
        this.repositoryExpired = repositoryExpired;
    }

    public Boolean getRepositoryFreeze() {
        return repositoryFreeze;
    }

    public void setRepositoryFreeze(Boolean repositoryFreeze) {
        this.repositoryFreeze = repositoryFreeze;
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

    public Integer getDiskCount() {
        return diskCount;
    }

    public void setDiskCount(Integer diskCount) {
        this.diskCount = diskCount;
    }

    public String getRestoreFinishedTime() {
        return restoreFinishedTime;
    }

    public void setRestoreFinishedTime(String restoreFinishedTime) {
        this.restoreFinishedTime = restoreFinishedTime;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }
}
