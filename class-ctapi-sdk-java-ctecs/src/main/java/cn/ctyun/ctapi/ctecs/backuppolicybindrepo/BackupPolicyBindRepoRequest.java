package cn.ctyun.ctapi.ctecs.backuppolicybindrepo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机备份策略绑定存储库>
 * Request: BackupPolicyBindRepoRequest
 */
public class BackupPolicyBindRepoRequest extends CTRequest {
    public BackupPolicyBindRepoRequest() {
        super("POST", "application/json", "/v4/ecs/backup-policy/bind-repo");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BackupPolicyBindRepoRequest withBody(BackupPolicyBindRepoRequestBody body) {
        this.body = body;
        return this;
    }
}
