package cn.ctyun.ctapi.ctecs.snapshotcreateinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-快照创建一台云主机>
 * Request: SnapshotCreateInstanceRequest
 */
public class SnapshotCreateInstanceRequest extends CTRequest {
    public SnapshotCreateInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot/create-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public SnapshotCreateInstanceRequest withBody(SnapshotCreateInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
