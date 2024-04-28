package cn.ctyun.ctapi.ctecs.ecssnapshotdelete;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-删除云主机快照>
 * Request: EcsSnapshotDeleteRequest
 */
public class EcsSnapshotDeleteRequest extends CTRequest {
    public EcsSnapshotDeleteRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-delete");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsSnapshotDeleteRequest withBody(EcsSnapshotDeleteRequestBody body) {
        this.body = body;
        return this;
    }
}
