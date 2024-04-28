package cn.ctyun.ctapi.ctecs.listinstancebyflavorfamilies;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询指定规格族下的云主机信息>
 * Request: ListInstanceByFlavorFamiliesRequest
 */
public class ListInstanceByFlavorFamiliesRequest extends CTRequest {
    public ListInstanceByFlavorFamiliesRequest() {
        super("POST", "application/json", "/v4/ecs/flavor/list-by-families");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public ListInstanceByFlavorFamiliesRequest withBody(ListInstanceByFlavorFamiliesRequestBody body) {
        this.body = body;
        return this;
    }
}
