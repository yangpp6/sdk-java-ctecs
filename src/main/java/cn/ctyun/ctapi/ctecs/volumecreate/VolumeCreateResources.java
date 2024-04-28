package cn.ctyun.ctapi.ctecs.volumecreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <创建一块按量付费或包年包月云硬盘>
 * Entity: VolumeCreateResources
 */
public class VolumeCreateResources {
    /**
     * diskID
     * 资源底层ID，即磁盘ID
     */
    private String diskID;
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
     * 资源状态，无需关心。参考masterResourceStatus
     */
    private Integer status;
    /**
     * isMaster
     * 是否是主资源项
     */
    private Boolean isMaster;
    /**
     * itemValue
     * 资源规格，这里指磁盘大小，单位GB
     */
    private Integer itemValue;
    /**
     * resourceType
     * 资源类型，云硬盘为EBS
     */
    private String resourceType;
    /**
     * diskName
     * 云硬盘名称
     */
    private String diskName;

    /**
     * set diskID
     * @param diskID 资源底层ID，即磁盘ID
     * @return this
     */
    public VolumeCreateResources withDiskID(String diskID) {
        this.diskID = diskID;
        return this;
    }

    /**
     * set orderID
     * @param orderID 无需关心
     * @return this
     */
    public VolumeCreateResources withOrderID(String orderID) {
        this.orderID = orderID;
        return this;
    }

    /**
     * set startTime
     * @param startTime 启动时刻，epoch时戳，毫秒精度
     * @return this
     */
    public VolumeCreateResources withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set createTime
     * @param createTime 创建时刻，epoch时戳，毫秒精度
     * @return this
     */
    public VolumeCreateResources withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set updateTime
     * @param updateTime 更新时刻，epoch时戳，毫秒精度
     * @return this
     */
    public VolumeCreateResources withUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set status
     * @param status 资源状态，无需关心。参考masterResourceStatus
     * @return this
     */
    public VolumeCreateResources withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set isMaster
     * @param isMaster 是否是主资源项
     * @return this
     */
    public VolumeCreateResources withIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * set itemValue
     * @param itemValue 资源规格，这里指磁盘大小，单位GB
     * @return this
     */
    public VolumeCreateResources withItemValue(Integer itemValue) {
        this.itemValue = itemValue;
        return this;
    }

    /**
     * set resourceType
     * @param resourceType 资源类型，云硬盘为EBS
     * @return this
     */
    public VolumeCreateResources withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set diskName
     * @param diskName 云硬盘名称
     * @return this
     */
    public VolumeCreateResources withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    public String getDiskID() {
        return diskID;
    }

    public void setDiskID(String diskID) {
        this.diskID = diskID;
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

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }
}
