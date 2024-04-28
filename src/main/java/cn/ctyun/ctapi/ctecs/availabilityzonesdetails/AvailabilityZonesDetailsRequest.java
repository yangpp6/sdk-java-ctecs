package cn.ctyun.ctapi.ctecs.availabilityzonesdetails;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询账户资源池中可用区信息>
 * Request: AvailabilityZonesDetailsRequest
 */
public class AvailabilityZonesDetailsRequest extends CTRequest {
    public AvailabilityZonesDetailsRequest() {
        super("GET", "application/json", "/v4/ecs/availability-zones/details");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public AvailabilityZonesDetailsRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }
}
