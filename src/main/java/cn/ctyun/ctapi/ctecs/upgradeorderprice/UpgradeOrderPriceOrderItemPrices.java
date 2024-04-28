package cn.ctyun.ctapi.ctecs.upgradeorderprice;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-升级订单询价(根据resourceId查询)>
 * Entity: UpgradeOrderPriceOrderItemPrices
 */
public class UpgradeOrderPriceOrderItemPrices {
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
    public UpgradeOrderPriceOrderItemPrices withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set totalPrice
     * @param totalPrice 总价格
     * @return this
     */
    public UpgradeOrderPriceOrderItemPrices withTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     * set finalPrice
     * @param finalPrice 最终价格
     * @return this
     */
    public UpgradeOrderPriceOrderItemPrices withFinalPrice(Float finalPrice) {
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
