package cn.ctyun.ctapi.ctecs.affinitygroupccreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机组>
 * Entity: AffinityGroupCcreateRequestBody
 */
public class AffinityGroupCcreateRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * affinityGroupName
     * 云主机组名称，满足以下规则：长度在2～63个字符，只能由数字、英文字母、中划线-、下划线_、点.组成
     */
    private String affinityGroupName;
    /**
     * policyType
     * 云主机组策略类型。<br />取值范围：<br />0（强制反亲和性），<br />1（强制亲和性），<br />2（反亲和性），<br />3（亲和性)，<br />4（电力反亲和性)<br />注：默认值2    
     */
    private Integer policyType;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public AffinityGroupCcreateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set affinityGroupName
     * @param affinityGroupName 云主机组名称，满足以下规则：长度在2～63个字符，只能由数字、英文字母、中划线-、下划线_、点.组成
     * @return this
     */
    public AffinityGroupCcreateRequestBody withAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
        return this;
    }

    /**
     * set policyType
     * @param policyType 云主机组策略类型。<br />取值范围：<br />0（强制反亲和性），<br />1（强制亲和性），<br />2（反亲和性），<br />3（亲和性)，<br />4（电力反亲和性)<br />注：默认值2    
     * @return this
     */
    public AffinityGroupCcreateRequestBody withPolicyType(Integer policyType) {
        this.policyType = policyType;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getAffinityGroupName() {
        return affinityGroupName;
    }

    public void setAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
    }

    public Integer getPolicyType() {
        return policyType;
    }

    public void setPolicyType(Integer policyType) {
        this.policyType = policyType;
    }
}
