package cn.ctyun.ctapi.ctecs.ecsdescriberegions;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询账户启用的资源池信息>
 * Request: EcsDescribeRegionsRequest
 */
public class EcsDescribeRegionsRequest extends CTRequest {
    public EcsDescribeRegionsRequest() {
        super("GET", "application/json", "/v4/ecs/describe-regions");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsDescribeRegionsRequest withBody(EcsDescribeRegionsRequestBody body) {
        this.body = body;
        return this;
    }
}
