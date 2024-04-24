package cn.ctyun.ctapi.ctecs.availabilityzonesdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询账户资源池中可用区信息>
 * Entity: AvailabilityZonesDetailsAvailabilityZone
 */
public class AvailabilityZonesDetailsAvailabilityZone {
    /**
     * azID
     * 可用区ID
     */
    private String azID;
    /**
     * azName
     * 可用区名称
     */
    private String azName;

    /**
     * set azID
     * @param azID 可用区ID
     * @return this
     */
    public AvailabilityZonesDetailsAvailabilityZone withAzID(String azID) {
        this.azID = azID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称
     * @return this
     */
    public AvailabilityZonesDetailsAvailabilityZone withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    public String getAzID() {
        return azID;
    }

    public void setAzID(String azID) {
        this.azID = azID;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }
}
