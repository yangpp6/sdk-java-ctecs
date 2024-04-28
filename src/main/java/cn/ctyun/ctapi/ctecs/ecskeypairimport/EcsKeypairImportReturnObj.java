package cn.ctyun.ctapi.ctecs.ecskeypairimport;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-导入RSA密钥对公钥>
 * Entity: EcsKeypairImportReturnObj
 */
public class EcsKeypairImportReturnObj {
    /**
     * publicKey
     * 密钥对的公钥
     */
    private String publicKey;
    /**
     * keyPairName
     * 密钥对名称
     */
    private String keyPairName;
    /**
     * fingerPrint
     * 密钥对的指纹，采用MD5信息摘要算法
     */
    private String fingerPrint;

    /**
     * set publicKey
     * @param publicKey 密钥对的公钥
     * @return this
     */
    public EcsKeypairImportReturnObj withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * set keyPairName
     * @param keyPairName 密钥对名称
     * @return this
     */
    public EcsKeypairImportReturnObj withKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }

    /**
     * set fingerPrint
     * @param fingerPrint 密钥对的指纹，采用MD5信息摘要算法
     * @return this
     */
    public EcsKeypairImportReturnObj withFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
        return this;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getKeyPairName() {
        return keyPairName;
    }

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    public String getFingerPrint() {
        return fingerPrint;
    }

    public void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }
}
