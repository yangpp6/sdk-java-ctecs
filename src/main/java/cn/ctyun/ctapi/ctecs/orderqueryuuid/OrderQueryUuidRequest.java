package cn.ctyun.ctapi.ctecs.orderqueryuuid;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-根据订单号查询uuid>
 * Request: OrderQueryUuidRequest
 */
public class OrderQueryUuidRequest extends CTRequest {
    public OrderQueryUuidRequest() {
        super("GET", "application/json", "/v4/order/queryUuid");
    }

    /**
     * <Query param> set masterOrderId
     * @param masterOrderId 订单id
     * @return this
     */
    public OrderQueryUuidRequest withMasterOrderId(String masterOrderId) {
        queryParam.put("masterOrderId", masterOrderId);
        return this;
    }
}
