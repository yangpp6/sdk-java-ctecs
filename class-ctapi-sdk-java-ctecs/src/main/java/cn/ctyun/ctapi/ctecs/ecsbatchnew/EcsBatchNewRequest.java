package cn.ctyun.ctapi.ctecs.ecsbatchnew;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-批量创建按量付费或者包年包月云主机>
 * Request: EcsBatchNewRequest
 */
public class EcsBatchNewRequest extends CTRequest {
    public EcsBatchNewRequest() {
        super("POST", "application/json", "/v4/ecs/batch-new");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBatchNewRequest withBody(EcsBatchNewRequestBody body) {
        this.body = body;
        return this;
    }
}
