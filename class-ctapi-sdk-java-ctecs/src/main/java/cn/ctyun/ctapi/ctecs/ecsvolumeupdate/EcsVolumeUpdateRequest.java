package cn.ctyun.ctapi.ctecs.ecsvolumeupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-修改云硬盘属性>
 * Request: EcsVolumeUpdateRequest
 */
public class EcsVolumeUpdateRequest extends CTRequest {
    public EcsVolumeUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/volume_update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVolumeUpdateRequest withBody(EcsVolumeUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
