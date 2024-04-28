package cn.ctyun.ctapi.ctecs.ecsbackup;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机立即备份>
 * Request: EcsBackupRequest
 */
public class EcsBackupRequest extends CTRequest {
    public EcsBackupRequest() {
        super("POST", "application/json", "/v4/ecs/backup-policy/backup-instances");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBackupRequest withBody(EcsBackupRequestBody body) {
        this.body = body;
        return this;
    }
}
