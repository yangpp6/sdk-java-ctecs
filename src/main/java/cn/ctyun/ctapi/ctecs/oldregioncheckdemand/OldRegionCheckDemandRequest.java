package cn.ctyun.ctapi.ctecs.oldregioncheckdemand;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-资源池产品可售查询>
 * Request: OldRegionCheckDemandRequest
 */
public class OldRegionCheckDemandRequest extends CTRequest {
    public OldRegionCheckDemandRequest() {
        super("POST", "application/json", "/v4/region/check-demand");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public OldRegionCheckDemandRequest withBody(OldRegionCheckDemandRequestBody body) {
        this.body = body;
        return this;
    }
}
