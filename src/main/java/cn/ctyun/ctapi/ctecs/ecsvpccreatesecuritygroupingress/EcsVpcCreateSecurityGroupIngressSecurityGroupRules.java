package cn.ctyun.ctapi.ctecs.ecsvpccreatesecuritygroupingress;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建安全组入向规则>
 * Entity: EcsVpcCreateSecurityGroupIngressSecurityGroupRules
 */
public class EcsVpcCreateSecurityGroupIngressSecurityGroupRules {
    /**
     * direction
     * 规则方向，入方向则填写ingress
     */
    private String direction;
    /**
     * action
     * 授权策略，取值范围：accept（允许），drop（拒绝）。
     */
    private String action;
    /**
     * priority
     * 优先级，取值范围：[1, 100] <br />注：取值越小优先级越大。
     */
    private Integer priority;
    /**
     * protocol
     * 网络协议，取值范围：ANY（任意）、TCP、UDP、ICMP(v4)
     */
    private String protocol;
    /**
     * ethertype
     * IP类型，取值范围：IPv4、IPv6
     */
    private String ethertype;
    /**
     * destCidrIp
     * 远端地址:0.0.0.0/0
     */
    private String destCidrIp;
    /**
     * description
     * 安全组规则描述信息，满足以下规则：<br />① 长度0-128字符，<br />② 支持拉丁字母、中文、数字, 特殊字符<br />！@#￥%……&*（）——-+={}《》？：“”【】、；‘'，。、<br />不能以 http: / https: 开头
     */
    private String description;
    /**
     * range
     * 安全组开放的传输层协议相关的源端端口范围
     */
    private String range;

    /**
     * set direction
     * @param direction 规则方向，入方向则填写ingress
     * @return this
     */
    public EcsVpcCreateSecurityGroupIngressSecurityGroupRules withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * set action
     * @param action 授权策略，取值范围：accept（允许），drop（拒绝）。
     * @return this
     */
    public EcsVpcCreateSecurityGroupIngressSecurityGroupRules withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * set priority
     * @param priority 优先级，取值范围：[1, 100] <br />注：取值越小优先级越大。
     * @return this
     */
    public EcsVpcCreateSecurityGroupIngressSecurityGroupRules withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * set protocol
     * @param protocol 网络协议，取值范围：ANY（任意）、TCP、UDP、ICMP(v4)
     * @return this
     */
    public EcsVpcCreateSecurityGroupIngressSecurityGroupRules withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * set ethertype
     * @param ethertype IP类型，取值范围：IPv4、IPv6
     * @return this
     */
    public EcsVpcCreateSecurityGroupIngressSecurityGroupRules withEthertype(String ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    /**
     * set destCidrIp
     * @param destCidrIp 远端地址:0.0.0.0/0
     * @return this
     */
    public EcsVpcCreateSecurityGroupIngressSecurityGroupRules withDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }

    /**
     * set description
     * @param description 安全组规则描述信息，满足以下规则：<br />① 长度0-128字符，<br />② 支持拉丁字母、中文、数字, 特殊字符<br />！@#￥%……&*（）——-+={}《》？：“”【】、；‘'，。、<br />不能以 http: / https: 开头
     * @return this
     */
    public EcsVpcCreateSecurityGroupIngressSecurityGroupRules withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set range
     * @param range 安全组开放的传输层协议相关的源端端口范围
     * @return this
     */
    public EcsVpcCreateSecurityGroupIngressSecurityGroupRules withRange(String range) {
        this.range = range;
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

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getEthertype() {
        return ethertype;
    }

    public void setEthertype(String ethertype) {
        this.ethertype = ethertype;
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

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
