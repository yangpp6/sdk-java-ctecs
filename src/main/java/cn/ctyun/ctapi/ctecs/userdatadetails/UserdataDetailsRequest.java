package cn.ctyun.ctapi.ctecs.userdatadetails;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机的用户自定义数据>
 * Request: UserdataDetailsRequest
 */
public class UserdataDetailsRequest extends CTRequest {
    public UserdataDetailsRequest() {
        super("GET", "application/json", "/v4/ecs/userdata/details");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public UserdataDetailsRequest withBody(UserdataDetailsRequestBody body) {
        this.body = body;
        return this;
    }
}
