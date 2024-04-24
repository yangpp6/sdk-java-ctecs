package cn.ctyun.ctapi.ctecs.ecsbackupusage;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查看云主机备份空间占用大小>
 * Request: EcsBackupUsageRequest
 */
public class EcsBackupUsageRequest extends CTRequest {
    public EcsBackupUsageRequest() {
        super("POST", "application/json", "/v4/ecs/backup-usage");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBackupUsageRequest withBody(EcsBackupUsageRequestBody body) {
        this.body = body;
        return this;
    }
}
