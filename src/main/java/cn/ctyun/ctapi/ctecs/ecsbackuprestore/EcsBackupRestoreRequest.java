package cn.ctyun.ctapi.ctecs.ecsbackuprestore;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-恢复云主机备份>
 * Request: EcsBackupRestoreRequest
 */
public class EcsBackupRestoreRequest extends CTRequest {
    public EcsBackupRestoreRequest() {
        super("POST", "application/json", "/v4/ecs/backup-restore");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBackupRestoreRequest withBody(EcsBackupRestoreRequestBody body) {
        this.body = body;
        return this;
    }
}
