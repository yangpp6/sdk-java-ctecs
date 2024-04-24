package cn.ctyun.ctapi.ctecs.orderrenewqueryprice;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-续订单询价(根据资源uuid查询)>
 * Entity: OrderRenewQueryPriceReturnObj
 */
public class OrderRenewQueryPriceReturnObj {
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
    private OrderRenewQueryPriceSubOrderPrices[] subOrderPrices;

    /**
     * set totalPrice
     * @param totalPrice 总价格
     * @return this
     */
    public OrderRenewQueryPriceReturnObj withTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     * set finalPrice
     * @param finalPrice 最终价格
     * @return this
     */
    public OrderRenewQueryPriceReturnObj withFinalPrice(Float finalPrice) {
        this.finalPrice = finalPrice;
        return this;
    }

    /**
     * set subOrderPrices
     * @param subOrderPrices 子订单价格信息
     * @return this
     */
    public OrderRenewQueryPriceReturnObj withSubOrderPrices(OrderRenewQueryPriceSubOrderPrices[] subOrderPrices) {
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

    public OrderRenewQueryPriceSubOrderPrices[] getSubOrderPrices() {
        return subOrderPrices;
    }

    public void setSubOrderPrices(OrderRenewQueryPriceSubOrderPrices[] subOrderPrices) {
        this.subOrderPrices = subOrderPrices;
    }
}
