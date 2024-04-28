package cn.ctyun.ctapi.ctecs.ecssnapshotstatus;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照状态>
 * Request: EcsSnapshotStatusRequest
 */
public class EcsSnapshotStatusRequest extends CTRequest {
    public EcsSnapshotStatusRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-status");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsSnapshotStatusRequest withBody(EcsSnapshotStatusRequestBody body) {
        this.body = body;
        return this;
    }
}
