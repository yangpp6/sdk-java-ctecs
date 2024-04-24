package cn.ctyun.ctapi.ctecs.volumedelete;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <释放云硬盘>
 * Request: VolumeDeleteRequest
 */
public class VolumeDeleteRequest extends CTRequest {
    public VolumeDeleteRequest() {
        super("POST", "application/json", "/v4/ecs/volume/delete");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public VolumeDeleteRequest withBody(VolumeDeleteRequestBody body) {
        this.body = body;
        return this;
    }
}
