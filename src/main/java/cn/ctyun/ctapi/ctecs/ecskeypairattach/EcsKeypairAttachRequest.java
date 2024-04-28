package cn.ctyun.ctapi.ctecs.ecskeypairattach;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-绑定SSH密钥对到云主机>
 * Request: EcsKeypairAttachRequest
 */
public class EcsKeypairAttachRequest extends CTRequest {
    public EcsKeypairAttachRequest() {
        super("POST", "application/json", "/v4/ecs/keypair/attach");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsKeypairAttachRequest withBody(EcsKeypairAttachRequestBody body) {
        this.body = body;
        return this;
    }
}
