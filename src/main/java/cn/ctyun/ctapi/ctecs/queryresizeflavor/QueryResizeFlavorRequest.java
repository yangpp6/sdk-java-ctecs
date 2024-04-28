package cn.ctyun.ctapi.ctecs.queryresizeflavor;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机可变配的规格>
 * Request: QueryResizeFlavorRequest
 */
public class QueryResizeFlavorRequest extends CTRequest {
    public QueryResizeFlavorRequest() {
        super("POST", "application/json", "/v4/ecs/query-resize-flavor");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public QueryResizeFlavorRequest withBody(QueryResizeFlavorRequestBody body) {
        this.body = body;
        return this;
    }
}
