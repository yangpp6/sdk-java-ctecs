package cn.ctyun.ctapi.ctecs.ecsmetadataupdate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机元数据更新>
 * Request: EcsMetadataUpdateRequest
 */
public class EcsMetadataUpdateRequest extends CTRequest {
    public EcsMetadataUpdateRequest() {
        super("POST", "application/json", "/v4/ecs/metadata-update");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsMetadataUpdateRequest withBody(EcsMetadataUpdateRequestBody body) {
        this.body = body;
        return this;
    }
}
