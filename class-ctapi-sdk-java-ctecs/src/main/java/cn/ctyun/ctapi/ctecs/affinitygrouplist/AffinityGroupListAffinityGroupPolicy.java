package cn.ctyun.ctapi.ctecs.affinitygrouplist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组列表或者详情>
 * Entity: AffinityGroupListAffinityGroupPolicy
 */
public class AffinityGroupListAffinityGroupPolicy {
    /**
     * policyType
     * 云主机组策略类型。<br />取值范围：<br />0（反亲和ANTI-AFFINITY），<br />1（亲和AFFINITY），<br />2（软反亲和SOFT-ANTI-AFFINITY），<br />3（软亲和SOFT-AFFINITY)<br />
     */
    private Integer policyType;
    /**
     * policyTypeName
     * 云主机组策略类型名称
     */
    private String policyTypeName;

    /**
     * set policyType
     * @param policyType 云主机组策略类型。<br />取值范围：<br />0（反亲和ANTI-AFFINITY），<br />1（亲和AFFINITY），<br />2（软反亲和SOFT-ANTI-AFFINITY），<br />3（软亲和SOFT-AFFINITY)<br />
     * @return this
     */
    public AffinityGroupListAffinityGroupPolicy withPolicyType(Integer policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * set policyTypeName
     * @param policyTypeName 云主机组策略类型名称
     * @return this
     */
    public AffinityGroupListAffinityGroupPolicy withPolicyTypeName(String policyTypeName) {
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
