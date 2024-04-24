package cn.ctyun.ctapi.ctecs.snapshotpolicytasklist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照任务列表>
 * Request: SnapshotPolicyTaskListRequest
 */
public class SnapshotPolicyTaskListRequest extends CTRequest {
    public SnapshotPolicyTaskListRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-policy/task-list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotPolicyTaskListRequest withBody(SnapshotPolicyTaskListRequestBody body) {
        this.body = body;
        return this;
    }
}
