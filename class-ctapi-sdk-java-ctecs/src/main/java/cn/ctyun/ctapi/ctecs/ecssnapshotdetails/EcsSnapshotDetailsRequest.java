package cn.ctyun.ctapi.ctecs.ecssnapshotdetails;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照详情>
 * Request: EcsSnapshotDetailsRequest
 */
public class EcsSnapshotDetailsRequest extends CTRequest {
    public EcsSnapshotDetailsRequest() {
        super("POST", "application/json", "/v4/ecs/snapshot-details");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsSnapshotDetailsRequest withBody(EcsSnapshotDetailsRequestBody body) {
        this.body = body;
        return this;
    }
}
