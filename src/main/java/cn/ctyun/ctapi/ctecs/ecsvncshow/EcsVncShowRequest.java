package cn.ctyun.ctapi.ctecs.ecsvncshow;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询一台云主机的Web管理终端地址>
 * Request: EcsVncShowRequest
 */
public class EcsVncShowRequest extends CTRequest {
    public EcsVncShowRequest() {
        super("GET", "application/json", "/v4/ecs/vnc-show");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVncShowRequest withBody(EcsVncShowRequestBody body) {
        this.body = body;
        return this;
    }
}
