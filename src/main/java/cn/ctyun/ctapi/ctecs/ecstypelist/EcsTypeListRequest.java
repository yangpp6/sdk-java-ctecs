package cn.ctyun.ctapi.ctecs.ecstypelist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个云主机规格资源>
 * Request: EcsTypeListRequest
 */
public class EcsTypeListRequest extends CTRequest {
    public EcsTypeListRequest() {
        super("POST", "application/json", "/v4/ecs/type-list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsTypeListRequest withBody(EcsTypeListRequestBody body) {
        this.body = body;
        return this;
    }
}
