package cn.ctyun.ctapi.ctecs.ecsorderqueryuuid;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-根据masterOrderID查询云主机ID>
 * Request: EcsOrderQueryUuidRequest
 */
public class EcsOrderQueryUuidRequest extends CTRequest {
    public EcsOrderQueryUuidRequest() {
        super("GET", "application/json", "/v4/ecs/order/query-uuid");
    }

    /**
     * <Query param> set masterOrderID
     * @param masterOrderID 订单ID
     * @return this
     */
    public EcsOrderQueryUuidRequest withMasterOrderID(String masterOrderID) {
        queryParam.put("masterOrderID", masterOrderID);
        return this;
    }
}
