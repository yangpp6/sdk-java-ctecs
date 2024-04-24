package cn.ctyun.ctapi.ctecs.ecssnapshotlist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照列表>
 * Request: EcsSnapshotListRequest
 */
public class EcsSnapshotListRequest extends CTRequest {
    public EcsSnapshotListRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsSnapshotListRequest withBody(EcsSnapshotListRequestBody body) {
        this.body = body;
        return this;
    }
}
