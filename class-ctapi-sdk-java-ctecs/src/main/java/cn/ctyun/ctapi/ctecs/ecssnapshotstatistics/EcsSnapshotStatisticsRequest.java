package cn.ctyun.ctapi.ctecs.ecssnapshotstatistics;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <云主机快照个数统计>
 * Request: EcsSnapshotStatisticsRequest
 */
public class EcsSnapshotStatisticsRequest extends CTRequest {
    public EcsSnapshotStatisticsRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot/statistics");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsSnapshotStatisticsRequest withBody(EcsSnapshotStatisticsRequestBody body) {
        this.body = body;
        return this;
    }
}
