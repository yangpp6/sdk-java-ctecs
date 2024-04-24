package cn.ctyun.ctapi.ctecs.ecsupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-更新云主机的部分信息>
 * Request: EcsUpdateRequest
 */
public class EcsUpdateRequest extends CTRequest {
    public EcsUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsUpdateRequest withBody(EcsUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
