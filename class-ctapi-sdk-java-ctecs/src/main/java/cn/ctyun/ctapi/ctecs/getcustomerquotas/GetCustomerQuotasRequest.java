package cn.ctyun.ctapi.ctecs.getcustomerquotas;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-用户配额查询>
 * Request: GetCustomerQuotasRequest
 */
public class GetCustomerQuotasRequest extends CTRequest {
    public GetCustomerQuotasRequest() {
        super("GET", "application/json", "/v4/region/customer-quotas");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public GetCustomerQuotasRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }
}
