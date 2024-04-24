package cn.ctyun.ctapi.ctecs.ecskeypairdelete;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-删除SSH密钥对>
 * Entity: EcsKeypairDeleteRequestBody
 */
public class EcsKeypairDeleteRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * keyPairName
     * 密钥对名称。满足以下规则：只能由数字、字母、-组成，不能以数字和-开头、以-结尾，且长度为2-63字符。
     */
    private String keyPairName;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsKeypairDeleteRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set keyPairName
     * @param keyPairName 密钥对名称。满足以下规则：只能由数字、字母、-组成，不能以数字和-开头、以-结尾，且长度为2-63字符。
     * @return this
     */
    public EcsKeypairDeleteRequestBody withKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
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
}
