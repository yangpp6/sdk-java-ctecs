package cn.ctyun.ctapi.ctecs.ecsbatchdelete;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-批量释放云主机>
 * Request: EcsBatchDeleteRequest
 */
public class EcsBatchDeleteRequest extends CTRequest {
    public EcsBatchDeleteRequest() {
        super("POST", "application/json", "/v4/ecs/batch-delete");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBatchDeleteRequest withBody(EcsBatchDeleteRequestBody body) {
        this.body = body;
        return this;
    }
}
