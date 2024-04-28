package cn.ctyun.ctapi.ctecs.backupcreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份>
 * Request: BackupCreateRequest
 */
public class BackupCreateRequest extends CTRequest {
    public BackupCreateRequest() {
        super("POST", "application/json", "/v4/ecs/backup/create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BackupCreateRequest withBody(BackupCreateRequestBody body) {
        this.body = body;
        return this;
    }
}
