package cn.ctyun.ctapi.ctecs.reneworderprice;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-续订询价(根据resourceId查询)>
 * Entity: RenewOrderPriceRequestBody
 */
public class RenewOrderPriceRequestBody {
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
     * resourceID
     * 资源ID
     */
    private String resourceID;
    /**
     * cycleType
     * 订购周期类型，可选值：MONTH 月，YEAR 年
     */
    private String cycleType;
    /**
     * cycleCount
     * 订购周期大小，订购周期类型为MONTH时范围[1,36]，订购周期类型为YEAR时范围[1,3]
     */
    private Integer cycleCount;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public RenewOrderPriceRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set resourceType
     * @param resourceType 资源类型
     * @return this
     */
    public RenewOrderPriceRequestBody withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set resourceID
     * @param resourceID 资源ID
     * @return this
     */
    public RenewOrderPriceRequestBody withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 订购周期类型，可选值：MONTH 月，YEAR 年
     * @return this
     */
    public RenewOrderPriceRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleCount
     * @param cycleCount 订购周期大小，订购周期类型为MONTH时范围[1,36]，订购周期类型为YEAR时范围[1,3]
     * @return this
     */
    public RenewOrderPriceRequestBody withCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
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

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
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
}
