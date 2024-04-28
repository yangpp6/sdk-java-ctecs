package cn.ctyun.ctapi.ctecs.ecsbackupstatus;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份状态>
 * Request: EcsBackupStatusRequest
 */
public class EcsBackupStatusRequest extends CTRequest {
    public EcsBackupStatusRequest() {
        super("POST", "application/json", "/v4/ecs/backup-status");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBackupStatusRequest withBody(EcsBackupStatusRequestBody body) {
        this.body = body;
        return this;
    }
}
