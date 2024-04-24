package cn.ctyun.ctapi.ctecs.ecsnetworklatestmetricdata;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机的网卡实时监控数据>
 * Request: EcsNetworkLatestMetricDataRequest
 */
public class EcsNetworkLatestMetricDataRequest extends CTRequest {
    public EcsNetworkLatestMetricDataRequest() {
        super("POST", "application/json", "/v4/ecs/vm-network-latest-metric-data");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsNetworkLatestMetricDataRequest withBody(EcsNetworkLatestMetricDataRequestBody body) {
        this.body = body;
        return this;
    }
}
