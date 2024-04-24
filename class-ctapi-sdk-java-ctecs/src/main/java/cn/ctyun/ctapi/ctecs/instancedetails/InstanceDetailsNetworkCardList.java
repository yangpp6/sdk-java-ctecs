package cn.ctyun.ctapi.ctecs.instancedetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机详细信息>
 * Entity: InstanceDetailsNetworkCardList
 */
public class InstanceDetailsNetworkCardList {
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
     * 子网ID
     */
    private String subnetID;
    /**
     * subnetCidr
     * 子网网段信息
     */
    private String subnetCidr;
    /**
     * isMaster
     * 是否主网卡，取值范围：<br />true（主网卡），<br />false（扩展网卡）
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
     * 安全组ID列表
     */
    private String[] securityGroup;

    /**
     * set IPv4Address
     * @param IPv4Address IPv4地址
     * @return this
     */
    public InstanceDetailsNetworkCardList withIPv4Address(String IPv4Address) {
        this.IPv4Address = IPv4Address;
        return this;
    }

    /**
     * set IPv6Address
     * @param IPv6Address IPv6地址列表
     * @return this
     */
    public InstanceDetailsNetworkCardList withIPv6Address(String[] IPv6Address) {
        this.IPv6Address = IPv6Address;
        return this;
    }

    /**
     * set subnetID
     * @param subnetID 子网ID
     * @return this
     */
    public InstanceDetailsNetworkCardList withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    /**
     * set subnetCidr
     * @param subnetCidr 子网网段信息
     * @return this
     */
    public InstanceDetailsNetworkCardList withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * set isMaster
     * @param isMaster 是否主网卡，取值范围：<br />true（主网卡），<br />false（扩展网卡）
     * @return this
     */
    public InstanceDetailsNetworkCardList withIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * set gateway
     * @param gateway 网关地址
     * @return this
     */
    public InstanceDetailsNetworkCardList withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * set networkCardID
     * @param networkCardID 网卡ID
     * @return this
     */
    public InstanceDetailsNetworkCardList withNetworkCardID(String networkCardID) {
        this.networkCardID = networkCardID;
        return this;
    }

    /**
     * set securityGroup
     * @param securityGroup 安全组ID列表
     * @return this
     */
    public InstanceDetailsNetworkCardList withSecurityGroup(String[] securityGroup) {
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
