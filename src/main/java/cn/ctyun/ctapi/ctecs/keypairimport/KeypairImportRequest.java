package cn.ctyun.ctapi.ctecs.keypairimport;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-导入密钥对>
 * Request: KeypairImportRequest
 */
public class KeypairImportRequest extends CTRequest {
    public KeypairImportRequest() {
        super("POST", "application/json", "/v4/ecs/keypair/import-keypair");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public KeypairImportRequest withBody(KeypairImportRequestBody body) {
        this.body = body;
        return this;
    }
}
