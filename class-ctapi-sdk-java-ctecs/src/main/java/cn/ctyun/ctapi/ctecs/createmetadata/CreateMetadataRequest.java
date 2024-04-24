package cn.ctyun.ctapi.ctecs.createmetadata;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-创建云主机元数据>
 * Request: CreateMetadataRequest
 */
public class CreateMetadataRequest extends CTRequest {
    public CreateMetadataRequest() {
        super("POST", "application/json", "/v4/ecs/metadata/create");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public CreateMetadataRequest withBody(CreateMetadataRequestBody body) {
        this.body = body;
        return this;
    }
}
