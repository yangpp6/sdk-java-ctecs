package cn.ctyun.ctapi.ctecs.ecsbackupupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-更新云主机备份信息>
 * Request: EcsBackupUpdateRequest
 */
public class EcsBackupUpdateRequest extends CTRequest {
    public EcsBackupUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/backup-update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBackupUpdateRequest withBody(EcsBackupUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
