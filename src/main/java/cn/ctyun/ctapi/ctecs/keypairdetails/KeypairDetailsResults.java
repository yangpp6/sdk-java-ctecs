package cn.ctyun.ctapi.ctecs.keypairdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取密钥对详情>
 * Entity: KeypairDetailsResults
 */
public class KeypairDetailsResults {
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
     * 密钥对的指纹，采用MD5信息摘要算法。
     */
    private String fingerPrint;
    /**
     * keyPairID
     * 密钥对的ID
     */
    private String keyPairID;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;

    /**
     * set publicKey
     * @param publicKey 密钥对的公钥
     * @return this
     */
    public KeypairDetailsResults withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * set keyPairName
     * @param keyPairName 密钥对名称
     * @return this
     */
    public KeypairDetailsResults withKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }

    /**
     * set fingerPrint
     * @param fingerPrint 密钥对的指纹，采用MD5信息摘要算法。
     * @return this
     */
    public KeypairDetailsResults withFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
        return this;
    }

    /**
     * set keyPairID
     * @param keyPairID 密钥对的ID
     * @return this
     */
    public KeypairDetailsResults withKeyPairID(String keyPairID) {
        this.keyPairID = keyPairID;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public KeypairDetailsResults withProjectID(String projectID) {
        this.projectID = projectID;
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

    public String getKeyPairID() {
        return keyPairID;
    }

    public void setKeyPairID(String keyPairID) {
        this.keyPairID = keyPairID;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }
}
