package cn.ctyun.ctapi.ctecs.ecsaffinitygroupcreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机组>
 * Entity: EcsAffinityGroupCreateResults
 */
public class EcsAffinityGroupCreateResults {
    /**
     * affinityGroupID
     * 云主机组ID
     */
    private String affinityGroupID;
    /**
     * affinityGroupName
     * 云主机组名称
     */
    private String affinityGroupName;
    /**
     * affinityGroupPolicy
     * 云主机组策略
     */
    private EcsAffinityGroupCreateAffinityGroupPolicy affinityGroupPolicy;

    /**
     * set affinityGroupID
     * @param affinityGroupID 云主机组ID
     * @return this
     */
    public EcsAffinityGroupCreateResults withAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
        return this;
    }

    /**
     * set affinityGroupName
     * @param affinityGroupName 云主机组名称
     * @return this
     */
    public EcsAffinityGroupCreateResults withAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
        return this;
    }

    /**
     * set affinityGroupPolicy
     * @param affinityGroupPolicy 云主机组策略
     * @return this
     */
    public EcsAffinityGroupCreateResults withAffinityGroupPolicy(EcsAffinityGroupCreateAffinityGroupPolicy affinityGroupPolicy) {
        this.affinityGroupPolicy = affinityGroupPolicy;
        return this;
    }

    public String getAffinityGroupID() {
        return affinityGroupID;
    }

    public void setAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
    }

    public String getAffinityGroupName() {
        return affinityGroupName;
    }

    public void setAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
    }

    public EcsAffinityGroupCreateAffinityGroupPolicy getAffinityGroupPolicy() {
        return affinityGroupPolicy;
    }

    public void setAffinityGroupPolicy(EcsAffinityGroupCreateAffinityGroupPolicy affinityGroupPolicy) {
        this.affinityGroupPolicy = affinityGroupPolicy;
    }
}
