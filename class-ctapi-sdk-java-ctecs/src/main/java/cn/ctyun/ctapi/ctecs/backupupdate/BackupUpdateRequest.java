package cn.ctyun.ctapi.ctecs.backupupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-更新云主机备份信息>
 * Request: BackupUpdateRequest
 */
public class BackupUpdateRequest extends CTRequest {
    public BackupUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/backup/update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BackupUpdateRequest withBody(BackupUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
