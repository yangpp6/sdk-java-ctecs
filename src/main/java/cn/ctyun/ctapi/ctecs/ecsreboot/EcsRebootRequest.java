package cn.ctyun.ctapi.ctecs.ecsreboot;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-重启一台云主机>
 * Request: EcsRebootRequest
 */
public class EcsRebootRequest extends CTRequest {
    public EcsRebootRequest() {
        super("POST", "application/json", "/v4/ecs/reboot");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsRebootRequest withBody(EcsRebootRequestBody body) {
        this.body = body;
        return this;
    }
}
