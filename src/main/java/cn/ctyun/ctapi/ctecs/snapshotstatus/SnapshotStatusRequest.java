package cn.ctyun.ctapi.ctecs.snapshotstatus;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-获取云主机快照状态>
 * Request: SnapshotStatusRequest
 */
public class SnapshotStatusRequest extends CTRequest {
    public SnapshotStatusRequest() {
        super("GET", "application/json", "/v4/ecs/snapshot/status");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotStatusRequest withBody(SnapshotStatusRequestBody body) {
        this.body = body;
        return this;
    }
}
