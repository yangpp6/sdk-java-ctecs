package cn.ctyun.ctapi.ctecs.ecsbackupdelete;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-删除云主机备份>
 * Request: EcsBackupDeleteRequest
 */
public class EcsBackupDeleteRequest extends CTRequest {
    public EcsBackupDeleteRequest() {
        super("POST", "application/json", "/v4/ecs/backup-delete");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBackupDeleteRequest withBody(EcsBackupDeleteRequestBody body) {
        this.body = body;
        return this;
    }
}
