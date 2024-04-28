package cn.ctyun.ctapi.ctecs.ecsattachshareinterface;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机添加共享网卡>
 * Request: EcsAttachShareInterfaceRequest
 */
public class EcsAttachShareInterfaceRequest extends CTRequest {
    public EcsAttachShareInterfaceRequest() {
        super("POST", "application/json", "/v4/ecs/attach-share-interface");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsAttachShareInterfaceRequest withBody(EcsAttachShareInterfaceRequestBody body) {
        this.body = body;
        return this;
    }
}
