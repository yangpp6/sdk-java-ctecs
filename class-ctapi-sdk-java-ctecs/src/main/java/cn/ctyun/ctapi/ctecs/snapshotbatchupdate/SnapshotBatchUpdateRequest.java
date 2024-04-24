package cn.ctyun.ctapi.ctecs.snapshotbatchupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机快照>
 * Request: SnapshotBatchUpdateRequest
 */
public class SnapshotBatchUpdateRequest extends CTRequest {
    public SnapshotBatchUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot/batch-update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotBatchUpdateRequest withBody(SnapshotBatchUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
