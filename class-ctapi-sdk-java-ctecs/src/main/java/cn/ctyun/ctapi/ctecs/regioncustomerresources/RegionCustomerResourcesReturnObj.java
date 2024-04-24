package cn.ctyun.ctapi.ctecs.regioncustomerresources;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-根据regionID查询用户资源>
 * Entity: RegionCustomerResourcesReturnObj
 */
public class RegionCustomerResourcesReturnObj {
    /**
     * resources
     * 资源信息
     */
    private RegionCustomerResourcesResources resources;

    /**
     * set resources
     * @param resources 资源信息
     * @return this
     */
    public RegionCustomerResourcesReturnObj withResources(RegionCustomerResourcesResources resources) {
        this.resources = resources;
        return this;
    }

    public RegionCustomerResourcesResources getResources() {
        return resources;
    }

    public void setResources(RegionCustomerResourcesResources resources) {
        this.resources = resources;
    }
}
