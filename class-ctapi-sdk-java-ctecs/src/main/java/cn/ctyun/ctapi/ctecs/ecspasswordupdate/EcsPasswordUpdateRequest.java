package cn.ctyun.ctapi.ctecs.ecspasswordupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-更新云主机密码>
 * Request: EcsPasswordUpdateRequest
 */
public class EcsPasswordUpdateRequest extends CTRequest {
    public EcsPasswordUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/password-update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsPasswordUpdateRequest withBody(EcsPasswordUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
