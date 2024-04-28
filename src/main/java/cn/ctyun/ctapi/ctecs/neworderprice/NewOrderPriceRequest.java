package cn.ctyun.ctapi.ctecs.neworderprice;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-下单询价>
 * Request: NewOrderPriceRequest
 */
public class NewOrderPriceRequest extends CTRequest {
    public NewOrderPriceRequest() {
        super("POST", "application/json", "/v4/new-order/query-price");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public NewOrderPriceRequest withBody(NewOrderPriceRequestBody body) {
        this.body = body;
        return this;
    }
}
