package cn.ctyun.ctapi.ctecs.keypaircreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建密钥对>
 * Entity: KeypairCreateReturnObj
 */
public class KeypairCreateReturnObj {
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
     * keyPairID
     * 密钥对的ID
     */
    private String keyPairID;

    /**
     * set keyPairName
     * @param keyPairName 密钥对名称
     * @return this
     */
    public KeypairCreateReturnObj withKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }

    /**
     * set fingerPrint
     * @param fingerPrint 密钥对的指纹，采用MD5信息摘要算法
     * @return this
     */
    public KeypairCreateReturnObj withFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
        return this;
    }

    /**
     * set keyPairID
     * @param keyPairID 密钥对的ID
     * @return this
     */
    public KeypairCreateReturnObj withKeyPairID(String keyPairID) {
        this.keyPairID = keyPairID;
        return this;
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
}
