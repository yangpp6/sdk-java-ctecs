package cn.ctyun.ctapi.ctecs.snapshotcreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建云主机快照>
 * Request: SnapshotCreateRequest
 */
public class SnapshotCreateRequest extends CTRequest {
    public SnapshotCreateRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot/create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotCreateRequest withBody(SnapshotCreateRequestBody body) {
        this.body = body;
        return this;
    }
}
