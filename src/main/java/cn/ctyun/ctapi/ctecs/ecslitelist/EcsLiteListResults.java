package cn.ctyun.ctapi.ctecs.ecslitelist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询轻量型云主机列表>
 * Entity: EcsLiteListResults
 */
public class EcsLiteListResults {
    /**
     * resourceID
     * 云主机资源ID
     */
    private String resourceID;
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;
    /**
     * displayName
     * 云主机显示名称
     */
    private String displayName;
    /**
     * instanceName
     * 云主机名称
     */
    private String instanceName;
    /**
     * osType
     * 操作系统类型，取值范围：<br />1: linux，<br />2: windows，<br />3: redhat，<br />4: ubuntu，<br />5: centos，<br />6: oracle
     */
    private Integer osType;
    /**
     * instanceStatus
     * 云主机状态，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中，<br />error: 错误，<br />snapshotting: 快照创建中
     */
    private String instanceStatus;
    /**
     * expiredTime
     * 到期时间
     */
    private String expiredTime;
    /**
     * createdTime
     * 创建时间
     */
    private String createdTime;
    /**
     * addresses
     * 网络地址信息
     */
    private EcsLiteListAddresses addresses;
    /**
     * image
     * 镜像信息
     */
    private EcsLiteListImage image;
    /**
     * flavor
     * 规格信息
     */
    private EcsLiteListFlavor flavor;
    /**
     * bandwidth
     * 带宽
     */
    private Integer bandwidth;
    /**
     * bootDiskSize
     * 系统盘大小
     */
    private Integer bootDiskSize;

    /**
     * set resourceID
     * @param resourceID 云主机资源ID
     * @return this
     */
    public EcsLiteListResults withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public EcsLiteListResults withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set displayName
     * @param displayName 云主机显示名称
     * @return this
     */
    public EcsLiteListResults withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称
     * @return this
     */
    public EcsLiteListResults withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set osType
     * @param osType 操作系统类型，取值范围：<br />1: linux，<br />2: windows，<br />3: redhat，<br />4: ubuntu，<br />5: centos，<br />6: oracle
     * @return this
     */
    public EcsLiteListResults withOsType(Integer osType) {
        this.osType = osType;
        return this;
    }

    /**
     * set instanceStatus
     * @param instanceStatus 云主机状态，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中，<br />error: 错误，<br />snapshotting: 快照创建中
     * @return this
     */
    public EcsLiteListResults withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set expiredTime
     * @param expiredTime 到期时间
     * @return this
     */
    public EcsLiteListResults withExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * set createdTime
     * @param createdTime 创建时间
     * @return this
     */
    public EcsLiteListResults withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set addresses
     * @param addresses 网络地址信息
     * @return this
     */
    public EcsLiteListResults withAddresses(EcsLiteListAddresses addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * set image
     * @param image 镜像信息
     * @return this
     */
    public EcsLiteListResults withImage(EcsLiteListImage image) {
        this.image = image;
        return this;
    }

    /**
     * set flavor
     * @param flavor 规格信息
     * @return this
     */
    public EcsLiteListResults withFlavor(EcsLiteListFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * set bandwidth
     * @param bandwidth 带宽
     * @return this
     */
    public EcsLiteListResults withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set bootDiskSize
     * @param bootDiskSize 系统盘大小
     * @return this
     */
    public EcsLiteListResults withBootDiskSize(Integer bootDiskSize) {
        this.bootDiskSize = bootDiskSize;
        return this;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public Integer getOsType() {
        return osType;
    }

    public void setOsType(Integer osType) {
        this.osType = osType;
    }

    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public String getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public EcsLiteListAddresses getAddresses() {
        return addresses;
    }

    public void setAddresses(EcsLiteListAddresses addresses) {
        this.addresses = addresses;
    }

    public EcsLiteListImage getImage() {
        return image;
    }

    public void setImage(EcsLiteListImage image) {
        this.image = image;
    }

    public EcsLiteListFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(EcsLiteListFlavor flavor) {
        this.flavor = flavor;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getBootDiskSize() {
        return bootDiskSize;
    }

    public void setBootDiskSize(Integer bootDiskSize) {
        this.bootDiskSize = bootDiskSize;
    }
}
