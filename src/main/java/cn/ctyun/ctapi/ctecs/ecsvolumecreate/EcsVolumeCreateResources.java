package cn.ctyun.ctapi.ctecs.ecsvolumecreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建一块按量付费或包年包月云硬盘>
 * Entity: EcsVolumeCreateResources
 */
public class EcsVolumeCreateResources {
    /**
     * resourceID
     * 单项资源的变配、续订、退订等需要该资源项的ID。<br/>比如某个云主机资源作为主资源，对其挂载
     */
    private String resourceID;
    /**
     * orderID
     * 无需关心
     */
    private String orderID;
    /**
     * startTime
     * 启动时刻，epoch时戳，毫秒精度
     */
    private Integer startTime;
    /**
     * createTime
     * 创建时刻，epoch时戳，毫秒精度
     */
    private Integer createTime;
    /**
     * updateTime
     * 更新时刻，epoch时戳，毫秒精度
     */
    private Integer updateTime;
    /**
     * status
     * 资源状态，无需关心。
     */
    private Integer status;
    /**
     * isMaster
     * 是否是主资源项
     */
    private Boolean isMaster;
    /**
     * itemValue
     * 资源规格，磁盘资源为磁盘大小GB
     */
    private Integer itemValue;
    /**
     * resourceUUID
     * 资源UUID，结合regionID一起使用
     */
    private String resourceUUID;
    /**
     * resourceType
     * 资源类型，云硬盘为EBS
     */
    private String resourceType;
    /**
     * masterResourceID
     * 主资源ID。云硬盘场景下，无需关心。
     */
    private String masterResourceID;
    /**
     * name
     * 云硬盘名称
     */
    private String name;

    /**
     * set resourceID
     * @param resourceID 单项资源的变配、续订、退订等需要该资源项的ID。<br/>比如某个云主机资源作为主资源，对其挂载
     * @return this
     */
    public EcsVolumeCreateResources withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * set orderID
     * @param orderID 无需关心
     * @return this
     */
    public EcsVolumeCreateResources withOrderID(String orderID) {
        this.orderID = orderID;
        return this;
    }

    /**
     * set startTime
     * @param startTime 启动时刻，epoch时戳，毫秒精度
     * @return this
     */
    public EcsVolumeCreateResources withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set createTime
     * @param createTime 创建时刻，epoch时戳，毫秒精度
     * @return this
     */
    public EcsVolumeCreateResources withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set updateTime
     * @param updateTime 更新时刻，epoch时戳，毫秒精度
     * @return this
     */
    public EcsVolumeCreateResources withUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set status
     * @param status 资源状态，无需关心。
     * @return this
     */
    public EcsVolumeCreateResources withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set isMaster
     * @param isMaster 是否是主资源项
     * @return this
     */
    public EcsVolumeCreateResources withIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * set itemValue
     * @param itemValue 资源规格，磁盘资源为磁盘大小GB
     * @return this
     */
    public EcsVolumeCreateResources withItemValue(Integer itemValue) {
        this.itemValue = itemValue;
        return this;
    }

    /**
     * set resourceUUID
     * @param resourceUUID 资源UUID，结合regionID一起使用
     * @return this
     */
    public EcsVolumeCreateResources withResourceUUID(String resourceUUID) {
        this.resourceUUID = resourceUUID;
        return this;
    }

    /**
     * set resourceType
     * @param resourceType 资源类型，云硬盘为EBS
     * @return this
     */
    public EcsVolumeCreateResources withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set masterResourceID
     * @param masterResourceID 主资源ID。云硬盘场景下，无需关心。
     * @return this
     */
    public EcsVolumeCreateResources withMasterResourceID(String masterResourceID) {
        this.masterResourceID = masterResourceID;
        return this;
    }

    /**
     * set name
     * @param name 云硬盘名称
     * @return this
     */
    public EcsVolumeCreateResources withName(String name) {
        this.name = name;
        return this;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
    }

    public Integer getItemValue() {
        return itemValue;
    }

    public void setItemValue(Integer itemValue) {
        this.itemValue = itemValue;
    }

    public String getResourceUUID() {
        return resourceUUID;
    }

    public void setResourceUUID(String resourceUUID) {
        this.resourceUUID = resourceUUID;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getMasterResourceID() {
        return masterResourceID;
    }

    public void setMasterResourceID(String masterResourceID) {
        this.masterResourceID = masterResourceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
