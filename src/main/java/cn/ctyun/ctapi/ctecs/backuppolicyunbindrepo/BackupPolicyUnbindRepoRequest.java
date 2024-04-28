package cn.ctyun.ctapi.ctecs.backuppolicyunbindrepo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机备份策略解绑存储库>
 * Request: BackupPolicyUnbindRepoRequest
 */
public class BackupPolicyUnbindRepoRequest extends CTRequest {
    public BackupPolicyUnbindRepoRequest() {
        super("POST", "application/json", "/v4/ecs/backup-policy/unbind-repo");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BackupPolicyUnbindRepoRequest withBody(BackupPolicyUnbindRepoRequestBody body) {
        this.body = body;
        return this;
    }
}
