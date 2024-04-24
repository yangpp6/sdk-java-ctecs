package cn.ctyun.ctapi.ctecs.ecsvolumecreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建一块按量付费或包年包月云硬盘>
 * Request: EcsVolumeCreateRequest
 */
public class EcsVolumeCreateRequest extends CTRequest {
    public EcsVolumeCreateRequest() {
        super("POST", "application/json", "/v4/ecs/volume_create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVolumeCreateRequest withBody(EcsVolumeCreateRequestBody body) {
        this.body = body;
        return this;
    }
}
