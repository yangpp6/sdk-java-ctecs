package cn.ctyun.ctapi.ctecs.affinitygrouplist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组列表或者详情>
 * Entity: AffinityGroupListRequestBody
 */
public class AffinityGroupListRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * affinityGroupID
     * 云主机组ID，获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8324&data=87">查询云主机组列表或者详情</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10039549">查询云主机组列表或详情（旧版）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组（旧版）
     */
    private String affinityGroupID;
    /**
     * queryContent
     * 模糊匹配查询内容（匹配字段：affinityGroupID、affinityGroupName）
     */
    private String queryContent;
    /**
     * pageNo
     * 页码，取值范围：正整数（≥1），注：默认值为1
     */
    private Integer pageNo;
    /**
     * pageSize
     * 每页记录数目，取值范围：[1, 50]，注：默认值为10
     */
    private Integer pageSize;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public AffinityGroupListRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set affinityGroupID
     * @param affinityGroupID 云主机组ID，获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8324&data=87">查询云主机组列表或者详情</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10039549">查询云主机组列表或详情（旧版）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组（旧版）
     * @return this
     */
    public AffinityGroupListRequestBody withAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
        return this;
    }

    /**
     * set queryContent
     * @param queryContent 模糊匹配查询内容（匹配字段：affinityGroupID、affinityGroupName）
     * @return this
     */
    public AffinityGroupListRequestBody withQueryContent(String queryContent) {
        this.queryContent = queryContent;
        return this;
    }

    /**
     * set pageNo
     * @param pageNo 页码，取值范围：正整数（≥1），注：默认值为1
     * @return this
     */
    public AffinityGroupListRequestBody withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * set pageSize
     * @param pageSize 每页记录数目，取值范围：[1, 50]，注：默认值为10
     * @return this
     */
    public AffinityGroupListRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getAffinityGroupID() {
        return affinityGroupID;
    }

    public void setAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
    }

    public String getQueryContent() {
        return queryContent;
    }

    public void setQueryContent(String queryContent) {
        this.queryContent = queryContent;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}