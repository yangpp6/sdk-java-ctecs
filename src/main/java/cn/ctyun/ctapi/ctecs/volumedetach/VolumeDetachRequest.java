package cn.ctyun.ctapi.ctecs.volumedetach;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <卸载云硬盘>
 * Request: VolumeDetachRequest
 */
public class VolumeDetachRequest extends CTRequest {
    public VolumeDetachRequest() {
        super("POST", "application/json", "/v4/ecs/volume/detach");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public VolumeDetachRequest withBody(VolumeDetachRequestBody body) {
        this.body = body;
        return this;
    }
}
