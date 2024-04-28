package cn.ctyun.ctapi.ctecs.backupbatchupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机备份信息>
 * Request: BackupBatchUpdateRequest
 */
public class BackupBatchUpdateRequest extends CTRequest {
    public BackupBatchUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/backup/batch-update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BackupBatchUpdateRequest withBody(BackupBatchUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
