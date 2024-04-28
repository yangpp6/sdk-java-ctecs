package cn.ctyun.ctapi.ctecs.ecsportsshow;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询网卡信息>
 * Entity: EcsPortsShowAssociatedEip
 */
public class EcsPortsShowAssociatedEip {
    /**
     * id
     * 弹性公网IP的ID
     */
    private String id;
    /**
     * name
     * 弹性公网IP的名称
     */
    private String name;

    /**
     * set id
     * @param id 弹性公网IP的ID
     * @return this
     */
    public EcsPortsShowAssociatedEip withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * set name
     * @param name 弹性公网IP的名称
     * @return this
     */
    public EcsPortsShowAssociatedEip withName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
