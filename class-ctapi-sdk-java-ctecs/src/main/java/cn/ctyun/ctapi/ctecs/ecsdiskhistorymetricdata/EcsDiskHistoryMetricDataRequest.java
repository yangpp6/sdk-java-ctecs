package cn.ctyun.ctapi.ctecs.ecsdiskhistorymetricdata;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询指定时间段内的磁盘监控数据>
 * Request: EcsDiskHistoryMetricDataRequest
 */
public class EcsDiskHistoryMetricDataRequest extends CTRequest {
    public EcsDiskHistoryMetricDataRequest() {
        super("POST", "application/json", "/v4/ecs/vm-disk-history-metric-data");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsDiskHistoryMetricDataRequest withBody(EcsDiskHistoryMetricDataRequestBody body) {
        this.body = body;
        return this;
    }
}
