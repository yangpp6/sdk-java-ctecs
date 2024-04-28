package cn.ctyun.ctapi.ctecs.getcustomerresources;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-用户已有资源查询>
 * Request: GetCustomerResourcesRequest
 */
public class GetCustomerResourcesRequest extends CTRequest {
    public GetCustomerResourcesRequest() {
        super("GET", "application/json", "/v4/region/customer-resources");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public GetCustomerResourcesRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }
}
