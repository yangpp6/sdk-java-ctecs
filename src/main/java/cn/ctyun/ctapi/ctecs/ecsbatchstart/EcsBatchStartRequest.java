package cn.ctyun.ctapi.ctecs.ecsbatchstart;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-开启多台云主机>
 * Request: EcsBatchStartRequest
 */
public class EcsBatchStartRequest extends CTRequest {
    public EcsBatchStartRequest() {
        super("POST", "application/json", "/v4/ecs/batch-start");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBatchStartRequest withBody(EcsBatchStartRequestBody body) {
        this.body = body;
        return this;
    }
}
