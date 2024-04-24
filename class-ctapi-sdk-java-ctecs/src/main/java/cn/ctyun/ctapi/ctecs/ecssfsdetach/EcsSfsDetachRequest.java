package cn.ctyun.ctapi.ctecs.ecssfsdetach;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <云主机卸载文件系统>
 * Request: EcsSfsDetachRequest
 */
public class EcsSfsDetachRequest extends CTRequest {
    public EcsSfsDetachRequest() {
        super("POST", "application/json", "/v4/ecs/sfs/detach");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsSfsDetachRequest withBody(EcsSfsDetachRequestBody body) {
        this.body = body;
        return this;
    }
}
