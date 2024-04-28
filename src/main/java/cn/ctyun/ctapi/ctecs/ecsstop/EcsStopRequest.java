package cn.ctyun.ctapi.ctecs.ecsstop;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-关闭一台云主机>
 * Request: EcsStopRequest
 */
public class EcsStopRequest extends CTRequest {
    public EcsStopRequest() {
        super("POST", "application/json", "/v4/ecs/stop");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsStopRequest withBody(EcsStopRequestBody body) {
        this.body = body;
        return this;
    }
}
