package cn.ctyun.ctapi.ctecs.ecsdescribeavailabilityzones;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询账户资源池下可用区信息>
 * Entity: EcsDescribeAvailabilityZonesAvailabilityZones
 */
public class EcsDescribeAvailabilityZonesAvailabilityZones {
    /**
     * id
     * 可用区ID
     */
    private String id;
    /**
     * name
     * 可用区名称
     */
    private String name;

    /**
     * set id
     * @param id 可用区ID
     * @return this
     */
    public EcsDescribeAvailabilityZonesAvailabilityZones withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * set name
     * @param name 可用区名称
     * @return this
     */
    public EcsDescribeAvailabilityZonesAvailabilityZones withName(String name) {
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
