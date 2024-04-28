package cn.ctyun.ctapi.ctecs.ecsbatchreboot;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-重启多台云主机>
 * Request: EcsBatchRebootRequest
 */
public class EcsBatchRebootRequest extends CTRequest {
    public EcsBatchRebootRequest() {
        super("POST", "application/json", "/v4/ecs/batch-reboot");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBatchRebootRequest withBody(EcsBatchRebootRequestBody body) {
        this.body = body;
        return this;
    }
}
