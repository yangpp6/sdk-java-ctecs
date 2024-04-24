package cn.ctyun.ctapi.ctecs.ecsportslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询网卡列表>
 * Entity: EcsPortsListReturnObj
 */
public class EcsPortsListReturnObj {
    /**
     * networkInterfaceName
     * 虚拟网名称
     */
    private String networkInterfaceName;
    /**
     * networkInterfaceID
     * 虚拟网id
     */
    private String networkInterfaceID;
    /**
     * vpcID
     * 所属vpc
     */
    private String vpcID;
    /**
     * subnetID
     * 所属子网id
     */
    private String subnetID;
    /**
     * role
     * 网卡类型: 0 主网卡， 1 弹性网卡
     */
    private Integer role;
    /**
     * macAddress
     * mac地址
     */
    private String macAddress;
    /**
     * primaryPrivateIp
     * 主ip
     */
    private String primaryPrivateIp;
    /**
     * ipv6Addresses
     * ipv6地址
     */
    private String[] ipv6Addresses;
    /**
     * instanceID
     * 关联的设备id
     */
    private String instanceID;
    /**
     * instanceType
     * 设备类型 VM, BM, Other
     */
    private String instanceType;
    /**
     * description
     * 描述
     */
    private String description;
    /**
     * securityGroupIds
     * 安全组ID列表
     */
    private String[] securityGroupIds;
    /**
     * secondaryPrivateIps
     * 辅助私网IP
     */
    private String[] secondaryPrivateIps;
    /**
     * adminStatus
     * 是否启用DOWN, UP
     */
    private String adminStatus;

    /**
     * set networkInterfaceName
     * @param networkInterfaceName 虚拟网名称
     * @return this
     */
    public EcsPortsListReturnObj withNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }

    /**
     * set networkInterfaceID
     * @param networkInterfaceID 虚拟网id
     * @return this
     */
    public EcsPortsListReturnObj withNetworkInterfaceID(String networkInterfaceID) {
        this.networkInterfaceID = networkInterfaceID;
        return this;
    }

    /**
     * set vpcID
     * @param vpcID 所属vpc
     * @return this
     */
    public EcsPortsListReturnObj withVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    /**
     * set subnetID
     * @param subnetID 所属子网id
     * @return this
     */
    public EcsPortsListReturnObj withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    /**
     * set role
     * @param role 网卡类型: 0 主网卡， 1 弹性网卡
     * @return this
     */
    public EcsPortsListReturnObj withRole(Integer role) {
        this.role = role;
        return this;
    }

    /**
     * set macAddress
     * @param macAddress mac地址
     * @return this
     */
    public EcsPortsListReturnObj withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * set primaryPrivateIp
     * @param primaryPrivateIp 主ip
     * @return this
     */
    public EcsPortsListReturnObj withPrimaryPrivateIp(String primaryPrivateIp) {
        this.primaryPrivateIp = primaryPrivateIp;
        return this;
    }

    /**
     * set ipv6Addresses
     * @param ipv6Addresses ipv6地址
     * @return this
     */
    public EcsPortsListReturnObj withIpv6Addresses(String[] ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 关联的设备id
     * @return this
     */
    public EcsPortsListReturnObj withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set instanceType
     * @param instanceType 设备类型 VM, BM, Other
     * @return this
     */
    public EcsPortsListReturnObj withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set description
     * @param description 描述
     * @return this
     */
    public EcsPortsListReturnObj withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set securityGroupIds
     * @param securityGroupIds 安全组ID列表
     * @return this
     */
    public EcsPortsListReturnObj withSecurityGroupIds(String[] securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * set secondaryPrivateIps
     * @param secondaryPrivateIps 辅助私网IP
     * @return this
     */
    public EcsPortsListReturnObj withSecondaryPrivateIps(String[] secondaryPrivateIps) {
        this.secondaryPrivateIps = secondaryPrivateIps;
        return this;
    }

    /**
     * set adminStatus
     * @param adminStatus 是否启用DOWN, UP
     * @return this
     */
    public EcsPortsListReturnObj withAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
        return this;
    }

    public String getNetworkInterfaceName() {
        return networkInterfaceName;
    }

    public void setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
    }

    public String getNetworkInterfaceID() {
        return networkInterfaceID;
    }

    public void setNetworkInterfaceID(String networkInterfaceID) {
        this.networkInterfaceID = networkInterfaceID;
    }

    public String getVpcID() {
        return vpcID;
    }

    public void setVpcID(String vpcID) {
        this.vpcID = vpcID;
    }

    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
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

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(String[] securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public String[] getSecondaryPrivateIps() {
        return secondaryPrivateIps;
    }

    public void setSecondaryPrivateIps(String[] secondaryPrivateIps) {
        this.secondaryPrivateIps = secondaryPrivateIps;
    }

    public String getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
    }
}
