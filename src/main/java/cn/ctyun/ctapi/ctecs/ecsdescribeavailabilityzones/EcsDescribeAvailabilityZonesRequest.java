package cn.ctyun.ctapi.ctecs.ecsdescribeavailabilityzones;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询账户资源池下可用区信息>
 * Request: EcsDescribeAvailabilityZonesRequest
 */
public class EcsDescribeAvailabilityZonesRequest extends CTRequest {
    public EcsDescribeAvailabilityZonesRequest() {
        super("POST", "application/json", "/v4/ecs/describe-availability-zones");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsDescribeAvailabilityZonesRequest withBody(EcsDescribeAvailabilityZonesRequestBody body) {
        this.body = body;
        return this;
    }
}
