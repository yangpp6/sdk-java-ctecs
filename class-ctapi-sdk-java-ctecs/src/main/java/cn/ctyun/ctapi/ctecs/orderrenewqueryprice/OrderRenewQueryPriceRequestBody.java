package cn.ctyun.ctapi.ctecs.orderrenewqueryprice;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-续订单询价(根据资源uuid查询)>
 * Entity: OrderRenewQueryPriceRequestBody
 */
public class OrderRenewQueryPriceRequestBody {
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
     * resourceUUID
     * 资源uuid
     */
    private String resourceUUID;
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
    public OrderRenewQueryPriceRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set resourceType
     * @param resourceType 资源类型
     * @return this
     */
    public OrderRenewQueryPriceRequestBody withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set resourceUUID
     * @param resourceUUID 资源uuid
     * @return this
     */
    public OrderRenewQueryPriceRequestBody withResourceUUID(String resourceUUID) {
        this.resourceUUID = resourceUUID;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 订购周期类型，可选值：MONTH 月，YEAR 年
     * @return this
     */
    public OrderRenewQueryPriceRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleCount
     * @param cycleCount 订购周期大小，订购周期类型为MONTH时范围[1,36]，订购周期类型为YEAR时范围[1,3]
     * @return this
     */
    public OrderRenewQueryPriceRequestBody withCycleCount(Integer cycleCount) {
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

    public String getResourceUUID() {
        return resourceUUID;
    }

    public void setResourceUUID(String resourceUUID) {
        this.resourceUUID = resourceUUID;
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
