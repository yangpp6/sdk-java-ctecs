package cn.ctyun.ctapi.ctecs.ecsvolumeshow;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询已将创建好的云硬盘>
 * Entity: EcsVolumeShowReturnObj
 */
public class EcsVolumeShowReturnObj {
    /**
     * name
     * 云硬盘名称
     */
    private String name;
    /**
     * resourceID
     * 云硬盘资源ID（计费资源ID）
     */
    private String resourceID;
    /**
     * diskSize
     * 磁盘大小，单位为GB
     */
    private Integer diskSize;
    /**
     * diskType
     * 云硬盘类型，取值范围：<br />SATA：普通IO<br />SAS：高IO<br />SSD：超高IO<br />SSD-genric：通用型SSD<br />FAST-SSD：极速型SSD
     */
    private String diskType;
    /**
     * diskMode
     * 云硬盘属性，取值范围: [FCSAN、ISCSI、VBD]，默认值为VBD
     */
    private String diskMode;
    /**
     * diskStatus
     * 云硬盘使用状态
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
     * instanceUUID
     * 绑定云主机resourceUUID，有挂载时才返回
     */
    private String instanceUUID;
    /**
     * instanceStatus
     * 云主机状态，有挂载时才返回，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中
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
    private EcsVolumeShowAttachments[] attachments;
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
     * 可用区名称
     */
    private String azName;
    /**
     * diskFreeze
     * 是否冻结
     */
    private Boolean diskFreeze;
    /**
     * resourceUUID
     * 云硬盘ID
     */
    private String resourceUUID;

    /**
     * set name
     * @param name 云硬盘名称
     * @return this
     */
    public EcsVolumeShowReturnObj withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * set resourceID
     * @param resourceID 云硬盘资源ID（计费资源ID）
     * @return this
     */
    public EcsVolumeShowReturnObj withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 磁盘大小，单位为GB
     * @return this
     */
    public EcsVolumeShowReturnObj withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * set diskType
     * @param diskType 云硬盘类型，取值范围：<br />SATA：普通IO<br />SAS：高IO<br />SSD：超高IO<br />SSD-genric：通用型SSD<br />FAST-SSD：极速型SSD
     * @return this
     */
    public EcsVolumeShowReturnObj withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set diskMode
     * @param diskMode 云硬盘属性，取值范围: [FCSAN、ISCSI、VBD]，默认值为VBD
     * @return this
     */
    public EcsVolumeShowReturnObj withDiskMode(String diskMode) {
        this.diskMode = diskMode;
        return this;
    }

    /**
     * set diskStatus
     * @param diskStatus 云硬盘使用状态
     * @return this
     */
    public EcsVolumeShowReturnObj withDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus;
        return this;
    }

    /**
     * set createTime
     * @param createTime 创建时刻，epoch时戳，精度毫秒
     * @return this
     */
    public EcsVolumeShowReturnObj withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set updateTime
     * @param updateTime 更新时刻，epoch时戳，精度毫秒
     * @return this
     */
    public EcsVolumeShowReturnObj withUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set expireTime
     * @param expireTime 过期时刻，epoch时戳，精度毫秒
     * @return this
     */
    public EcsVolumeShowReturnObj withExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * set isSystemVolume
     * @param isSystemVolume 是否系统盘，只有为系统盘时才返回该字段
     * @return this
     */
    public EcsVolumeShowReturnObj withIsSystemVolume(Boolean isSystemVolume) {
        this.isSystemVolume = isSystemVolume;
        return this;
    }

    /**
     * set isPackaged
     * @param isPackaged 是否是云主机成套资源
     * @return this
     */
    public EcsVolumeShowReturnObj withIsPackaged(Boolean isPackaged) {
        this.isPackaged = isPackaged;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 绑定的云主机名，有挂载时才返回
     * @return this
     */
    public EcsVolumeShowReturnObj withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set instanceUUID
     * @param instanceUUID 绑定云主机resourceUUID，有挂载时才返回
     * @return this
     */
    public EcsVolumeShowReturnObj withInstanceUUID(String instanceUUID) {
        this.instanceUUID = instanceUUID;
        return this;
    }

    /**
     * set instanceStatus
     * @param instanceStatus 云主机状态，有挂载时才返回，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中
     * @return this
     */
    public EcsVolumeShowReturnObj withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set multiAttach
     * @param multiAttach 是否共享云硬盘
     * @return this
     */
    public EcsVolumeShowReturnObj withMultiAttach(Boolean multiAttach) {
        this.multiAttach = multiAttach;
        return this;
    }

    /**
     * set attachments
     * @param attachments 挂载信息。如果是共享挂载云硬盘，有多项
     * @return this
     */
    public EcsVolumeShowReturnObj withAttachments(EcsVolumeShowAttachments[] attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * set projectID
     * @param projectID 资源所属企业项目ID
     * @return this
     */
    public EcsVolumeShowReturnObj withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set isEncrypt
     * @param isEncrypt 是否加密盘
     * @return this
     */
    public EcsVolumeShowReturnObj withIsEncrypt(Boolean isEncrypt) {
        this.isEncrypt = isEncrypt;
        return this;
    }

    /**
     * set kmsUUID
     * @param kmsUUID 加密盘密钥UUID，是加密盘时才返回
     * @return this
     */
    public EcsVolumeShowReturnObj withKmsUUID(String kmsUUID) {
        this.kmsUUID = kmsUUID;
        return this;
    }

    /**
     * set onDemand
     * @param onDemand 是否按需订购，按需时才返回该字段
     * @return this
     */
    public EcsVolumeShowReturnObj withOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType month/year，非按需时返回
     * @return this
     */
    public EcsVolumeShowReturnObj withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleCount
     * @param cycleCount 包周期数，非按需时返回
     * @return this
     */
    public EcsVolumeShowReturnObj withCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsVolumeShowReturnObj withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称
     * @return this
     */
    public EcsVolumeShowReturnObj withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set diskFreeze
     * @param diskFreeze 是否冻结
     * @return this
     */
    public EcsVolumeShowReturnObj withDiskFreeze(Boolean diskFreeze) {
        this.diskFreeze = diskFreeze;
        return this;
    }

    /**
     * set resourceUUID
     * @param resourceUUID 云硬盘ID
     * @return this
     */
    public EcsVolumeShowReturnObj withResourceUUID(String resourceUUID) {
        this.resourceUUID = resourceUUID;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
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

    public String getInstanceUUID() {
        return instanceUUID;
    }

    public void setInstanceUUID(String instanceUUID) {
        this.instanceUUID = instanceUUID;
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

    public EcsVolumeShowAttachments[] getAttachments() {
        return attachments;
    }

    public void setAttachments(EcsVolumeShowAttachments[] attachments) {
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

    public Boolean getDiskFreeze() {
        return diskFreeze;
    }

    public void setDiskFreeze(Boolean diskFreeze) {
        this.diskFreeze = diskFreeze;
    }

    public String getResourceUUID() {
        return resourceUUID;
    }

    public void setResourceUUID(String resourceUUID) {
        this.resourceUUID = resourceUUID;
    }
}
