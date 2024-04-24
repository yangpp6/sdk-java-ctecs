package cn.ctyun.ctapi.ctecs.regionzones;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-资源池可用区查询>
 * Entity: RegionZonesZone
 */
public class RegionZonesZone {
    /**
     * name
     * 可用区名称，其他需要可用区参数的接口需要依赖该名称结果
     */
    private String name;
    /**
     * azDisplayName
     * 可用区展示名
     */
    private String azDisplayName;

    /**
     * set name
     * @param name 可用区名称，其他需要可用区参数的接口需要依赖该名称结果
     * @return this
     */
    public RegionZonesZone withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * set azDisplayName
     * @param azDisplayName 可用区展示名
     * @return this
     */
    public RegionZonesZone withAzDisplayName(String azDisplayName) {
        this.azDisplayName = azDisplayName;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAzDisplayName() {
        return azDisplayName;
    }

    public void setAzDisplayName(String azDisplayName) {
        this.azDisplayName = azDisplayName;
    }
}
