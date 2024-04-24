package cn.ctyun.ctapi.ctecs.orderupgradequeryprice;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-升级订单询价(根据资源uuid查询)>
 * Entity: OrderUpgradeQueryPriceReturnObj
 */
public class OrderUpgradeQueryPriceReturnObj {
    /**
     * totalPrice
     * 总价格
     */
    private Float totalPrice;
    /**
     * discountPrice
     * 折后价格
     */
    private Float discountPrice;
    /**
     * finalPrice
     * 最终价格
     */
    private Float finalPrice;
    /**
     * subOrderPrices
     * 子订单价格信息
     */
    private OrderUpgradeQueryPriceSubOrderPrices[] subOrderPrices;

    /**
     * set totalPrice
     * @param totalPrice 总价格
     * @return this
     */
    public OrderUpgradeQueryPriceReturnObj withTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     * set discountPrice
     * @param discountPrice 折后价格
     * @return this
     */
    public OrderUpgradeQueryPriceReturnObj withDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }

    /**
     * set finalPrice
     * @param finalPrice 最终价格
     * @return this
     */
    public OrderUpgradeQueryPriceReturnObj withFinalPrice(Float finalPrice) {
        this.finalPrice = finalPrice;
        return this;
    }

    /**
     * set subOrderPrices
     * @param subOrderPrices 子订单价格信息
     * @return this
     */
    public OrderUpgradeQueryPriceReturnObj withSubOrderPrices(OrderUpgradeQueryPriceSubOrderPrices[] subOrderPrices) {
        this.subOrderPrices = subOrderPrices;
        return this;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Float getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Float finalPrice) {
        this.finalPrice = finalPrice;
    }

    public OrderUpgradeQueryPriceSubOrderPrices[] getSubOrderPrices() {
        return subOrderPrices;
    }

    public void setSubOrderPrices(OrderUpgradeQueryPriceSubOrderPrices[] subOrderPrices) {
        this.subOrderPrices = subOrderPrices;
    }
}
