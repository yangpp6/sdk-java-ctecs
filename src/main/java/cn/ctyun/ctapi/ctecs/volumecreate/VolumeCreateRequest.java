package cn.ctyun.ctapi.ctecs.volumecreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <创建一块按量付费或包年包月云硬盘>
 * Request: VolumeCreateRequest
 */
public class VolumeCreateRequest extends CTRequest {
    public VolumeCreateRequest() {
        super("POST", "application/json", "/v4/ecs/volume/create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public VolumeCreateRequest withBody(VolumeCreateRequestBody body) {
        this.body = body;
        return this;
    }
}
