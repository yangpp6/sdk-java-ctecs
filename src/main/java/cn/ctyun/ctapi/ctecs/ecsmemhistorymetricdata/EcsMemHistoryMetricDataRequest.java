package cn.ctyun.ctapi.ctecs.ecsmemhistorymetricdata;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询指定时间段内的内存监控数据>
 * Request: EcsMemHistoryMetricDataRequest
 */
public class EcsMemHistoryMetricDataRequest extends CTRequest {
    public EcsMemHistoryMetricDataRequest() {
        super("POST", "application/json", "/v4/ecs/vm-mem-history-metric-data");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsMemHistoryMetricDataRequest withBody(EcsMemHistoryMetricDataRequestBody body) {
        this.body = body;
        return this;
    }
}
