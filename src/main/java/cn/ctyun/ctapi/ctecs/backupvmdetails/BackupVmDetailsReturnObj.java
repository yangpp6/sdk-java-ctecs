package cn.ctyun.ctapi.ctecs.backupvmdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机备份查询虚机>
 * Entity: BackupVmDetailsReturnObj
 */
public class BackupVmDetailsReturnObj {
    /**
     * projectID
     * 企业项目id
     */
    private String projectID;
    /**
     * azName
     * 可用区名称
     */
    private String azName;
    /**
     * attachedVolume
     * 云硬盘ID列表
     */
    private String[] attachedVolume;
    /**
     * addresses
     * 网络地址信息
     */
    private BackupVmDetailsAddresses[] addresses;
    /**
     * resourceID
     * 资源ID
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
     * availableDay
     * 可用(天)
     */
    private Integer availableDay;
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
     * zabbixName
     * 监控对象名称
     */
    private String zabbixName;
    /**
     * secGroupList
     * 安全组信息
     */
    private BackupVmDetailsSecGroupList[] secGroupList;
    /**
     * privateIP
     * 内网IPv4地址
     */
    private String privateIP;
    /**
     * privateIPv6
     * 内网IPv6址
     */
    private String privateIPv6;
    /**
     * networkCardList
     * 网卡信息
     */
    private BackupVmDetailsNetworkCardList[] networkCardList;
    /**
     * vipInfoList
     * 虚拟IP信息列表
     */
    private BackupVmDetailsVipInfoList[] vipInfoList;
    /**
     * vipCount
     * vip数目
     */
    private Integer vipCount;
    /**
     * affinityGroup
     * 云主机组信息
     */
    private BackupVmDetailsAffinityGroup affinityGroup;
    /**
     * image
     * 镜像信息
     */
    private BackupVmDetailsImage image;
    /**
     * flavor
     * 云主机规格信息
     */
    private BackupVmDetailsFlavor flavor;
    /**
     * onDemand
     * 付费方式。取值范围：<br>false：包周期。<br>true：按量付费。
     */
    private Boolean onDemand;
    /**
     * vpcName
     * vpc名称
     */
    private String vpcName;
    /**
     * vpcID
     * vpc ID
     */
    private String vpcID;
    /**
     * fixedIP
     * 内网IP
     */
    private String[] fixedIP;
    /**
     * floatingIP
     * 公网IP
     */
    private String floatingIP;
    /**
     * subnetIDList
     * 子网ID列表
     */
    private String[] subnetIDList;
    /**
     * keypairName
     * 密钥对名称
     */
    private String keypairName;
    /**
     * volumes
     * 云硬盘信息
     */
    private BackupVmDetailsVolumes[] volumes;

    /**
     * set projectID
     * @param projectID 企业项目id
     * @return this
     */
    public BackupVmDetailsReturnObj withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称
     * @return this
     */
    public BackupVmDetailsReturnObj withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set attachedVolume
     * @param attachedVolume 云硬盘ID列表
     * @return this
     */
    public BackupVmDetailsReturnObj withAttachedVolume(String[] attachedVolume) {
        this.attachedVolume = attachedVolume;
        return this;
    }

    /**
     * set addresses
     * @param addresses 网络地址信息
     * @return this
     */
    public BackupVmDetailsReturnObj withAddresses(BackupVmDetailsAddresses[] addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * set resourceID
     * @param resourceID 资源ID
     * @return this
     */
    public BackupVmDetailsReturnObj withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public BackupVmDetailsReturnObj withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set displayName
     * @param displayName 云主机显示名称
     * @return this
     */
    public BackupVmDetailsReturnObj withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称
     * @return this
     */
    public BackupVmDetailsReturnObj withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set osType
     * @param osType 操作系统类型，取值范围：<br />1: linux，<br />2: windows，<br />3: redhat，<br />4: ubuntu，<br />5: centos，<br />6: oracle
     * @return this
     */
    public BackupVmDetailsReturnObj withOsType(Integer osType) {
        this.osType = osType;
        return this;
    }

    /**
     * set instanceStatus
     * @param instanceStatus 云主机状态，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中，<br />error: 错误，<br />snapshotting: 快照创建中
     * @return this
     */
    public BackupVmDetailsReturnObj withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set expiredTime
     * @param expiredTime 到期时间
     * @return this
     */
    public BackupVmDetailsReturnObj withExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * set availableDay
     * @param availableDay 可用(天)
     * @return this
     */
    public BackupVmDetailsReturnObj withAvailableDay(Integer availableDay) {
        this.availableDay = availableDay;
        return this;
    }

    /**
     * set updatedTime
     * @param updatedTime 更新时间
     * @return this
     */
    public BackupVmDetailsReturnObj withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * set createdTime
     * @param createdTime 创建时间
     * @return this
     */
    public BackupVmDetailsReturnObj withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set zabbixName
     * @param zabbixName 监控对象名称
     * @return this
     */
    public BackupVmDetailsReturnObj withZabbixName(String zabbixName) {
        this.zabbixName = zabbixName;
        return this;
    }

    /**
     * set secGroupList
     * @param secGroupList 安全组信息
     * @return this
     */
    public BackupVmDetailsReturnObj withSecGroupList(BackupVmDetailsSecGroupList[] secGroupList) {
        this.secGroupList = secGroupList;
        return this;
    }

    /**
     * set privateIP
     * @param privateIP 内网IPv4地址
     * @return this
     */
    public BackupVmDetailsReturnObj withPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }

    /**
     * set privateIPv6
     * @param privateIPv6 内网IPv6址
     * @return this
     */
    public BackupVmDetailsReturnObj withPrivateIPv6(String privateIPv6) {
        this.privateIPv6 = privateIPv6;
        return this;
    }

    /**
     * set networkCardList
     * @param networkCardList 网卡信息
     * @return this
     */
    public BackupVmDetailsReturnObj withNetworkCardList(BackupVmDetailsNetworkCardList[] networkCardList) {
        this.networkCardList = networkCardList;
        return this;
    }

    /**
     * set vipInfoList
     * @param vipInfoList 虚拟IP信息列表
     * @return this
     */
    public BackupVmDetailsReturnObj withVipInfoList(BackupVmDetailsVipInfoList[] vipInfoList) {
        this.vipInfoList = vipInfoList;
        return this;
    }

    /**
     * set vipCount
     * @param vipCount vip数目
     * @return this
     */
    public BackupVmDetailsReturnObj withVipCount(Integer vipCount) {
        this.vipCount = vipCount;
        return this;
    }

    /**
     * set affinityGroup
     * @param affinityGroup 云主机组信息
     * @return this
     */
    public BackupVmDetailsReturnObj withAffinityGroup(BackupVmDetailsAffinityGroup affinityGroup) {
        this.affinityGroup = affinityGroup;
        return this;
    }

    /**
     * set image
     * @param image 镜像信息
     * @return this
     */
    public BackupVmDetailsReturnObj withImage(BackupVmDetailsImage image) {
        this.image = image;
        return this;
    }

    /**
     * set flavor
     * @param flavor 云主机规格信息
     * @return this
     */
    public BackupVmDetailsReturnObj withFlavor(BackupVmDetailsFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * set onDemand
     * @param onDemand 付费方式。取值范围：<br>false：包周期。<br>true：按量付费。
     * @return this
     */
    public BackupVmDetailsReturnObj withOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
        return this;
    }

    /**
     * set vpcName
     * @param vpcName vpc名称
     * @return this
     */
    public BackupVmDetailsReturnObj withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set vpcID
     * @param vpcID vpc ID
     * @return this
     */
    public BackupVmDetailsReturnObj withVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    /**
     * set fixedIP
     * @param fixedIP 内网IP
     * @return this
     */
    public BackupVmDetailsReturnObj withFixedIP(String[] fixedIP) {
        this.fixedIP = fixedIP;
        return this;
    }

    /**
     * set floatingIP
     * @param floatingIP 公网IP
     * @return this
     */
    public BackupVmDetailsReturnObj withFloatingIP(String floatingIP) {
        this.floatingIP = floatingIP;
        return this;
    }

    /**
     * set subnetIDList
     * @param subnetIDList 子网ID列表
     * @return this
     */
    public BackupVmDetailsReturnObj withSubnetIDList(String[] subnetIDList) {
        this.subnetIDList = subnetIDList;
        return this;
    }

    /**
     * set keypairName
     * @param keypairName 密钥对名称
     * @return this
     */
    public BackupVmDetailsReturnObj withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    /**
     * set volumes
     * @param volumes 云硬盘信息
     * @return this
     */
    public BackupVmDetailsReturnObj withVolumes(BackupVmDetailsVolumes[] volumes) {
        this.volumes = volumes;
        return this;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public String[] getAttachedVolume() {
        return attachedVolume;
    }

    public void setAttachedVolume(String[] attachedVolume) {
        this.attachedVolume = attachedVolume;
    }

    public BackupVmDetailsAddresses[] getAddresses() {
        return addresses;
    }

    public void setAddresses(BackupVmDetailsAddresses[] addresses) {
        this.addresses = addresses;
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

    public Integer getAvailableDay() {
        return availableDay;
    }

    public void setAvailableDay(Integer availableDay) {
        this.availableDay = availableDay;
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

    public String getZabbixName() {
        return zabbixName;
    }

    public void setZabbixName(String zabbixName) {
        this.zabbixName = zabbixName;
    }

    public BackupVmDetailsSecGroupList[] getSecGroupList() {
        return secGroupList;
    }

    public void setSecGroupList(BackupVmDetailsSecGroupList[] secGroupList) {
        this.secGroupList = secGroupList;
    }

    public String getPrivateIP() {
        return privateIP;
    }

    public void setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
    }

    public String getPrivateIPv6() {
        return privateIPv6;
    }

    public void setPrivateIPv6(String privateIPv6) {
        this.privateIPv6 = privateIPv6;
    }

    public BackupVmDetailsNetworkCardList[] getNetworkCardList() {
        return networkCardList;
    }

    public void setNetworkCardList(BackupVmDetailsNetworkCardList[] networkCardList) {
        this.networkCardList = networkCardList;
    }

    public BackupVmDetailsVipInfoList[] getVipInfoList() {
        return vipInfoList;
    }

    public void setVipInfoList(BackupVmDetailsVipInfoList[] vipInfoList) {
        this.vipInfoList = vipInfoList;
    }

    public Integer getVipCount() {
        return vipCount;
    }

    public void setVipCount(Integer vipCount) {
        this.vipCount = vipCount;
    }

    public BackupVmDetailsAffinityGroup getAffinityGroup() {
        return affinityGroup;
    }

    public void setAffinityGroup(BackupVmDetailsAffinityGroup affinityGroup) {
        this.affinityGroup = affinityGroup;
    }

    public BackupVmDetailsImage getImage() {
        return image;
    }

    public void setImage(BackupVmDetailsImage image) {
        this.image = image;
    }

    public BackupVmDetailsFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(BackupVmDetailsFlavor flavor) {
        this.flavor = flavor;
    }

    public Boolean getOnDemand() {
        return onDemand;
    }

    public void setOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
    }

    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public String getVpcID() {
        return vpcID;
    }

    public void setVpcID(String vpcID) {
        this.vpcID = vpcID;
    }

    public String[] getFixedIP() {
        return fixedIP;
    }

    public void setFixedIP(String[] fixedIP) {
        this.fixedIP = fixedIP;
    }

    public String getFloatingIP() {
        return floatingIP;
    }

    public void setFloatingIP(String floatingIP) {
        this.floatingIP = floatingIP;
    }

    public String[] getSubnetIDList() {
        return subnetIDList;
    }

    public void setSubnetIDList(String[] subnetIDList) {
        this.subnetIDList = subnetIDList;
    }

    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    public BackupVmDetailsVolumes[] getVolumes() {
        return volumes;
    }

    public void setVolumes(BackupVmDetailsVolumes[] volumes) {
        this.volumes = volumes;
    }
}
