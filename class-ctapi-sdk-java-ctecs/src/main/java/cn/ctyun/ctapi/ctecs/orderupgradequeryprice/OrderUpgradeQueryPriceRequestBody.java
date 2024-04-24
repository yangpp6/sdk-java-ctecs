package cn.ctyun.ctapi.ctecs.orderupgradequeryprice;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-升级订单询价(根据资源uuid查询)>
 * Entity: OrderUpgradeQueryPriceRequestBody
 */
public class OrderUpgradeQueryPriceRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * resourceUUID
     * 资源uuid
     */
    private String resourceUUID;
    /**
     * resourceType
     * 资源类型
     */
    private String resourceType;
    /**
     * flavorName
     * 云主机规格，当resourceType为VM时必填
     */
    private String flavorName;
    /**
     * bandwidth
     * 带宽大小，范围[1,2000]，需大于当前带宽，当resourceType为IP时必填
     */
    private Integer bandwidth;
    /**
     * diskSize
     * 磁盘大小，范围[10,2000]，需大于当前大小，当resourceType为EBS时必填
     */
    private Integer diskSize;
    /**
     * natType
     * nat规格，当resourceType为NAT时必填
     */
    private String natType;
    /**
     * ipPoolBandwidth
     * 共享带宽大小，范围[5,2000]，需大于当前带宽，当resourceType为IP_POOL时必填
     */
    private Integer ipPoolBandwidth;
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
    public OrderUpgradeQueryPriceRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set resourceUUID
     * @param resourceUUID 资源uuid
     * @return this
     */
    public OrderUpgradeQueryPriceRequestBody withResourceUUID(String resourceUUID) {
        this.resourceUUID = resourceUUID;
        return this;
    }

    /**
     * set resourceType
     * @param resourceType 资源类型
     * @return this
     */
    public OrderUpgradeQueryPriceRequestBody withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set flavorName
     * @param flavorName 云主机规格，当resourceType为VM时必填
     * @return this
     */
    public OrderUpgradeQueryPriceRequestBody withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * set bandwidth
     * @param bandwidth 带宽大小，范围[1,2000]，需大于当前带宽，当resourceType为IP时必填
     * @return this
     */
    public OrderUpgradeQueryPriceRequestBody withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 磁盘大小，范围[10,2000]，需大于当前大小，当resourceType为EBS时必填
     * @return this
     */
    public OrderUpgradeQueryPriceRequestBody withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * set natType
     * @param natType nat规格，当resourceType为NAT时必填
     * @return this
     */
    public OrderUpgradeQueryPriceRequestBody withNatType(String natType) {
        this.natType = natType;
        return this;
    }

    /**
     * set ipPoolBandwidth
     * @param ipPoolBandwidth 共享带宽大小，范围[5,2000]，需大于当前带宽，当resourceType为IP_POOL时必填
     * @return this
     */
    public OrderUpgradeQueryPriceRequestBody withIpPoolBandwidth(Integer ipPoolBandwidth) {
        this.ipPoolBandwidth = ipPoolBandwidth;
        return this;
    }

    /**
     * set elbType
     * @param elbType 性能保障型负载均衡类型(支持standardI/standardII/enhancedI/enhancedII/higherI)，当resourceType为PGELB时必填
     * @return this
     */
    public OrderUpgradeQueryPriceRequestBody withElbType(String elbType) {
        this.elbType = elbType;
        return this;
    }

    /**
     * set cbrValue
     * @param cbrValue 存储库大小，100-1024000GB，当resourceType为CBR_VM或CBR_VBS时必填
     * @return this
     */
    public OrderUpgradeQueryPriceRequestBody withCbrValue(Integer cbrValue) {
        this.cbrValue = cbrValue;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getResourceUUID() {
        return resourceUUID;
    }

    public void setResourceUUID(String resourceUUID) {
        this.resourceUUID = resourceUUID;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
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
