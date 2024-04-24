package cn.ctyun.ctapi.ctecs.snapshotpolicyinstancelist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询快照策略绑定云主机列表>
 * Request: SnapshotPolicyInstanceListRequest
 */
public class SnapshotPolicyInstanceListRequest extends CTRequest {
    public SnapshotPolicyInstanceListRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-policy/instance-list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotPolicyInstanceListRequest withBody(SnapshotPolicyInstanceListRequestBody body) {
        this.body = body;
        return this;
    }
}
