package cn.ctyun.ctapi.ctecs.ecsvolumedelete;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-释放一块按量付费云硬盘>
 * Entity: EcsVolumeDeleteReturnObj
 */
public class EcsVolumeDeleteReturnObj {
    /**
     * masterOrderNO
     * 退订订单号
     */
    private String masterOrderNO;
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * masterOrderID
     * 退订订单号，可以使用该订单号确认资源的最终退订状态
     */
    private String masterOrderID;

    /**
     * set masterOrderNO
     * @param masterOrderNO 退订订单号
     * @return this
     */
    public EcsVolumeDeleteReturnObj withMasterOrderNO(String masterOrderNO) {
        this.masterOrderNO = masterOrderNO;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsVolumeDeleteReturnObj withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set masterOrderID
     * @param masterOrderID 退订订单号，可以使用该订单号确认资源的最终退订状态
     * @return this
     */
    public EcsVolumeDeleteReturnObj withMasterOrderID(String masterOrderID) {
        this.masterOrderID = masterOrderID;
        return this;
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

    public String getMasterOrderID() {
        return masterOrderID;
    }

    public void setMasterOrderID(String masterOrderID) {
        this.masterOrderID = masterOrderID;
    }
}
