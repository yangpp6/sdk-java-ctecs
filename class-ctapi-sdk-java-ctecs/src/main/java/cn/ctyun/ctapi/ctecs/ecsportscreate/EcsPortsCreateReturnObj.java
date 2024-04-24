package cn.ctyun.ctapi.ctecs.ecsportscreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建弹性网卡>
 * Entity: EcsPortsCreateReturnObj
 */
public class EcsPortsCreateReturnObj {
    /**
     * vpcID
     * vpc的ID
     */
    private String vpcID;
    /**
     * subnetID
     * 子网ID
     */
    private String subnetID;
    /**
     * networkInterfaceID
     * 网卡ID
     */
    private String networkInterfaceID;
    /**
     * networkInterfaceName
     * 网卡名称
     */
    private String networkInterfaceName;
    /**
     * macAddress
     * mac地址
     */
    private String macAddress;
    /**
     * description
     * 网卡描述
     */
    private String description;
    /**
     * ipv6Address
     * IPv6地址列表
     */
    private String[] ipv6Address;
    /**
     * securityGroupIds
     * 安全组ID列表
     */
    private String[] securityGroupIds;
    /**
     * secondaryPrivateIps
     * 二级IP地址列表
     */
    private String[] secondaryPrivateIps;
    /**
     * privateIpAddress
     * 弹性网卡的主私有IP
     */
    private String privateIpAddress;
    /**
     * instanceOwnerID
     * 绑定的实例的所有者ID
     */
    private String instanceOwnerID;
    /**
     * instanceType
     * 绑定的实例类型
     */
    private String instanceType;
    /**
     * instanceID
     * 绑定的实例ID
     */
    private String instanceID;

    /**
     * set vpcID
     * @param vpcID vpc的ID
     * @return this
     */
    public EcsPortsCreateReturnObj withVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    /**
     * set subnetID
     * @param subnetID 子网ID
     * @return this
     */
    public EcsPortsCreateReturnObj withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    /**
     * set networkInterfaceID
     * @param networkInterfaceID 网卡ID
     * @return this
     */
    public EcsPortsCreateReturnObj withNetworkInterfaceID(String networkInterfaceID) {
        this.networkInterfaceID = networkInterfaceID;
        return this;
    }

    /**
     * set networkInterfaceName
     * @param networkInterfaceName 网卡名称
     * @return this
     */
    public EcsPortsCreateReturnObj withNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }

    /**
     * set macAddress
     * @param macAddress mac地址
     * @return this
     */
    public EcsPortsCreateReturnObj withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * set description
     * @param description 网卡描述
     * @return this
     */
    public EcsPortsCreateReturnObj withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set ipv6Address
     * @param ipv6Address IPv6地址列表
     * @return this
     */
    public EcsPortsCreateReturnObj withIpv6Address(String[] ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    /**
     * set securityGroupIds
     * @param securityGroupIds 安全组ID列表
     * @return this
     */
    public EcsPortsCreateReturnObj withSecurityGroupIds(String[] securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * set secondaryPrivateIps
     * @param secondaryPrivateIps 二级IP地址列表
     * @return this
     */
    public EcsPortsCreateReturnObj withSecondaryPrivateIps(String[] secondaryPrivateIps) {
        this.secondaryPrivateIps = secondaryPrivateIps;
        return this;
    }

    /**
     * set privateIpAddress
     * @param privateIpAddress 弹性网卡的主私有IP
     * @return this
     */
    public EcsPortsCreateReturnObj withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * set instanceOwnerID
     * @param instanceOwnerID 绑定的实例的所有者ID
     * @return this
     */
    public EcsPortsCreateReturnObj withInstanceOwnerID(String instanceOwnerID) {
        this.instanceOwnerID = instanceOwnerID;
        return this;
    }

    /**
     * set instanceType
     * @param instanceType 绑定的实例类型
     * @return this
     */
    public EcsPortsCreateReturnObj withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 绑定的实例ID
     * @return this
     */
    public EcsPortsCreateReturnObj withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
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

    public String getNetworkInterfaceID() {
        return networkInterfaceID;
    }

    public void setNetworkInterfaceID(String networkInterfaceID) {
        this.networkInterfaceID = networkInterfaceID;
    }

    public String getNetworkInterfaceName() {
        return networkInterfaceName;
    }

    public void setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getIpv6Address() {
        return ipv6Address;
    }

    public void setIpv6Address(String[] ipv6Address) {
        this.ipv6Address = ipv6Address;
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

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public String getInstanceOwnerID() {
        return instanceOwnerID;
    }

    public void setInstanceOwnerID(String instanceOwnerID) {
        this.instanceOwnerID = instanceOwnerID;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }
}
