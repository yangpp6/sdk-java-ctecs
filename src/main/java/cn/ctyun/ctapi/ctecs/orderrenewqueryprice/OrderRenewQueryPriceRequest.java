package cn.ctyun.ctapi.ctecs.orderrenewqueryprice;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-续订单询价(根据资源uuid查询)>
 * Request: OrderRenewQueryPriceRequest
 */
public class OrderRenewQueryPriceRequest extends CTRequest {
    public OrderRenewQueryPriceRequest() {
        super("POST", "application/json", "/v4/order/renew-query-price");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public OrderRenewQueryPriceRequest withBody(OrderRenewQueryPriceRequestBody body) {
        this.body = body;
        return this;
    }
}
