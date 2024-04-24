package cn.ctyun.ctapi.ctecs.upgradeorderprice;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-升级订单询价(根据resourceId查询)>
 * Entity: UpgradeOrderPriceSubOrderPrices
 */
public class UpgradeOrderPriceSubOrderPrices {
    /**
     * serviceTag
     * 服务类型
     */
    private String serviceTag;
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
     * orderItemPrices
     * 资源价格信息
     */
    private UpgradeOrderPriceOrderItemPrices[] orderItemPrices;

    /**
     * set serviceTag
     * @param serviceTag 服务类型
     * @return this
     */
    public UpgradeOrderPriceSubOrderPrices withServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
        return this;
    }

    /**
     * set totalPrice
     * @param totalPrice 总价格
     * @return this
     */
    public UpgradeOrderPriceSubOrderPrices withTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     * set finalPrice
     * @param finalPrice 最终价格
     * @return this
     */
    public UpgradeOrderPriceSubOrderPrices withFinalPrice(Float finalPrice) {
        this.finalPrice = finalPrice;
        return this;
    }

    /**
     * set orderItemPrices
     * @param orderItemPrices 资源价格信息
     * @return this
     */
    public UpgradeOrderPriceSubOrderPrices withOrderItemPrices(UpgradeOrderPriceOrderItemPrices[] orderItemPrices) {
        this.orderItemPrices = orderItemPrices;
        return this;
    }

    public String getServiceTag() {
        return serviceTag;
    }

    public void setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
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

    public UpgradeOrderPriceOrderItemPrices[] getOrderItemPrices() {
        return orderItemPrices;
    }

    public void setOrderItemPrices(UpgradeOrderPriceOrderItemPrices[] orderItemPrices) {
        this.orderItemPrices = orderItemPrices;
    }
}
