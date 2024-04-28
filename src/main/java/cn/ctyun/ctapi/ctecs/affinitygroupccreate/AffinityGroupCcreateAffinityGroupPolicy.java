package cn.ctyun.ctapi.ctecs.affinitygroupccreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机组>
 * Entity: AffinityGroupCcreateAffinityGroupPolicy
 */
public class AffinityGroupCcreateAffinityGroupPolicy {
    /**
     * policyType
     * 云主机组策略类型，<br />范围：<br />0：反亲和。<br />1：亲和。<br />2：软反亲和。<br />3：软亲和
     */
    private Integer policyType;
    /**
     * policyTypeName
     * 云主机组策略类型名称
     */
    private String policyTypeName;

    /**
     * set policyType
     * @param policyType 云主机组策略类型，<br />范围：<br />0：反亲和。<br />1：亲和。<br />2：软反亲和。<br />3：软亲和
     * @return this
     */
    public AffinityGroupCcreateAffinityGroupPolicy withPolicyType(Integer policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * set policyTypeName
     * @param policyTypeName 云主机组策略类型名称
     * @return this
     */
    public AffinityGroupCcreateAffinityGroupPolicy withPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
        return this;
    }

    public Integer getPolicyType() {
        return policyType;
    }

    public void setPolicyType(Integer policyType) {
        this.policyType = policyType;
    }

    public String getPolicyTypeName() {
        return policyTypeName;
    }

    public void setPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
    }
}
