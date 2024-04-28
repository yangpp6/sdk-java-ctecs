package cn.ctyun.ctapi.ctecs.ecsaffinitygroupecslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组内的云主机>
 * Entity: EcsAffinityGroupEcsListNicList
 */
public class EcsAffinityGroupEcsListNicList {
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
     * 是否主网卡
     */
    private Boolean isMaster;
    /**
     * gateway
     * 网关地址
     */
    private String gateway;
    /**
     * nicID
     * 网卡ID
     */
    private String nicID;
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
    public EcsAffinityGroupEcsListNicList withIPv4Address(String IPv4Address) {
        this.IPv4Address = IPv4Address;
        return this;
    }

    /**
     * set IPv6Address
     * @param IPv6Address IPv6地址列表
     * @return this
     */
    public EcsAffinityGroupEcsListNicList withIPv6Address(String[] IPv6Address) {
        this.IPv6Address = IPv6Address;
        return this;
    }

    /**
     * set subnetID
     * @param subnetID 子网ID
     * @return this
     */
    public EcsAffinityGroupEcsListNicList withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    /**
     * set subnetCidr
     * @param subnetCidr 子网网段信息
     * @return this
     */
    public EcsAffinityGroupEcsListNicList withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * set isMaster
     * @param isMaster 是否主网卡
     * @return this
     */
    public EcsAffinityGroupEcsListNicList withIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * set gateway
     * @param gateway 网关地址
     * @return this
     */
    public EcsAffinityGroupEcsListNicList withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * set nicID
     * @param nicID 网卡ID
     * @return this
     */
    public EcsAffinityGroupEcsListNicList withNicID(String nicID) {
        this.nicID = nicID;
        return this;
    }

    /**
     * set securityGroup
     * @param securityGroup 安全组ID列表
     * @return this
     */
    public EcsAffinityGroupEcsListNicList withSecurityGroup(String[] securityGroup) {
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

    public String getNicID() {
        return nicID;
    }

    public void setNicID(String nicID) {
        this.nicID = nicID;
    }

    public String[] getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(String[] securityGroup) {
        this.securityGroup = securityGroup;
    }
}
