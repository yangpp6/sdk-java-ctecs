package cn.ctyun.ctapi.ctecs.ecsliteresubscribe;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <续订轻量型云主机>
 * Entity: EcsLiteResubscribeReturnObj
 */
public class EcsLiteResubscribeReturnObj {
    /**
     * masterOrderID
     * 订单ID。调用方在拿到masterOrderID之后，在若干错误情况下，可以使用materOrderID进一步确认订单状态及资源状态。
     */
    private String masterOrderID;
    /**
     * masterOrderNO
     * 订单号
     */
    private String masterOrderNO;
    /**
     * regionID
     * 资源所属资源池ID
     */
    private String regionID;

    /**
     * set masterOrderID
     * @param masterOrderID 订单ID。调用方在拿到masterOrderID之后，在若干错误情况下，可以使用materOrderID进一步确认订单状态及资源状态。
     * @return this
     */
    public EcsLiteResubscribeReturnObj withMasterOrderID(String masterOrderID) {
        this.masterOrderID = masterOrderID;
        return this;
    }

    /**
     * set masterOrderNO
     * @param masterOrderNO 订单号
     * @return this
     */
    public EcsLiteResubscribeReturnObj withMasterOrderNO(String masterOrderNO) {
        this.masterOrderNO = masterOrderNO;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源所属资源池ID
     * @return this
     */
    public EcsLiteResubscribeReturnObj withRegionID(String regionID) {
        this.regionID = regionID;
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

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }
}