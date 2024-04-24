package cn.ctyun.ctapi.ctecs.getorderuuid;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-根据masterOrderId查询资源uuid>
 * Entity: GetOrderUuidReturnObj
 */
public class GetOrderUuidReturnObj {
    /**
     * orderStatus
     * 订单状态
     */
    private String orderStatus;
    /**
     * resourceType
     * 资源类型
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
    public GetOrderUuidReturnObj withOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    /**
     * set resourceType
     * @param resourceType 资源类型
     * @return this
     */
    public GetOrderUuidReturnObj withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set resourceUuid
     * @param resourceUuid 资源uuid
     * @return this
     */
    public GetOrderUuidReturnObj withResourceUuid(String[] resourceUuid) {
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
