package cn.ctyun.ctapi.ctecs.ecsdescribeavailabilityzones;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询账户资源池下可用区信息>
 * Entity: EcsDescribeAvailabilityZonesReturnObj
 */
public class EcsDescribeAvailabilityZonesReturnObj {
    /**
     * availabilityZones
     * 可用区列表
     */
    private EcsDescribeAvailabilityZonesAvailabilityZones[] availabilityZones;

    /**
     * set availabilityZones
     * @param availabilityZones 可用区列表
     * @return this
     */
    public EcsDescribeAvailabilityZonesReturnObj withAvailabilityZones(EcsDescribeAvailabilityZonesAvailabilityZones[] availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public EcsDescribeAvailabilityZonesAvailabilityZones[] getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(EcsDescribeAvailabilityZonesAvailabilityZones[] availabilityZones) {
        this.availabilityZones = availabilityZones;
    }
}
