package cn.ctyun.ctapi.ctecs.ecsvolumecreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建一块按量付费或包年包月云硬盘>
 * Entity: EcsVolumeCreateReturnObj
 */
public class EcsVolumeCreateReturnObj {
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
     * 资源明细列表
     */
    private EcsVolumeCreateResources resources;

    /**
     * set masterOrderID
     * @param masterOrderID 主订单ID。调用方在拿到masterOrderID之后，可以使用materOrderID进一步确认订单状态及资源状态
     * @return this
     */
    public EcsVolumeCreateReturnObj withMasterOrderID(String masterOrderID) {
        this.masterOrderID = masterOrderID;
        return this;
    }

    /**
     * set masterOrderNO
     * @param masterOrderNO 订单号
     * @return this
     */
    public EcsVolumeCreateReturnObj withMasterOrderNO(String masterOrderNO) {
        this.masterOrderNO = masterOrderNO;
        return this;
    }

    /**
     * set masterResourceID
     * @param masterResourceID 主资源ID。云硬盘场景下，无需关心
     * @return this
     */
    public EcsVolumeCreateReturnObj withMasterResourceID(String masterResourceID) {
        this.masterResourceID = masterResourceID;
        return this;
    }

    /**
     * set masterResourceStatus
     * @param masterResourceStatus 主资源状态。只有主订单资源会返回。unknown/failed/ starting
     * @return this
     */
    public EcsVolumeCreateReturnObj withMasterResourceStatus(String masterResourceStatus) {
        this.masterResourceStatus = masterResourceStatus;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsVolumeCreateReturnObj withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set resources
     * @param resources 资源明细列表
     * @return this
     */
    public EcsVolumeCreateReturnObj withResources(EcsVolumeCreateResources resources) {
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

    public EcsVolumeCreateResources getResources() {
        return resources;
    }

    public void setResources(EcsVolumeCreateResources resources) {
        this.resources = resources;
    }
}
