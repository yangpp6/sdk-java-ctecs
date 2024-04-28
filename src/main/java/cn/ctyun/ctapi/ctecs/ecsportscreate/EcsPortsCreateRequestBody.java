package cn.ctyun.ctapi.ctecs.ecsportscreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建弹性网卡>
 * Entity: EcsPortsCreateRequestBody
 */
public class EcsPortsCreateRequestBody {
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。长度为1-64字符，要求单个云平台账户内唯一，使用同一个ClientToken值，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * subnetID
     * 子网ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028310">产品定义-子网</a>来了解子网<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=8659&data=94">查询子网列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4812&data=94">创建子网</a>
     */
    private String subnetID;
    /**
     * primaryPrivateIp
     * 弹性网卡的主私网IPv4地址
     */
    private String primaryPrivateIp;
    /**
     * ipv6Addresses
     * 弹性网卡的主私网IPv6地址
     */
    private String[] ipv6Addresses;
    /**
     * securityGroupIds
     * 加入一个或多个安全组。安全组和弹性网卡必须在同一个专有网络VPC中。您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>来了解安全组<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a>
     */
    private String[] securityGroupIds;
    /**
     * secondaryPrivateIpCount
     * 辅助私网IP地址数量，让ECS为您自动创建IP地址
     */
    private Integer secondaryPrivateIpCount;
    /**
     * secondaryPrivateIps
     * 辅助私网IP地址，不能和secondaryPrivateIpCount同时指定
     */
    private String[] secondaryPrivateIps;
    /**
     * name
     * 网卡名称，满足以下规则：支持拉丁字母、中文、数字，下划线，连字符，中文/英文字母开头，不能以http:/https:开头，长度2-32
     */
    private String name;

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。长度为1-64字符，要求单个云平台账户内唯一，使用同一个ClientToken值，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public EcsPortsCreateRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsPortsCreateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set subnetID
     * @param subnetID 子网ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028310">产品定义-子网</a>来了解子网<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=8659&data=94">查询子网列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4812&data=94">创建子网</a>
     * @return this
     */
    public EcsPortsCreateRequestBody withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    /**
     * set primaryPrivateIp
     * @param primaryPrivateIp 弹性网卡的主私网IPv4地址
     * @return this
     */
    public EcsPortsCreateRequestBody withPrimaryPrivateIp(String primaryPrivateIp) {
        this.primaryPrivateIp = primaryPrivateIp;
        return this;
    }

    /**
     * set ipv6Addresses
     * @param ipv6Addresses 弹性网卡的主私网IPv6地址
     * @return this
     */
    public EcsPortsCreateRequestBody withIpv6Addresses(String[] ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
        return this;
    }

    /**
     * set securityGroupIds
     * @param securityGroupIds 加入一个或多个安全组。安全组和弹性网卡必须在同一个专有网络VPC中。您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>来了解安全组<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a>
     * @return this
     */
    public EcsPortsCreateRequestBody withSecurityGroupIds(String[] securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * set secondaryPrivateIpCount
     * @param secondaryPrivateIpCount 辅助私网IP地址数量，让ECS为您自动创建IP地址
     * @return this
     */
    public EcsPortsCreateRequestBody withSecondaryPrivateIpCount(Integer secondaryPrivateIpCount) {
        this.secondaryPrivateIpCount = secondaryPrivateIpCount;
        return this;
    }

    /**
     * set secondaryPrivateIps
     * @param secondaryPrivateIps 辅助私网IP地址，不能和secondaryPrivateIpCount同时指定
     * @return this
     */
    public EcsPortsCreateRequestBody withSecondaryPrivateIps(String[] secondaryPrivateIps) {
        this.secondaryPrivateIps = secondaryPrivateIps;
        return this;
    }

    /**
     * set name
     * @param name 网卡名称，满足以下规则：支持拉丁字母、中文、数字，下划线，连字符，中文/英文字母开头，不能以http:/https:开头，长度2-32
     * @return this
     */
    public EcsPortsCreateRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }

    public String getPrimaryPrivateIp() {
        return primaryPrivateIp;
    }

    public void setPrimaryPrivateIp(String primaryPrivateIp) {
        this.primaryPrivateIp = primaryPrivateIp;
    }

    public String[] getIpv6Addresses() {
        return ipv6Addresses;
    }

    public void setIpv6Addresses(String[] ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
    }

    public String[] getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(String[] securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public Integer getSecondaryPrivateIpCount() {
        return secondaryPrivateIpCount;
    }

    public void setSecondaryPrivateIpCount(Integer secondaryPrivateIpCount) {
        this.secondaryPrivateIpCount = secondaryPrivateIpCount;
    }

    public String[] getSecondaryPrivateIps() {
        return secondaryPrivateIps;
    }

    public void setSecondaryPrivateIps(String[] secondaryPrivateIps) {
        this.secondaryPrivateIps = secondaryPrivateIps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
