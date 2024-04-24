package cn.ctyun.ctapi.ctecs.volumelist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机的云硬盘列表>
 * Request: VolumeListRequest
 */
public class VolumeListRequest extends CTRequest {
    public VolumeListRequest() {
        super("POST", "application/json", "/v4/ecs/volume/list");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public VolumeListRequest withBody(VolumeListRequestBody body) {
        this.body = body;
        return this;
    }
}
