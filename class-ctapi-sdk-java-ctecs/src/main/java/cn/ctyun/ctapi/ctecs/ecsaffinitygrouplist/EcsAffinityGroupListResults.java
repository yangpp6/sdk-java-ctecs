package cn.ctyun.ctapi.ctecs.ecsaffinitygrouplist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组列表或者详情>
 * Entity: EcsAffinityGroupListResults
 */
public class EcsAffinityGroupListResults {
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
    private EcsAffinityGroupListAffinityGroupPolicy affinityGroupPolicy;
    /**
     * createAt
     * 创建时间
     */
    private String createAt;
    /**
     * updateAt
     * 更新时间
     */
    private String updateAt;
    /**
     * deleted
     * 是否删除
     */
    private Boolean deleted;

    /**
     * set affinityGroupID
     * @param affinityGroupID 云主机组ID
     * @return this
     */
    public EcsAffinityGroupListResults withAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
        return this;
    }

    /**
     * set affinityGroupName
     * @param affinityGroupName 云主机组名称
     * @return this
     */
    public EcsAffinityGroupListResults withAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
        return this;
    }

    /**
     * set affinityGroupPolicy
     * @param affinityGroupPolicy 云主机组策略
     * @return this
     */
    public EcsAffinityGroupListResults withAffinityGroupPolicy(EcsAffinityGroupListAffinityGroupPolicy affinityGroupPolicy) {
        this.affinityGroupPolicy = affinityGroupPolicy;
        return this;
    }

    /**
     * set createAt
     * @param createAt 创建时间
     * @return this
     */
    public EcsAffinityGroupListResults withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * set updateAt
     * @param updateAt 更新时间
     * @return this
     */
    public EcsAffinityGroupListResults withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * set deleted
     * @param deleted 是否删除
     * @return this
     */
    public EcsAffinityGroupListResults withDeleted(Boolean deleted) {
        this.deleted = deleted;
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

    public EcsAffinityGroupListAffinityGroupPolicy getAffinityGroupPolicy() {
        return affinityGroupPolicy;
    }

    public void setAffinityGroupPolicy(EcsAffinityGroupListAffinityGroupPolicy affinityGroupPolicy) {
        this.affinityGroupPolicy = affinityGroupPolicy;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
