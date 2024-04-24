package cn.ctyun.ctapi.ctecs.volumeattach;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <挂载云硬盘>
 * Request: VolumeAttachRequest
 */
public class VolumeAttachRequest extends CTRequest {
    public VolumeAttachRequest() {
        super("POST", "application/json", "/v4/ecs/volume/attach");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public VolumeAttachRequest withBody(VolumeAttachRequestBody body) {
        this.body = body;
        return this;
    }
}
