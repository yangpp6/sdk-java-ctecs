package cn.ctyun.ctapi.ctecs.ecsdetails;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询一台或多台云主机详细信息>
 * Request: EcsDetailsRequest
 */
public class EcsDetailsRequest extends CTRequest {
    public EcsDetailsRequest() {
        super("POST", "application/json", "/v4/ecs/details");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsDetailsRequest withBody(EcsDetailsRequestBody body) {
        this.body = body;
        return this;
    }
}
