package cn.ctyun.ctapi.ctecs.ecsgpudriverlist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <查询GPU云主机驱动版本>
 * Request: EcsGpuDriverListRequest
 */
public class EcsGpuDriverListRequest extends CTRequest {
    public EcsGpuDriverListRequest() {
        super("POST", "application/json", "/v4/ecs/gpu-driver/list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsGpuDriverListRequest withBody(EcsGpuDriverListRequestBody body) {
        this.body = body;
        return this;
    }
}
