package cn.ctyun.ctapi.ctecs.ecsvolumecreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建一块按量付费或包年包月云硬盘>
 * Entity: EcsVolumeCreateRequestBody
 */
public class EcsVolumeCreateRequestBody {
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;
    /**
     * regionID
     * 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8317&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * multiAttach
     * 是否支持多云主机挂载，默认false
     */
    private Boolean multiAttach;
    /**
     * isEncrypt
     * 是否加密盘，取值范围：<br />true表示加盟，<br />false表示未加密
     */
    private Boolean isEncrypt;
    /**
     * kmsUUID
     * 加密盘的ID，如果是加密盘，需要提供kms的uuid
     */
    private String kmsUUID;
    /**
     * projectID
     * 企业项目ID,默认值为0
     */
    private String projectID;
    /**
     * diskMode
     * 云硬盘属性，取值范围: [FCSAN、ISCSI、VBD]，默认值为VBD
     */
    private String diskMode;
    /**
     * diskType
     * 云硬盘类型，取值范围：<br />SATA：普通IO<br />SAS：高IO<br />SSD：超高IO<br />SSD-genric：通用型SSD<br />FAST-SSD：极速型SSD
     */
    private String diskType;
    /**
     * name
     * 云硬盘命名，单账户单资源池下，命名需唯一
     */
    private String name;
    /**
     * diskSize
     * 云硬盘大小，单位GB
     */
    private Integer diskSize;
    /**
     * onDemand
     * 是否按需下单。默认为true
     */
    private Boolean onDemand;
    /**
     * cycleType
     * 订购周期类型，取值范围: <br />MONTH：表示按月，<br />YEAR：表示按年。onDemand为false时，必须指定。
     */
    private String cycleType;
    /**
     * cycleCount
     * 包周期数。onDemand为false时必须指定。周期最大长度不能超过5年
     */
    private Integer cycleCount;
    /**
     * azName
     * 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8314&data=87">资源池可用区查询</a>，查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空(即为单可用区，本字段填写default),多可用区资源池下，必须指定可用区
     */
    private String azName;
    /**
     * imageID
     * 镜像ID，您可以调用[imageID]查看最新的天翼云具体资源池的镜像列表，如果用镜像创建，只支持数据盘的私有镜像，所创建的数据盘的所在地域要与镜像源一致，容量不可小于镜像对应的磁盘容量，不支持批量创建操作，从镜像创建的数据盘不支持加密、iSCSI和FCSAN高级配置
     */
    private String imageID;

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public EcsVolumeCreateRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8317&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsVolumeCreateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set multiAttach
     * @param multiAttach 是否支持多云主机挂载，默认false
     * @return this
     */
    public EcsVolumeCreateRequestBody withMultiAttach(Boolean multiAttach) {
        this.multiAttach = multiAttach;
        return this;
    }

    /**
     * set isEncrypt
     * @param isEncrypt 是否加密盘，取值范围：<br />true表示加盟，<br />false表示未加密
     * @return this
     */
    public EcsVolumeCreateRequestBody withIsEncrypt(Boolean isEncrypt) {
        this.isEncrypt = isEncrypt;
        return this;
    }

    /**
     * set kmsUUID
     * @param kmsUUID 加密盘的ID，如果是加密盘，需要提供kms的uuid
     * @return this
     */
    public EcsVolumeCreateRequestBody withKmsUUID(String kmsUUID) {
        this.kmsUUID = kmsUUID;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID,默认值为0
     * @return this
     */
    public EcsVolumeCreateRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set diskMode
     * @param diskMode 云硬盘属性，取值范围: [FCSAN、ISCSI、VBD]，默认值为VBD
     * @return this
     */
    public EcsVolumeCreateRequestBody withDiskMode(String diskMode) {
        this.diskMode = diskMode;
        return this;
    }

    /**
     * set diskType
     * @param diskType 云硬盘类型，取值范围：<br />SATA：普通IO<br />SAS：高IO<br />SSD：超高IO<br />SSD-genric：通用型SSD<br />FAST-SSD：极速型SSD
     * @return this
     */
    public EcsVolumeCreateRequestBody withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set name
     * @param name 云硬盘命名，单账户单资源池下，命名需唯一
     * @return this
     */
    public EcsVolumeCreateRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 云硬盘大小，单位GB
     * @return this
     */
    public EcsVolumeCreateRequestBody withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * set onDemand
     * @param onDemand 是否按需下单。默认为true
     * @return this
     */
    public EcsVolumeCreateRequestBody withOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 订购周期类型，取值范围: <br />MONTH：表示按月，<br />YEAR：表示按年。onDemand为false时，必须指定。
     * @return this
     */
    public EcsVolumeCreateRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleCount
     * @param cycleCount 包周期数。onDemand为false时必须指定。周期最大长度不能超过5年
     * @return this
     */
    public EcsVolumeCreateRequestBody withCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8314&data=87">资源池可用区查询</a>，查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空(即为单可用区，本字段填写default),多可用区资源池下，必须指定可用区
     * @return this
     */
    public EcsVolumeCreateRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set imageID
     * @param imageID 镜像ID，您可以调用[imageID]查看最新的天翼云具体资源池的镜像列表，如果用镜像创建，只支持数据盘的私有镜像，所创建的数据盘的所在地域要与镜像源一致，容量不可小于镜像对应的磁盘容量，不支持批量创建操作，从镜像创建的数据盘不支持加密、iSCSI和FCSAN高级配置
     * @return this
     */
    public EcsVolumeCreateRequestBody withImageID(String imageID) {
        this.imageID = imageID;
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

    public Boolean getMultiAttach() {
        return multiAttach;
    }

    public void setMultiAttach(Boolean multiAttach) {
        this.multiAttach = multiAttach;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
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

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }
}
