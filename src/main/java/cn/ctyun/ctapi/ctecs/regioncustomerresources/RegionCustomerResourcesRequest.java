package cn.ctyun.ctapi.ctecs.regioncustomerresources;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-根据regionID查询用户资源>
 * Request: RegionCustomerResourcesRequest
 */
public class RegionCustomerResourcesRequest extends CTRequest {
    public RegionCustomerResourcesRequest() {
        super("GET", "application/json", "/v4/region/customerResources");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public RegionCustomerResourcesRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }
}
