package cn.ctyun.ctapi.ctecs.instancesnapshotlist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-获取云主机快照列表>
 * Request: InstanceSnapshotListRequest
 */
public class InstanceSnapshotListRequest extends CTRequest {
    public InstanceSnapshotListRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot/list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public InstanceSnapshotListRequest withBody(InstanceSnapshotListRequestBody body) {
        this.body = body;
        return this;
    }
}
