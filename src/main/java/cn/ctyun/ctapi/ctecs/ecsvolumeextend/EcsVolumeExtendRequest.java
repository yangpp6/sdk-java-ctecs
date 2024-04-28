package cn.ctyun.ctapi.ctecs.ecsvolumeextend;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-扩容云硬盘>
 * Request: EcsVolumeExtendRequest
 */
public class EcsVolumeExtendRequest extends CTRequest {
    public EcsVolumeExtendRequest() {
        super("POST", "application/json", "/v4/ecs/volume_extend");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsVolumeExtendRequest withBody(EcsVolumeExtendRequestBody body) {
        this.body = body;
        return this;
    }
}
