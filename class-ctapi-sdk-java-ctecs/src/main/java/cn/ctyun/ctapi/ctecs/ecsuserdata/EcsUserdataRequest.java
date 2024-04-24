package cn.ctyun.ctapi.ctecs.ecsuserdata;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询一台云主机的自定义数据>
 * Request: EcsUserdataRequest
 */
public class EcsUserdataRequest extends CTRequest {
    public EcsUserdataRequest() {
        super("POST", "application/json", "/v4/ecs/userdata");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsUserdataRequest withBody(EcsUserdataRequestBody body) {
        this.body = body;
        return this;
    }
}
