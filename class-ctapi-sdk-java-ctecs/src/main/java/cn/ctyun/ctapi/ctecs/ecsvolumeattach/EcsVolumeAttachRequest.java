package cn.ctyun.ctapi.ctecs.ecsvolumeattach;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-为云主机挂载云硬盘>
 * Request: EcsVolumeAttachRequest
 */
public class EcsVolumeAttachRequest extends CTRequest {
    public EcsVolumeAttachRequest() {
        super("POST", "application/json", "/v4/ecs/volume_attach");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVolumeAttachRequest withBody(EcsVolumeAttachRequestBody body) {
        this.body = body;
        return this;
    }
}
