package cn.ctyun.ctapi.ctecs.ecsbatchnew;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量创建按量付费或者包年包月云主机>
 * Entity: EcsBatchNewRequestBody
 */
public class EcsBatchNewRequestBody {
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;
    /**
     * regionID
     * 资源池ID，您可以调用[regionID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87)查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * azName
     * 可用区名称。您可以调用获取[资源池信息](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87)，查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空(即为单可用区，本字段填写default)。
     */
    private String azName;
    /**
     * projectID
     * 企业项目ID，默认值为0
     */
    private String projectID;
    /**
     * vmName
     * 云主机名称，不可以使用已存在的云主机名称。不同操作系统下，云主机名称规则有差异。<br />Windows：长度为2~15个字符（当创建两台及两台以上的云主机时名称长度为2~10个字符），允许使用大小写字母、数字或连字符（-），不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能仅使用数字；<br />其他操作系统：长度为2-64字符（当创建两台及两台以上的云主机时名称长度为2~59个字符），允许使用点（.）分隔字符成多段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾，也不能仅使用数字。
     */
    private String vmName;
    /**
     * displayName
     * 云主机显示名称，长度为2-63字符
     */
    private String displayName;
    /**
     * flavorID
     * 云主机规格ID，您可以调用[flavorID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8327&data=87)查看最新的天翼云具体资源池的云主机规格列表
     */
    private String flavorID;
    /**
     * imagePublic
     * 镜像类型，取值范围:<br />0：私有镜像，<br />1：公有镜像，<br />2：共享镜像，<br />3：安全镜像，<br />4：甄选镜像
     */
    private Integer imagePublic;
    /**
     * imageID
     * 镜像ID，您可以调用[imageID](https://www.ctyun.cn/document/10027726/10040047)查看最新的天翼云具体资源池的镜像列表
     */
    private String imageID;
    /**
     * syshdType
     * 系统盘类型，取值范围: <br />SATA：普通IO，<br />SAS：高IO，<br />SSD：超高IO，<br />SSD-genric：通用型SSD，<br />FAST-SSD：极速型SSD
     */
    private String syshdType;
    /**
     * syshd
     * 系统盘大小单位为GiB，取值范围[40-32768]
     */
    private Integer syshd;
    /**
     * diskList
     * 数据盘
     */
    private EcsBatchNewDisks[] diskList;
    /**
     * vpc
     * 虚拟私有云ID
     */
    private String vpc;
    /**
     * onDemand
     * 购买方式，取值范围：<br />false：按周期，<br />true：按需，按需创建云主机需要同时指定cycleCount和cycleType参数
     */
    private Boolean onDemand;
    /**
     * secGroupList
     * 安全组ID列表，默认使用默认安全组，无默认安全组情况下请填写该参数
     */
    private String[] secGroupList;
    /**
     * networkCardList
     * 网卡列表信息
     */
    private EcsBatchNewNetworkCardList[] networkCardList;
    /**
     * extIP
     * 是否使用弹性公网IP，取值范围:<br />0：不使用，<br />1：自动分配，自动分配需指定带宽大小，<br />2：使用已有
     */
    private String extIP;
    /**
     * ipType
     * 弹性IP版本，取值范围:<br />ipv4：v4地址，<br />ipv6：v6地址，<br />默认选择ipv4
     */
    private String ipType;
    /**
     * bandWidth
     * 带宽大小单位为Mbit/s，取值范围:[1~2000]
     */
    private Integer bandWidth;
    /**
     * ipv6Address
     * ipv6地址的ID（多可用区类资源池暂不支持）
     */
    private String ipv6Address;
    /**
     * publicIP
     * 弹性公网IP的ID
     */
    private String publicIP;
    /**
     * affinityGroup
     * 云主机组ID，您可以调用[affinityGroupID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87)查看当前用户的云主机组列表
     */
    private String affinityGroup;
    /**
     * keyPairID
     * 密钥对ID
     */
    private String keyPairID;
    /**
     * rootPassword
     * 用户密码，满足以下规则：<br />长度在8～30个字符；<br />必须包含大写字母、小写字母、数字以及特殊符号中的三项；<br />特殊符号可选：()`~!@#$%^&*_-+=｜{}[]:;'<>,.?/\且不能以斜线号 / 开头；<br />不能包含3个及以上连续字符；<br />Linux镜像不能包含镜像用户名（root）、用户名的倒序（toor）、用户名大小写变化（如RoOt、rOot等）；<br />Windows镜像不能包含镜像用户名（Administrator）、用户名大小写变化（adminiSTrator等）
     */
    private String rootPassword;
    /**
     * cycleCount
     * 订购时长
     */
    private Integer cycleCount;
    /**
     * cycleType
     * 表示订购周期类型，取值范围：<br />MONTH：按月，<br />YEAR：按年，<br />最长订购周期为5年
     */
    private String cycleType;
    /**
     * orderCount
     * 购买数量，不指定默认为1，最大数量为50台。
     */
    private Integer orderCount;
    /**
     * autoRenewStatus
     * 是否自动续订 ，取值范围：<br />0：不续费，<br />1：自动续费，<br />按月购买：自动续订周期为1个月，<br />按年购买：自动续订周期为1年
     */
    private Integer autoRenewStatus;
    /**
     * userData
     * 用户自定义数据,需要以Base64方式编码,需要以Base64方式编码,Base64编码后的长度限制为1-16384字符
     */
    private String userData;

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public EcsBatchNewRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用[regionID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87)查看最新的天翼云资源池列表
     * @return this
     */
    public EcsBatchNewRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称。您可以调用获取[资源池信息](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87)，查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空(即为单可用区，本字段填写default)。
     * @return this
     */
    public EcsBatchNewRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID，默认值为0
     * @return this
     */
    public EcsBatchNewRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set vmName
     * @param vmName 云主机名称，不可以使用已存在的云主机名称。不同操作系统下，云主机名称规则有差异。<br />Windows：长度为2~15个字符（当创建两台及两台以上的云主机时名称长度为2~10个字符），允许使用大小写字母、数字或连字符（-），不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能仅使用数字；<br />其他操作系统：长度为2-64字符（当创建两台及两台以上的云主机时名称长度为2~59个字符），允许使用点（.）分隔字符成多段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾，也不能仅使用数字。
     * @return this
     */
    public EcsBatchNewRequestBody withVmName(String vmName) {
        this.vmName = vmName;
        return this;
    }

    /**
     * set displayName
     * @param displayName 云主机显示名称，长度为2-63字符
     * @return this
     */
    public EcsBatchNewRequestBody withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set flavorID
     * @param flavorID 云主机规格ID，您可以调用[flavorID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8327&data=87)查看最新的天翼云具体资源池的云主机规格列表
     * @return this
     */
    public EcsBatchNewRequestBody withFlavorID(String flavorID) {
        this.flavorID = flavorID;
        return this;
    }

    /**
     * set imagePublic
     * @param imagePublic 镜像类型，取值范围:<br />0：私有镜像，<br />1：公有镜像，<br />2：共享镜像，<br />3：安全镜像，<br />4：甄选镜像
     * @return this
     */
    public EcsBatchNewRequestBody withImagePublic(Integer imagePublic) {
        this.imagePublic = imagePublic;
        return this;
    }

    /**
     * set imageID
     * @param imageID 镜像ID，您可以调用[imageID](https://www.ctyun.cn/document/10027726/10040047)查看最新的天翼云具体资源池的镜像列表
     * @return this
     */
    public EcsBatchNewRequestBody withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    /**
     * set syshdType
     * @param syshdType 系统盘类型，取值范围: <br />SATA：普通IO，<br />SAS：高IO，<br />SSD：超高IO，<br />SSD-genric：通用型SSD，<br />FAST-SSD：极速型SSD
     * @return this
     */
    public EcsBatchNewRequestBody withSyshdType(String syshdType) {
        this.syshdType = syshdType;
        return this;
    }

    /**
     * set syshd
     * @param syshd 系统盘大小单位为GiB，取值范围[40-32768]
     * @return this
     */
    public EcsBatchNewRequestBody withSyshd(Integer syshd) {
        this.syshd = syshd;
        return this;
    }

    /**
     * set diskList
     * @param diskList 数据盘
     * @return this
     */
    public EcsBatchNewRequestBody withDiskList(EcsBatchNewDisks[] diskList) {
        this.diskList = diskList;
        return this;
    }

    /**
     * set vpc
     * @param vpc 虚拟私有云ID
     * @return this
     */
    public EcsBatchNewRequestBody withVpc(String vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * set onDemand
     * @param onDemand 购买方式，取值范围：<br />false：按周期，<br />true：按需，按需创建云主机需要同时指定cycleCount和cycleType参数
     * @return this
     */
    public EcsBatchNewRequestBody withOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
        return this;
    }

    /**
     * set secGroupList
     * @param secGroupList 安全组ID列表，默认使用默认安全组，无默认安全组情况下请填写该参数
     * @return this
     */
    public EcsBatchNewRequestBody withSecGroupList(String[] secGroupList) {
        this.secGroupList = secGroupList;
        return this;
    }

    /**
     * set networkCardList
     * @param networkCardList 网卡列表信息
     * @return this
     */
    public EcsBatchNewRequestBody withNetworkCardList(EcsBatchNewNetworkCardList[] networkCardList) {
        this.networkCardList = networkCardList;
        return this;
    }

    /**
     * set extIP
     * @param extIP 是否使用弹性公网IP，取值范围:<br />0：不使用，<br />1：自动分配，自动分配需指定带宽大小，<br />2：使用已有
     * @return this
     */
    public EcsBatchNewRequestBody withExtIP(String extIP) {
        this.extIP = extIP;
        return this;
    }

    /**
     * set ipType
     * @param ipType 弹性IP版本，取值范围:<br />ipv4：v4地址，<br />ipv6：v6地址，<br />默认选择ipv4
     * @return this
     */
    public EcsBatchNewRequestBody withIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * set bandWidth
     * @param bandWidth 带宽大小单位为Mbit/s，取值范围:[1~2000]
     * @return this
     */
    public EcsBatchNewRequestBody withBandWidth(Integer bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }

    /**
     * set ipv6Address
     * @param ipv6Address ipv6地址的ID（多可用区类资源池暂不支持）
     * @return this
     */
    public EcsBatchNewRequestBody withIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    /**
     * set publicIP
     * @param publicIP 弹性公网IP的ID
     * @return this
     */
    public EcsBatchNewRequestBody withPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }

    /**
     * set affinityGroup
     * @param affinityGroup 云主机组ID，您可以调用[affinityGroupID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87)查看当前用户的云主机组列表
     * @return this
     */
    public EcsBatchNewRequestBody withAffinityGroup(String affinityGroup) {
        this.affinityGroup = affinityGroup;
        return this;
    }

    /**
     * set keyPairID
     * @param keyPairID 密钥对ID
     * @return this
     */
    public EcsBatchNewRequestBody withKeyPairID(String keyPairID) {
        this.keyPairID = keyPairID;
        return this;
    }

    /**
     * set rootPassword
     * @param rootPassword 用户密码，满足以下规则：<br />长度在8～30个字符；<br />必须包含大写字母、小写字母、数字以及特殊符号中的三项；<br />特殊符号可选：()`~!@#$%^&*_-+=｜{}[]:;'<>,.?/\且不能以斜线号 / 开头；<br />不能包含3个及以上连续字符；<br />Linux镜像不能包含镜像用户名（root）、用户名的倒序（toor）、用户名大小写变化（如RoOt、rOot等）；<br />Windows镜像不能包含镜像用户名（Administrator）、用户名大小写变化（adminiSTrator等）
     * @return this
     */
    public EcsBatchNewRequestBody withRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }

    /**
     * set cycleCount
     * @param cycleCount 订购时长
     * @return this
     */
    public EcsBatchNewRequestBody withCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 表示订购周期类型，取值范围：<br />MONTH：按月，<br />YEAR：按年，<br />最长订购周期为5年
     * @return this
     */
    public EcsBatchNewRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set orderCount
     * @param orderCount 购买数量，不指定默认为1，最大数量为50台。
     * @return this
     */
    public EcsBatchNewRequestBody withOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
        return this;
    }

    /**
     * set autoRenewStatus
     * @param autoRenewStatus 是否自动续订 ，取值范围：<br />0：不续费，<br />1：自动续费，<br />按月购买：自动续订周期为1个月，<br />按年购买：自动续订周期为1年
     * @return this
     */
    public EcsBatchNewRequestBody withAutoRenewStatus(Integer autoRenewStatus) {
        this.autoRenewStatus = autoRenewStatus;
        return this;
    }

    /**
     * set userData
     * @param userData 用户自定义数据,需要以Base64方式编码,需要以Base64方式编码,Base64编码后的长度限制为1-16384字符
     * @return this
     */
    public EcsBatchNewRequestBody withUserData(String userData) {
        this.userData = userData;
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

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
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

    public Integer getImagePublic() {
        return imagePublic;
    }

    public void setImagePublic(Integer imagePublic) {
        this.imagePublic = imagePublic;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getSyshdType() {
        return syshdType;
    }

    public void setSyshdType(String syshdType) {
        this.syshdType = syshdType;
    }

    public Integer getSyshd() {
        return syshd;
    }

    public void setSyshd(Integer syshd) {
        this.syshd = syshd;
    }

    public EcsBatchNewDisks[] getDiskList() {
        return diskList;
    }

    public void setDiskList(EcsBatchNewDisks[] diskList) {
        this.diskList = diskList;
    }

    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
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

    public EcsBatchNewNetworkCardList[] getNetworkCardList() {
        return networkCardList;
    }

    public void setNetworkCardList(EcsBatchNewNetworkCardList[] networkCardList) {
        this.networkCardList = networkCardList;
    }

    public String getExtIP() {
        return extIP;
    }

    public void setExtIP(String extIP) {
        this.extIP = extIP;
    }

    public String getIpType() {
        return ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public Integer getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(Integer bandWidth) {
        this.bandWidth = bandWidth;
    }

    public String getIpv6Address() {
        return ipv6Address;
    }

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public String getPublicIP() {
        return publicIP;
    }

    public void setPublicIP(String publicIP) {
        this.publicIP = publicIP;
    }

    public String getAffinityGroup() {
        return affinityGroup;
    }

    public void setAffinityGroup(String affinityGroup) {
        this.affinityGroup = affinityGroup;
    }

    public String getKeyPairID() {
        return keyPairID;
    }

    public void setKeyPairID(String keyPairID) {
        this.keyPairID = keyPairID;
    }

    public String getRootPassword() {
        return rootPassword;
    }

    public void setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
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

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
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
}
