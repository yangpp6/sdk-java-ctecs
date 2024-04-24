package cn.ctyun.ctapi.ctecs.snapshotcount;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-获取云主机快照数量>
 * Request: SnapshotCountRequest
 */
public class SnapshotCountRequest extends CTRequest {
    public SnapshotCountRequest() {
        super("GET", "application/json", "/v4/ecs/snapshot/count");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotCountRequest withBody(SnapshotCountRequestBody body) {
        this.body = body;
        return this;
    }
}
