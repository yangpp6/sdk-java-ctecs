package cn.ctyun.ctapi.ctecs.listinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机列表>
 * Entity: ListInstancesAffinityGroup
 */
public class ListInstancesAffinityGroup {
    /**
     * affinityGroupPolicy
     * 云主机组策略
     */
    private String affinityGroupPolicy;
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
     * set affinityGroupPolicy
     * @param affinityGroupPolicy 云主机组策略
     * @return this
     */
    public ListInstancesAffinityGroup withAffinityGroupPolicy(String affinityGroupPolicy) {
        this.affinityGroupPolicy = affinityGroupPolicy;
        return this;
    }

    /**
     * set affinityGroupName
     * @param affinityGroupName 云主机组名称
     * @return this
     */
    public ListInstancesAffinityGroup withAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
        return this;
    }

    /**
     * set affinityGroupID
     * @param affinityGroupID 云主机组ID
     * @return this
     */
    public ListInstancesAffinityGroup withAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
        return this;
    }

    public String getAffinityGroupPolicy() {
        return affinityGroupPolicy;
    }

    public void setAffinityGroupPolicy(String affinityGroupPolicy) {
        this.affinityGroupPolicy = affinityGroupPolicy;
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
