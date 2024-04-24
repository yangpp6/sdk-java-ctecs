package cn.ctyun.ctapi.ctecs.ecsaffinitygrouplist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组列表或者详情>
 * Entity: EcsAffinityGroupListAffinityGroupPolicy
 */
public class EcsAffinityGroupListAffinityGroupPolicy {
    /**
     * id
     * 云主机组策略ID
     */
    private Integer id;
    /**
     * name
     * 云主机组策略名称
     */
    private String name;

    /**
     * set id
     * @param id 云主机组策略ID
     * @return this
     */
    public EcsAffinityGroupListAffinityGroupPolicy withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set name
     * @param name 云主机组策略名称
     * @return this
     */
    public EcsAffinityGroupListAffinityGroupPolicy withName(String name) {
        this.name = name;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
