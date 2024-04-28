package cn.ctyun.ctapi.ctecs.regionzones;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-资源池可用区查询>
 * Entity: RegionZonesReturnObj
 */
public class RegionZonesReturnObj {
    /**
     * zoneList
     * 可用区列表
     */
    private RegionZonesZone[] zoneList;

    /**
     * set zoneList
     * @param zoneList 可用区列表
     * @return this
     */
    public RegionZonesReturnObj withZoneList(RegionZonesZone[] zoneList) {
        this.zoneList = zoneList;
        return this;
    }

    public RegionZonesZone[] getZoneList() {
        return zoneList;
    }

    public void setZoneList(RegionZonesZone[] zoneList) {
        this.zoneList = zoneList;
    }
}
