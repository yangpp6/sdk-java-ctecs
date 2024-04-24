package cn.ctyun.ctapi.ctecs.createrepo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份存储库>
 * Request: CreateRepoRequest
 */
public class CreateRepoRequest extends CTRequest {
    public CreateRepoRequest() {
        super("POST", "application/json", "/v4/ecs/backup-repo/create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public CreateRepoRequest withBody(CreateRepoRequestBody body) {
        this.body = body;
        return this;
    }
}
