package cn.ctyun.ctapi.ctecs.ecsshelveinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-节省关机一台云主机>
 * Request: EcsShelveInstanceRequest
 */
public class EcsShelveInstanceRequest extends CTRequest {
    public EcsShelveInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/shelve-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsShelveInstanceRequest withBody(EcsShelveInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
