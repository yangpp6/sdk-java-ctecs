package cn.ctyun.ctapi.ctecs.cloneinstance;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-克隆云主机>
 * Request: CloneInstanceRequest
 */
public class CloneInstanceRequest extends CTRequest {
    public CloneInstanceRequest() {
        super("POST", "application/json", "/v4/ecs/clone-instance");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public CloneInstanceRequest withBody(CloneInstanceRequestBody body) {
        this.body = body;
        return this;
    }
}
