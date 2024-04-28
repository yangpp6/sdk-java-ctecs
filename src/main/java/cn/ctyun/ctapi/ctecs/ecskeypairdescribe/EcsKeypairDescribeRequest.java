package cn.ctyun.ctapi.ctecs.ecskeypairdescribe;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个密钥对>
 * Request: EcsKeypairDescribeRequest
 */
public class EcsKeypairDescribeRequest extends CTRequest {
    public EcsKeypairDescribeRequest() {
        super("POST", "application/json", "/v4/ecs/keypair/describe");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsKeypairDescribeRequest withBody(EcsKeypairDescribeRequestBody body) {
        this.body = body;
        return this;
    }
}
