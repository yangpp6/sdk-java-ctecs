package cn.ctyun.ctapi.ctecs.regionzones;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-资源池可用区查询>
 * Request: RegionZonesRequest
 */
public class RegionZonesRequest extends CTRequest {
    public RegionZonesRequest() {
        super("GET", "application/json", "/v4/region/get-zones");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public RegionZonesRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }
}
