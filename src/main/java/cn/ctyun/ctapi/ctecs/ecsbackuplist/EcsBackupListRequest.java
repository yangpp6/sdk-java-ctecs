package cn.ctyun.ctapi.ctecs.ecsbackuplist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份列表>
 * Request: EcsBackupListRequest
 */
public class EcsBackupListRequest extends CTRequest {
    public EcsBackupListRequest() {
        super("POST", "application/json", "/v4/ecs/backup-list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBackupListRequest withBody(EcsBackupListRequestBody body) {
        this.body = body;
        return this;
    }
}
