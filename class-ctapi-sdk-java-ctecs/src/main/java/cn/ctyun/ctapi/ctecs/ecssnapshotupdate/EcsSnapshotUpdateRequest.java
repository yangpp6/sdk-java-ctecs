package cn.ctyun.ctapi.ctecs.ecssnapshotupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-更新云主机快照信息>
 * Request: EcsSnapshotUpdateRequest
 */
public class EcsSnapshotUpdateRequest extends CTRequest {
    public EcsSnapshotUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsSnapshotUpdateRequest withBody(EcsSnapshotUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
