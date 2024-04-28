package cn.ctyun.ctapi.ctecs.ecsmaintainstatus;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-获取云主机维护属性>
 * Request: EcsMaintainStatusRequest
 */
public class EcsMaintainStatusRequest extends CTRequest {
    public EcsMaintainStatusRequest() {
        super("POST", "application/json", "/v4/ecs/maintain-status");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsMaintainStatusRequest withBody(EcsMaintainStatusRequestBody body) {
        this.body = body;
        return this;
    }
}
