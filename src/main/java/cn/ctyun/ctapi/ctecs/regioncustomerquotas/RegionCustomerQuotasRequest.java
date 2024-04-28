package cn.ctyun.ctapi.ctecs.regioncustomerquotas;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-根据regionID查询用户配额>
 * Request: RegionCustomerQuotasRequest
 */
public class RegionCustomerQuotasRequest extends CTRequest {
    public RegionCustomerQuotasRequest() {
        super("GET", "application/json", "/v4/region/customerQuotas");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public RegionCustomerQuotasRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }
}
