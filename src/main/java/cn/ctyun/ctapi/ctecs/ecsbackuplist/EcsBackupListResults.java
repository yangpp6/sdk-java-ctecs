package cn.ctyun.ctapi.ctecs.ecsbackuplist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份列表>
 * Entity: EcsBackupListResults
 */
public class EcsBackupListResults {
    /**
     * volumeCount
     * 云硬盘数目
     */
    private Integer volumeCount;
    /**
     * restoreFinishTime
     * 恢复时间
     */
    private String restoreFinishTime;
    /**
     * instanceBackupID
     * 云主机备份ID
     */
    private String instanceBackupID;
    /**
     * repoFreezing
     * 存储库是否冻结，取值范围：<br />true：已冻结，<br />false: 未冻结
     */
    private Boolean repoFreezing;
    /**
     * size
     * 云主机备份大小
     */
    private Integer size;
    /**
     * repositoryID
     * 备份存储库ID
     */
    private String repositoryID;
    /**
     * repositoryName
     * 备份存储库名称
     */
    private String repositoryName;
    /**
     * deleted
     * 是否删除
     */
    private Boolean deleted;
    /**
     * usedSize
     * 已使用大小
     */
    private Integer usedSize;
    /**
     * status
     * 备份状态，取值范围：<br />CREATING: 备份创建中, <br />ACTIVE: 可用， <br />RESTORING: 备份恢复中，<br />DELETING: 删除中，<br />EXPIRED：到期，<br />ERROR：错误
     */
    private String status;
    /**
     * description
     * 备份描述
     */
    private String description;
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
     * repoExpired
     * 存储库是否到期
     */
    private Boolean repoExpired;
    /**
     * instanceBackupName
     * 云主机备份名称
     */
    private String instanceBackupName;
    /**
     * block_device_mappings
     * 云主机关联云硬盘映射表
     */
    private EcsBackupListBlockDeviceMappingS[] block_device_mappings;
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
     * finishTime
     * 完成时间
     */
    private String finishTime;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;

    /**
     * set volumeCount
     * @param volumeCount 云硬盘数目
     * @return this
     */
    public EcsBackupListResults withVolumeCount(Integer volumeCount) {
        this.volumeCount = volumeCount;
        return this;
    }

    /**
     * set restoreFinishTime
     * @param restoreFinishTime 恢复时间
     * @return this
     */
    public EcsBackupListResults withRestoreFinishTime(String restoreFinishTime) {
        this.restoreFinishTime = restoreFinishTime;
        return this;
    }

    /**
     * set instanceBackupID
     * @param instanceBackupID 云主机备份ID
     * @return this
     */
    public EcsBackupListResults withInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
        return this;
    }

    /**
     * set repoFreezing
     * @param repoFreezing 存储库是否冻结，取值范围：<br />true：已冻结，<br />false: 未冻结
     * @return this
     */
    public EcsBackupListResults withRepoFreezing(Boolean repoFreezing) {
        this.repoFreezing = repoFreezing;
        return this;
    }

    /**
     * set size
     * @param size 云主机备份大小
     * @return this
     */
    public EcsBackupListResults withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * set repositoryID
     * @param repositoryID 备份存储库ID
     * @return this
     */
    public EcsBackupListResults withRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
        return this;
    }

    /**
     * set repositoryName
     * @param repositoryName 备份存储库名称
     * @return this
     */
    public EcsBackupListResults withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * set deleted
     * @param deleted 是否删除
     * @return this
     */
    public EcsBackupListResults withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * set usedSize
     * @param usedSize 已使用大小
     * @return this
     */
    public EcsBackupListResults withUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
        return this;
    }

    /**
     * set status
     * @param status 备份状态，取值范围：<br />CREATING: 备份创建中, <br />ACTIVE: 可用， <br />RESTORING: 备份恢复中，<br />DELETING: 删除中，<br />EXPIRED：到期，<br />ERROR：错误
     * @return this
     */
    public EcsBackupListResults withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * set description
     * @param description 备份描述
     * @return this
     */
    public EcsBackupListResults withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public EcsBackupListResults withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称
     * @return this
     */
    public EcsBackupListResults withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set repoExpired
     * @param repoExpired 存储库是否到期
     * @return this
     */
    public EcsBackupListResults withRepoExpired(Boolean repoExpired) {
        this.repoExpired = repoExpired;
        return this;
    }

    /**
     * set instanceBackupName
     * @param instanceBackupName 云主机备份名称
     * @return this
     */
    public EcsBackupListResults withInstanceBackupName(String instanceBackupName) {
        this.instanceBackupName = instanceBackupName;
        return this;
    }

    /**
     * set block_device_mappings
     * @param block_device_mappings 云主机关联云硬盘映射表
     * @return this
     */
    public EcsBackupListResults withBlock_device_mappings(EcsBackupListBlockDeviceMappingS[] block_device_mappings) {
        this.block_device_mappings = block_device_mappings;
        return this;
    }

    /**
     * set createAt
     * @param createAt 创建时间
     * @return this
     */
    public EcsBackupListResults withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * set updateAt
     * @param updateAt 更新时间
     * @return this
     */
    public EcsBackupListResults withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * set finishTime
     * @param finishTime 完成时间
     * @return this
     */
    public EcsBackupListResults withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public EcsBackupListResults withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    public Integer getVolumeCount() {
        return volumeCount;
    }

    public void setVolumeCount(Integer volumeCount) {
        this.volumeCount = volumeCount;
    }

    public String getRestoreFinishTime() {
        return restoreFinishTime;
    }

    public void setRestoreFinishTime(String restoreFinishTime) {
        this.restoreFinishTime = restoreFinishTime;
    }

    public String getInstanceBackupID() {
        return instanceBackupID;
    }

    public void setInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
    }

    public Boolean getRepoFreezing() {
        return repoFreezing;
    }

    public void setRepoFreezing(Boolean repoFreezing) {
        this.repoFreezing = repoFreezing;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
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

    public Boolean getRepoExpired() {
        return repoExpired;
    }

    public void setRepoExpired(Boolean repoExpired) {
        this.repoExpired = repoExpired;
    }

    public String getInstanceBackupName() {
        return instanceBackupName;
    }

    public void setInstanceBackupName(String instanceBackupName) {
        this.instanceBackupName = instanceBackupName;
    }

    public EcsBackupListBlockDeviceMappingS[] getBlock_device_mappings() {
        return block_device_mappings;
    }

    public void setBlock_device_mappings(EcsBackupListBlockDeviceMappingS[] block_device_mappings) {
        this.block_device_mappings = block_device_mappings;
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

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }
}
