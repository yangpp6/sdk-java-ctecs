package cn.ctyun.ctapi.ctecs.backupcreateinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-备份创建一台云主机>
 * Request: BackupCreateInstanceRequest
 */
public class BackupCreateInstanceRequest extends CTRequest {
    public BackupCreateInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/backup/create-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public BackupCreateInstanceRequest withBody(BackupCreateInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
