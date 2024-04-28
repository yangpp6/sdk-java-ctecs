package cn.ctyun.ctapi.ctecs.ecsbackupdetails;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份详情>
 * Request: EcsBackupDetailsRequest
 */
public class EcsBackupDetailsRequest extends CTRequest {
    public EcsBackupDetailsRequest() {
        super("POST", "application/json", "/v4/ecs/backup-details");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBackupDetailsRequest withBody(EcsBackupDetailsRequestBody body) {
        this.body = body;
        return this;
    }
}
