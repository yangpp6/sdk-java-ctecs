package cn.ctyun.ctapi.ctecs.upgraderepo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-扩容云主机备份存储库>
 * Request: UpgradeRepoRequest
 */
public class UpgradeRepoRequest extends CTRequest {
    public UpgradeRepoRequest() {
        super("POST", "application/json", "/v4/ecs/backup-repo/upgrade");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public UpgradeRepoRequest withBody(UpgradeRepoRequestBody body) {
        this.body = body;
        return this;
    }
}
