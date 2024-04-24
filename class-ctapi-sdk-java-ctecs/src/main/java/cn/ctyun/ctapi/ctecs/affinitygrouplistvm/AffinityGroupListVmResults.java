package cn.ctyun.ctapi.ctecs.affinitygrouplistvm;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组内的云主机>
 * Entity: AffinityGroupListVmResults
 */
public class AffinityGroupListVmResults {
    /**
     * projectID
     * 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目</a>了解如何创建企业项目
     */
    private String projectID;
    /**
     * azName
     * 可用区名称，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解可用区 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a><br />注：查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空（即为单可用区，本字段填写default）
     */
    private String azName;
    /**
     * attachedVolume
     * 云主机挂载的云硬盘列表
     */
    private String[] attachedVolume;
    /**
     * addresses
     * 网络地址信息
     */
    private AffinityGroupListVmAddresses[] addresses;
    /**
     * resourceID
     * 资源ID，非资源的UUID，该ID为订单的资源ID（创建云主机接口为异步接口，订单先返回一个该资源ID方便后续查找）<br />获取：<br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>
     */
    private String resourceID;
    /**
     * instanceID
     * 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>
     */
    private String instanceID;
    /**
     * displayName
     * 云主机显示名称，长度为2-63字符
     */
    private String displayName;
    /**
     * instanceName
     * 云主机名称，不同操作系统下，云主机名称规则有差异。<br />Windows：长度为2~15个字符，允许使用大小写字母、数字或连字符（-）。不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能仅使用数字；<br />其他操作系统：长度为2-64字符，允许使用点（.）分隔字符成多段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾
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
     * 安全组ID列表，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关信息 <br />获取： <br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a><br />注：在多可用区类型资源池下，安全组ID通常以“sg-”开头，非多可用区类型资源池安全组ID为uuid格式
     */
    private AffinityGroupListVmSecGroupList[] secGroupList;
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
     * 网卡信息列表，您可以查看<a href="https://www.ctyun.cn/document/10026730/10225195">弹性网卡概述</a>了解弹性网卡相关信息
     */
    private AffinityGroupListVmNetworkCardList[] networkCardList;
    /**
     * vipInfoList
     * 虚拟IP信息列表
     */
    private AffinityGroupListVmVipInfoList[] vipInfoList;
    /**
     * vipCount
     * vip数目
     */
    private Integer vipCount;
    /**
     * affinityGroup
     * 云主机组ID，获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8324&data=87">查询云主机组列表或者详情</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10039549">查询云主机组列表或详情（旧版）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组（旧版）
     */
    private AffinityGroupListVmAffinityGroup affinityGroup;
    /**
     * image
     * 镜像信息
     */
    private AffinityGroupListVmImage image;
    /**
     * flavor
     * 规格信息
     */
    private AffinityGroupListVmFlavor flavor;
    /**
     * onDemand
     * 购买方式，取值范围：<br />false（按周期），<br />true（按需）<br />您可以查看<a href="https://www.ctyun.cn/document/10026730/10030877">计费模式</a>了解云主机的计费模式<br />注：按周期（false）创建云主机需要同时指定cycleCount和cycleType参数
     */
    private Boolean onDemand;
    /**
     * vpcName
     * vpc名称
     */
    private String vpcName;
    /**
     * vpcID
     * 虚拟私有云ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028310">产品定义-虚拟私有云</a>来了解虚拟私有云<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4814&data=94">查询VPC列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4811&data=94">创建VPC</a><br />注：在多可用区类型资源池下，vpcID通常以“vpc-”开头，非多可用区类型资源池vpcID为uuid格式
     */
    private String vpcID;
    /**
     * fixedIPList
     * 内网IP
     */
    private String[] fixedIPList;
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
     * 密钥对名称。满足以下规则：只能由数字、字母、-组成，不能以数字和-开头、以-结尾，且长度为2-63字符
     */
    private String keypairName;

    /**
     * set projectID
     * @param projectID 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目</a>了解如何创建企业项目
     * @return this
     */
    public AffinityGroupListVmResults withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解可用区 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a><br />注：查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空（即为单可用区，本字段填写default）
     * @return this
     */
    public AffinityGroupListVmResults withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set attachedVolume
     * @param attachedVolume 云主机挂载的云硬盘列表
     * @return this
     */
    public AffinityGroupListVmResults withAttachedVolume(String[] attachedVolume) {
        this.attachedVolume = attachedVolume;
        return this;
    }

    /**
     * set addresses
     * @param addresses 网络地址信息
     * @return this
     */
    public AffinityGroupListVmResults withAddresses(AffinityGroupListVmAddresses[] addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * set resourceID
     * @param resourceID 资源ID，非资源的UUID，该ID为订单的资源ID（创建云主机接口为异步接口，订单先返回一个该资源ID方便后续查找）<br />获取：<br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>
     * @return this
     */
    public AffinityGroupListVmResults withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>
     * @return this
     */
    public AffinityGroupListVmResults withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set displayName
     * @param displayName 云主机显示名称，长度为2-63字符
     * @return this
     */
    public AffinityGroupListVmResults withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称，不同操作系统下，云主机名称规则有差异。<br />Windows：长度为2~15个字符，允许使用大小写字母、数字或连字符（-）。不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能仅使用数字；<br />其他操作系统：长度为2-64字符，允许使用点（.）分隔字符成多段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾
     * @return this
     */
    public AffinityGroupListVmResults withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set osType
     * @param osType 操作系统类型，取值范围：<br />1: linux，<br />2: windows，<br />3: redhat，<br />4: ubuntu，<br />5: centos，<br />6: oracle
     * @return this
     */
    public AffinityGroupListVmResults withOsType(Integer osType) {
        this.osType = osType;
        return this;
    }

    /**
     * set instanceStatus
     * @param instanceStatus 云主机状态，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中，<br />error: 错误，<br />snapshotting: 快照创建中
     * @return this
     */
    public AffinityGroupListVmResults withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set expiredTime
     * @param expiredTime 到期时间
     * @return this
     */
    public AffinityGroupListVmResults withExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * set availableDay
     * @param availableDay 可用(天)
     * @return this
     */
    public AffinityGroupListVmResults withAvailableDay(Integer availableDay) {
        this.availableDay = availableDay;
        return this;
    }

    /**
     * set updatedTime
     * @param updatedTime 更新时间
     * @return this
     */
    public AffinityGroupListVmResults withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * set createdTime
     * @param createdTime 创建时间
     * @return this
     */
    public AffinityGroupListVmResults withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set zabbixName
     * @param zabbixName 监控对象名称
     * @return this
     */
    public AffinityGroupListVmResults withZabbixName(String zabbixName) {
        this.zabbixName = zabbixName;
        return this;
    }

    /**
     * set secGroupList
     * @param secGroupList 安全组ID列表，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关信息 <br />获取： <br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a><br />注：在多可用区类型资源池下，安全组ID通常以“sg-”开头，非多可用区类型资源池安全组ID为uuid格式
     * @return this
     */
    public AffinityGroupListVmResults withSecGroupList(AffinityGroupListVmSecGroupList[] secGroupList) {
        this.secGroupList = secGroupList;
        return this;
    }

    /**
     * set privateIP
     * @param privateIP 内网IPv4地址
     * @return this
     */
    public AffinityGroupListVmResults withPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }

    /**
     * set privateIPv6
     * @param privateIPv6 内网IPv6址
     * @return this
     */
    public AffinityGroupListVmResults withPrivateIPv6(String privateIPv6) {
        this.privateIPv6 = privateIPv6;
        return this;
    }

    /**
     * set networkCardList
     * @param networkCardList 网卡信息列表，您可以查看<a href="https://www.ctyun.cn/document/10026730/10225195">弹性网卡概述</a>了解弹性网卡相关信息
     * @return this
     */
    public AffinityGroupListVmResults withNetworkCardList(AffinityGroupListVmNetworkCardList[] networkCardList) {
        this.networkCardList = networkCardList;
        return this;
    }

    /**
     * set vipInfoList
     * @param vipInfoList 虚拟IP信息列表
     * @return this
     */
    public AffinityGroupListVmResults withVipInfoList(AffinityGroupListVmVipInfoList[] vipInfoList) {
        this.vipInfoList = vipInfoList;
        return this;
    }

    /**
     * set vipCount
     * @param vipCount vip数目
     * @return this
     */
    public AffinityGroupListVmResults withVipCount(Integer vipCount) {
        this.vipCount = vipCount;
        return this;
    }

    /**
     * set affinityGroup
     * @param affinityGroup 云主机组ID，获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8324&data=87">查询云主机组列表或者详情</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10039549">查询云主机组列表或详情（旧版）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组（旧版）
     * @return this
     */
    public AffinityGroupListVmResults withAffinityGroup(AffinityGroupListVmAffinityGroup affinityGroup) {
        this.affinityGroup = affinityGroup;
        return this;
    }

    /**
     * set image
     * @param image 镜像信息
     * @return this
     */
    public AffinityGroupListVmResults withImage(AffinityGroupListVmImage image) {
        this.image = image;
        return this;
    }

    /**
     * set flavor
     * @param flavor 规格信息
     * @return this
     */
    public AffinityGroupListVmResults withFlavor(AffinityGroupListVmFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * set onDemand
     * @param onDemand 购买方式，取值范围：<br />false（按周期），<br />true（按需）<br />您可以查看<a href="https://www.ctyun.cn/document/10026730/10030877">计费模式</a>了解云主机的计费模式<br />注：按周期（false）创建云主机需要同时指定cycleCount和cycleType参数
     * @return this
     */
    public AffinityGroupListVmResults withOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
        return this;
    }

    /**
     * set vpcName
     * @param vpcName vpc名称
     * @return this
     */
    public AffinityGroupListVmResults withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set vpcID
     * @param vpcID 虚拟私有云ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028310">产品定义-虚拟私有云</a>来了解虚拟私有云<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4814&data=94">查询VPC列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4811&data=94">创建VPC</a><br />注：在多可用区类型资源池下，vpcID通常以“vpc-”开头，非多可用区类型资源池vpcID为uuid格式
     * @return this
     */
    public AffinityGroupListVmResults withVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    /**
     * set fixedIPList
     * @param fixedIPList 内网IP
     * @return this
     */
    public AffinityGroupListVmResults withFixedIPList(String[] fixedIPList) {
        this.fixedIPList = fixedIPList;
        return this;
    }

    /**
     * set floatingIP
     * @param floatingIP 公网IP
     * @return this
     */
    public AffinityGroupListVmResults withFloatingIP(String floatingIP) {
        this.floatingIP = floatingIP;
        return this;
    }

    /**
     * set subnetIDList
     * @param subnetIDList 子网ID列表
     * @return this
     */
    public AffinityGroupListVmResults withSubnetIDList(String[] subnetIDList) {
        this.subnetIDList = subnetIDList;
        return this;
    }

    /**
     * set keypairName
     * @param keypairName 密钥对名称。满足以下规则：只能由数字、字母、-组成，不能以数字和-开头、以-结尾，且长度为2-63字符
     * @return this
     */
    public AffinityGroupListVmResults withKeypairName(String keypairName) {
        this.keypairName = keypairName;
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

    public AffinityGroupListVmAddresses[] getAddresses() {
        return addresses;
    }

    public void setAddresses(AffinityGroupListVmAddresses[] addresses) {
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

    public AffinityGroupListVmSecGroupList[] getSecGroupList() {
        return secGroupList;
    }

    public void setSecGroupList(AffinityGroupListVmSecGroupList[] secGroupList) {
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

    public AffinityGroupListVmNetworkCardList[] getNetworkCardList() {
        return networkCardList;
    }

    public void setNetworkCardList(AffinityGroupListVmNetworkCardList[] networkCardList) {
        this.networkCardList = networkCardList;
    }

    public AffinityGroupListVmVipInfoList[] getVipInfoList() {
        return vipInfoList;
    }

    public void setVipInfoList(AffinityGroupListVmVipInfoList[] vipInfoList) {
        this.vipInfoList = vipInfoList;
    }

    public Integer getVipCount() {
        return vipCount;
    }

    public void setVipCount(Integer vipCount) {
        this.vipCount = vipCount;
    }

    public AffinityGroupListVmAffinityGroup getAffinityGroup() {
        return affinityGroup;
    }

    public void setAffinityGroup(AffinityGroupListVmAffinityGroup affinityGroup) {
        this.affinityGroup = affinityGroup;
    }

    public AffinityGroupListVmImage getImage() {
        return image;
    }

    public void setImage(AffinityGroupListVmImage image) {
        this.image = image;
    }

    public AffinityGroupListVmFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(AffinityGroupListVmFlavor flavor) {
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

    public String[] getFixedIPList() {
        return fixedIPList;
    }

    public void setFixedIPList(String[] fixedIPList) {
        this.fixedIPList = fixedIPList;
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
