package cn.ctyun.ctapi.ctecs.deletemetadata;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机元数据删除>
 * Request: DeleteMetadataRequest
 */
public class DeleteMetadataRequest extends CTRequest {
    public DeleteMetadataRequest() {
        super("POST", "application/json", "/v4/ecs/metadata/delete");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public DeleteMetadataRequest withBody(DeleteMetadataRequestBody body) {
        this.body = body;
        return this;
    }
}
