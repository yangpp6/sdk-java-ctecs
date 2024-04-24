package cn.ctyun.ctapi.ctecs.orderupgradequeryprice;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-升级订单询价(根据资源uuid查询)>
 * Request: OrderUpgradeQueryPriceRequest
 */
public class OrderUpgradeQueryPriceRequest extends CTRequest {
    public OrderUpgradeQueryPriceRequest() {
        super("POST", "application/json", "/v4/order/upgrade-query-price");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public OrderUpgradeQueryPriceRequest withBody(OrderUpgradeQueryPriceRequestBody body) {
        this.body = body;
        return this;
    }
}
