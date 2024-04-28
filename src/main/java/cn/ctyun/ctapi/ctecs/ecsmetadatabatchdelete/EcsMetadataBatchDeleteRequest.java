package cn.ctyun.ctapi.ctecs.ecsmetadatabatchdelete;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-批量删除云主机元数据>
 * Request: EcsMetadataBatchDeleteRequest
 */
public class EcsMetadataBatchDeleteRequest extends CTRequest {
    public EcsMetadataBatchDeleteRequest() {
        super("POST", "application/json", "/v4/ecs/metadata-batch-delete");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsMetadataBatchDeleteRequest withBody(EcsMetadataBatchDeleteRequestBody body) {
        this.body = body;
        return this;
    }
}
