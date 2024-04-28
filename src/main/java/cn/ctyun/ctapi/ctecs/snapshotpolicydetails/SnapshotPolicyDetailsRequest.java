package cn.ctyun.ctapi.ctecs.snapshotpolicydetails;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照策略详情>
 * Request: SnapshotPolicyDetailsRequest
 */
public class SnapshotPolicyDetailsRequest extends CTRequest {
    public SnapshotPolicyDetailsRequest() {
        super("GET", "application/json", "/v4/ecs/snapshot-policy/details");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotPolicyDetailsRequest withBody(SnapshotPolicyDetailsRequestBody body) {
        this.body = body;
        return this;
    }
}
