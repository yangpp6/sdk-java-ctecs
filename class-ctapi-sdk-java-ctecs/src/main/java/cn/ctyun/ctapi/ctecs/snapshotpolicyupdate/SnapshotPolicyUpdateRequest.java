package cn.ctyun.ctapi.ctecs.snapshotpolicyupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-修改云主机快照策略>
 * Request: SnapshotPolicyUpdateRequest
 */
public class SnapshotPolicyUpdateRequest extends CTRequest {
    public SnapshotPolicyUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-policy/update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotPolicyUpdateRequest withBody(SnapshotPolicyUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
