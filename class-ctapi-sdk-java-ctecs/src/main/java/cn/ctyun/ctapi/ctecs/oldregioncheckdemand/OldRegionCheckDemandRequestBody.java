package cn.ctyun.ctapi.ctecs.oldregioncheckdemand;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-资源池产品可售查询>
 * Entity: OldRegionCheckDemandRequestBody
 */
public class OldRegionCheckDemandRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * azName
     * 可用区名称(云主机规格资源池4.0区分az)
     */
    private String azName;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public OldRegionCheckDemandRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称(云主机规格资源池4.0区分az)
     * @return this
     */
    public OldRegionCheckDemandRequestBody withAzName(String azName) {
        this.azName = azName;
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
}
