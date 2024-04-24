package cn.ctyun.ctapi.ctecs.ecsinstancelist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机列表>
 * Request: EcsInstanceListRequest
 */
public class EcsInstanceListRequest extends CTRequest {
    public EcsInstanceListRequest() {
        super("POST", "application/json", "/v4/ecs/instance-list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsInstanceListRequest withBody(EcsInstanceListRequestBody body) {
        this.body = body;
        return this;
    }
}