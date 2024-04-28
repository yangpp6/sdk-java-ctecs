package cn.ctyun.ctapi.ctecs.descibeinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一台或多台云主机详细信息>
 * Entity: DescibeInstancesResults
 */
public class DescibeInstancesResults {
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;
    /**
     * azName
     * 可用区名称
     */
    private String azName;
    /**
     * azDisplayName
     * 可用区展示名称
     */
    private String azDisplayName;
    /**
     * attachedVolume
     * 云硬盘ID列表
     */
    private String[] attachedVolume;
    /**
     * addresses
     * 网络地址信息
     */
    private DescibeInstancesAddresses[] addresses;
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
     * 操作系统类型，取值范围：<br />1（linux），<br />2（windows），<br />3（redhat），<br />4（ubuntu），<br />5（centos），<br />6（oracle）
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
     * createdTime
     * 创建时间
     */
    private String createdTime;
    /**
     * secGroupList
     * 安全组信息列表
     */
    private DescibeInstancesSecGroupList[] secGroupList;
    /**
     * vipInfoList
     * 虚拟IP信息列表
     */
    private DescibeInstancesVipInfoList[] vipInfoList;
    /**
     * affinityGroup
     * 云主机组信息
     */
    private DescibeInstancesAffinityGroup affinityGroup;
    /**
     * image
     * 镜像信息
     */
    private DescibeInstancesImage image;
    /**
     * flavor
     * 云主机规格信息
     */
    private DescibeInstancesFlavor flavor;
    /**
     * onDemand
     * 付费方式，取值范围：<br />true（按量付费）;<br />false（包周期）
     */
    private Boolean onDemand;
    /**
     * keypairName
     * 密钥对名称
     */
    private String keypairName;
    /**
     * networkInfo
     * 网络信息
     */
    private DescibeInstancesNetworkInfo[] networkInfo;

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public DescibeInstancesResults withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称
     * @return this
     */
    public DescibeInstancesResults withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set azDisplayName
     * @param azDisplayName 可用区展示名称
     * @return this
     */
    public DescibeInstancesResults withAzDisplayName(String azDisplayName) {
        this.azDisplayName = azDisplayName;
        return this;
    }

    /**
     * set attachedVolume
     * @param attachedVolume 云硬盘ID列表
     * @return this
     */
    public DescibeInstancesResults withAttachedVolume(String[] attachedVolume) {
        this.attachedVolume = attachedVolume;
        return this;
    }

    /**
     * set addresses
     * @param addresses 网络地址信息
     * @return this
     */
    public DescibeInstancesResults withAddresses(DescibeInstancesAddresses[] addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public DescibeInstancesResults withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set displayName
     * @param displayName 云主机显示名称
     * @return this
     */
    public DescibeInstancesResults withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称
     * @return this
     */
    public DescibeInstancesResults withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set osType
     * @param osType 操作系统类型，取值范围：<br />1（linux），<br />2（windows），<br />3（redhat），<br />4（ubuntu），<br />5（centos），<br />6（oracle）
     * @return this
     */
    public DescibeInstancesResults withOsType(Integer osType) {
        this.osType = osType;
        return this;
    }

    /**
     * set instanceStatus
     * @param instanceStatus 云主机状态，取值范围：<br />backuping: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中，<br />error: 错误，<br />snapshotting: 快照创建中
     * @return this
     */
    public DescibeInstancesResults withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set expiredTime
     * @param expiredTime 到期时间
     * @return this
     */
    public DescibeInstancesResults withExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * set createdTime
     * @param createdTime 创建时间
     * @return this
     */
    public DescibeInstancesResults withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set secGroupList
     * @param secGroupList 安全组信息列表
     * @return this
     */
    public DescibeInstancesResults withSecGroupList(DescibeInstancesSecGroupList[] secGroupList) {
        this.secGroupList = secGroupList;
        return this;
    }

    /**
     * set vipInfoList
     * @param vipInfoList 虚拟IP信息列表
     * @return this
     */
    public DescibeInstancesResults withVipInfoList(DescibeInstancesVipInfoList[] vipInfoList) {
        this.vipInfoList = vipInfoList;
        return this;
    }

    /**
     * set affinityGroup
     * @param affinityGroup 云主机组信息
     * @return this
     */
    public DescibeInstancesResults withAffinityGroup(DescibeInstancesAffinityGroup affinityGroup) {
        this.affinityGroup = affinityGroup;
        return this;
    }

    /**
     * set image
     * @param image 镜像信息
     * @return this
     */
    public DescibeInstancesResults withImage(DescibeInstancesImage image) {
        this.image = image;
        return this;
    }

    /**
     * set flavor
     * @param flavor 云主机规格信息
     * @return this
     */
    public DescibeInstancesResults withFlavor(DescibeInstancesFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * set onDemand
     * @param onDemand 付费方式，取值范围：<br />true（按量付费）;<br />false（包周期）
     * @return this
     */
    public DescibeInstancesResults withOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
        return this;
    }

    /**
     * set keypairName
     * @param keypairName 密钥对名称
     * @return this
     */
    public DescibeInstancesResults withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    /**
     * set networkInfo
     * @param networkInfo 网络信息
     * @return this
     */
    public DescibeInstancesResults withNetworkInfo(DescibeInstancesNetworkInfo[] networkInfo) {
        this.networkInfo = networkInfo;
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

    public String getAzDisplayName() {
        return azDisplayName;
    }

    public void setAzDisplayName(String azDisplayName) {
        this.azDisplayName = azDisplayName;
    }

    public String[] getAttachedVolume() {
        return attachedVolume;
    }

    public void setAttachedVolume(String[] attachedVolume) {
        this.attachedVolume = attachedVolume;
    }

    public DescibeInstancesAddresses[] getAddresses() {
        return addresses;
    }

    public void setAddresses(DescibeInstancesAddresses[] addresses) {
        this.addresses = addresses;
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

    public DescibeInstancesSecGroupList[] getSecGroupList() {
        return secGroupList;
    }

    public void setSecGroupList(DescibeInstancesSecGroupList[] secGroupList) {
        this.secGroupList = secGroupList;
    }

    public DescibeInstancesVipInfoList[] getVipInfoList() {
        return vipInfoList;
    }

    public void setVipInfoList(DescibeInstancesVipInfoList[] vipInfoList) {
        this.vipInfoList = vipInfoList;
    }

    public DescibeInstancesAffinityGroup getAffinityGroup() {
        return affinityGroup;
    }

    public void setAffinityGroup(DescibeInstancesAffinityGroup affinityGroup) {
        this.affinityGroup = affinityGroup;
    }

    public DescibeInstancesImage getImage() {
        return image;
    }

    public void setImage(DescibeInstancesImage image) {
        this.image = image;
    }

    public DescibeInstancesFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(DescibeInstancesFlavor flavor) {
        this.flavor = flavor;
    }

    public Boolean getOnDemand() {
        return onDemand;
    }

    public void setOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
    }

    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    public DescibeInstancesNetworkInfo[] getNetworkInfo() {
        return networkInfo;
    }

    public void setNetworkInfo(DescibeInstancesNetworkInfo[] networkInfo) {
        this.networkInfo = networkInfo;
    }
}
