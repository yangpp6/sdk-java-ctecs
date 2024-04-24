package cn.ctyun.ctapi.ctecs.metadatadetails;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机元数据查询>
 * Request: MetadataDetailsRequest
 */
public class MetadataDetailsRequest extends CTRequest {
    public MetadataDetailsRequest() {
        super("GET", "application/json", "/v4/ecs/metadata/details");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public MetadataDetailsRequest withBody(MetadataDetailsRequestBody body) {
        this.body = body;
        return this;
    }
}
