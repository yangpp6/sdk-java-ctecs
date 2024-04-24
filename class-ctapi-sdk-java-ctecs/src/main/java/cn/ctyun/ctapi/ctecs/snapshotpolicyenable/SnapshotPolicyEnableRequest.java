package cn.ctyun.ctapi.ctecs.snapshotpolicyenable;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-启用云主机快照策略>
 * Request: SnapshotPolicyEnableRequest
 */
public class SnapshotPolicyEnableRequest extends CTRequest {
    public SnapshotPolicyEnableRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-policy/enable");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotPolicyEnableRequest withBody(SnapshotPolicyEnableRequestBody body) {
        this.body = body;
        return this;
    }
}
