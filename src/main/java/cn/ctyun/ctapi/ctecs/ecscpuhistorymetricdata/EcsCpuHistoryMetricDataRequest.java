package cn.ctyun.ctapi.ctecs.ecscpuhistorymetricdata;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询指定时间段内的CPU监控数据>
 * Request: EcsCpuHistoryMetricDataRequest
 */
public class EcsCpuHistoryMetricDataRequest extends CTRequest {
    public EcsCpuHistoryMetricDataRequest() {
        super("POST", "application/json", "/v4/ecs/vm-cpu-history-metric-data");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsCpuHistoryMetricDataRequest withBody(EcsCpuHistoryMetricDataRequestBody body) {
        this.body = body;
        return this;
    }
}
