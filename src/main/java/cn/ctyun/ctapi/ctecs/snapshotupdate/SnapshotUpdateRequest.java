package cn.ctyun.ctapi.ctecs.snapshotupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-更新云主机快照>
 * Request: SnapshotUpdateRequest
 */
public class SnapshotUpdateRequest extends CTRequest {
    public SnapshotUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot/update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotUpdateRequest withBody(SnapshotUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
