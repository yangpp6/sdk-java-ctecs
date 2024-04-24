package cn.ctyun.ctapi.ctecs.ecsvpcquerysecuritygroups;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询用户安全组列表>
 * Entity: EcsVpcQuerySecurityGroupsReturnObj
 */
public class EcsVpcQuerySecurityGroupsReturnObj {
    /**
     * securityGroupName
     * 安全组名称
     */
    private String securityGroupName;
    /**
     * id
     * 安全组id
     */
    private String id;
    /**
     * vmNum
     * 相关云主机
     */
    private String vmNum;
    /**
     * origin
     * 表示是否是默认安全组
     */
    private String origin;
    /**
     * vpcName
     * vpc名称
     */
    private String vpcName;
    /**
     * vpcID
     * 安全组所属的专有网络
     */
    private String vpcID;
    /**
     * creationTime
     * 创建时间
     */
    private String creationTime;
    /**
     * description
     * 安全组描述信息
     */
    private String description;
    /**
     * securityGroupRuleList
     * 安全组规则信息
     */
    private EcsVpcQuerySecurityGroupsSecurityGroupRuleList[] securityGroupRuleList;

    /**
     * set securityGroupName
     * @param securityGroupName 安全组名称
     * @return this
     */
    public EcsVpcQuerySecurityGroupsReturnObj withSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }

    /**
     * set id
     * @param id 安全组id
     * @return this
     */
    public EcsVpcQuerySecurityGroupsReturnObj withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * set vmNum
     * @param vmNum 相关云主机
     * @return this
     */
    public EcsVpcQuerySecurityGroupsReturnObj withVmNum(String vmNum) {
        this.vmNum = vmNum;
        return this;
    }

    /**
     * set origin
     * @param origin 表示是否是默认安全组
     * @return this
     */
    public EcsVpcQuerySecurityGroupsReturnObj withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * set vpcName
     * @param vpcName vpc名称
     * @return this
     */
    public EcsVpcQuerySecurityGroupsReturnObj withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set vpcID
     * @param vpcID 安全组所属的专有网络
     * @return this
     */
    public EcsVpcQuerySecurityGroupsReturnObj withVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    /**
     * set creationTime
     * @param creationTime 创建时间
     * @return this
     */
    public EcsVpcQuerySecurityGroupsReturnObj withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * set description
     * @param description 安全组描述信息
     * @return this
     */
    public EcsVpcQuerySecurityGroupsReturnObj withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set securityGroupRuleList
     * @param securityGroupRuleList 安全组规则信息
     * @return this
     */
    public EcsVpcQuerySecurityGroupsReturnObj withSecurityGroupRuleList(EcsVpcQuerySecurityGroupsSecurityGroupRuleList[] securityGroupRuleList) {
        this.securityGroupRuleList = securityGroupRuleList;
        return this;
    }

    public String getSecurityGroupName() {
        return securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVmNum() {
        return vmNum;
    }

    public void setVmNum(String vmNum) {
        this.vmNum = vmNum;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public String getVpcID() {
        return vpcID;
    }

    public void setVpcID(String vpcID) {
        this.vpcID = vpcID;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EcsVpcQuerySecurityGroupsSecurityGroupRuleList[] getSecurityGroupRuleList() {
        return securityGroupRuleList;
    }

    public void setSecurityGroupRuleList(EcsVpcQuerySecurityGroupsSecurityGroupRuleList[] securityGroupRuleList) {
        this.securityGroupRuleList = securityGroupRuleList;
    }
}
