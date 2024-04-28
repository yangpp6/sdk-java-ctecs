package cn.ctyun.ctapi.ctecs.ecsmigratetime;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-获取云主机迁移时间预估>
 * Request: EcsMigrateTimeRequest
 */
public class EcsMigrateTimeRequest extends CTRequest {
    public EcsMigrateTimeRequest() {
        super("POST", "application/json", "/v4/ecs/migrate-time");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsMigrateTimeRequest withBody(EcsMigrateTimeRequestBody body) {
        this.body = body;
        return this;
    }
}
