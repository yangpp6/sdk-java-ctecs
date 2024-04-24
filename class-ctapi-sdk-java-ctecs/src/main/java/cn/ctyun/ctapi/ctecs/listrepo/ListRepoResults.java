package cn.ctyun.ctapi.ctecs.listrepo;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份存储库>
 * Entity: ListRepoResults
 */
public class ListRepoResults {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * repositoryID
     * 存储库ID
     */
    private String repositoryID;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;
    /**
     * repositoryName
     * 存储库名称
     */
    private String repositoryName;
    /**
     * status
     * 云主机存储库状态，<br />expired: 已到期，<br />active: 可用
     */
    private String status;
    /**
     * size
     * 云主机存储库总容量，单位GB
     */
    private Integer size;
    /**
     * freeSize
     * 云主机存储库剩余大小，单位GB
     */
    private Integer freeSize;
    /**
     * usedSize
     * 云主机存储库使用大小，单位Byte
     */
    private Integer usedSize;
    /**
     * createdAt
     * 创建时间
     */
    private String createdAt;
    /**
     * expiredAt
     * 到期时间
     */
    private String expiredAt;
    /**
     * expired
     * 存储库是否到期
     */
    private Boolean expired;
    /**
     * freeze
     * 是否冻结
     */
    private Boolean freeze;
    /**
     * paas
     * 是否支持PAAS
     */
    private Boolean paas;
    /**
     * backupList
     * 存储库下可用的备份ID列表
     */
    private String[] backupList;
    /**
     * backupCount
     * 存储库中备份数量
     */
    private Integer backupCount;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public ListRepoResults withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set repositoryID
     * @param repositoryID 存储库ID
     * @return this
     */
    public ListRepoResults withRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public ListRepoResults withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set repositoryName
     * @param repositoryName 存储库名称
     * @return this
     */
    public ListRepoResults withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * set status
     * @param status 云主机存储库状态，<br />expired: 已到期，<br />active: 可用
     * @return this
     */
    public ListRepoResults withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * set size
     * @param size 云主机存储库总容量，单位GB
     * @return this
     */
    public ListRepoResults withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * set freeSize
     * @param freeSize 云主机存储库剩余大小，单位GB
     * @return this
     */
    public ListRepoResults withFreeSize(Integer freeSize) {
        this.freeSize = freeSize;
        return this;
    }

    /**
     * set usedSize
     * @param usedSize 云主机存储库使用大小，单位Byte
     * @return this
     */
    public ListRepoResults withUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
        return this;
    }

    /**
     * set createdAt
     * @param createdAt 创建时间
     * @return this
     */
    public ListRepoResults withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * set expiredAt
     * @param expiredAt 到期时间
     * @return this
     */
    public ListRepoResults withExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    /**
     * set expired
     * @param expired 存储库是否到期
     * @return this
     */
    public ListRepoResults withExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }

    /**
     * set freeze
     * @param freeze 是否冻结
     * @return this
     */
    public ListRepoResults withFreeze(Boolean freeze) {
        this.freeze = freeze;
        return this;
    }

    /**
     * set paas
     * @param paas 是否支持PAAS
     * @return this
     */
    public ListRepoResults withPaas(Boolean paas) {
        this.paas = paas;
        return this;
    }

    /**
     * set backupList
     * @param backupList 存储库下可用的备份ID列表
     * @return this
     */
    public ListRepoResults withBackupList(String[] backupList) {
        this.backupList = backupList;
        return this;
    }

    /**
     * set backupCount
     * @param backupCount 存储库中备份数量
     * @return this
     */
    public ListRepoResults withBackupCount(Integer backupCount) {
        this.backupCount = backupCount;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getRepositoryID() {
        return repositoryID;
    }

    public void setRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getFreeSize() {
        return freeSize;
    }

    public void setFreeSize(Integer freeSize) {
        this.freeSize = freeSize;
    }

    public Integer getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public Boolean getFreeze() {
        return freeze;
    }

    public void setFreeze(Boolean freeze) {
        this.freeze = freeze;
    }

    public Boolean getPaas() {
        return paas;
    }

    public void setPaas(Boolean paas) {
        this.paas = paas;
    }

    public String[] getBackupList() {
        return backupList;
    }

    public void setBackupList(String[] backupList) {
        this.backupList = backupList;
    }

    public Integer getBackupCount() {
        return backupCount;
    }

    public void setBackupCount(Integer backupCount) {
        this.backupCount = backupCount;
    }
}
