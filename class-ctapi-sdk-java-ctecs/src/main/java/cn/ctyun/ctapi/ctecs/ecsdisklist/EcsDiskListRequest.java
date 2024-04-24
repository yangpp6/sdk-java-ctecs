package cn.ctyun.ctapi.ctecs.ecsdisklist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机的云硬盘列表>
 * Request: EcsDiskListRequest
 */
public class EcsDiskListRequest extends CTRequest {
    public EcsDiskListRequest() {
        super("POST", "application/json", "/v4/ecs/disk/list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsDiskListRequest withBody(EcsDiskListRequestBody body) {
        this.body = body;
        return this;
    }
}
