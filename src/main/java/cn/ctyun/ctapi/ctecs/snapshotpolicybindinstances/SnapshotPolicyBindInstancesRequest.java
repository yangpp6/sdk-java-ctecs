package cn.ctyun.ctapi.ctecs.snapshotpolicybindinstances;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-快照策略绑定云主机>
 * Request: SnapshotPolicyBindInstancesRequest
 */
public class SnapshotPolicyBindInstancesRequest extends CTRequest {
    public SnapshotPolicyBindInstancesRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-policy/bind-instances");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotPolicyBindInstancesRequest withBody(SnapshotPolicyBindInstancesRequestBody body) {
        this.body = body;
        return this;
    }
}
