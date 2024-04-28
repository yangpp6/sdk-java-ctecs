package cn.ctyun.ctapi.ctecs.snapshotpolicydisable;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-停用云主机快照策略>
 * Request: SnapshotPolicyDisableRequest
 */
public class SnapshotPolicyDisableRequest extends CTRequest {
    public SnapshotPolicyDisableRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-policy/disable");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotPolicyDisableRequest withBody(SnapshotPolicyDisableRequestBody body) {
        this.body = body;
        return this;
    }
}
