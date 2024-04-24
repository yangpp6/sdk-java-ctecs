package cn.ctyun.ctapi.ctecs.ecsvpccreatesecuritygroup;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建安全组>
 * Entity: EcsVpcCreateSecurityGroupReturnObj
 */
public class EcsVpcCreateSecurityGroupReturnObj {
    /**
     * securityGroupID
     * 安全组ID
     */
    private String securityGroupID;

    /**
     * set securityGroupID
     * @param securityGroupID 安全组ID
     * @return this
     */
    public EcsVpcCreateSecurityGroupReturnObj withSecurityGroupID(String securityGroupID) {
        this.securityGroupID = securityGroupID;
        return this;
    }

    public String getSecurityGroupID() {
        return securityGroupID;
    }

    public void setSecurityGroupID(String securityGroupID) {
        this.securityGroupID = securityGroupID;
    }
}
