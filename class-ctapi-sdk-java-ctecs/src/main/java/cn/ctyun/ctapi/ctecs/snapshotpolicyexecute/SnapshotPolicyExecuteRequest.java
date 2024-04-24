package cn.ctyun.ctapi.ctecs.snapshotpolicyexecute;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-立即执行云主机快照策略>
 * Request: SnapshotPolicyExecuteRequest
 */
public class SnapshotPolicyExecuteRequest extends CTRequest {
    public SnapshotPolicyExecuteRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-policy/execute");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotPolicyExecuteRequest withBody(SnapshotPolicyExecuteRequestBody body) {
        this.body = body;
        return this;
    }
}
