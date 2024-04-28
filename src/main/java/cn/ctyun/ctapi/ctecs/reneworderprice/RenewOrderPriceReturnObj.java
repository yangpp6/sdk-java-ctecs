package cn.ctyun.ctapi.ctecs.reneworderprice;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-续订询价(根据resourceId查询)>
 * Entity: RenewOrderPriceReturnObj
 */
public class RenewOrderPriceReturnObj {
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
     * subOrderPrices
     * 子订单价格信息
     */
    private RenewOrderPriceSubOrderPrices[] subOrderPrices;

    /**
     * set totalPrice
     * @param totalPrice 总价格
     * @return this
     */
    public RenewOrderPriceReturnObj withTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     * set finalPrice
     * @param finalPrice 最终价格
     * @return this
     */
    public RenewOrderPriceReturnObj withFinalPrice(Float finalPrice) {
        this.finalPrice = finalPrice;
        return this;
    }

    /**
     * set subOrderPrices
     * @param subOrderPrices 子订单价格信息
     * @return this
     */
    public RenewOrderPriceReturnObj withSubOrderPrices(RenewOrderPriceSubOrderPrices[] subOrderPrices) {
        this.subOrderPrices = subOrderPrices;
        return this;
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

    public RenewOrderPriceSubOrderPrices[] getSubOrderPrices() {
        return subOrderPrices;
    }

    public void setSubOrderPrices(RenewOrderPriceSubOrderPrices[] subOrderPrices) {
        this.subOrderPrices = subOrderPrices;
    }
}
