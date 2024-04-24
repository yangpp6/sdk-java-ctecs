package cn.ctyun.ctapi.ctecs.ecsbatchrebuild;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-重装多台云主机>
 * Request: EcsBatchRebuildRequest
 */
public class EcsBatchRebuildRequest extends CTRequest {
    public EcsBatchRebuildRequest() {
        super("POST", "application/json", "/v4/ecs/batch-rebuild");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBatchRebuildRequest withBody(EcsBatchRebuildRequestBody body) {
        this.body = body;
        return this;
    }
}
