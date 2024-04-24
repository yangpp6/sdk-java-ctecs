package cn.ctyun.ctapi.ctecs.listflavor;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个云主机规格资源>
 * Request: ListFlavorRequest
 */
public class ListFlavorRequest extends CTRequest {
    public ListFlavorRequest() {
        super("POST", "application/json", "/v4/ecs/flavor/list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public ListFlavorRequest withBody(ListFlavorRequestBody body) {
        this.body = body;
        return this;
    }
}
