package cn.ctyun.ctapi.ctecs.snapshotpolicycreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建云主机快照策略>
 * Request: SnapshotPolicyCreateRequest
 */
public class SnapshotPolicyCreateRequest extends CTRequest {
    public SnapshotPolicyCreateRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-policy/create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotPolicyCreateRequest withBody(SnapshotPolicyCreateRequestBody body) {
        this.body = body;
        return this;
    }
}
