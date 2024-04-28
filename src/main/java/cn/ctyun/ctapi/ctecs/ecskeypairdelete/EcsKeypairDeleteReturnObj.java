package cn.ctyun.ctapi.ctecs.ecskeypairdelete;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-删除SSH密钥对>
 * Entity: EcsKeypairDeleteReturnObj
 */
public class EcsKeypairDeleteReturnObj {
    /**
     * keyPairName
     * 密钥对名称
     */
    private String keyPairName;

    /**
     * set keyPairName
     * @param keyPairName 密钥对名称
     * @return this
     */
    public EcsKeypairDeleteReturnObj withKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }

    public String getKeyPairName() {
        return keyPairName;
    }

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }
}
