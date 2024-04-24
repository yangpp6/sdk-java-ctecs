package cn.ctyun.ctapi.ctecs.snapshotpolicyunbindinstances;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-快照策略解绑云主机>
 * Request: SnapshotPolicyUnbindInstancesRequest
 */
public class SnapshotPolicyUnbindInstancesRequest extends CTRequest {
    public SnapshotPolicyUnbindInstancesRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-policy/unbind-instances");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotPolicyUnbindInstancesRequest withBody(SnapshotPolicyUnbindInstancesRequestBody body) {
        this.body = body;
        return this;
    }
}
