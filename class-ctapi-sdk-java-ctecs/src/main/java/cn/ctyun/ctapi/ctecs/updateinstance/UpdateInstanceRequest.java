package cn.ctyun.ctapi.ctecs.updateinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-更新云主机>
 * Request: UpdateInstanceRequest
 */
public class UpdateInstanceRequest extends CTRequest {
    public UpdateInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/update-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public UpdateInstanceRequest withBody(UpdateInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
