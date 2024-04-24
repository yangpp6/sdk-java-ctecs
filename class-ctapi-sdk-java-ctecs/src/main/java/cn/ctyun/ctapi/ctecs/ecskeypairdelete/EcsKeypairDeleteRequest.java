package cn.ctyun.ctapi.ctecs.ecskeypairdelete;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-删除SSH密钥对>
 * Request: EcsKeypairDeleteRequest
 */
public class EcsKeypairDeleteRequest extends CTRequest {
    public EcsKeypairDeleteRequest() {
        super("POST", "application/json", "/v4/ecs/keypair/delete");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsKeypairDeleteRequest withBody(EcsKeypairDeleteRequestBody body) {
        this.body = body;
        return this;
    }
}
