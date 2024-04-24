package cn.ctyun.ctapi.ctecs.affinitygrouplistvm;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组内的云主机>
 * Entity: AffinityGroupListVmAffinityGroup
 */
public class AffinityGroupListVmAffinityGroup {
    /**
     * affinityGroupPolicy
     * 云主机组策略
     */
    private String affinityGroupPolicy;
    /**
     * affinityGroupName
     * 云主机组名称，满足以下规则：长度在2～63个字符，只能由数字、英文字母、中划线-、下划线_、点.组成
     */
    private String affinityGroupName;
    /**
     * affinityGroupID
     * 云主机组ID，获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8324&data=87">查询云主机组列表或者详情</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10039549">查询云主机组列表或详情（旧版）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组（旧版）
     */
    private String affinityGroupID;

    /**
     * set affinityGroupPolicy
     * @param affinityGroupPolicy 云主机组策略
     * @return this
     */
    public AffinityGroupListVmAffinityGroup withAffinityGroupPolicy(String affinityGroupPolicy) {
        this.affinityGroupPolicy = affinityGroupPolicy;
        return this;
    }

    /**
     * set affinityGroupName
     * @param affinityGroupName 云主机组名称，满足以下规则：长度在2～63个字符，只能由数字、英文字母、中划线-、下划线_、点.组成
     * @return this
     */
    public AffinityGroupListVmAffinityGroup withAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
        return this;
    }

    /**
     * set affinityGroupID
     * @param affinityGroupID 云主机组ID，获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8324&data=87">查询云主机组列表或者详情</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10039549">查询云主机组列表或详情（旧版）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8316&data=87">创建云主机组（旧版）
     * @return this
     */
    public AffinityGroupListVmAffinityGroup withAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
        return this;
    }

    public String getAffinityGroupPolicy() {
        return affinityGroupPolicy;
    }

    public void setAffinityGroupPolicy(String affinityGroupPolicy) {
        this.affinityGroupPolicy = affinityGroupPolicy;
    }

    public String getAffinityGroupName() {
        return affinityGroupName;
    }

    public void setAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
    }

    public String getAffinityGroupID() {
        return affinityGroupID;
    }

    public void setAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
    }
}
