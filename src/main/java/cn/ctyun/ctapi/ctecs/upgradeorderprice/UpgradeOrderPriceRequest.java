package cn.ctyun.ctapi.ctecs.upgradeorderprice;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-升级订单询价(根据resourceId查询)>
 * Request: UpgradeOrderPriceRequest
 */
public class UpgradeOrderPriceRequest extends CTRequest {
    public UpgradeOrderPriceRequest() {
        super("POST", "application/json", "/v4/upgrade-order/query-price");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public UpgradeOrderPriceRequest withBody(UpgradeOrderPriceRequestBody body) {
        this.body = body;
        return this;
    }
}
