package cn.ctyun.ctapi.ctecs.keypairdetails;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-获取密钥对详情>
 * Request: KeypairDetailsRequest
 */
public class KeypairDetailsRequest extends CTRequest {
    public KeypairDetailsRequest() {
        super("POST", "application/json", "/v4/ecs/keypair/details");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public KeypairDetailsRequest withBody(KeypairDetailsRequestBody body) {
        this.body = body;
        return this;
    }
}
