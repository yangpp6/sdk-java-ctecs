package cn.ctyun.ctapi.ctecs.ecsmetadatacreate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机元数据创建>
 * Request: EcsMetadataCreateRequest
 */
public class EcsMetadataCreateRequest extends CTRequest {
    public EcsMetadataCreateRequest() {
        super("POST", "application/json", "/v4/ecs/metadata-create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsMetadataCreateRequest withBody(EcsMetadataCreateRequestBody body) {
        this.body = body;
        return this;
    }
}
