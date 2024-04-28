package cn.ctyun.ctapi.ctecs.ecsaffinitygroupcreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机组>
 * Entity: EcsAffinityGroupCreateRequestBody
 */
public class EcsAffinityGroupCreateRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * azName
     * 可用区名称。
     */
    private String azName;
    /**
     * affinityGroupName
     * 云主机组名称，满足以下规则：<br />长度在2～63个字符; <br />只能由数字、英文字母、中划线-、下划线_、点.组成
     */
    private String affinityGroupName;
    /**
     * policyID
     * 云主机亲组策略ID。<br/>取值范围：<br/>0：反亲和（ANTI-AFFINITY）。<br/>1：亲和（AFFINITY）。<br/>2：软反亲和（SOFT-ANTI-AFFINITY）。<br/>3：软亲和（SOFT-AFFINITY)。
     */
    private Integer policyID;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsAffinityGroupCreateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称。
     * @return this
     */
    public EcsAffinityGroupCreateRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set affinityGroupName
     * @param affinityGroupName 云主机组名称，满足以下规则：<br />长度在2～63个字符; <br />只能由数字、英文字母、中划线-、下划线_、点.组成
     * @return this
     */
    public EcsAffinityGroupCreateRequestBody withAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
        return this;
    }

    /**
     * set policyID
     * @param policyID 云主机亲组策略ID。<br/>取值范围：<br/>0：反亲和（ANTI-AFFINITY）。<br/>1：亲和（AFFINITY）。<br/>2：软反亲和（SOFT-ANTI-AFFINITY）。<br/>3：软亲和（SOFT-AFFINITY)。
     * @return this
     */
    public EcsAffinityGroupCreateRequestBody withPolicyID(Integer policyID) {
        this.policyID = policyID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public String getAffinityGroupName() {
        return affinityGroupName;
    }

    public void setAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
    }

    public Integer getPolicyID() {
        return policyID;
    }

    public void setPolicyID(Integer policyID) {
        this.policyID = policyID;
    }
}
