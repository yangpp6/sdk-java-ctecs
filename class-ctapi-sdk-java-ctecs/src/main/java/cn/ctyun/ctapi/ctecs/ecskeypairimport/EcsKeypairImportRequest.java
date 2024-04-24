package cn.ctyun.ctapi.ctecs.ecskeypairimport;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-导入RSA密钥对公钥>
 * Request: EcsKeypairImportRequest
 */
public class EcsKeypairImportRequest extends CTRequest {
    public EcsKeypairImportRequest() {
        super("POST", "application/json", "/v4/ecs/keypair/import");
    }

    /**
     * set body entity
     * @param body body实体类
     * @return this
     */
    public EcsKeypairImportRequest withBody(EcsKeypairImportRequestBody body) {
        this.body = body;
        return this;
    }
}
