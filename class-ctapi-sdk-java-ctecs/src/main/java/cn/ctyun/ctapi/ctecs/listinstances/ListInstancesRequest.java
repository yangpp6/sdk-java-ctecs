package cn.ctyun.ctapi.ctecs.listinstances;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机列表>
 * Request: ListInstancesRequest
 */
public class ListInstancesRequest extends CTRequest {
    public ListInstancesRequest() {
        super("POST", "application/json", "/v4/ecs/list-instances");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public ListInstancesRequest withBody(ListInstancesRequestBody body) {
        this.body = body;
        return this;
    }
}
