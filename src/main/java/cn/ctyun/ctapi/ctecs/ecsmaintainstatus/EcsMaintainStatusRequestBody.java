package cn.ctyun.ctapi.ctecs.ecsmaintainstatus;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取云主机维护属性>
 * Entity: EcsMaintainStatusRequestBody
 */
public class EcsMaintainStatusRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * azName
     * az名称
     */
    private String azName;
    /**
     * ID
     * 云主机ID
     */
    private String ID;
    /**
     * customInfo
     * 客户信息 使用identity中的accountId作为用户的标识
     */
    private EcsMaintainStatusCustomInfo customInfo;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsMaintainStatusRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName az名称
     * @return this
     */
    public EcsMaintainStatusRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set ID
     * @param ID 云主机ID
     * @return this
     */
    public EcsMaintainStatusRequestBody withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set customInfo
     * @param customInfo 客户信息 使用identity中的accountId作为用户的标识
     * @return this
     */
    public EcsMaintainStatusRequestBody withCustomInfo(EcsMaintainStatusCustomInfo customInfo) {
        this.customInfo = customInfo;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public EcsMaintainStatusCustomInfo getCustomInfo() {
        return customInfo;
    }

    public void setCustomInfo(EcsMaintainStatusCustomInfo customInfo) {
        this.customInfo = customInfo;
    }
}
