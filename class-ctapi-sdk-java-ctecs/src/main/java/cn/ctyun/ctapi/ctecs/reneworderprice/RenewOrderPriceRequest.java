package cn.ctyun.ctapi.ctecs.reneworderprice;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-续订询价(根据resourceId查询)>
 * Request: RenewOrderPriceRequest
 */
public class RenewOrderPriceRequest extends CTRequest {
    public RenewOrderPriceRequest() {
        super("POST", "application/json", "/v4/renew-order/query-price");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public RenewOrderPriceRequest withBody(RenewOrderPriceRequestBody body) {
        this.body = body;
        return this;
    }
}
