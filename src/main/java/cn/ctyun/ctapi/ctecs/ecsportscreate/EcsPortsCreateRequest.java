package cn.ctyun.ctapi.ctecs.ecsportscreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建弹性网卡>
 * Request: EcsPortsCreateRequest
 */
public class EcsPortsCreateRequest extends CTRequest {
    public EcsPortsCreateRequest() {
        super("POST", "application/json", "/v4/ecs/ports/create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsPortsCreateRequest withBody(EcsPortsCreateRequestBody body) {
        this.body = body;
        return this;
    }
}
