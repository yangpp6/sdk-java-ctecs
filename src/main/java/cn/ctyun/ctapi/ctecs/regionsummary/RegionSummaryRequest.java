package cn.ctyun.ctapi.ctecs.regionsummary;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-资源池概况信息查询>
 * Request: RegionSummaryRequest
 */
public class RegionSummaryRequest extends CTRequest {
    public RegionSummaryRequest() {
        super("GET", "application/json", "/v4/region/get-summary");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public RegionSummaryRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }
}
