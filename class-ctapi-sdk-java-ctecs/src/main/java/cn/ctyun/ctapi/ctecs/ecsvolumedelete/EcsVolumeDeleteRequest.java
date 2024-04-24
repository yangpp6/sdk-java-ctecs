package cn.ctyun.ctapi.ctecs.ecsvolumedelete;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-释放一块按量付费云硬盘>
 * Request: EcsVolumeDeleteRequest
 */
public class EcsVolumeDeleteRequest extends CTRequest {
    public EcsVolumeDeleteRequest() {
        super("POST", "application/json", "/v4/ecs/volume_delete");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVolumeDeleteRequest withBody(EcsVolumeDeleteRequestBody body) {
        this.body = body;
        return this;
    }
}
