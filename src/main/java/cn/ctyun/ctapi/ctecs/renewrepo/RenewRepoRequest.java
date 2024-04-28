package cn.ctyun.ctapi.ctecs.renewrepo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-续订云主机备份存储库>
 * Request: RenewRepoRequest
 */
public class RenewRepoRequest extends CTRequest {
    public RenewRepoRequest() {
        super("POST", "application/json", "/v4/ecs/backup-repo/renew");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public RenewRepoRequest withBody(RenewRepoRequestBody body) {
        this.body = body;
        return this;
    }
}
