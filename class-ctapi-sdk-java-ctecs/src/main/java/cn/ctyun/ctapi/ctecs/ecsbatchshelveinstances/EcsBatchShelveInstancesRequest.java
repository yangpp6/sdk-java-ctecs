package cn.ctyun.ctapi.ctecs.ecsbatchshelveinstances;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-节省关机多台云主机>
 * Request: EcsBatchShelveInstancesRequest
 */
public class EcsBatchShelveInstancesRequest extends CTRequest {
    public EcsBatchShelveInstancesRequest() {
        super("POST", "application/json", "/v4/ecs/batch-shelve-instances");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsBatchShelveInstancesRequest withBody(EcsBatchShelveInstancesRequestBody body) {
        this.body = body;
        return this;
    }
}
