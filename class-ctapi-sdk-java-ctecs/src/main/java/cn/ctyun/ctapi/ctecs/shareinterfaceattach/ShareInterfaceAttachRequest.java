package cn.ctyun.ctapi.ctecs.shareinterfaceattach;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-挂载共享网卡>
 * Request: ShareInterfaceAttachRequest
 */
public class ShareInterfaceAttachRequest extends CTRequest {
    public ShareInterfaceAttachRequest() {
        super("POST", "application/json", "/v4/ecs/share-interface/attach");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public ShareInterfaceAttachRequest withBody(ShareInterfaceAttachRequestBody body) {
        this.body = body;
        return this;
    }
}
