package cn.ctyun.ctapi.ctecs.getorderuuid;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-根据masterOrderId查询资源uuid>
 * Request: GetOrderUuidRequest
 */
public class GetOrderUuidRequest extends CTRequest {
    public GetOrderUuidRequest() {
        super("GET", "application/json", "/v4/order/query-uuid");
    }

    /**
     * <Query param> set masterOrderId
     * @param masterOrderId 订单id
     * @return this
     */
    public GetOrderUuidRequest withMasterOrderId(String masterOrderId) {
        queryParam.put("masterOrderId", masterOrderId);
        return this;
    }
}
