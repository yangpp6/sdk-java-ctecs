package cn.ctyun.ctapi.ctecs.orderqueryuuid;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-根据订单号查询uuid>
 * Entity: OrderQueryUuidReturnObj
 */
public class OrderQueryUuidReturnObj {
    /**
     * orderStatus
     * 订单状态
     */
    private String orderStatus;
    /**
     * resourceType
     * 资源类型 (VM主机,EBS硬盘,NETWORK带宽)
     */
    private String resourceType;
    /**
     * resourceUuid
     * 资源uuid
     */
    private String[] resourceUuid;

    /**
     * set orderStatus
     * @param orderStatus 订单状态
     * @return this
     */
    public OrderQueryUuidReturnObj withOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    /**
     * set resourceType
     * @param resourceType 资源类型 (VM主机,EBS硬盘,NETWORK带宽)
     * @return this
     */
    public OrderQueryUuidReturnObj withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set resourceUuid
     * @param resourceUuid 资源uuid
     * @return this
     */
    public OrderQueryUuidReturnObj withResourceUuid(String[] resourceUuid) {
        this.resourceUuid = resourceUuid;
        return this;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String[] getResourceUuid() {
        return resourceUuid;
    }

    public void setResourceUuid(String[] resourceUuid) {
        this.resourceUuid = resourceUuid;
    }
}
