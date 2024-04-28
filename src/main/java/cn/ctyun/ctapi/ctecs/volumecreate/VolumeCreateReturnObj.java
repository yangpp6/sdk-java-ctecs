package cn.ctyun.ctapi.ctecs.volumecreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <创建一块按量付费或包年包月云硬盘>
 * Entity: VolumeCreateReturnObj
 */
public class VolumeCreateReturnObj {
    /**
     * masterOrderID
     * 主订单ID。调用方在拿到masterOrderID之后，可以使用materOrderID进一步确认订单状态及资源状态
     */
    private String masterOrderID;
    /**
     * masterOrderNO
     * 订单号
     */
    private String masterOrderNO;
    /**
     * masterResourceID
     * 主资源ID。云硬盘场景下，无需关心
     */
    private String masterResourceID;
    /**
     * masterResourceStatus
     * 主资源状态。只有主订单资源会返回。unknown/failed/ starting
     */
    private String masterResourceStatus;
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * resources
     * 资源明细列表，注：订单未完成情况下不返回；待订单完成后使用创建时同样的clientToken（24小时后失效）进行查询，则返回该部分内容
     */
    private VolumeCreateResources resources;

    /**
     * set masterOrderID
     * @param masterOrderID 主订单ID。调用方在拿到masterOrderID之后，可以使用materOrderID进一步确认订单状态及资源状态
     * @return this
     */
    public VolumeCreateReturnObj withMasterOrderID(String masterOrderID) {
        this.masterOrderID = masterOrderID;
        return this;
    }

    /**
     * set masterOrderNO
     * @param masterOrderNO 订单号
     * @return this
     */
    public VolumeCreateReturnObj withMasterOrderNO(String masterOrderNO) {
        this.masterOrderNO = masterOrderNO;
        return this;
    }

    /**
     * set masterResourceID
     * @param masterResourceID 主资源ID。云硬盘场景下，无需关心
     * @return this
     */
    public VolumeCreateReturnObj withMasterResourceID(String masterResourceID) {
        this.masterResourceID = masterResourceID;
        return this;
    }

    /**
     * set masterResourceStatus
     * @param masterResourceStatus 主资源状态。只有主订单资源会返回。unknown/failed/ starting
     * @return this
     */
    public VolumeCreateReturnObj withMasterResourceStatus(String masterResourceStatus) {
        this.masterResourceStatus = masterResourceStatus;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public VolumeCreateReturnObj withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set resources
     * @param resources 资源明细列表，注：订单未完成情况下不返回；待订单完成后使用创建时同样的clientToken（24小时后失效）进行查询，则返回该部分内容
     * @return this
     */
    public VolumeCreateReturnObj withResources(VolumeCreateResources resources) {
        this.resources = resources;
        return this;
    }

    public String getMasterOrderID() {
        return masterOrderID;
    }

    public void setMasterOrderID(String masterOrderID) {
        this.masterOrderID = masterOrderID;
    }

    public String getMasterOrderNO() {
        return masterOrderNO;
    }

    public void setMasterOrderNO(String masterOrderNO) {
        this.masterOrderNO = masterOrderNO;
    }

    public String getMasterResourceID() {
        return masterResourceID;
    }

    public void setMasterResourceID(String masterResourceID) {
        this.masterResourceID = masterResourceID;
    }

    public String getMasterResourceStatus() {
        return masterResourceStatus;
    }

    public void setMasterResourceStatus(String masterResourceStatus) {
        this.masterResourceStatus = masterResourceStatus;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public VolumeCreateResources getResources() {
        return resources;
    }

    public void setResources(VolumeCreateResources resources) {
        this.resources = resources;
    }
}
