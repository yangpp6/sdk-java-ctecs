package cn.ctyun.ctapi.ctecs.regionproducts;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-资源池产品信息查询>
 * Request: RegionProductsRequest
 */
public class RegionProductsRequest extends CTRequest {
    public RegionProductsRequest() {
        super("GET", "application/json", "/v4/region/get-products");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public RegionProductsRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }
}
