package cn.ctyun.ctapi.ctecs.affinitygrouplistvm;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组内的云主机>
 * Entity: AffinityGroupListVmNetworkCardList
 */
public class AffinityGroupListVmNetworkCardList {
    /**
     * IPv4Address
     * IPv4地址
     */
    private String IPv4Address;
    /**
     * IPv6Address
     * IPv6地址列表
     */
    private String[] IPv6Address;
    /**
     * subnetID
     * 子网ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028310">产品定义-子网</a>来了解子网<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=8659&data=94">查询子网列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4812&data=94">创建子网</a>
     */
    private String subnetID;
    /**
     * subnetCidr
     * 子网网段信息
     */
    private String subnetCidr;
    /**
     * isMaster
     * 是否主网卡，取值范围：<br />true（表示主网卡），<br />false（表示扩展网卡）<br />注：只能含有一个主网卡
     */
    private Boolean isMaster;
    /**
     * gateway
     * 网关地址
     */
    private String gateway;
    /**
     * networkCardID
     * 网卡ID
     */
    private String networkCardID;
    /**
     * securityGroup
     * 安全组ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关信息 <br />获取： <br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a>
     */
    private String[] securityGroup;

    /**
     * set IPv4Address
     * @param IPv4Address IPv4地址
     * @return this
     */
    public AffinityGroupListVmNetworkCardList withIPv4Address(String IPv4Address) {
        this.IPv4Address = IPv4Address;
        return this;
    }

    /**
     * set IPv6Address
     * @param IPv6Address IPv6地址列表
     * @return this
     */
    public AffinityGroupListVmNetworkCardList withIPv6Address(String[] IPv6Address) {
        this.IPv6Address = IPv6Address;
        return this;
    }

    /**
     * set subnetID
     * @param subnetID 子网ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028310">产品定义-子网</a>来了解子网<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=8659&data=94">查询子网列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4812&data=94">创建子网</a>
     * @return this
     */
    public AffinityGroupListVmNetworkCardList withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    /**
     * set subnetCidr
     * @param subnetCidr 子网网段信息
     * @return this
     */
    public AffinityGroupListVmNetworkCardList withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * set isMaster
     * @param isMaster 是否主网卡，取值范围：<br />true（表示主网卡），<br />false（表示扩展网卡）<br />注：只能含有一个主网卡
     * @return this
     */
    public AffinityGroupListVmNetworkCardList withIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * set gateway
     * @param gateway 网关地址
     * @return this
     */
    public AffinityGroupListVmNetworkCardList withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * set networkCardID
     * @param networkCardID 网卡ID
     * @return this
     */
    public AffinityGroupListVmNetworkCardList withNetworkCardID(String networkCardID) {
        this.networkCardID = networkCardID;
        return this;
    }

    /**
     * set securityGroup
     * @param securityGroup 安全组ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关信息 <br />获取： <br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a>
     * @return this
     */
    public AffinityGroupListVmNetworkCardList withSecurityGroup(String[] securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public String getIPv4Address() {
        return IPv4Address;
    }

    public void setIPv4Address(String IPv4Address) {
        this.IPv4Address = IPv4Address;
    }

    public String[] getIPv6Address() {
        return IPv6Address;
    }

    public void setIPv6Address(String[] IPv6Address) {
        this.IPv6Address = IPv6Address;
    }

    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }

    public String getSubnetCidr() {
        return subnetCidr;
    }

    public void setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
    }

    public Boolean getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getNetworkCardID() {
        return networkCardID;
    }

    public void setNetworkCardID(String networkCardID) {
        this.networkCardID = networkCardID;
    }

    public String[] getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(String[] securityGroup) {
        this.securityGroup = securityGroup;
    }
}
