package cn.ctyun.ctapi.ctecs.ecsaffinitygroupecslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组内的云主机>
 * Entity: EcsAffinityGroupEcsListAffinityGroup
 */
public class EcsAffinityGroupEcsListAffinityGroup {
    /**
     * policy
     * 云主机组策略
     */
    private String policy;
    /**
     * affinityGroupName
     * 云主机组名称
     */
    private String affinityGroupName;
    /**
     * affinityGroupID
     * 云主机组ID
     */
    private String affinityGroupID;

    /**
     * set policy
     * @param policy 云主机组策略
     * @return this
     */
    public EcsAffinityGroupEcsListAffinityGroup withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * set affinityGroupName
     * @param affinityGroupName 云主机组名称
     * @return this
     */
    public EcsAffinityGroupEcsListAffinityGroup withAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
        return this;
    }

    /**
     * set affinityGroupID
     * @param affinityGroupID 云主机组ID
     * @return this
     */
    public EcsAffinityGroupEcsListAffinityGroup withAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
        return this;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getAffinityGroupName() {
        return affinityGroupName;
    }

    public void setAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
    }

    public String getAffinityGroupID() {
        return affinityGroupID;
    }

    public void setAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
    }
}
