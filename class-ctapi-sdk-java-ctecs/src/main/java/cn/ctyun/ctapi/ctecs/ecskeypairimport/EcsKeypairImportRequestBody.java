package cn.ctyun.ctapi.ctecs.ecskeypairimport;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-导入RSA密钥对公钥>
 * Entity: EcsKeypairImportRequestBody
 */
public class EcsKeypairImportRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * keyPairName
     * 密钥对名称。只能由数字、字母、-组成,不能以数字和-开头、以-结尾,且长度为2-63字符
     */
    private String keyPairName;
    /**
     * publicKey
     * 公钥
     */
    private String publicKey;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsKeypairImportRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set keyPairName
     * @param keyPairName 密钥对名称。只能由数字、字母、-组成,不能以数字和-开头、以-结尾,且长度为2-63字符
     * @return this
     */
    public EcsKeypairImportRequestBody withKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }

    /**
     * set publicKey
     * @param publicKey 公钥
     * @return this
     */
    public EcsKeypairImportRequestBody withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public EcsKeypairImportRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getKeyPairName() {
        return keyPairName;
    }

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }
}
