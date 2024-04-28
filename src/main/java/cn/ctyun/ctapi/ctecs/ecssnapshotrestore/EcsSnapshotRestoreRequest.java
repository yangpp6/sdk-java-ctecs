package cn.ctyun.ctapi.ctecs.ecssnapshotrestore;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-恢复云主机快照>
 * Request: EcsSnapshotRestoreRequest
 */
public class EcsSnapshotRestoreRequest extends CTRequest {
    public EcsSnapshotRestoreRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-restore");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsSnapshotRestoreRequest withBody(EcsSnapshotRestoreRequestBody body) {
        this.body = body;
        return this;
    }
}
