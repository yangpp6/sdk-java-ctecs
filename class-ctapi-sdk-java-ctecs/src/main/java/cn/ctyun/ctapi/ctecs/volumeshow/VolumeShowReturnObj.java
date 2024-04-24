package cn.ctyun.ctapi.ctecs.volumeshow;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <云硬盘信息查询>
 * Entity: VolumeShowReturnObj
 */
public class VolumeShowReturnObj {
    /**
     * diskName
     * 磁盘名
     */
    private String diskName;
    /**
     * diskID
     * 磁盘ID
     */
    private String diskID;
    /**
     * diskSize
     * 磁盘大小(GB)
     */
    private Integer diskSize;
    /**
     * diskType
     * 磁盘规格类型 SATA/SAS/SSD-genric/SSD/FAST-SSD
     */
    private String diskType;
    /**
     * diskMode
     * 磁盘模式。VBD/ISCSI/FCSAN
     */
    private String diskMode;
    /**
     * diskStatus
     * 云硬盘使用状态 deleting/creating/detaching，具体请参考<a href="https://www.ctyun.cn/document/10027696/10168629">云硬盘使用状态</a>
     */
    private String diskStatus;
    /**
     * createTime
     * 创建时刻，epoch时戳，精度毫秒
     */
    private Integer createTime;
    /**
     * updateTime
     * 更新时刻，epoch时戳，精度毫秒
     */
    private Integer updateTime;
    /**
     * expireTime
     * 过期时刻，epoch时戳，精度毫秒
     */
    private Integer expireTime;
    /**
     * isSystemVolume
     * 是否系统盘，只有为系统盘时才返回该字段
     */
    private Boolean isSystemVolume;
    /**
     * isPackaged
     * 是否是云主机成套资源
     */
    private Boolean isPackaged;
    /**
     * instanceName
     * 绑定的云主机名，有挂载时才返回
     */
    private String instanceName;
    /**
     * instanceID
     * 绑定云主机resourceUUID，有挂载时才返回
     */
    private String instanceID;
    /**
     * instanceStatus
     * 云主机状态starting/restarting/stopping，具体参考<a href="https://www.ctyun.cn/document/10027696/10168629">云主机状态(有挂载时才返回)</a>
     */
    private String instanceStatus;
    /**
     * multiAttach
     * 是否共享云硬盘
     */
    private Boolean multiAttach;
    /**
     * attachments
     * 挂载信息。如果是共享挂载云硬盘，有多项
     */
    private VolumeShowAttachments[] attachments;
    /**
     * projectID
     * 资源所属企业项目ID
     */
    private String projectID;
    /**
     * isEncrypt
     * 是否加密盘
     */
    private Boolean isEncrypt;
    /**
     * kmsUUID
     * 加密盘密钥UUID，是加密盘时才返回
     */
    private String kmsUUID;
    /**
     * onDemand
     * 是否按需订购，按需时才返回该字段
     */
    private Boolean onDemand;
    /**
     * cycleType
     * month/year，非按需时返回
     */
    private String cycleType;
    /**
     * cycleCount
     * 包周期数，非按需时返回
     */
    private Integer cycleCount;
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * azName
     * 多可用区下的可用区名字
     */
    private String azName;

    /**
     * set diskName
     * @param diskName 磁盘名
     * @return this
     */
    public VolumeShowReturnObj withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * set diskID
     * @param diskID 磁盘ID
     * @return this
     */
    public VolumeShowReturnObj withDiskID(String diskID) {
        this.diskID = diskID;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 磁盘大小(GB)
     * @return this
     */
    public VolumeShowReturnObj withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * set diskType
     * @param diskType 磁盘规格类型 SATA/SAS/SSD-genric/SSD/FAST-SSD
     * @return this
     */
    public VolumeShowReturnObj withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set diskMode
     * @param diskMode 磁盘模式。VBD/ISCSI/FCSAN
     * @return this
     */
    public VolumeShowReturnObj withDiskMode(String diskMode) {
        this.diskMode = diskMode;
        return this;
    }

    /**
     * set diskStatus
     * @param diskStatus 云硬盘使用状态 deleting/creating/detaching，具体请参考<a href="https://www.ctyun.cn/document/10027696/10168629">云硬盘使用状态</a>
     * @return this
     */
    public VolumeShowReturnObj withDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus;
        return this;
    }

    /**
     * set createTime
     * @param createTime 创建时刻，epoch时戳，精度毫秒
     * @return this
     */
    public VolumeShowReturnObj withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set updateTime
     * @param updateTime 更新时刻，epoch时戳，精度毫秒
     * @return this
     */
    public VolumeShowReturnObj withUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set expireTime
     * @param expireTime 过期时刻，epoch时戳，精度毫秒
     * @return this
     */
    public VolumeShowReturnObj withExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * set isSystemVolume
     * @param isSystemVolume 是否系统盘，只有为系统盘时才返回该字段
     * @return this
     */
    public VolumeShowReturnObj withIsSystemVolume(Boolean isSystemVolume) {
        this.isSystemVolume = isSystemVolume;
        return this;
    }

    /**
     * set isPackaged
     * @param isPackaged 是否是云主机成套资源
     * @return this
     */
    public VolumeShowReturnObj withIsPackaged(Boolean isPackaged) {
        this.isPackaged = isPackaged;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 绑定的云主机名，有挂载时才返回
     * @return this
     */
    public VolumeShowReturnObj withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 绑定云主机resourceUUID，有挂载时才返回
     * @return this
     */
    public VolumeShowReturnObj withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set instanceStatus
     * @param instanceStatus 云主机状态starting/restarting/stopping，具体参考<a href="https://www.ctyun.cn/document/10027696/10168629">云主机状态(有挂载时才返回)</a>
     * @return this
     */
    public VolumeShowReturnObj withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set multiAttach
     * @param multiAttach 是否共享云硬盘
     * @return this
     */
    public VolumeShowReturnObj withMultiAttach(Boolean multiAttach) {
        this.multiAttach = multiAttach;
        return this;
    }

    /**
     * set attachments
     * @param attachments 挂载信息。如果是共享挂载云硬盘，有多项
     * @return this
     */
    public VolumeShowReturnObj withAttachments(VolumeShowAttachments[] attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * set projectID
     * @param projectID 资源所属企业项目ID
     * @return this
     */
    public VolumeShowReturnObj withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set isEncrypt
     * @param isEncrypt 是否加密盘
     * @return this
     */
    public VolumeShowReturnObj withIsEncrypt(Boolean isEncrypt) {
        this.isEncrypt = isEncrypt;
        return this;
    }

    /**
     * set kmsUUID
     * @param kmsUUID 加密盘密钥UUID，是加密盘时才返回
     * @return this
     */
    public VolumeShowReturnObj withKmsUUID(String kmsUUID) {
        this.kmsUUID = kmsUUID;
        return this;
    }

    /**
     * set onDemand
     * @param onDemand 是否按需订购，按需时才返回该字段
     * @return this
     */
    public VolumeShowReturnObj withOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType month/year，非按需时返回
     * @return this
     */
    public VolumeShowReturnObj withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleCount
     * @param cycleCount 包周期数，非按需时返回
     * @return this
     */
    public VolumeShowReturnObj withCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public VolumeShowReturnObj withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 多可用区下的可用区名字
     * @return this
     */
    public VolumeShowReturnObj withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public String getDiskID() {
        return diskID;
    }

    public void setDiskID(String diskID) {
        this.diskID = diskID;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public String getDiskMode() {
        return diskMode;
    }

    public void setDiskMode(String diskMode) {
        this.diskMode = diskMode;
    }

    public String getDiskStatus() {
        return diskStatus;
    }

    public void setDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public Boolean getIsSystemVolume() {
        return isSystemVolume;
    }

    public void setIsSystemVolume(Boolean isSystemVolume) {
        this.isSystemVolume = isSystemVolume;
    }

    public Boolean getIsPackaged() {
        return isPackaged;
    }

    public void setIsPackaged(Boolean isPackaged) {
        this.isPackaged = isPackaged;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
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

    public Boolean getMultiAttach() {
        return multiAttach;
    }

    public void setMultiAttach(Boolean multiAttach) {
        this.multiAttach = multiAttach;
    }

    public VolumeShowAttachments[] getAttachments() {
        return attachments;
    }

    public void setAttachments(VolumeShowAttachments[] attachments) {
        this.attachments = attachments;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public Boolean getIsEncrypt() {
        return isEncrypt;
    }

    public void setIsEncrypt(Boolean isEncrypt) {
        this.isEncrypt = isEncrypt;
    }

    public String getKmsUUID() {
        return kmsUUID;
    }

    public void setKmsUUID(String kmsUUID) {
        this.kmsUUID = kmsUUID;
    }

    public Boolean getOnDemand() {
        return onDemand;
    }

    public void setOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
    }

    public String getCycleType() {
        return cycleType;
    }

    public void setCycleType(String cycleType) {
        this.cycleType = cycleType;
    }

    public Integer getCycleCount() {
        return cycleCount;
    }

    public void setCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }
}
