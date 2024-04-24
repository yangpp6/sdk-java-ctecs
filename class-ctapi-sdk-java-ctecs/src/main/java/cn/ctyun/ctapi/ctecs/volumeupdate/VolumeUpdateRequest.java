package cn.ctyun.ctapi.ctecs.volumeupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <修改云硬盘属性>
 * Request: VolumeUpdateRequest
 */
public class VolumeUpdateRequest extends CTRequest {
    public VolumeUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/volume/update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public VolumeUpdateRequest withBody(VolumeUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
