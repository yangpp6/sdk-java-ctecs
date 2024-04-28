package cn.ctyun.ctapi.ctecs.ecsbatchstop;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-关闭多台云主机>
 * Request: EcsBatchStopRequest
 */
public class EcsBatchStopRequest extends CTRequest {
    public EcsBatchStopRequest() {
        super("POST", "application/json", "/v4/ecs/batch-stop");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBatchStopRequest withBody(EcsBatchStopRequestBody body) {
        this.body = body;
        return this;
    }
}
