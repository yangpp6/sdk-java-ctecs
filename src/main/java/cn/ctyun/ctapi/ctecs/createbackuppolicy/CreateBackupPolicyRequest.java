package cn.ctyun.ctapi.ctecs.createbackuppolicy;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份策略>
 * Request: CreateBackupPolicyRequest
 */
public class CreateBackupPolicyRequest extends CTRequest {
    public CreateBackupPolicyRequest() {
        super("POST", "application/json", "/v4/ecs/backup-policy/create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public CreateBackupPolicyRequest withBody(CreateBackupPolicyRequestBody body) {
        this.body = body;
        return this;
    }
}
