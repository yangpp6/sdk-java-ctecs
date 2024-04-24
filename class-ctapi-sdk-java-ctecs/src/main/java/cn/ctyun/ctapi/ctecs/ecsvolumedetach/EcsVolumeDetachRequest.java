package cn.ctyun.ctapi.ctecs.ecsvolumedetach;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-卸载按量付费云硬盘>
 * Request: EcsVolumeDetachRequest
 */
public class EcsVolumeDetachRequest extends CTRequest {
    public EcsVolumeDetachRequest() {
        super("POST", "application/json", "/v4/ecs/volume_detach");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVolumeDetachRequest withBody(EcsVolumeDetachRequestBody body) {
        this.body = body;
        return this;
    }
}
