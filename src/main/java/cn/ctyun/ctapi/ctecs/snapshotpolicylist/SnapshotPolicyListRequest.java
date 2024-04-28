package cn.ctyun.ctapi.ctecs.snapshotpolicylist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照策略列表>
 * Request: SnapshotPolicyListRequest
 */
public class SnapshotPolicyListRequest extends CTRequest {
    public SnapshotPolicyListRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-policy/list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotPolicyListRequest withBody(SnapshotPolicyListRequestBody body) {
        this.body = body;
        return this;
    }
}
