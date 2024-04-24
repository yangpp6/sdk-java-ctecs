package cn.ctyun.ctapi.ctecs.ecskeypaircreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建一对SSH密钥对>
 * Entity: EcsKeypairCreateReturnObj
 */
public class EcsKeypairCreateReturnObj {
    /**
     * publicKey
     * 密钥对的公钥
     */
    private String publicKey;
    /**
     * privateKey
     * 密钥对的私钥
     */
    private String privateKey;
    /**
     * name
     * 密钥对名称
     */
    private String name;
    /**
     * fingerprint
     * 密钥对的指纹，采用MD5信息摘要算法。
     */
    private String fingerprint;
    /**
     * keyPairID
     * 密钥对的ID
     */
    private String keyPairID;

    /**
     * set publicKey
     * @param publicKey 密钥对的公钥
     * @return this
     */
    public EcsKeypairCreateReturnObj withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * set privateKey
     * @param privateKey 密钥对的私钥
     * @return this
     */
    public EcsKeypairCreateReturnObj withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * set name
     * @param name 密钥对名称
     * @return this
     */
    public EcsKeypairCreateReturnObj withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * set fingerprint
     * @param fingerprint 密钥对的指纹，采用MD5信息摘要算法。
     * @return this
     */
    public EcsKeypairCreateReturnObj withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * set keyPairID
     * @param keyPairID 密钥对的ID
     * @return this
     */
    public EcsKeypairCreateReturnObj withKeyPairID(String keyPairID) {
        this.keyPairID = keyPairID;
        return this;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getKeyPairID() {
        return keyPairID;
    }

    public void setKeyPairID(String keyPairID) {
        this.keyPairID = keyPairID;
    }
}
