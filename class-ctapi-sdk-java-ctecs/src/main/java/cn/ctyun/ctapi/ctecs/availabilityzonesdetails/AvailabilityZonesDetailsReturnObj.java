package cn.ctyun.ctapi.ctecs.availabilityzonesdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询账户资源池中可用区信息>
 * Entity: AvailabilityZonesDetailsReturnObj
 */
public class AvailabilityZonesDetailsReturnObj {
    /**
     * azList
     * 可用区列表
     */
    private AvailabilityZonesDetailsAvailabilityZone[] azList;

    /**
     * set azList
     * @param azList 可用区列表
     * @return this
     */
    public AvailabilityZonesDetailsReturnObj withAzList(AvailabilityZonesDetailsAvailabilityZone[] azList) {
        this.azList = azList;
        return this;
    }

    public AvailabilityZonesDetailsAvailabilityZone[] getAzList() {
        return azList;
    }

    public void setAzList(AvailabilityZonesDetailsAvailabilityZone[] azList) {
        this.azList = azList;
    }
}
