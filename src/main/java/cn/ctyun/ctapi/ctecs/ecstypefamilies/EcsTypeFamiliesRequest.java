package cn.ctyun.ctapi.ctecs.ecstypefamilies;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机规格族列表>
 * Request: EcsTypeFamiliesRequest
 */
public class EcsTypeFamiliesRequest extends CTRequest {
    public EcsTypeFamiliesRequest() {
        super("POST", "application/json", "/v4/ecs/type-families");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsTypeFamiliesRequest withBody(EcsTypeFamiliesRequestBody body) {
        this.body = body;
        return this;
    }
}
