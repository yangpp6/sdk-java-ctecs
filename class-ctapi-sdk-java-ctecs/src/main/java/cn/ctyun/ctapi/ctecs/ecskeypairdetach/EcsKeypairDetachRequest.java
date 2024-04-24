package cn.ctyun.ctapi.ctecs.ecskeypairdetach;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-为Linux云主机解绑SSH密钥对>
 * Request: EcsKeypairDetachRequest
 */
public class EcsKeypairDetachRequest extends CTRequest {
    public EcsKeypairDetachRequest() {
        super("POST", "application/json", "/v4/ecs/keypair/detach");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsKeypairDetachRequest withBody(EcsKeypairDetachRequestBody body) {
        this.body = body;
        return this;
    }
}
