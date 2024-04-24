package cn.ctyun.ctapi.ctecs.ecsbackupbatchupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机备份信息>
 * Request: EcsBackupBatchUpdateRequest
 */
public class EcsBackupBatchUpdateRequest extends CTRequest {
    public EcsBackupBatchUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/backup-batch-update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBackupBatchUpdateRequest withBody(EcsBackupBatchUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
