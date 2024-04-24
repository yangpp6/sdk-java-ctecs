package cn.ctyun.ctapi.ctecs.volumeextend;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <扩容云硬盘>
 * Request: VolumeExtendRequest
 */
public class VolumeExtendRequest extends CTRequest {
    public VolumeExtendRequest() {
        super("POST", "application/json", "/v4/ecs/volume/extend");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public VolumeExtendRequest withBody(VolumeExtendRequestBody body) {
        this.body = body;
        return this;
    }
}
