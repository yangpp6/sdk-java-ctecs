package cn.ctyun.ctapi.ctecs.ordernewqueryprice;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-新订单询价>
 * Request: OrderNewQueryPriceRequest
 */
public class OrderNewQueryPriceRequest extends CTRequest {
    public OrderNewQueryPriceRequest() {
        super("POST", "application/json", "/v4/order/new-query-price");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public OrderNewQueryPriceRequest withBody(OrderNewQueryPriceRequestBody body) {
        this.body = body;
        return this;
    }
}
