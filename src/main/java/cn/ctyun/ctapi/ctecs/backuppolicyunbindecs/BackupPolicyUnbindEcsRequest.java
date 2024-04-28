package cn.ctyun.ctapi.ctecs.backuppolicyunbindecs;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-备份策略解绑云主机>
 * Request: BackupPolicyUnbindEcsRequest
 */
public class BackupPolicyUnbindEcsRequest extends CTRequest {
    public BackupPolicyUnbindEcsRequest() {
        super("POST", "application/json", "/v4/ecs/backup-policy/unbind-instances");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BackupPolicyUnbindEcsRequest withBody(BackupPolicyUnbindEcsRequestBody body) {
        this.body = body;
        return this;
    }
}
