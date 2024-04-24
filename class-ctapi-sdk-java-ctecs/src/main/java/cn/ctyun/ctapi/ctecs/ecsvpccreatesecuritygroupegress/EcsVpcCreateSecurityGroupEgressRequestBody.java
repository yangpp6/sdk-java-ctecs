package cn.ctyun.ctapi.ctecs.ecsvpccreatesecuritygroupegress;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建安全组出向规则>
 * Entity: EcsVpcCreateSecurityGroupEgressRequestBody
 */
public class EcsVpcCreateSecurityGroupEgressRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * securityGroupID
     * 安全组ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关信息 <br />获取： <br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a>
     */
    private String securityGroupID;
    /**
     * securityGroupRules
     * 规则信息列表，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关配置
     */
    private EcsVpcCreateSecurityGroupEgressSecurityGroupRules[] securityGroupRules;
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。长度为1-64字符，要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsVpcCreateSecurityGroupEgressRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set securityGroupID
     * @param securityGroupID 安全组ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关信息 <br />获取： <br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a>
     * @return this
     */
    public EcsVpcCreateSecurityGroupEgressRequestBody withSecurityGroupID(String securityGroupID) {
        this.securityGroupID = securityGroupID;
        return this;
    }

    /**
     * set securityGroupRules
     * @param securityGroupRules 规则信息列表，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关配置
     * @return this
     */
    public EcsVpcCreateSecurityGroupEgressRequestBody withSecurityGroupRules(EcsVpcCreateSecurityGroupEgressSecurityGroupRules[] securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
        return this;
    }

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。长度为1-64字符，要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public EcsVpcCreateSecurityGroupEgressRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getSecurityGroupID() {
        return securityGroupID;
    }

    public void setSecurityGroupID(String securityGroupID) {
        this.securityGroupID = securityGroupID;
    }

    public EcsVpcCreateSecurityGroupEgressSecurityGroupRules[] getSecurityGroupRules() {
        return securityGroupRules;
    }

    public void setSecurityGroupRules(EcsVpcCreateSecurityGroupEgressSecurityGroupRules[] securityGroupRules) {
        this.securityGroupRules = securityGroupRules;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
}
