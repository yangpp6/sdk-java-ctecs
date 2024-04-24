package cn.ctyun.ctapi.ctecs.ecsportsdelete;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-删除弹性网卡>
 * Request: EcsPortsDeleteRequest
 */
public class EcsPortsDeleteRequest extends CTRequest {
    public EcsPortsDeleteRequest() {
        super("POST", "application/json", "/v4/ecs/ports/delete");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsPortsDeleteRequest withBody(EcsPortsDeleteRequestBody body) {
        this.body = body;
        return this;
    }
}
