package cn.ctyun.ctapi.ctecs.orderrenewqueryprice;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-续订单询价(根据资源uuid查询)>
 * Entity: OrderRenewQueryPriceOrderItemPrices
 */
public class OrderRenewQueryPriceOrderItemPrices {
    /**
     * resourceType
     * 资源类型
     */
    private String resourceType;
    /**
     * totalPrice
     * 总价格
     */
    private Float totalPrice;
    /**
     * finalPrice
     * 最终价格
     */
    private Float finalPrice;

    /**
     * set resourceType
     * @param resourceType 资源类型
     * @return this
     */
    public OrderRenewQueryPriceOrderItemPrices withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set totalPrice
     * @param totalPrice 总价格
     * @return this
     */
    public OrderRenewQueryPriceOrderItemPrices withTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     * set finalPrice
     * @param finalPrice 最终价格
     * @return this
     */
    public OrderRenewQueryPriceOrderItemPrices withFinalPrice(Float finalPrice) {
        this.finalPrice = finalPrice;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Float finalPrice) {
        this.finalPrice = finalPrice;
    }
}
