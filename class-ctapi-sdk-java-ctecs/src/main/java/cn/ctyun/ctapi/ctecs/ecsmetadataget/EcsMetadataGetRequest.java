package cn.ctyun.ctapi.ctecs.ecsmetadataget;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机元数据查询>
 * Request: EcsMetadataGetRequest
 */
public class EcsMetadataGetRequest extends CTRequest {
    public EcsMetadataGetRequest() {
        super("POST", "application/json", "/v4/ecs/metadata-get");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsMetadataGetRequest withBody(EcsMetadataGetRequestBody body) {
        this.body = body;
        return this;
    }
}
