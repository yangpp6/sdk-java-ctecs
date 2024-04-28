package cn.ctyun.ctapi.ctecs.batchcreateinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量创建云主机>
 * Entity: BatchCreateInstancesRequestBody
 */
public class BatchCreateInstancesRequestBody {
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * azName
     * 可用区名称，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解可用区 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a><br />注：查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空（即为单可用区，本字段填写default）
     */
    private String azName;
    /**
     * instanceName
     * 云主机名称，不可以使用已存在的云主机名称。不同操作系统下，云主机名称规则有差异。<br />Windows：长度为2~15个字符（当创建两台及两台以上的云主机时名称长度为2~10个字符），允许使用大小写字母、数字或连字符（-）。不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能仅使用数字；<br />其他操作系统：长度为2~64字符（当创建两台及两台以上的云主机时名称长度为2~59个字符），允许使用点（.）分隔字符成多段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾，也不能仅使用数字
     */
    private String instanceName;
    /**
     * displayName
     * 云主机显示名称，长度为2~63字符
     */
    private String displayName;
    /**
     * flavorID
     * 云主机规格ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10118193">规格说明</a>了解弹性云主机的选型基本信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8327&data=87">查询一个或多个云主机规格资源</a><br />注：同一规格名称在不同资源池不同可用区的规格ID是不同的，调用前需确认规格ID是否归属当前资源池，多可用区资源池确认是否归属当前可用区
     */
    private String flavorID;
    /**
     * imageType
     * 镜像类型，取值范围：<br />0（私有镜像），<br />1（公有镜像），<br />2（共享镜像），<br />3（安全镜像），<br />4（甄选镜像） <br />您可以查看<a href="https://www.ctyun.cn/document/10026730/10030151">镜像概述</a>查看关于云主机镜像介绍
     */
    private Integer imageType;
    /**
     * imageID
     * 镜像ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10030151">镜像概述</a>来了解云主机镜像<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=23&api=4763&data=89">查询可以使用的镜像资源</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=23&api=4765&data=89">创建私有镜像（云主机系统盘）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=23&api=5230&data=89">创建私有镜像（云主机数据盘）</a><br />注：同一镜像名称在不同资源池的镜像ID是不同的，调用前需确认镜像ID是否归属当前资源池
     */
    private String imageID;
    /**
     * bootDiskType
     * 系统盘类型，取值范围：<br />SATA（普通IO），<br />SAS（高IO），<br />SSD（超高IO），<br />SSD-genric（通用型SSD），<br />FAST-SSD（极速型SSD），您可以查看<a href="https://www.ctyun.cn/document/10027696/10162918">磁盘类型及性能介绍</a>来了解磁盘类型及其对应性能指标
     */
    private String bootDiskType;
    /**
     * bootDiskSize
     * 系统盘大小单位为GiB，取值范围：[40, 32768]，注：创建云主机过程中会存在单位转换，因此该参数只能传入整型，如果填写小数值则会被取整，影响到涉及计费
     */
    private Integer bootDiskSize;
    /**
     * vpcID
     * 虚拟私有云ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028310">产品定义-虚拟私有云</a>来了解虚拟私有云<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4814&data=94">查询VPC列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4811&data=94">创建VPC</a><br />注：在多可用区类型资源池下，vpcID通常为“vpc-”开头，非多可用区类型资源池vpcID为uuid格式
     */
    private String vpcID;
    /**
     * onDemand
     * 购买方式，取值范围：<br />false（按周期），<br />true（按需）<br />您可以查看<a href="https://www.ctyun.cn/document/10026730/10030877">计费模式</a>了解云主机的计费模式<br />注：按周期（false）创建云主机需要同时指定cycleCount和cycleType参数
     */
    private Boolean onDemand;
    /**
     * networkCardList
     * 网卡信息列表，您可以查看<a href="https://www.ctyun.cn/document/10026730/10225195">弹性网卡概述</a>了解弹性网卡相关信息
     */
    private BatchCreateInstancesNetworkCardList[] networkCardList;
    /**
     * extIP
     * 是否使用弹性公网IP，取值范围：<br />0（不使用），<br />1（自动分配），<br />2（使用已有）。<br />注：自动分配弹性公网，默认分配IPv4弹性公网，需填写带宽大小，如需ipv6请填写弹性IP版本（即参数extIP="1"时，需填写参数bandwidth、ipVersion，ipVersion含默认值ipv4）；<br />使用已有弹性公网，请填写弹性公网IP的ID，默认为ipv4版本，如使用已有ipv6，请填写弹性ip版本（即参数extIP="2"时，需填写eipID或ipv6AddressID，同时ipv6情况下请填写ipVersion）
     */
    private String extIP;
    /**
     * projectID
     * 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目</a>了解如何创建企业项目<br />注：默认值为"0"
     */
    private String projectID;
    /**
     * secGroupList
     * 安全组ID列表，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关信息 <br />获取： <br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a><br />注：在多可用区类型资源池下，安全组ID通常以“sg-”开头，非多可用区类型资源池安全组ID为uuid格式；默认使用默认安全组，无默认安全组情况下请填写该参数
     */
    private String[] secGroupList;
    /**
     * dataDiskList
     * 数据盘信息列表，注：同一云主机下最多可挂载8块数据盘
     */
    private BatchCreateInstancesDataDiskList[] dataDiskList;
    /**
     * ipVersion
     * 弹性IP版本，取值范围：<br />ipv4（v4地址），<br />ipv6（v6地址），<br />不指定默认为ipv4。注：请先确认该资源池是否支持ipv6（多可用区类资源池暂不支持）
     */
    private String ipVersion;
    /**
     * bandwidth
     * 带宽大小，单位为Mbit/s，取值范围：[1, 2000]
     */
    private Integer bandwidth;
    /**
     * ipv6AddressID
     * 弹性公网IPv6的ID，注：多可用区类资源池暂不支持；填写该参数时请填写ipVersion为ipv6
     */
    private String ipv6AddressID;
    /**
     * eipID
     * 弹性公网IP的ID，您可以查看<a href="https://www.ctyun.cn/document/10026753/10026909">产品定义-弹性IP</a>来了解弹性公网IP <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=13&api=8652&data=101">查询指定地域已创建的弹性 IP</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=13&api=5723&data=101">创建弹性 IP</a>
     */
    private String eipID;
    /**
     * affinityGroupID
     * 云主机组ID，获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8324&data=87">查询云主机组列表或者详情</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87"> 创建云主机组</a>
     */
    private String affinityGroupID;
    /**
     * keyPairID
     * 密钥对ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10230540">密钥对</a>来了解密钥对相关内容 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8342&data=87">查询一个或多个密钥对</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8344&data=87">创建一对SSH密钥对</a>
     */
    private String keyPairID;
    /**
     * userPassword
     * 用户密码，满足以下规则：<br />长度在8～30个字符；<br />必须包含大写字母、小写字母、数字以及特殊符号中的三项；<br />特殊符号可选：()`~!@#$%^&*_-+=｜{}[]:;'<>,.?/\且不能以斜线号 / 开头；<br />不能包含3个及以上连续字符；<br />Linux镜像不能包含镜像用户名（root）、用户名的倒序（toor）、用户名大小写变化（如RoOt、rOot等）；<br />Windows镜像不能包含镜像用户名（Administrator）、用户名大小写变化（adminiSTrator等）
     */
    private String userPassword;
    /**
     * cycleCount
     * 订购时长，该参数需要与cycleType一同使用<br />注：最长订购周期为60个月（5年）；cycleType与cycleCount一起填写；按量付费（即onDemand为true）时，无需填写该参数（填写无效）
     */
    private Integer cycleCount;
    /**
     * cycleType
     * 订购周期类型，取值范围：<br />MONTH：按月，<br />YEAR：按年。注：cycleType与cycleCount一起填写；按量付费（即onDemand为true）时，无需填写该参数（填写无效）
     */
    private String cycleType;
    /**
     * autoRenewStatus
     * 是否自动续订，取值范围：<br />0（不续费），<br />1（自动续费），<br />注：按月购买，自动续订周期为1个月；按年购买，自动续订周期为1年
     */
    private Integer autoRenewStatus;
    /**
     * userData
     * 用户自定义数据，需要以Base64方式编码，Base64编码后的长度限制为1-16384字符。<br />注：非多可用区类型资源池暂不支持该参数
     */
    private String userData;
    /**
     * orderCount
     * 购买数量，取值范围：[1, 50]。注：不填则默认为1
     */
    private Integer orderCount;
    /**
     * payVoucherPrice
     * 代金券，满足以下规则：两位小数，不足两位自动补0，超过两位小数无效；不可为负数；字段为0时表示不使用代金券
     */
    private Float payVoucherPrice;
    /**
     * labelList
     * 标签信息列表，注：单台云主机最多可绑定10个标签；云主机创建完成后，云主机变为运行状态，此时标签仍可能未绑定，需等待一段时间（0~10分钟）（0~10分钟）；批量创建云主机时并非云主机对应labelList中各个标签进行对应绑定，而是这一批的所有云主机都会绑定labelList中所有的标签。
     */
    private BatchCreateInstancesLabelList[] labelList;
    /**
     * gpuDriverKits
     * GPU云主机安装驱动的工具包，仅在同时选择NVIDIA显卡、计算加速型、linux公共镜像三个条件下，支持安装驱动
     */
    private String gpuDriverKits;
    /**
     * monitorService
     * 监控参数，支持通过该参数指定云主机在创建后是否开启详细监控，取值范围： <br />false（不开启），<br />true（开启）<br />若指定该参数为true或不指定该参数，云主机内默认开启最新详细监控服务。<br />若指定该参数为false，默认公共镜像不开启最新监控服务；私有镜像使用镜像中保留的监控服务。<br />说明：仅部分资源池支持monitorService参数，详细请参考<a href="https://www.ctyun.cn/document/10026730/10325957">监控Agent概览</a>。
     */
    private Boolean monitorService;

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public BatchCreateInstancesRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public BatchCreateInstancesRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解可用区 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a><br />注：查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空（即为单可用区，本字段填写default）
     * @return this
     */
    public BatchCreateInstancesRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称，不可以使用已存在的云主机名称。不同操作系统下，云主机名称规则有差异。<br />Windows：长度为2~15个字符（当创建两台及两台以上的云主机时名称长度为2~10个字符），允许使用大小写字母、数字或连字符（-）。不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能仅使用数字；<br />其他操作系统：长度为2~64字符（当创建两台及两台以上的云主机时名称长度为2~59个字符），允许使用点（.）分隔字符成多段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾，也不能仅使用数字
     * @return this
     */
    public BatchCreateInstancesRequestBody withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set displayName
     * @param displayName 云主机显示名称，长度为2~63字符
     * @return this
     */
    public BatchCreateInstancesRequestBody withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set flavorID
     * @param flavorID 云主机规格ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10118193">规格说明</a>了解弹性云主机的选型基本信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8327&data=87">查询一个或多个云主机规格资源</a><br />注：同一规格名称在不同资源池不同可用区的规格ID是不同的，调用前需确认规格ID是否归属当前资源池，多可用区资源池确认是否归属当前可用区
     * @return this
     */
    public BatchCreateInstancesRequestBody withFlavorID(String flavorID) {
        this.flavorID = flavorID;
        return this;
    }

    /**
     * set imageType
     * @param imageType 镜像类型，取值范围：<br />0（私有镜像），<br />1（公有镜像），<br />2（共享镜像），<br />3（安全镜像），<br />4（甄选镜像） <br />您可以查看<a href="https://www.ctyun.cn/document/10026730/10030151">镜像概述</a>查看关于云主机镜像介绍
     * @return this
     */
    public BatchCreateInstancesRequestBody withImageType(Integer imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * set imageID
     * @param imageID 镜像ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10030151">镜像概述</a>来了解云主机镜像<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=23&api=4763&data=89">查询可以使用的镜像资源</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=23&api=4765&data=89">创建私有镜像（云主机系统盘）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=23&api=5230&data=89">创建私有镜像（云主机数据盘）</a><br />注：同一镜像名称在不同资源池的镜像ID是不同的，调用前需确认镜像ID是否归属当前资源池
     * @return this
     */
    public BatchCreateInstancesRequestBody withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    /**
     * set bootDiskType
     * @param bootDiskType 系统盘类型，取值范围：<br />SATA（普通IO），<br />SAS（高IO），<br />SSD（超高IO），<br />SSD-genric（通用型SSD），<br />FAST-SSD（极速型SSD），您可以查看<a href="https://www.ctyun.cn/document/10027696/10162918">磁盘类型及性能介绍</a>来了解磁盘类型及其对应性能指标
     * @return this
     */
    public BatchCreateInstancesRequestBody withBootDiskType(String bootDiskType) {
        this.bootDiskType = bootDiskType;
        return this;
    }

    /**
     * set bootDiskSize
     * @param bootDiskSize 系统盘大小单位为GiB，取值范围：[40, 32768]，注：创建云主机过程中会存在单位转换，因此该参数只能传入整型，如果填写小数值则会被取整，影响到涉及计费
     * @return this
     */
    public BatchCreateInstancesRequestBody withBootDiskSize(Integer bootDiskSize) {
        this.bootDiskSize = bootDiskSize;
        return this;
    }

    /**
     * set vpcID
     * @param vpcID 虚拟私有云ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028310">产品定义-虚拟私有云</a>来了解虚拟私有云<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4814&data=94">查询VPC列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4811&data=94">创建VPC</a><br />注：在多可用区类型资源池下，vpcID通常为“vpc-”开头，非多可用区类型资源池vpcID为uuid格式
     * @return this
     */
    public BatchCreateInstancesRequestBody withVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    /**
     * set onDemand
     * @param onDemand 购买方式，取值范围：<br />false（按周期），<br />true（按需）<br />您可以查看<a href="https://www.ctyun.cn/document/10026730/10030877">计费模式</a>了解云主机的计费模式<br />注：按周期（false）创建云主机需要同时指定cycleCount和cycleType参数
     * @return this
     */
    public BatchCreateInstancesRequestBody withOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
        return this;
    }

    /**
     * set networkCardList
     * @param networkCardList 网卡信息列表，您可以查看<a href="https://www.ctyun.cn/document/10026730/10225195">弹性网卡概述</a>了解弹性网卡相关信息
     * @return this
     */
    public BatchCreateInstancesRequestBody withNetworkCardList(BatchCreateInstancesNetworkCardList[] networkCardList) {
        this.networkCardList = networkCardList;
        return this;
    }

    /**
     * set extIP
     * @param extIP 是否使用弹性公网IP，取值范围：<br />0（不使用），<br />1（自动分配），<br />2（使用已有）。<br />注：自动分配弹性公网，默认分配IPv4弹性公网，需填写带宽大小，如需ipv6请填写弹性IP版本（即参数extIP="1"时，需填写参数bandwidth、ipVersion，ipVersion含默认值ipv4）；<br />使用已有弹性公网，请填写弹性公网IP的ID，默认为ipv4版本，如使用已有ipv6，请填写弹性ip版本（即参数extIP="2"时，需填写eipID或ipv6AddressID，同时ipv6情况下请填写ipVersion）
     * @return this
     */
    public BatchCreateInstancesRequestBody withExtIP(String extIP) {
        this.extIP = extIP;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目</a>了解如何创建企业项目<br />注：默认值为"0"
     * @return this
     */
    public BatchCreateInstancesRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set secGroupList
     * @param secGroupList 安全组ID列表，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关信息 <br />获取： <br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a><br />注：在多可用区类型资源池下，安全组ID通常以“sg-”开头，非多可用区类型资源池安全组ID为uuid格式；默认使用默认安全组，无默认安全组情况下请填写该参数
     * @return this
     */
    public BatchCreateInstancesRequestBody withSecGroupList(String[] secGroupList) {
        this.secGroupList = secGroupList;
        return this;
    }

    /**
     * set dataDiskList
     * @param dataDiskList 数据盘信息列表，注：同一云主机下最多可挂载8块数据盘
     * @return this
     */
    public BatchCreateInstancesRequestBody withDataDiskList(BatchCreateInstancesDataDiskList[] dataDiskList) {
        this.dataDiskList = dataDiskList;
        return this;
    }

    /**
     * set ipVersion
     * @param ipVersion 弹性IP版本，取值范围：<br />ipv4（v4地址），<br />ipv6（v6地址），<br />不指定默认为ipv4。注：请先确认该资源池是否支持ipv6（多可用区类资源池暂不支持）
     * @return this
     */
    public BatchCreateInstancesRequestBody withIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * set bandwidth
     * @param bandwidth 带宽大小，单位为Mbit/s，取值范围：[1, 2000]
     * @return this
     */
    public BatchCreateInstancesRequestBody withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set ipv6AddressID
     * @param ipv6AddressID 弹性公网IPv6的ID，注：多可用区类资源池暂不支持；填写该参数时请填写ipVersion为ipv6
     * @return this
     */
    public BatchCreateInstancesRequestBody withIpv6AddressID(String ipv6AddressID) {
        this.ipv6AddressID = ipv6AddressID;
        return this;
    }

    /**
     * set eipID
     * @param eipID 弹性公网IP的ID，您可以查看<a href="https://www.ctyun.cn/document/10026753/10026909">产品定义-弹性IP</a>来了解弹性公网IP <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=13&api=8652&data=101">查询指定地域已创建的弹性 IP</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=13&api=5723&data=101">创建弹性 IP</a>
     * @return this
     */
    public BatchCreateInstancesRequestBody withEipID(String eipID) {
        this.eipID = eipID;
        return this;
    }

    /**
     * set affinityGroupID
     * @param affinityGroupID 云主机组ID，获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8324&data=87">查询云主机组列表或者详情</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87"> 创建云主机组</a>
     * @return this
     */
    public BatchCreateInstancesRequestBody withAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
        return this;
    }

    /**
     * set keyPairID
     * @param keyPairID 密钥对ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10230540">密钥对</a>来了解密钥对相关内容 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8342&data=87">查询一个或多个密钥对</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8344&data=87">创建一对SSH密钥对</a>
     * @return this
     */
    public BatchCreateInstancesRequestBody withKeyPairID(String keyPairID) {
        this.keyPairID = keyPairID;
        return this;
    }

    /**
     * set userPassword
     * @param userPassword 用户密码，满足以下规则：<br />长度在8～30个字符；<br />必须包含大写字母、小写字母、数字以及特殊符号中的三项；<br />特殊符号可选：()`~!@#$%^&*_-+=｜{}[]:;'<>,.?/\且不能以斜线号 / 开头；<br />不能包含3个及以上连续字符；<br />Linux镜像不能包含镜像用户名（root）、用户名的倒序（toor）、用户名大小写变化（如RoOt、rOot等）；<br />Windows镜像不能包含镜像用户名（Administrator）、用户名大小写变化（adminiSTrator等）
     * @return this
     */
    public BatchCreateInstancesRequestBody withUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    /**
     * set cycleCount
     * @param cycleCount 订购时长，该参数需要与cycleType一同使用<br />注：最长订购周期为60个月（5年）；cycleType与cycleCount一起填写；按量付费（即onDemand为true）时，无需填写该参数（填写无效）
     * @return this
     */
    public BatchCreateInstancesRequestBody withCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 订购周期类型，取值范围：<br />MONTH：按月，<br />YEAR：按年。注：cycleType与cycleCount一起填写；按量付费（即onDemand为true）时，无需填写该参数（填写无效）
     * @return this
     */
    public BatchCreateInstancesRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set autoRenewStatus
     * @param autoRenewStatus 是否自动续订，取值范围：<br />0（不续费），<br />1（自动续费），<br />注：按月购买，自动续订周期为1个月；按年购买，自动续订周期为1年
     * @return this
     */
    public BatchCreateInstancesRequestBody withAutoRenewStatus(Integer autoRenewStatus) {
        this.autoRenewStatus = autoRenewStatus;
        return this;
    }

    /**
     * set userData
     * @param userData 用户自定义数据，需要以Base64方式编码，Base64编码后的长度限制为1-16384字符。<br />注：非多可用区类型资源池暂不支持该参数
     * @return this
     */
    public BatchCreateInstancesRequestBody withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * set orderCount
     * @param orderCount 购买数量，取值范围：[1, 50]。注：不填则默认为1
     * @return this
     */
    public BatchCreateInstancesRequestBody withOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
        return this;
    }

    /**
     * set payVoucherPrice
     * @param payVoucherPrice 代金券，满足以下规则：两位小数，不足两位自动补0，超过两位小数无效；不可为负数；字段为0时表示不使用代金券
     * @return this
     */
    public BatchCreateInstancesRequestBody withPayVoucherPrice(Float payVoucherPrice) {
        this.payVoucherPrice = payVoucherPrice;
        return this;
    }

    /**
     * set labelList
     * @param labelList 标签信息列表，注：单台云主机最多可绑定10个标签；云主机创建完成后，云主机变为运行状态，此时标签仍可能未绑定，需等待一段时间（0~10分钟）（0~10分钟）；批量创建云主机时并非云主机对应labelList中各个标签进行对应绑定，而是这一批的所有云主机都会绑定labelList中所有的标签。
     * @return this
     */
    public BatchCreateInstancesRequestBody withLabelList(BatchCreateInstancesLabelList[] labelList) {
        this.labelList = labelList;
        return this;
    }

    /**
     * set gpuDriverKits
     * @param gpuDriverKits GPU云主机安装驱动的工具包，仅在同时选择NVIDIA显卡、计算加速型、linux公共镜像三个条件下，支持安装驱动
     * @return this
     */
    public BatchCreateInstancesRequestBody withGpuDriverKits(String gpuDriverKits) {
        this.gpuDriverKits = gpuDriverKits;
        return this;
    }

    /**
     * set monitorService
     * @param monitorService 监控参数，支持通过该参数指定云主机在创建后是否开启详细监控，取值范围： <br />false（不开启），<br />true（开启）<br />若指定该参数为true或不指定该参数，云主机内默认开启最新详细监控服务。<br />若指定该参数为false，默认公共镜像不开启最新监控服务；私有镜像使用镜像中保留的监控服务。<br />说明：仅部分资源池支持monitorService参数，详细请参考<a href="https://www.ctyun.cn/document/10026730/10325957">监控Agent概览</a>。
     * @return this
     */
    public BatchCreateInstancesRequestBody withMonitorService(Boolean monitorService) {
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

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
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

    public String getFlavorID() {
        return flavorID;
    }

    public void setFlavorID(String flavorID) {
        this.flavorID = flavorID;
    }

    public Integer getImageType() {
        return imageType;
    }

    public void setImageType(Integer imageType) {
        this.imageType = imageType;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getBootDiskType() {
        return bootDiskType;
    }

    public void setBootDiskType(String bootDiskType) {
        this.bootDiskType = bootDiskType;
    }

    public Integer getBootDiskSize() {
        return bootDiskSize;
    }

    public void setBootDiskSize(Integer bootDiskSize) {
        this.bootDiskSize = bootDiskSize;
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

    public BatchCreateInstancesNetworkCardList[] getNetworkCardList() {
        return networkCardList;
    }

    public void setNetworkCardList(BatchCreateInstancesNetworkCardList[] networkCardList) {
        this.networkCardList = networkCardList;
    }

    public String getExtIP() {
        return extIP;
    }

    public void setExtIP(String extIP) {
        this.extIP = extIP;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String[] getSecGroupList() {
        return secGroupList;
    }

    public void setSecGroupList(String[] secGroupList) {
        this.secGroupList = secGroupList;
    }

    public BatchCreateInstancesDataDiskList[] getDataDiskList() {
        return dataDiskList;
    }

    public void setDataDiskList(BatchCreateInstancesDataDiskList[] dataDiskList) {
        this.dataDiskList = dataDiskList;
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

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Float getPayVoucherPrice() {
        return payVoucherPrice;
    }

    public void setPayVoucherPrice(Float payVoucherPrice) {
        this.payVoucherPrice = payVoucherPrice;
    }

    public BatchCreateInstancesLabelList[] getLabelList() {
        return labelList;
    }

    public void setLabelList(BatchCreateInstancesLabelList[] labelList) {
        this.labelList = labelList;
    }

    public String getGpuDriverKits() {
        return gpuDriverKits;
    }

    public void setGpuDriverKits(String gpuDriverKits) {
        this.gpuDriverKits = gpuDriverKits;
    }

    public Boolean getMonitorService() {
        return monitorService;
    }

    public void setMonitorService(Boolean monitorService) {
        this.monitorService = monitorService;
    }
}
