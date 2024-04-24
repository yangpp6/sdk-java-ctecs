package cn.ctyun.ctapi.ctecs.ecssfsattach;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <云主机挂载文件系统>
 * Request: EcsSfsAttachRequest
 */
public class EcsSfsAttachRequest extends CTRequest {
    public EcsSfsAttachRequest() {
        super("POST", "application/json", "/v4/ecs/sfs/attach");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsSfsAttachRequest withBody(EcsSfsAttachRequestBody body) {
        this.body = body;
        return this;
    }
}
