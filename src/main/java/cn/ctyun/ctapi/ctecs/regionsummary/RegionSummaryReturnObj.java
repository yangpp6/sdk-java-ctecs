package cn.ctyun.ctapi.ctecs.regionsummary;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-资源池概况信息查询>
 * Entity: RegionSummaryReturnObj
 */
public class RegionSummaryReturnObj {
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
     * cpuArches
     * 资源池cpu架构信息
     */
    private String[] cpuArches;
    /**
     * regionVersion
     * 资源池版本
     */
    private String regionVersion;
    /**
     * dedicated
     * 是否是专属资源池，账户可能访问的是一个自己可见的专属资源池
     */
    private Boolean dedicated;
    /**
     * province
     * 省份
     */
    private String province;
    /**
     * city
     * 城市
     */
    private String city;
    /**
     * openapiAvailable
     * 是否支持通过OpenAPI访问
     */
    private Boolean openapiAvailable;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public RegionSummaryReturnObj withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set regionParent
     * @param regionParent 资源池所属省份
     * @return this
     */
    public RegionSummaryReturnObj withRegionParent(String regionParent) {
        this.regionParent = regionParent;
        return this;
    }

    /**
     * set regionName
     * @param regionName 资源池名称
     * @return this
     */
    public RegionSummaryReturnObj withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * set regionType
     * @param regionType 资源池类型
     * @return this
     */
    public RegionSummaryReturnObj withRegionType(String regionType) {
        this.regionType = regionType;
        return this;
    }

    /**
     * set isMultiZones
     * @param isMultiZones 是否多可用区资源池
     * @return this
     */
    public RegionSummaryReturnObj withIsMultiZones(Boolean isMultiZones) {
        this.isMultiZones = isMultiZones;
        return this;
    }

    /**
     * set cpuArches
     * @param cpuArches 资源池cpu架构信息
     * @return this
     */
    public RegionSummaryReturnObj withCpuArches(String[] cpuArches) {
        this.cpuArches = cpuArches;
        return this;
    }

    /**
     * set regionVersion
     * @param regionVersion 资源池版本
     * @return this
     */
    public RegionSummaryReturnObj withRegionVersion(String regionVersion) {
        this.regionVersion = regionVersion;
        return this;
    }

    /**
     * set dedicated
     * @param dedicated 是否是专属资源池，账户可能访问的是一个自己可见的专属资源池
     * @return this
     */
    public RegionSummaryReturnObj withDedicated(Boolean dedicated) {
        this.dedicated = dedicated;
        return this;
    }

    /**
     * set province
     * @param province 省份
     * @return this
     */
    public RegionSummaryReturnObj withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * set city
     * @param city 城市
     * @return this
     */
    public RegionSummaryReturnObj withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * set openapiAvailable
     * @param openapiAvailable 是否支持通过OpenAPI访问
     * @return this
     */
    public RegionSummaryReturnObj withOpenapiAvailable(Boolean openapiAvailable) {
        this.openapiAvailable = openapiAvailable;
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

    public String[] getCpuArches() {
        return cpuArches;
    }

    public void setCpuArches(String[] cpuArches) {
        this.cpuArches = cpuArches;
    }

    public String getRegionVersion() {
        return regionVersion;
    }

    public void setRegionVersion(String regionVersion) {
        this.regionVersion = regionVersion;
    }

    public Boolean getDedicated() {
        return dedicated;
    }

    public void setDedicated(Boolean dedicated) {
        this.dedicated = dedicated;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getOpenapiAvailable() {
        return openapiAvailable;
    }

    public void setOpenapiAvailable(Boolean openapiAvailable) {
        this.openapiAvailable = openapiAvailable;
    }
}
