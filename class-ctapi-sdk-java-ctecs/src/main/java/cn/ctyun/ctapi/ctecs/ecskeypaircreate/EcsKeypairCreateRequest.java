package cn.ctyun.ctapi.ctecs.ecskeypaircreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建一对SSH密钥对>
 * Request: EcsKeypairCreateRequest
 */
public class EcsKeypairCreateRequest extends CTRequest {
    public EcsKeypairCreateRequest() {
        super("POST", "application/json", "/v4/ecs/keypair/create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsKeypairCreateRequest withBody(EcsKeypairCreateRequestBody body) {
        this.body = body;
        return this;
    }
}
