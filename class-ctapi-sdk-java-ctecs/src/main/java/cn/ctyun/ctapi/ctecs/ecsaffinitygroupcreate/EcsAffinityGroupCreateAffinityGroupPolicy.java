package cn.ctyun.ctapi.ctecs.ecsaffinitygroupcreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机组>
 * Entity: EcsAffinityGroupCreateAffinityGroupPolicy
 */
public class EcsAffinityGroupCreateAffinityGroupPolicy {
    /**
     * id
     * 云主机组策略ID，<br/>范围：<br/>0：反亲和。<br/>1：亲和。<br/>2：软反亲和。<br/>3：软亲和
     */
    private Integer id;
    /**
     * name
     * 云主机组策略名称
     */
    private String name;

    /**
     * set id
     * @param id 云主机组策略ID，<br/>范围：<br/>0：反亲和。<br/>1：亲和。<br/>2：软反亲和。<br/>3：软亲和
     * @return this
     */
    public EcsAffinityGroupCreateAffinityGroupPolicy withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set name
     * @param name 云主机组策略名称
     * @return this
     */
    public EcsAffinityGroupCreateAffinityGroupPolicy withName(String name) {
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
