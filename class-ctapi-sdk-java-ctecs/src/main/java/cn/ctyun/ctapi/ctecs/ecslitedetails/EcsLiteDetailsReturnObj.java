package cn.ctyun.ctapi.ctecs.ecslitedetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询轻量型云主机详情>
 * Entity: EcsLiteDetailsReturnObj
 */
public class EcsLiteDetailsReturnObj {
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
     * 云主机状态，取值范围：<br />backuping: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中，<br />error: 错误，<br />snapshotting: 快照创建中
     */
    private String instanceStatus;
    /**
     * expiredTime
     * 到期时间
     */
    private String expiredTime;
    /**
     * updatedTime
     * 更新时间
     */
    private String updatedTime;
    /**
     * createdTime
     * 创建时间
     */
    private String createdTime;
    /**
     * attachedVolume
     * 附加卷
     */
    private String[] attachedVolume;
    /**
     * addresses
     * 网络地址信息
     */
    private EcsLiteDetailsAddresses addresses;
    /**
     * secGroupList
     * 安全组信息
     */
    private EcsLiteDetailsSecurityGroup[] secGroupList;
    /**
     * networkCardList
     * 网卡信息
     */
    private EcsLiteDetailsNetworkCard[] networkCardList;
    /**
     * image
     * 镜像信息
     */
    private EcsLiteDetailsImage image;
    /**
     * flavor
     * 规格信息
     */
    private EcsLiteDetailsFlavor flavor;
    /**
     * vpcID
     * vpc ID
     */
    private String vpcID;
    /**
     * vpcName
     * vpc名称
     */
    private String vpcName;
    /**
     * zabbixName
     * 监控对象名称
     */
    private String zabbixName;
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
    public EcsLiteDetailsReturnObj withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public EcsLiteDetailsReturnObj withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set displayName
     * @param displayName 云主机显示名称
     * @return this
     */
    public EcsLiteDetailsReturnObj withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称
     * @return this
     */
    public EcsLiteDetailsReturnObj withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set osType
     * @param osType 操作系统类型，取值范围：<br />1: linux，<br />2: windows，<br />3: redhat，<br />4: ubuntu，<br />5: centos，<br />6: oracle
     * @return this
     */
    public EcsLiteDetailsReturnObj withOsType(Integer osType) {
        this.osType = osType;
        return this;
    }

    /**
     * set instanceStatus
     * @param instanceStatus 云主机状态，取值范围：<br />backuping: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中，<br />error: 错误，<br />snapshotting: 快照创建中
     * @return this
     */
    public EcsLiteDetailsReturnObj withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set expiredTime
     * @param expiredTime 到期时间
     * @return this
     */
    public EcsLiteDetailsReturnObj withExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * set updatedTime
     * @param updatedTime 更新时间
     * @return this
     */
    public EcsLiteDetailsReturnObj withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * set createdTime
     * @param createdTime 创建时间
     * @return this
     */
    public EcsLiteDetailsReturnObj withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set attachedVolume
     * @param attachedVolume 附加卷
     * @return this
     */
    public EcsLiteDetailsReturnObj withAttachedVolume(String[] attachedVolume) {
        this.attachedVolume = attachedVolume;
        return this;
    }

    /**
     * set addresses
     * @param addresses 网络地址信息
     * @return this
     */
    public EcsLiteDetailsReturnObj withAddresses(EcsLiteDetailsAddresses addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * set secGroupList
     * @param secGroupList 安全组信息
     * @return this
     */
    public EcsLiteDetailsReturnObj withSecGroupList(EcsLiteDetailsSecurityGroup[] secGroupList) {
        this.secGroupList = secGroupList;
        return this;
    }

    /**
     * set networkCardList
     * @param networkCardList 网卡信息
     * @return this
     */
    public EcsLiteDetailsReturnObj withNetworkCardList(EcsLiteDetailsNetworkCard[] networkCardList) {
        this.networkCardList = networkCardList;
        return this;
    }

    /**
     * set image
     * @param image 镜像信息
     * @return this
     */
    public EcsLiteDetailsReturnObj withImage(EcsLiteDetailsImage image) {
        this.image = image;
        return this;
    }

    /**
     * set flavor
     * @param flavor 规格信息
     * @return this
     */
    public EcsLiteDetailsReturnObj withFlavor(EcsLiteDetailsFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * set vpcID
     * @param vpcID vpc ID
     * @return this
     */
    public EcsLiteDetailsReturnObj withVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    /**
     * set vpcName
     * @param vpcName vpc名称
     * @return this
     */
    public EcsLiteDetailsReturnObj withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set zabbixName
     * @param zabbixName 监控对象名称
     * @return this
     */
    public EcsLiteDetailsReturnObj withZabbixName(String zabbixName) {
        this.zabbixName = zabbixName;
        return this;
    }

    /**
     * set bandwidth
     * @param bandwidth 带宽
     * @return this
     */
    public EcsLiteDetailsReturnObj withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set bootDiskSize
     * @param bootDiskSize 系统盘大小
     * @return this
     */
    public EcsLiteDetailsReturnObj withBootDiskSize(Integer bootDiskSize) {
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

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String[] getAttachedVolume() {
        return attachedVolume;
    }

    public void setAttachedVolume(String[] attachedVolume) {
        this.attachedVolume = attachedVolume;
    }

    public EcsLiteDetailsAddresses getAddresses() {
        return addresses;
    }

    public void setAddresses(EcsLiteDetailsAddresses addresses) {
        this.addresses = addresses;
    }

    public EcsLiteDetailsSecurityGroup[] getSecGroupList() {
        return secGroupList;
    }

    public void setSecGroupList(EcsLiteDetailsSecurityGroup[] secGroupList) {
        this.secGroupList = secGroupList;
    }

    public EcsLiteDetailsNetworkCard[] getNetworkCardList() {
        return networkCardList;
    }

    public void setNetworkCardList(EcsLiteDetailsNetworkCard[] networkCardList) {
        this.networkCardList = networkCardList;
    }

    public EcsLiteDetailsImage getImage() {
        return image;
    }

    public void setImage(EcsLiteDetailsImage image) {
        this.image = image;
    }

    public EcsLiteDetailsFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(EcsLiteDetailsFlavor flavor) {
        this.flavor = flavor;
    }

    public String getVpcID() {
        return vpcID;
    }

    public void setVpcID(String vpcID) {
        this.vpcID = vpcID;
    }

    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public String getZabbixName() {
        return zabbixName;
    }

    public void setZabbixName(String zabbixName) {
        this.zabbixName = zabbixName;
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
