package cn.ctyun.ctapi.ctecs.updatebackuppolicy;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-修改启用停用云主机备份策略>
 * Request: UpdateBackupPolicyRequest
 */
public class UpdateBackupPolicyRequest extends CTRequest {
    public UpdateBackupPolicyRequest() {
        super("POST", "application/json", "/v4/ecs/backup-policy/update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public UpdateBackupPolicyRequest withBody(UpdateBackupPolicyRequestBody body) {
        this.body = body;
        return this;
    }
}
