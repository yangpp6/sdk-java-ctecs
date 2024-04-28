package cn.ctyun.ctapi.ctecs.ecsbackupcreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份>
 * Request: EcsBackupCreateRequest
 */
public class EcsBackupCreateRequest extends CTRequest {
    public EcsBackupCreateRequest() {
        super("POST", "application/json", "/v4/ecs/backup-create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBackupCreateRequest withBody(EcsBackupCreateRequestBody body) {
        this.body = body;
        return this;
    }
}
