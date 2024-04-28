package cn.ctyun.ctapi.ctecs.updatedeletionprotection;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <更新云主机实例删除保护信息>
 * Request: UpdateDeletionProtectionRequest
 */
public class UpdateDeletionProtectionRequest extends CTRequest {
    public UpdateDeletionProtectionRequest() {
        super("POST", "application/json", "/v4/ecs/update-deletion-protection");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public UpdateDeletionProtectionRequest withBody(UpdateDeletionProtectionRequestBody body) {
        this.body = body;
        return this;
    }
}
