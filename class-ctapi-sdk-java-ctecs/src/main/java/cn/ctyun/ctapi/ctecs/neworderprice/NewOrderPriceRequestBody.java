package cn.ctyun.ctapi.ctecs.neworderprice;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-下单询价>
 * Entity: NewOrderPriceRequestBody
 */
public class NewOrderPriceRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * resourceType
     * 资源类型
     */
    private String resourceType;
    /**
     * count
     * 订购数量
     */
    private Integer count;
    /**
     * onDemand
     * 是否按需资源，true 按需 / false 包周期
     */
    private Boolean onDemand;
    /**
     * cycleType
     * 订购周期类型，当onDemand为false时为必填，可选值：MONTH 月/YEAR 年
     */
    private String cycleType;
    /**
     * cycleCount
     * 订购周期大小，订购周期类型为MONTH时范围[1,60]，订购周期类型为YEAR时范围[1,5]，当onDemand为false时为必填
     */
    private Integer cycleCount;
    /**
     * flavorName
     * 云主机规格，当resourceType为VM时必填
     */
    private String flavorName;
    /**
     * imageUUID
     * 云主机镜像UUID，当resourceType为VM时必填
     */
    private String imageUUID;
    /**
     * sysDiskType
     * 云主机系统盘类型，当resourceType为VM时必填
     */
    private String sysDiskType;
    /**
     * sysDiskSize
     * 云主机系统盘大小，范围[40,2048]，当resourceType为VM时必填
     */
    private Integer sysDiskSize;
    /**
     * disks
     * 数据盘信息，当resourceType为VM选填，订购云主机时如果成套订购数据盘时需要该字段
     */
    private NewOrderPriceDisks[] disks;
    /**
     * bandwidth
     * 带宽大小，范围[1,2000]，当resourceType为IP时必填；当resourceType为VM时，如果成套订购弹性公网IP时需要该字段
     */
    private Integer bandwidth;
    /**
     * diskType
     * 磁盘类型，当resourceType为EBS时必填
     */
    private String diskType;
    /**
     * diskSize
     * 磁盘大小，范围[5,2000]，当resourceType为EBS时必填
     */
    private Integer diskSize;
    /**
     * diskMode
     * 磁盘模式(VBD/ISCSI/FCSAN)，当resourceType为EBS时必填
     */
    private String diskMode;
    /**
     * natType
     * nat规格，当resourceType为NAT时必填
     */
    private String natType;
    /**
     * ipPoolBandwidth
     * 共享带宽大小，范围[5,2000]，当resourceType为IP_POOL时必填
     */
    private Integer ipPoolBandwidth;
    /**
     * deviceType
     * 物理机规格，当resourceType为BMS时必填
     */
    private String deviceType;
    /**
     * azName
     * 物理机规格可用区，当resourceType为BMS时必填
     */
    private String azName;
    /**
     * orderDisks
     * 物理机云硬盘信息，当resourceType为BMS选填
     */
    private NewOrderPriceOrderDisks[] orderDisks;
    /**
     * elbType
     * 性能保障型负载均衡类型(支持standardI/standardII/enhancedI/enhancedII/higherI)，当resourceType为PGELB时必填
     */
    private String elbType;
    /**
     * cbrValue
     * 存储库大小，100-1024000GB，当resourceType为CBR_VM或CBR_VBS时必填
     */
    private Integer cbrValue;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public NewOrderPriceRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set resourceType
     * @param resourceType 资源类型
     * @return this
     */
    public NewOrderPriceRequestBody withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set count
     * @param count 订购数量
     * @return this
     */
    public NewOrderPriceRequestBody withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * set onDemand
     * @param onDemand 是否按需资源，true 按需 / false 包周期
     * @return this
     */
    public NewOrderPriceRequestBody withOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 订购周期类型，当onDemand为false时为必填，可选值：MONTH 月/YEAR 年
     * @return this
     */
    public NewOrderPriceRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleCount
     * @param cycleCount 订购周期大小，订购周期类型为MONTH时范围[1,60]，订购周期类型为YEAR时范围[1,5]，当onDemand为false时为必填
     * @return this
     */
    public NewOrderPriceRequestBody withCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
        return this;
    }

    /**
     * set flavorName
     * @param flavorName 云主机规格，当resourceType为VM时必填
     * @return this
     */
    public NewOrderPriceRequestBody withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * set imageUUID
     * @param imageUUID 云主机镜像UUID，当resourceType为VM时必填
     * @return this
     */
    public NewOrderPriceRequestBody withImageUUID(String imageUUID) {
        this.imageUUID = imageUUID;
        return this;
    }

    /**
     * set sysDiskType
     * @param sysDiskType 云主机系统盘类型，当resourceType为VM时必填
     * @return this
     */
    public NewOrderPriceRequestBody withSysDiskType(String sysDiskType) {
        this.sysDiskType = sysDiskType;
        return this;
    }

    /**
     * set sysDiskSize
     * @param sysDiskSize 云主机系统盘大小，范围[40,2048]，当resourceType为VM时必填
     * @return this
     */
    public NewOrderPriceRequestBody withSysDiskSize(Integer sysDiskSize) {
        this.sysDiskSize = sysDiskSize;
        return this;
    }

    /**
     * set disks
     * @param disks 数据盘信息，当resourceType为VM选填，订购云主机时如果成套订购数据盘时需要该字段
     * @return this
     */
    public NewOrderPriceRequestBody withDisks(NewOrderPriceDisks[] disks) {
        this.disks = disks;
        return this;
    }

    /**
     * set bandwidth
     * @param bandwidth 带宽大小，范围[1,2000]，当resourceType为IP时必填；当resourceType为VM时，如果成套订购弹性公网IP时需要该字段
     * @return this
     */
    public NewOrderPriceRequestBody withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set diskType
     * @param diskType 磁盘类型，当resourceType为EBS时必填
     * @return this
     */
    public NewOrderPriceRequestBody withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 磁盘大小，范围[5,2000]，当resourceType为EBS时必填
     * @return this
     */
    public NewOrderPriceRequestBody withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * set diskMode
     * @param diskMode 磁盘模式(VBD/ISCSI/FCSAN)，当resourceType为EBS时必填
     * @return this
     */
    public NewOrderPriceRequestBody withDiskMode(String diskMode) {
        this.diskMode = diskMode;
        return this;
    }

    /**
     * set natType
     * @param natType nat规格，当resourceType为NAT时必填
     * @return this
     */
    public NewOrderPriceRequestBody withNatType(String natType) {
        this.natType = natType;
        return this;
    }

    /**
     * set ipPoolBandwidth
     * @param ipPoolBandwidth 共享带宽大小，范围[5,2000]，当resourceType为IP_POOL时必填
     * @return this
     */
    public NewOrderPriceRequestBody withIpPoolBandwidth(Integer ipPoolBandwidth) {
        this.ipPoolBandwidth = ipPoolBandwidth;
        return this;
    }

    /**
     * set deviceType
     * @param deviceType 物理机规格，当resourceType为BMS时必填
     * @return this
     */
    public NewOrderPriceRequestBody withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * set azName
     * @param azName 物理机规格可用区，当resourceType为BMS时必填
     * @return this
     */
    public NewOrderPriceRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set orderDisks
     * @param orderDisks 物理机云硬盘信息，当resourceType为BMS选填
     * @return this
     */
    public NewOrderPriceRequestBody withOrderDisks(NewOrderPriceOrderDisks[] orderDisks) {
        this.orderDisks = orderDisks;
        return this;
    }

    /**
     * set elbType
     * @param elbType 性能保障型负载均衡类型(支持standardI/standardII/enhancedI/enhancedII/higherI)，当resourceType为PGELB时必填
     * @return this
     */
    public NewOrderPriceRequestBody withElbType(String elbType) {
        this.elbType = elbType;
        return this;
    }

    /**
     * set cbrValue
     * @param cbrValue 存储库大小，100-1024000GB，当resourceType为CBR_VM或CBR_VBS时必填
     * @return this
     */
    public NewOrderPriceRequestBody withCbrValue(Integer cbrValue) {
        this.cbrValue = cbrValue;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public String getImageUUID() {
        return imageUUID;
    }

    public void setImageUUID(String imageUUID) {
        this.imageUUID = imageUUID;
    }

    public String getSysDiskType() {
        return sysDiskType;
    }

    public void setSysDiskType(String sysDiskType) {
        this.sysDiskType = sysDiskType;
    }

    public Integer getSysDiskSize() {
        return sysDiskSize;
    }

    public void setSysDiskSize(Integer sysDiskSize) {
        this.sysDiskSize = sysDiskSize;
    }

    public NewOrderPriceDisks[] getDisks() {
        return disks;
    }

    public void setDisks(NewOrderPriceDisks[] disks) {
        this.disks = disks;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public String getDiskMode() {
        return diskMode;
    }

    public void setDiskMode(String diskMode) {
        this.diskMode = diskMode;
    }

    public String getNatType() {
        return natType;
    }

    public void setNatType(String natType) {
        this.natType = natType;
    }

    public Integer getIpPoolBandwidth() {
        return ipPoolBandwidth;
    }

    public void setIpPoolBandwidth(Integer ipPoolBandwidth) {
        this.ipPoolBandwidth = ipPoolBandwidth;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public NewOrderPriceOrderDisks[] getOrderDisks() {
        return orderDisks;
    }

    public void setOrderDisks(NewOrderPriceOrderDisks[] orderDisks) {
        this.orderDisks = orderDisks;
    }

    public String getElbType() {
        return elbType;
    }

    public void setElbType(String elbType) {
        this.elbType = elbType;
    }

    public Integer getCbrValue() {
        return cbrValue;
    }

    public void setCbrValue(Integer cbrValue) {
        this.cbrValue = cbrValue;
    }
}
