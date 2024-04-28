package cn.ctyun.ctapi.ctecs.updateinstancespec;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-更新云主机网络或者配置>
 * Request: UpdateInstanceSpecRequest
 */
public class UpdateInstanceSpecRequest extends CTRequest {
    public UpdateInstanceSpecRequest() {
        super("POST", "application/json", "/v4/ecs/update-instance-spec");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public UpdateInstanceSpecRequest withBody(UpdateInstanceSpecRequestBody body) {
        this.body = body;
        return this;
    }
}
