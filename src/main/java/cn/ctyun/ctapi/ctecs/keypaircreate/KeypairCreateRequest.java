package cn.ctyun.ctapi.ctecs.keypaircreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建密钥对>
 * Request: KeypairCreateRequest
 */
public class KeypairCreateRequest extends CTRequest {
    public KeypairCreateRequest() {
        super("POST", "application/json", "/v4/ecs/keypair/create-keypair");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public KeypairCreateRequest withBody(KeypairCreateRequestBody body) {
        this.body = body;
        return this;
    }
}
