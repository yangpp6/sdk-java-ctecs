package cn.ctyun.ctapi.ctecs.ecsquerysnapshot;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机快照个数统计>
 * Request: EcsQuerySnapshotRequest
 */
public class EcsQuerySnapshotRequest extends CTRequest {
    public EcsQuerySnapshotRequest() {
        super("POST", "application/json", "/v4/ecs/query_vm_snapshot");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsQuerySnapshotRequest withBody(EcsQuerySnapshotRequestBody body) {
        this.body = body;
        return this;
    }
}
