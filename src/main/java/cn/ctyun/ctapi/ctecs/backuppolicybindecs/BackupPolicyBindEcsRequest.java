package cn.ctyun.ctapi.ctecs.backuppolicybindecs;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-备份策略绑定云主机>
 * Request: BackupPolicyBindEcsRequest
 */
public class BackupPolicyBindEcsRequest extends CTRequest {
    public BackupPolicyBindEcsRequest() {
        super("POST", "application/json", "/v4/ecs/backup-policy/bind-instances");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BackupPolicyBindEcsRequest withBody(BackupPolicyBindEcsRequestBody body) {
        this.body = body;
        return this;
    }
}
