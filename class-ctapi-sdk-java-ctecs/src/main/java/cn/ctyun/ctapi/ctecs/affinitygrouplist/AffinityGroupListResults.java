package cn.ctyun.ctapi.ctecs.affinitygrouplist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组列表或者详情>
 * Entity: AffinityGroupListResults
 */
public class AffinityGroupListResults {
    /**
     * affinityGroupID
     * 云主机组ID，获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8324&data=87">查询云主机组列表或者详情</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10039549">查询云主机组列表或详情（旧版）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组（旧版）
     */
    private String affinityGroupID;
    /**
     * affinityGroupName
     * 云主机组名称
     */
    private String affinityGroupName;
    /**
     * affinityGroupPolicy
     * 云主机组策略
     */
    private AffinityGroupListAffinityGroupPolicy affinityGroupPolicy;
    /**
     * createdTime
     * 创建时间
     */
    private String createdTime;
    /**
     * updatedTime
     * 更新时间
     */
    private String updatedTime;
    /**
     * deleted
     * 是否删除
     */
    private Boolean deleted;

    /**
     * set affinityGroupID
     * @param affinityGroupID 云主机组ID，获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8324&data=87">查询云主机组列表或者详情</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10039549">查询云主机组列表或详情（旧版）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组（旧版）
     * @return this
     */
    public AffinityGroupListResults withAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
        return this;
    }

    /**
     * set affinityGroupName
     * @param affinityGroupName 云主机组名称
     * @return this
     */
    public AffinityGroupListResults withAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
        return this;
    }

    /**
     * set affinityGroupPolicy
     * @param affinityGroupPolicy 云主机组策略
     * @return this
     */
    public AffinityGroupListResults withAffinityGroupPolicy(AffinityGroupListAffinityGroupPolicy affinityGroupPolicy) {
        this.affinityGroupPolicy = affinityGroupPolicy;
        return this;
    }

    /**
     * set createdTime
     * @param createdTime 创建时间
     * @return this
     */
    public AffinityGroupListResults withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set updatedTime
     * @param updatedTime 更新时间
     * @return this
     */
    public AffinityGroupListResults withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * set deleted
     * @param deleted 是否删除
     * @return this
     */
    public AffinityGroupListResults withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public String getAffinityGroupID() {
        return affinityGroupID;
    }

    public void setAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
    }

    public String getAffinityGroupName() {
        return affinityGroupName;
    }

    public void setAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
    }

    public AffinityGroupListAffinityGroupPolicy getAffinityGroupPolicy() {
        return affinityGroupPolicy;
    }

    public void setAffinityGroupPolicy(AffinityGroupListAffinityGroupPolicy affinityGroupPolicy) {
        this.affinityGroupPolicy = affinityGroupPolicy;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
