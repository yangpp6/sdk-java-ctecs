package cn.ctyun.ctapi.ctecs.regionlist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-资源池列表查询>
 * Entity: RegionListRegionList
 */
public class RegionListRegionList {
    /**
     * regionID
     * 资源池ID	
     */
    private String regionID;
    /**
     * regionParent
     * 资源池所属省份	
     */
    private String regionParent;
    /**
     * regionName
     * 资源池名称	
     */
    private String regionName;
    /**
     * regionType
     * 资源池类型	
     */
    private String regionType;
    /**
     * isMultiZones
     * 是否多可用区资源池	
     */
    private Boolean isMultiZones;
    /**
     * zoneList
     * 可用区列表	
     */
    private String[] zoneList;

    /**
     * set regionID
     * @param regionID 资源池ID	
     * @return this
     */
    public RegionListRegionList withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set regionParent
     * @param regionParent 资源池所属省份	
     * @return this
     */
    public RegionListRegionList withRegionParent(String regionParent) {
        this.regionParent = regionParent;
        return this;
    }

    /**
     * set regionName
     * @param regionName 资源池名称	
     * @return this
     */
    public RegionListRegionList withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * set regionType
     * @param regionType 资源池类型	
     * @return this
     */
    public RegionListRegionList withRegionType(String regionType) {
        this.regionType = regionType;
        return this;
    }

    /**
     * set isMultiZones
     * @param isMultiZones 是否多可用区资源池	
     * @return this
     */
    public RegionListRegionList withIsMultiZones(Boolean isMultiZones) {
        this.isMultiZones = isMultiZones;
        return this;
    }

    /**
     * set zoneList
     * @param zoneList 可用区列表	
     * @return this
     */
    public RegionListRegionList withZoneList(String[] zoneList) {
        this.zoneList = zoneList;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getRegionParent() {
        return regionParent;
    }

    public void setRegionParent(String regionParent) {
        this.regionParent = regionParent;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionType() {
        return regionType;
    }

    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    public Boolean getIsMultiZones() {
        return isMultiZones;
    }

    public void setIsMultiZones(Boolean isMultiZones) {
        this.isMultiZones = isMultiZones;
    }

    public String[] getZoneList() {
        return zoneList;
    }

    public void setZoneList(String[] zoneList) {
        this.zoneList = zoneList;
    }
}
