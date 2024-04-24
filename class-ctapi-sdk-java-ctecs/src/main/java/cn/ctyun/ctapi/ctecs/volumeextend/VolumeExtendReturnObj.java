package cn.ctyun.ctapi.ctecs.volumeextend;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <扩容云硬盘>
 * Entity: VolumeExtendReturnObj
 */
public class VolumeExtendReturnObj {
    /**
     * masterOrderID
     * 订单ID。调用方在拿到masterOrderID之后，在若干错误情况下，可以使用masterOrderID进一步确认订单状态及资源状态
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
     * 主资源状态。只有主订单资源会返回。unknown/failed/ starting，具体状态信息请参考<a href="https://www.ctyun.cn/document/10027696/10168629">资源状态</a>
     */
    private String masterResourceStatus;

    /**
     * set masterOrderID
     * @param masterOrderID 订单ID。调用方在拿到masterOrderID之后，在若干错误情况下，可以使用masterOrderID进一步确认订单状态及资源状态
     * @return this
     */
    public VolumeExtendReturnObj withMasterOrderID(String masterOrderID) {
        this.masterOrderID = masterOrderID;
        return this;
    }

    /**
     * set masterOrderNO
     * @param masterOrderNO 订单号
     * @return this
     */
    public VolumeExtendReturnObj withMasterOrderNO(String masterOrderNO) {
        this.masterOrderNO = masterOrderNO;
        return this;
    }

    /**
     * set masterResourceID
     * @param masterResourceID 主资源ID。云硬盘场景下，无需关心
     * @return this
     */
    public VolumeExtendReturnObj withMasterResourceID(String masterResourceID) {
        this.masterResourceID = masterResourceID;
        return this;
    }

    /**
     * set masterResourceStatus
     * @param masterResourceStatus 主资源状态。只有主订单资源会返回。unknown/failed/ starting，具体状态信息请参考<a href="https://www.ctyun.cn/document/10027696/10168629">资源状态</a>
     * @return this
     */
    public VolumeExtendReturnObj withMasterResourceStatus(String masterResourceStatus) {
        this.masterResourceStatus = masterResourceStatus;
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
}
