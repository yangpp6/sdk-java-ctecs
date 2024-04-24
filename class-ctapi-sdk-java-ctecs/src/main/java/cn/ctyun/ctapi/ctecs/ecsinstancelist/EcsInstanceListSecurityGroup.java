package cn.ctyun.ctapi.ctecs.ecsinstancelist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机列表>
 * Entity: EcsInstanceListSecurityGroup
 */
public class EcsInstanceListSecurityGroup {
    /**
     * securityGroupID
     * 安全组ID
     */
    private String securityGroupID;
    /**
     * securityGroupName
     * 安全组名称
     */
    private String securityGroupName;

    /**
     * set securityGroupID
     * @param securityGroupID 安全组ID
     * @return this
     */
    public EcsInstanceListSecurityGroup withSecurityGroupID(String securityGroupID) {
        this.securityGroupID = securityGroupID;
        return this;
    }

    /**
     * set securityGroupName
     * @param securityGroupName 安全组名称
     * @return this
     */
    public EcsInstanceListSecurityGroup withSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }

    public String getSecurityGroupID() {
        return securityGroupID;
    }

    public void setSecurityGroupID(String securityGroupID) {
        this.securityGroupID = securityGroupID;
    }

    public String getSecurityGroupName() {
        return securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }
}
