package cn.ctyun.ctapi.ctecs.ecsbatchnew;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量创建按量付费或者包年包月云主机>
 * Entity: EcsBatchNewReturnObj
 */
public class EcsBatchNewReturnObj {
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
     * 主资源ID
     */
    private String masterResourceID;
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;

    /**
     * set masterOrderID
     * @param masterOrderID 主订单ID。调用方在拿到masterOrderID之后，可以使用materOrderID进一步确认订单状态及资源状态
     * @return this
     */
    public EcsBatchNewReturnObj withMasterOrderID(String masterOrderID) {
        this.masterOrderID = masterOrderID;
        return this;
    }

    /**
     * set masterOrderNO
     * @param masterOrderNO 订单号
     * @return this
     */
    public EcsBatchNewReturnObj withMasterOrderNO(String masterOrderNO) {
        this.masterOrderNO = masterOrderNO;
        return this;
    }

    /**
     * set masterResourceID
     * @param masterResourceID 主资源ID
     * @return this
     */
    public EcsBatchNewReturnObj withMasterResourceID(String masterResourceID) {
        this.masterResourceID = masterResourceID;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsBatchNewReturnObj withRegionID(String regionID) {
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

    public String getMasterResourceID() {
        return masterResourceID;
    }

    public void setMasterResourceID(String masterResourceID) {
        this.masterResourceID = masterResourceID;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }
}
