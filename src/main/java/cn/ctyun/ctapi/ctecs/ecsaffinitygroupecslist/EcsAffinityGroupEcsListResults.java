package cn.ctyun.ctapi.ctecs.ecsaffinitygroupecslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组内的云主机>
 * Entity: EcsAffinityGroupEcsListResults
 */
public class EcsAffinityGroupEcsListResults {
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;
    /**
     * availabilityZone
     * 可用区名称
     */
    private String availabilityZone;
    /**
     * attachedVolume
     * 云主机所关联的云硬盘ID列表
     */
    private String[] attachedVolume;
    /**
     * addresses
     * 网络地址信息列表
     */
    private EcsAffinityGroupEcsListAddresses[] addresses;
    /**
     * resourceID
     * 云主机资源ID
     */
    private String resourceID;
    /**
     * ID
     * 云主机ID
     */
    private String ID;
    /**
     * displayName
     * 云主机名称
     */
    private String displayName;
    /**
     * name
     * 云主机名称
     */
    private String name;
    /**
     * osType
     * 操作系统类型，取值范围：<br />1: linux，<br />2: windows，<br />3: redhat，<br />4: ubuntu，<br />5: centos，<br />6: oracle
     */
    private Integer osType;
    /**
     * vmState
     * 云主机状态，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中，<br />master_order_creating: 主订单未完成
     */
    private String vmState;
    /**
     * expiredTime
     * 到期时间
     */
    private String expiredTime;
    /**
     * availableDay
     * 可用时间(天)
     */
    private Integer availableDay;
    /**
     * updatedAt
     * 更新时间
     */
    private String updatedAt;
    /**
     * createdAt
     * 创建时间
     */
    private String createdAt;
    /**
     * zabbixName
     * 监控对象名称
     */
    private String zabbixName;
    /**
     * securityGroup
     * 安全组信息
     */
    private EcsAffinityGroupEcsListSecurityGroup[] securityGroup;
    /**
     * floatingV6UUID
     * 弹性IPv6的UUID
     */
    private String floatingV6UUID;
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
     * nicList
     * 网卡信息列表
     */
    private EcsAffinityGroupEcsListNicList[] nicList;
    /**
     * vipInfoList
     * 虚拟IP信息列表
     */
    private EcsAffinityGroupEcsListVipInfoList[] vipInfoList;
    /**
     * vipCount
     * vip数目
     */
    private Integer vipCount;
    /**
     * affinityGroup
     * 云主机关联的云主机组
     */
    private EcsAffinityGroupEcsListAffinityGroup affinityGroup;
    /**
     * image
     * 镜像信息
     */
    private EcsAffinityGroupEcsListImage image;
    /**
     * flavor
     * 云主机规格
     */
    private EcsAffinityGroupEcsListFlavor flavor;
    /**
     * onDemand
     * 付费方式，取值范围：<br />true表示按量付费; <br />false表示包周期
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
     * 内网IP地址
     */
    private String[] fixedIP;
    /**
     * floatingIP
     * 公网IP地址
     */
    private String floatingIP;
    /**
     * subnetIDList
     * 子网ID列表
     */
    private String[] subnetIDList;
    /**
     * keypairName
     * 云主机关联的密钥对名称
     */
    private String keypairName;

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public EcsAffinityGroupEcsListResults withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set availabilityZone
     * @param availabilityZone 可用区名称
     * @return this
     */
    public EcsAffinityGroupEcsListResults withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * set attachedVolume
     * @param attachedVolume 云主机所关联的云硬盘ID列表
     * @return this
     */
    public EcsAffinityGroupEcsListResults withAttachedVolume(String[] attachedVolume) {
        this.attachedVolume = attachedVolume;
        return this;
    }

    /**
     * set addresses
     * @param addresses 网络地址信息列表
     * @return this
     */
    public EcsAffinityGroupEcsListResults withAddresses(EcsAffinityGroupEcsListAddresses[] addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * set resourceID
     * @param resourceID 云主机资源ID
     * @return this
     */
    public EcsAffinityGroupEcsListResults withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * set ID
     * @param ID 云主机ID
     * @return this
     */
    public EcsAffinityGroupEcsListResults withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set displayName
     * @param displayName 云主机名称
     * @return this
     */
    public EcsAffinityGroupEcsListResults withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set name
     * @param name 云主机名称
     * @return this
     */
    public EcsAffinityGroupEcsListResults withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * set osType
     * @param osType 操作系统类型，取值范围：<br />1: linux，<br />2: windows，<br />3: redhat，<br />4: ubuntu，<br />5: centos，<br />6: oracle
     * @return this
     */
    public EcsAffinityGroupEcsListResults withOsType(Integer osType) {
        this.osType = osType;
        return this;
    }

    /**
     * set vmState
     * @param vmState 云主机状态，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中，<br />master_order_creating: 主订单未完成
     * @return this
     */
    public EcsAffinityGroupEcsListResults withVmState(String vmState) {
        this.vmState = vmState;
        return this;
    }

    /**
     * set expiredTime
     * @param expiredTime 到期时间
     * @return this
     */
    public EcsAffinityGroupEcsListResults withExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * set availableDay
     * @param availableDay 可用时间(天)
     * @return this
     */
    public EcsAffinityGroupEcsListResults withAvailableDay(Integer availableDay) {
        this.availableDay = availableDay;
        return this;
    }

    /**
     * set updatedAt
     * @param updatedAt 更新时间
     * @return this
     */
    public EcsAffinityGroupEcsListResults withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * set createdAt
     * @param createdAt 创建时间
     * @return this
     */
    public EcsAffinityGroupEcsListResults withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * set zabbixName
     * @param zabbixName 监控对象名称
     * @return this
     */
    public EcsAffinityGroupEcsListResults withZabbixName(String zabbixName) {
        this.zabbixName = zabbixName;
        return this;
    }

    /**
     * set securityGroup
     * @param securityGroup 安全组信息
     * @return this
     */
    public EcsAffinityGroupEcsListResults withSecurityGroup(EcsAffinityGroupEcsListSecurityGroup[] securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    /**
     * set floatingV6UUID
     * @param floatingV6UUID 弹性IPv6的UUID
     * @return this
     */
    public EcsAffinityGroupEcsListResults withFloatingV6UUID(String floatingV6UUID) {
        this.floatingV6UUID = floatingV6UUID;
        return this;
    }

    /**
     * set privateIP
     * @param privateIP 内网IPv4地址
     * @return this
     */
    public EcsAffinityGroupEcsListResults withPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }

    /**
     * set privateIPv6
     * @param privateIPv6 内网IPv6址
     * @return this
     */
    public EcsAffinityGroupEcsListResults withPrivateIPv6(String privateIPv6) {
        this.privateIPv6 = privateIPv6;
        return this;
    }

    /**
     * set nicList
     * @param nicList 网卡信息列表
     * @return this
     */
    public EcsAffinityGroupEcsListResults withNicList(EcsAffinityGroupEcsListNicList[] nicList) {
        this.nicList = nicList;
        return this;
    }

    /**
     * set vipInfoList
     * @param vipInfoList 虚拟IP信息列表
     * @return this
     */
    public EcsAffinityGroupEcsListResults withVipInfoList(EcsAffinityGroupEcsListVipInfoList[] vipInfoList) {
        this.vipInfoList = vipInfoList;
        return this;
    }

    /**
     * set vipCount
     * @param vipCount vip数目
     * @return this
     */
    public EcsAffinityGroupEcsListResults withVipCount(Integer vipCount) {
        this.vipCount = vipCount;
        return this;
    }

    /**
     * set affinityGroup
     * @param affinityGroup 云主机关联的云主机组
     * @return this
     */
    public EcsAffinityGroupEcsListResults withAffinityGroup(EcsAffinityGroupEcsListAffinityGroup affinityGroup) {
        this.affinityGroup = affinityGroup;
        return this;
    }

    /**
     * set image
     * @param image 镜像信息
     * @return this
     */
    public EcsAffinityGroupEcsListResults withImage(EcsAffinityGroupEcsListImage image) {
        this.image = image;
        return this;
    }

    /**
     * set flavor
     * @param flavor 云主机规格
     * @return this
     */
    public EcsAffinityGroupEcsListResults withFlavor(EcsAffinityGroupEcsListFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * set onDemand
     * @param onDemand 付费方式，取值范围：<br />true表示按量付费; <br />false表示包周期
     * @return this
     */
    public EcsAffinityGroupEcsListResults withOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
        return this;
    }

    /**
     * set vpcName
     * @param vpcName vpc名称
     * @return this
     */
    public EcsAffinityGroupEcsListResults withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set vpcID
     * @param vpcID vpc ID
     * @return this
     */
    public EcsAffinityGroupEcsListResults withVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    /**
     * set fixedIP
     * @param fixedIP 内网IP地址
     * @return this
     */
    public EcsAffinityGroupEcsListResults withFixedIP(String[] fixedIP) {
        this.fixedIP = fixedIP;
        return this;
    }

    /**
     * set floatingIP
     * @param floatingIP 公网IP地址
     * @return this
     */
    public EcsAffinityGroupEcsListResults withFloatingIP(String floatingIP) {
        this.floatingIP = floatingIP;
        return this;
    }

    /**
     * set subnetIDList
     * @param subnetIDList 子网ID列表
     * @return this
     */
    public EcsAffinityGroupEcsListResults withSubnetIDList(String[] subnetIDList) {
        this.subnetIDList = subnetIDList;
        return this;
    }

    /**
     * set keypairName
     * @param keypairName 云主机关联的密钥对名称
     * @return this
     */
    public EcsAffinityGroupEcsListResults withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public String[] getAttachedVolume() {
        return attachedVolume;
    }

    public void setAttachedVolume(String[] attachedVolume) {
        this.attachedVolume = attachedVolume;
    }

    public EcsAffinityGroupEcsListAddresses[] getAddresses() {
        return addresses;
    }

    public void setAddresses(EcsAffinityGroupEcsListAddresses[] addresses) {
        this.addresses = addresses;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOsType() {
        return osType;
    }

    public void setOsType(Integer osType) {
        this.osType = osType;
    }

    public String getVmState() {
        return vmState;
    }

    public void setVmState(String vmState) {
        this.vmState = vmState;
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

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getZabbixName() {
        return zabbixName;
    }

    public void setZabbixName(String zabbixName) {
        this.zabbixName = zabbixName;
    }

    public EcsAffinityGroupEcsListSecurityGroup[] getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(EcsAffinityGroupEcsListSecurityGroup[] securityGroup) {
        this.securityGroup = securityGroup;
    }

    public String getFloatingV6UUID() {
        return floatingV6UUID;
    }

    public void setFloatingV6UUID(String floatingV6UUID) {
        this.floatingV6UUID = floatingV6UUID;
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

    public EcsAffinityGroupEcsListNicList[] getNicList() {
        return nicList;
    }

    public void setNicList(EcsAffinityGroupEcsListNicList[] nicList) {
        this.nicList = nicList;
    }

    public EcsAffinityGroupEcsListVipInfoList[] getVipInfoList() {
        return vipInfoList;
    }

    public void setVipInfoList(EcsAffinityGroupEcsListVipInfoList[] vipInfoList) {
        this.vipInfoList = vipInfoList;
    }

    public Integer getVipCount() {
        return vipCount;
    }

    public void setVipCount(Integer vipCount) {
        this.vipCount = vipCount;
    }

    public EcsAffinityGroupEcsListAffinityGroup getAffinityGroup() {
        return affinityGroup;
    }

    public void setAffinityGroup(EcsAffinityGroupEcsListAffinityGroup affinityGroup) {
        this.affinityGroup = affinityGroup;
    }

    public EcsAffinityGroupEcsListImage getImage() {
        return image;
    }

    public void setImage(EcsAffinityGroupEcsListImage image) {
        this.image = image;
    }

    public EcsAffinityGroupEcsListFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(EcsAffinityGroupEcsListFlavor flavor) {
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
}
