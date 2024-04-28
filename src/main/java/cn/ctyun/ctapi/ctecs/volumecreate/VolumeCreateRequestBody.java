package cn.ctyun.ctapi.ctecs.volumecreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <创建一块按量付费或包年包月云硬盘>
 * Entity: VolumeCreateRequestBody
 */
public class VolumeCreateRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8317&data=87">查询账户启用的资源池信息</a>
     */
    private String regionID;
    /**
     * diskMode
     * 磁盘模式，取值范围：<br />FCSAN（光纤通道协议的SAN网络），<br />ISCSI（小型计算机系统接口），<br />VBD（虚拟块存储设备）<br />您可以查看<a href="https://www.ctyun.cn/document/10027696/10162960">磁盘模式及使用方法</a>了解相关内容。<br/>注：默认值为VBD；XSSD类型盘不支持ISCSI和FCSAN
     */
    private String diskMode;
    /**
     * diskType
     * 云硬盘类型，取值范围：<br />SATA（普通IO），SAS（高IO），SSD（超高IO），SSD-genric（通用型SSD），FAST-SSD（极速型SSD）。<br />您可以查看<a href="https://www.ctyun.cn/document/10027696/10162918">磁盘类型及性能介绍</a>磁盘类型相关信息<br />
     注：极速SSD类型盘（FAST-SSD）不支持ISCSI磁盘模式；只有高IO类型（SAS）支持FCSAN磁盘模式；XSSD类型盘不支持多挂载、加密、ISCSI和FCSAN磁盘模式
     */
    private String diskType;
    /**
     * diskName
     * 云硬盘命名，单账户单资源池下，命名需唯一
     */
    private String diskName;
    /**
     * diskSize
     * 云硬盘大小，单位GB，取值范围：[10, 32768]
     */
    private Integer diskSize;
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;
    /**
     * azName
     * 可用区名称，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解可用区 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8314&data=87">资源池可用区查询</a><br />注：查询结果中zoneList内返回存在可用区名称则为多可用区，若查询结果中zoneList为空则为单可用区；<br />多可用区类型资源池该参数必填，单可用区类型资源池该参数不可填
     */
    private String azName;
    /**
     * multiAttach
     * 是否支持多云主机挂载，注：默认值false；XSSD类型盘不支持多挂载
     */
    private Boolean multiAttach;
    /**
     * onDemand
     * 是否按需下单，注：默认值true
     */
    private Boolean onDemand;
    /**
     * cycleType
     * 订购周期类型，取值范围： <br />MONTH（表示按月），<br />YEAR（表示按年）。<br />注：onDemand为false时，必须指定。
     */
    private String cycleType;
    /**
     * cycleCount
     * 包周期数。注：onDemand为false时必须指定；周期最大长度不能超过5年
     */
    private Integer cycleCount;
    /**
     * isEncrypt
     * 是否加密盘，取值范围：<br />true表示加密，<br />false表示未加密。注：默认值false；XSSD类型盘不支持加密
     */
    private Boolean isEncrypt;
    /**
     * kmsUUID
     * 天翼云自研密钥管理（KMS，Key Management Service）的ID，如果是加密盘（参数isEncrypt为true时），需要提供KMS的uuid，您可以查看<a href="https://www.ctyun.cn/document/10027696/10162638">支持云硬盘加密功能</a>了解云硬盘加密功能
     */
    private String kmsUUID;
    /**
     * projectID
     * 企业项目ID，默认值为"0"，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目<a/>了解如何创建企业项目
     */
    private String projectID;
    /**
     * imageID
     * 镜像ID，如果用镜像创建，只支持数据盘的私有镜像，所创建的数据盘的所在地域要与镜像源一致，容量不可小于镜像对应的磁盘容量，不支持批量创建操作，从镜像创建的数据盘不支持加密、ISCSI和FCSAN高级配置
     */
    private String imageID;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8317&data=87">查询账户启用的资源池信息</a>
     * @return this
     */
    public VolumeCreateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set diskMode
     * @param diskMode 磁盘模式，取值范围：<br />FCSAN（光纤通道协议的SAN网络），<br />ISCSI（小型计算机系统接口），<br />VBD（虚拟块存储设备）<br />您可以查看<a href="https://www.ctyun.cn/document/10027696/10162960">磁盘模式及使用方法</a>了解相关内容。<br/>注：默认值为VBD；XSSD类型盘不支持ISCSI和FCSAN
     * @return this
     */
    public VolumeCreateRequestBody withDiskMode(String diskMode) {
        this.diskMode = diskMode;
        return this;
    }

    /**
     * set diskType
     * @param diskType 云硬盘类型，取值范围：<br />SATA（普通IO），SAS（高IO），SSD（超高IO），SSD-genric（通用型SSD），FAST-SSD（极速型SSD）。<br />您可以查看<a href="https://www.ctyun.cn/document/10027696/10162918">磁盘类型及性能介绍</a>磁盘类型相关信息<br />
     注：极速SSD类型盘（FAST-SSD）不支持ISCSI磁盘模式；只有高IO类型（SAS）支持FCSAN磁盘模式；XSSD类型盘不支持多挂载、加密、ISCSI和FCSAN磁盘模式
     * @return this
     */
    public VolumeCreateRequestBody withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set diskName
     * @param diskName 云硬盘命名，单账户单资源池下，命名需唯一
     * @return this
     */
    public VolumeCreateRequestBody withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 云硬盘大小，单位GB，取值范围：[10, 32768]
     * @return this
     */
    public VolumeCreateRequestBody withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public VolumeCreateRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解可用区 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8314&data=87">资源池可用区查询</a><br />注：查询结果中zoneList内返回存在可用区名称则为多可用区，若查询结果中zoneList为空则为单可用区；<br />多可用区类型资源池该参数必填，单可用区类型资源池该参数不可填
     * @return this
     */
    public VolumeCreateRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set multiAttach
     * @param multiAttach 是否支持多云主机挂载，注：默认值false；XSSD类型盘不支持多挂载
     * @return this
     */
    public VolumeCreateRequestBody withMultiAttach(Boolean multiAttach) {
        this.multiAttach = multiAttach;
        return this;
    }

    /**
     * set onDemand
     * @param onDemand 是否按需下单，注：默认值true
     * @return this
     */
    public VolumeCreateRequestBody withOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 订购周期类型，取值范围： <br />MONTH（表示按月），<br />YEAR（表示按年）。<br />注：onDemand为false时，必须指定。
     * @return this
     */
    public VolumeCreateRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleCount
     * @param cycleCount 包周期数。注：onDemand为false时必须指定；周期最大长度不能超过5年
     * @return this
     */
    public VolumeCreateRequestBody withCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
        return this;
    }

    /**
     * set isEncrypt
     * @param isEncrypt 是否加密盘，取值范围：<br />true表示加密，<br />false表示未加密。注：默认值false；XSSD类型盘不支持加密
     * @return this
     */
    public VolumeCreateRequestBody withIsEncrypt(Boolean isEncrypt) {
        this.isEncrypt = isEncrypt;
        return this;
    }

    /**
     * set kmsUUID
     * @param kmsUUID 天翼云自研密钥管理（KMS，Key Management Service）的ID，如果是加密盘（参数isEncrypt为true时），需要提供KMS的uuid，您可以查看<a href="https://www.ctyun.cn/document/10027696/10162638">支持云硬盘加密功能</a>了解云硬盘加密功能
     * @return this
     */
    public VolumeCreateRequestBody withKmsUUID(String kmsUUID) {
        this.kmsUUID = kmsUUID;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID，默认值为"0"，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目<a/>了解如何创建企业项目
     * @return this
     */
    public VolumeCreateRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set imageID
     * @param imageID 镜像ID，如果用镜像创建，只支持数据盘的私有镜像，所创建的数据盘的所在地域要与镜像源一致，容量不可小于镜像对应的磁盘容量，不支持批量创建操作，从镜像创建的数据盘不支持加密、ISCSI和FCSAN高级配置
     * @return this
     */
    public VolumeCreateRequestBody withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getDiskMode() {
        return diskMode;
    }

    public void setDiskMode(String diskMode) {
        this.diskMode = diskMode;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public Boolean getMultiAttach() {
        return multiAttach;
    }

    public void setMultiAttach(Boolean multiAttach) {
        this.multiAttach = multiAttach;
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

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }
}
