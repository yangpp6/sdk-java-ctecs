package cn.ctyun.ctapi.ctecs.deleterepo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-退订云主机备份存储库>
 * Request: DeleteRepoRequest
 */
public class DeleteRepoRequest extends CTRequest {
    public DeleteRepoRequest() {
        super("POST", "application/json", "/v4/ecs/backup-repo/delete");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public DeleteRepoRequest withBody(DeleteRepoRequestBody body) {
        this.body = body;
        return this;
    }
}
