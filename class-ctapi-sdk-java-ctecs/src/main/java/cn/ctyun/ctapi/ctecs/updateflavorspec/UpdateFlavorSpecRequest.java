package cn.ctyun.ctapi.ctecs.updateflavorspec;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-更新云主机配置>
 * Request: UpdateFlavorSpecRequest
 */
public class UpdateFlavorSpecRequest extends CTRequest {
    public UpdateFlavorSpecRequest() {
        super("POST", "application/json", "/v4/ecs/update-flavor-spec");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public UpdateFlavorSpecRequest withBody(UpdateFlavorSpecRequestBody body) {
        this.body = body;
        return this;
    }
}
