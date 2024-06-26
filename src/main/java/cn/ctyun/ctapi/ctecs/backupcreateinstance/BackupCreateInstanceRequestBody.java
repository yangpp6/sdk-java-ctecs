package cn.ctyun.ctapi.ctecs.backupcreateinstance;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-备份创建一台云主机>
 * Entity: BackupCreateInstanceRequestBody
 */
public class BackupCreateInstanceRequestBody {
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;
    /**
     * regionID
     * 资源池ID，请输入备份所在的资源池，保证备份创建的云主机与备份在同一资源池。
     */
    private String regionID;
    /**
     * instanceName
     * 云主机名称，不可以使用已存在的云主机名称。不同操作系统下，云主机名称规则有差异。<br />Windows：长度为2~15个字符，允许使用大小写字母、数字或连字符（-）。不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能仅使用数字；<br />其他操作系统：长度为2-64字符，允许使用点（.）分隔字符成多段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾，也不能仅使用数字
     */
    private String instanceName;
    /**
     * displayName
     * 云主机显示名称，长度为2-63字符
     */
    private String displayName;
    /**
     * instanceBackupID
     * 云主机备份ID，您可以查看<a href="https://www.ctyun.cn/document/10051003/10051023">产品定义-云主机备份</a>来了解云主机备份<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=6910&data=100">查询云主机备份列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=8332&data=100">创建云主机备份</a>
     */
    private String instanceBackupID;
    /**
     * vpcID
     * 虚拟私有云ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028310">产品定义-虚拟私有云</a>来了解虚拟私有云<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4814&data=94">查询VPC列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4811&data=94">创建VPC</a>
     */
    private String vpcID;
    /**
     * onDemand
     * 购买方式，取值范围：<br />false（按周期），<br />true（按需）<br />您可以查看<a href="https://www.ctyun.cn/document/10026730/10030877">计费模式</a>了解云主机的计费模式<br />注：按周期（false）创建云主机需要同时指定cycleCount和cycleType参数
     */
    private Boolean onDemand;
    /**
     * secGroupList
     * 安全组ID列表，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关信息 <br />获取： <br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a>
     */
    private String[] secGroupList;
    /**
     * extIP
     * 是否使用弹性公网IP，取值范围：<br />0（不使用），<br />1（自动分配），<br />2（使用已有）。<br />注：自动分配弹性公网，默认分配IPv4弹性公网，需填写带宽大小，如需ipv6请填写弹性IP版本（即参数extIP="1"时，需填写参数bandwidth、ipVersion，ipVersion含默认值ipv4）；<br />使用已有弹性公网，请填写弹性公网IP的ID，默认为ipv4版本，如使用已有ipv6，请填写弹性ip版本（即参数extIP="2"时，需填写eipID或ipv6AddressID，同时ipv6情况下请填写ipVersion）
     */
    private String extIP;
    /**
     * ipVersion
     * 弹性IP版本，取值范围：<br />ipv4（v4地址），<br />ipv6（v6地址），<br />不指定默认为ipv4。注：请先确认该资源池是否支持ipv6
     */
    private String ipVersion;
    /**
     * bandwidth
     * 带宽大小，单位为Mbit/s，取值范围：[1, 2000]
     */
    private Integer bandwidth;
    /**
     * ipv6AddressID
     * ipv6地址的ID（多可用区类资源池暂不支持）
     */
    private String ipv6AddressID;
    /**
     * eipID
     * 弹性公网IP的ID，您可以查看<a href="https://www.ctyun.cn/document/10026753/10026909">产品定义-弹性IP]来了解弹性公网IP <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=13&api=8652&data=101">查询指定地域已创建的弹性 IP</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=13&api=5723&data=101">创建弹性 IP</a>
     */
    private String eipID;
    /**
     * affinityGroupID
     * 云主机组ID，获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8324&data=87">查询云主机组列表或者详情</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10039549">查询云主机组列表或详情（旧版）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87"> 创建云主机组</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87"> 创建云主机组（旧版）
     */
    private String affinityGroupID;
    /**
     * keyPairID
     * 密钥对ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10230540">密钥对</a>来了解密钥对相关内容 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8342&data=87">查询一个或多个密钥对</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10040171">查询一个或多个SSH密钥对（旧版）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8344&data=87">创建一对SSH密钥对</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://www.ctyun.cn/document/10026730/10040170"> 创建一对SSH密钥对（旧版）</a>
     */
    private String keyPairID;
    /**
     * userPassword
     * 用户密码，满足以下规则：<br />长度在8～30个字符；<br />必须包含大写字母、小写字母、数字以及特殊符号中的三项；<br />特殊符号可选：()`~!@#$%^&*_-+=｜{}[]:;'<>,.?/\且不能以斜线号 / 开头；<br />不能包含3个及以上连续字符；<br />Linux镜像不能包含镜像用户名（root）、用户名的倒序（toor）、用户名大小写变化（如RoOt、rOot等）；<br />Windows镜像不能包含镜像用户名（Administrator）、用户名大小写变化（adminiSTrator等）
     */
    private String userPassword;
    /**
     * cycleCount
     * 订购时长，该参数需要与cycleType一同使用<br />注：最长订购周期为60个月（5年）；cycleType与cycleCount一起填写
     */
    private Integer cycleCount;
    /**
     * cycleType
     * 订购周期类型，取值范围：<br />MONTH：按月，<br />YEAR：按年。注：cycleType与cycleCount一起填写
     */
    private String cycleType;
    /**
     * autoRenewStatus
     * 是否自动续订，取值范围：<br />0（不续费），<br />1（自动续费），<br />注：按月购买，自动续订周期为1个月；按年购买，自动续订周期为1年
     */
    private Integer autoRenewStatus;
    /**
     * userData
     * 用户自定义数据，需要以Base64方式编码，Base64编码后的长度限制为1-16384字符（非多可用区类型资源池暂不支持）
     */
    private String userData;
    /**
     * projectID
     * 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目</a>了解如何创建企业项目<br />注：默认值为"0"
     */
    private String projectID;
    /**
     * payVoucherPrice
     * 代金券，满足以下规则：<br />两位小数，不足两位自动补0，超过两位小数无效；<br />不可为负数；<br />注：字段为0时表示不使用代金券，默认不使用
     */
    private Float payVoucherPrice;
    /**
     * labelList
     * 标签信息列表，注：单台云主机最多可绑定10个标签；主机创建完成后，云主机变为运行状态，此时标签仍可能未绑定，需等待一段时间（0~10分钟）。
     */
    private BackupCreateInstanceLabelList[] labelList;
    /**
     * monitorService
     * 监控参数，支持通过该参数指定云主机在创建后是否开启详细监控，取值范围： <br />false（不开启），<br />true（开启）<br />若指定该参数为true或不指定该参数，云主机内默认开启最新详细监控服务。<br />若指定该参数为false，默认不开启最新监控服务，而使用与原备份里保留的监控服务。<br />说明：仅部分资源池支持monitorService参数，详细请参考[监控Agent概览](https://www.ctyun.cn/document/10026730/10325957)。
     */
    private Boolean monitorService;

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public BackupCreateInstanceRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID，请输入备份所在的资源池，保证备份创建的云主机与备份在同一资源池。
     * @return this
     */
    public BackupCreateInstanceRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称，不可以使用已存在的云主机名称。不同操作系统下，云主机名称规则有差异。<br />Windows：长度为2~15个字符，允许使用大小写字母、数字或连字符（-）。不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能仅使用数字；<br />其他操作系统：长度为2-64字符，允许使用点（.）分隔字符成多段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾，也不能仅使用数字
     * @return this
     */
    public BackupCreateInstanceRequestBody withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set displayName
     * @param displayName 云主机显示名称，长度为2-63字符
     * @return this
     */
    public BackupCreateInstanceRequestBody withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set instanceBackupID
     * @param instanceBackupID 云主机备份ID，您可以查看<a href="https://www.ctyun.cn/document/10051003/10051023">产品定义-云主机备份</a>来了解云主机备份<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=6910&data=100">查询云主机备份列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=8332&data=100">创建云主机备份</a>
     * @return this
     */
    public BackupCreateInstanceRequestBody withInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
        return this;
    }

    /**
     * set vpcID
     * @param vpcID 虚拟私有云ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028310">产品定义-虚拟私有云</a>来了解虚拟私有云<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4814&data=94">查询VPC列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4811&data=94">创建VPC</a>
     * @return this
     */
    public BackupCreateInstanceRequestBody withVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    /**
     * set onDemand
     * @param onDemand 购买方式，取值范围：<br />false（按周期），<br />true（按需）<br />您可以查看<a href="https://www.ctyun.cn/document/10026730/10030877">计费模式</a>了解云主机的计费模式<br />注：按周期（false）创建云主机需要同时指定cycleCount和cycleType参数
     * @return this
     */
    public BackupCreateInstanceRequestBody withOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
        return this;
    }

    /**
     * set secGroupList
     * @param secGroupList 安全组ID列表，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关信息 <br />获取： <br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a>
     * @return this
     */
    public BackupCreateInstanceRequestBody withSecGroupList(String[] secGroupList) {
        this.secGroupList = secGroupList;
        return this;
    }

    /**
     * set extIP
     * @param extIP 是否使用弹性公网IP，取值范围：<br />0（不使用），<br />1（自动分配），<br />2（使用已有）。<br />注：自动分配弹性公网，默认分配IPv4弹性公网，需填写带宽大小，如需ipv6请填写弹性IP版本（即参数extIP="1"时，需填写参数bandwidth、ipVersion，ipVersion含默认值ipv4）；<br />使用已有弹性公网，请填写弹性公网IP的ID，默认为ipv4版本，如使用已有ipv6，请填写弹性ip版本（即参数extIP="2"时，需填写eipID或ipv6AddressID，同时ipv6情况下请填写ipVersion）
     * @return this
     */
    public BackupCreateInstanceRequestBody withExtIP(String extIP) {
        this.extIP = extIP;
        return this;
    }

    /**
     * set ipVersion
     * @param ipVersion 弹性IP版本，取值范围：<br />ipv4（v4地址），<br />ipv6（v6地址），<br />不指定默认为ipv4。注：请先确认该资源池是否支持ipv6
     * @return this
     */
    public BackupCreateInstanceRequestBody withIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * set bandwidth
     * @param bandwidth 带宽大小，单位为Mbit/s，取值范围：[1, 2000]
     * @return this
     */
    public BackupCreateInstanceRequestBody withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set ipv6AddressID
     * @param ipv6AddressID ipv6地址的ID（多可用区类资源池暂不支持）
     * @return this
     */
    public BackupCreateInstanceRequestBody withIpv6AddressID(String ipv6AddressID) {
        this.ipv6AddressID = ipv6AddressID;
        return this;
    }

    /**
     * set eipID
     * @param eipID 弹性公网IP的ID，您可以查看<a href="https://www.ctyun.cn/document/10026753/10026909">产品定义-弹性IP]来了解弹性公网IP <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=13&api=8652&data=101">查询指定地域已创建的弹性 IP</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=13&api=5723&data=101">创建弹性 IP</a>
     * @return this
     */
    public BackupCreateInstanceRequestBody withEipID(String eipID) {
        this.eipID = eipID;
        return this;
    }

    /**
     * set affinityGroupID
     * @param affinityGroupID 云主机组ID，获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8324&data=87">查询云主机组列表或者详情</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10039549">查询云主机组列表或详情（旧版）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87"> 创建云主机组</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87"> 创建云主机组（旧版）
     * @return this
     */
    public BackupCreateInstanceRequestBody withAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
        return this;
    }

    /**
     * set keyPairID
     * @param keyPairID 密钥对ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10230540">密钥对</a>来了解密钥对相关内容 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8342&data=87">查询一个或多个密钥对</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10040171">查询一个或多个SSH密钥对（旧版）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8344&data=87">创建一对SSH密钥对</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://www.ctyun.cn/document/10026730/10040170"> 创建一对SSH密钥对（旧版）</a>
     * @return this
     */
    public BackupCreateInstanceRequestBody withKeyPairID(String keyPairID) {
        this.keyPairID = keyPairID;
        return this;
    }

    /**
     * set userPassword
     * @param userPassword 用户密码，满足以下规则：<br />长度在8～30个字符；<br />必须包含大写字母、小写字母、数字以及特殊符号中的三项；<br />特殊符号可选：()`~!@#$%^&*_-+=｜{}[]:;'<>,.?/\且不能以斜线号 / 开头；<br />不能包含3个及以上连续字符；<br />Linux镜像不能包含镜像用户名（root）、用户名的倒序（toor）、用户名大小写变化（如RoOt、rOot等）；<br />Windows镜像不能包含镜像用户名（Administrator）、用户名大小写变化（adminiSTrator等）
     * @return this
     */
    public BackupCreateInstanceRequestBody withUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    /**
     * set cycleCount
     * @param cycleCount 订购时长，该参数需要与cycleType一同使用<br />注：最长订购周期为60个月（5年）；cycleType与cycleCount一起填写
     * @return this
     */
    public BackupCreateInstanceRequestBody withCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 订购周期类型，取值范围：<br />MONTH：按月，<br />YEAR：按年。注：cycleType与cycleCount一起填写
     * @return this
     */
    public BackupCreateInstanceRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set autoRenewStatus
     * @param autoRenewStatus 是否自动续订，取值范围：<br />0（不续费），<br />1（自动续费），<br />注：按月购买，自动续订周期为1个月；按年购买，自动续订周期为1年
     * @return this
     */
    public BackupCreateInstanceRequestBody withAutoRenewStatus(Integer autoRenewStatus) {
        this.autoRenewStatus = autoRenewStatus;
        return this;
    }

    /**
     * set userData
     * @param userData 用户自定义数据，需要以Base64方式编码，Base64编码后的长度限制为1-16384字符（非多可用区类型资源池暂不支持）
     * @return this
     */
    public BackupCreateInstanceRequestBody withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目</a>了解如何创建企业项目<br />注：默认值为"0"
     * @return this
     */
    public BackupCreateInstanceRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set payVoucherPrice
     * @param payVoucherPrice 代金券，满足以下规则：<br />两位小数，不足两位自动补0，超过两位小数无效；<br />不可为负数；<br />注：字段为0时表示不使用代金券，默认不使用
     * @return this
     */
    public BackupCreateInstanceRequestBody withPayVoucherPrice(Float payVoucherPrice) {
        this.payVoucherPrice = payVoucherPrice;
        return this;
    }

    /**
     * set labelList
     * @param labelList 标签信息列表，注：单台云主机最多可绑定10个标签；主机创建完成后，云主机变为运行状态，此时标签仍可能未绑定，需等待一段时间（0~10分钟）。
     * @return this
     */
    public BackupCreateInstanceRequestBody withLabelList(BackupCreateInstanceLabelList[] labelList) {
        this.labelList = labelList;
        return this;
    }

    /**
     * set monitorService
     * @param monitorService 监控参数，支持通过该参数指定云主机在创建后是否开启详细监控，取值范围： <br />false（不开启），<br />true（开启）<br />若指定该参数为true或不指定该参数，云主机内默认开启最新详细监控服务。<br />若指定该参数为false，默认不开启最新监控服务，而使用与原备份里保留的监控服务。<br />说明：仅部分资源池支持monitorService参数，详细请参考[监控Agent概览](https://www.ctyun.cn/document/10026730/10325957)。
     * @return this
     */
    public BackupCreateInstanceRequestBody withMonitorService(Boolean monitorService) {
        this.monitorService = monitorService;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getInstanceBackupID() {
        return instanceBackupID;
    }

    public void setInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
    }

    public String getVpcID() {
        return vpcID;
    }

    public void setVpcID(String vpcID) {
        this.vpcID = vpcID;
    }

    public Boolean getOnDemand() {
        return onDemand;
    }

    public void setOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
    }

    public String[] getSecGroupList() {
        return secGroupList;
    }

    public void setSecGroupList(String[] secGroupList) {
        this.secGroupList = secGroupList;
    }

    public String getExtIP() {
        return extIP;
    }

    public void setExtIP(String extIP) {
        this.extIP = extIP;
    }

    public String getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getIpv6AddressID() {
        return ipv6AddressID;
    }

    public void setIpv6AddressID(String ipv6AddressID) {
        this.ipv6AddressID = ipv6AddressID;
    }

    public String getEipID() {
        return eipID;
    }

    public void setEipID(String eipID) {
        this.eipID = eipID;
    }

    public String getAffinityGroupID() {
        return affinityGroupID;
    }

    public void setAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
    }

    public String getKeyPairID() {
        return keyPairID;
    }

    public void setKeyPairID(String keyPairID) {
        this.keyPairID = keyPairID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getCycleCount() {
        return cycleCount;
    }

    public void setCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
    }

    public String getCycleType() {
        return cycleType;
    }

    public void setCycleType(String cycleType) {
        this.cycleType = cycleType;
    }

    public Integer getAutoRenewStatus() {
        return autoRenewStatus;
    }

    public void setAutoRenewStatus(Integer autoRenewStatus) {
        this.autoRenewStatus = autoRenewStatus;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public Float getPayVoucherPrice() {
        return payVoucherPrice;
    }

    public void setPayVoucherPrice(Float payVoucherPrice) {
        this.payVoucherPrice = payVoucherPrice;
    }

    public BackupCreateInstanceLabelList[] getLabelList() {
        return labelList;
    }

    public void setLabelList(BackupCreateInstanceLabelList[] labelList) {
        this.labelList = labelList;
    }

    public Boolean getMonitorService() {
        return monitorService;
    }

    public void setMonitorService(Boolean monitorService) {
        this.monitorService = monitorService;
    }
}
