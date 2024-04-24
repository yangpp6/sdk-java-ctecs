package cn.ctyun.ctapi.ctecs.ecsvpcquerysecuritygroups;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询用户安全组列表>
 * Entity: EcsVpcQuerySecurityGroupsSecurityGroupRuleList
 */
public class EcsVpcQuerySecurityGroupsSecurityGroupRuleList {
    /**
     * direction
     * 出方向-egress、入方向-ingress
     */
    private String direction;
    /**
     * action
     * 拒绝策略:允许-accept 拒绝-drop
     */
    private String action;
    /**
     * origin
     * 来源
     */
    private String origin;
    /**
     * priority
     * 优先级:0~100
     */
    private Integer priority;
    /**
     * ethertype
     * IP类型:IPv4、IPv6
     */
    private String ethertype;
    /**
     * protocol
     * 协议: ANY、TCP、UDP、ICMP、ICMP6
     */
    private String protocol;
    /**
     * range
     * 接口范围/ICMP类型:1-65535
     */
    private String range;
    /**
     * destCidrIp
     * 远端地址:0.0.0.0/0
     */
    private String destCidrIp;
    /**
     * description
     * 安全组规则描述信息
     */
    private String description;
    /**
     * createTime
     * 创建时间，UTC时间
     */
    private String createTime;
    /**
     * id
     * 唯一标识ID
     */
    private String id;
    /**
     * securityGroupID
     * 安全组ID
     */
    private String securityGroupID;

    /**
     * set direction
     * @param direction 出方向-egress、入方向-ingress
     * @return this
     */
    public EcsVpcQuerySecurityGroupsSecurityGroupRuleList withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * set action
     * @param action 拒绝策略:允许-accept 拒绝-drop
     * @return this
     */
    public EcsVpcQuerySecurityGroupsSecurityGroupRuleList withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * set origin
     * @param origin 来源
     * @return this
     */
    public EcsVpcQuerySecurityGroupsSecurityGroupRuleList withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * set priority
     * @param priority 优先级:0~100
     * @return this
     */
    public EcsVpcQuerySecurityGroupsSecurityGroupRuleList withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * set ethertype
     * @param ethertype IP类型:IPv4、IPv6
     * @return this
     */
    public EcsVpcQuerySecurityGroupsSecurityGroupRuleList withEthertype(String ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    /**
     * set protocol
     * @param protocol 协议: ANY、TCP、UDP、ICMP、ICMP6
     * @return this
     */
    public EcsVpcQuerySecurityGroupsSecurityGroupRuleList withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * set range
     * @param range 接口范围/ICMP类型:1-65535
     * @return this
     */
    public EcsVpcQuerySecurityGroupsSecurityGroupRuleList withRange(String range) {
        this.range = range;
        return this;
    }

    /**
     * set destCidrIp
     * @param destCidrIp 远端地址:0.0.0.0/0
     * @return this
     */
    public EcsVpcQuerySecurityGroupsSecurityGroupRuleList withDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }

    /**
     * set description
     * @param description 安全组规则描述信息
     * @return this
     */
    public EcsVpcQuerySecurityGroupsSecurityGroupRuleList withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set createTime
     * @param createTime 创建时间，UTC时间
     * @return this
     */
    public EcsVpcQuerySecurityGroupsSecurityGroupRuleList withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set id
     * @param id 唯一标识ID
     * @return this
     */
    public EcsVpcQuerySecurityGroupsSecurityGroupRuleList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * set securityGroupID
     * @param securityGroupID 安全组ID
     * @return this
     */
    public EcsVpcQuerySecurityGroupsSecurityGroupRuleList withSecurityGroupID(String securityGroupID) {
        this.securityGroupID = securityGroupID;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getEthertype() {
        return ethertype;
    }

    public void setEthertype(String ethertype) {
        this.ethertype = ethertype;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getDestCidrIp() {
        return destCidrIp;
    }

    public void setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSecurityGroupID() {
        return securityGroupID;
    }

    public void setSecurityGroupID(String securityGroupID) {
        this.securityGroupID = securityGroupID;
    }
}
