package cn.ctyun.ctapi.ctecs.ecsnetworkhistorymetricdata;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询指定时间段内的网卡监控数据>
 * Request: EcsNetworkHistoryMetricDataRequest
 */
public class EcsNetworkHistoryMetricDataRequest extends CTRequest {
    public EcsNetworkHistoryMetricDataRequest() {
        super("POST", "application/json", "/v4/ecs/vm-network-history-metric-data");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsNetworkHistoryMetricDataRequest withBody(EcsNetworkHistoryMetricDataRequestBody body) {
        this.body = body;
        return this;
    }
}
