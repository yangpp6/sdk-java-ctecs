package cn.ctyun.ctapi.ctecs.volumedelete;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <释放云硬盘>
 * Entity: VolumeDeleteReturnObj
 */
public class VolumeDeleteReturnObj {
    /**
     * masterOrderID
     * 退订订单号，可以使用该订单号确认资源的最终退订状态
     */
    private String masterOrderID;
    /**
     * masterOrderNO
     * 退订订单号
     */
    private String masterOrderNO;

    /**
     * set masterOrderID
     * @param masterOrderID 退订订单号，可以使用该订单号确认资源的最终退订状态
     * @return this
     */
    public VolumeDeleteReturnObj withMasterOrderID(String masterOrderID) {
        this.masterOrderID = masterOrderID;
        return this;
    }

    /**
     * set masterOrderNO
     * @param masterOrderNO 退订订单号
     * @return this
     */
    public VolumeDeleteReturnObj withMasterOrderNO(String masterOrderNO) {
        this.masterOrderNO = masterOrderNO;
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
}
