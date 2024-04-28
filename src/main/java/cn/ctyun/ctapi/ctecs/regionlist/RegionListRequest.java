package cn.ctyun.ctapi.ctecs.regionlist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-资源池列表查询>
 * Request: RegionListRequest
 */
public class RegionListRequest extends CTRequest {
    public RegionListRequest() {
        super("GET", "application/json", "/v4/region/list-regions");
    }

    /**
     * <Query param> set regionName
     * @param regionName 资源池名称
     * @return this
     */
    public RegionListRequest withRegionName(String regionName) {
        queryParam.put("regionName", regionName);
        return this;
    }
}
