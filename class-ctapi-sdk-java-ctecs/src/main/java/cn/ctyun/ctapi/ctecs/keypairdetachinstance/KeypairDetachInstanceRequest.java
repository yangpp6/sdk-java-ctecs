package cn.ctyun.ctapi.ctecs.keypairdetachinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-密钥对解绑云主机>
 * Request: KeypairDetachInstanceRequest
 */
public class KeypairDetachInstanceRequest extends CTRequest {
    public KeypairDetachInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/keypair/detach-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public KeypairDetachInstanceRequest withBody(KeypairDetachInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
