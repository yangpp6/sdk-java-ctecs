package cn.ctyun.ctapi.ctecs.keypairattachinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-密钥对绑定云主机>
 * Request: KeypairAttachInstanceRequest
 */
public class KeypairAttachInstanceRequest extends CTRequest {
    public KeypairAttachInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/keypair/attach-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public KeypairAttachInstanceRequest withBody(KeypairAttachInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
