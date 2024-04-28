package cn.ctyun.ctapi.ctecs.getcustomerresources;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-用户已有资源查询>
 * Entity: GetCustomerResourcesReturnObj
 */
public class GetCustomerResourcesReturnObj {
    /**
     * resources
     * 资源信息
     */
    private GetCustomerResourcesResources resources;

    /**
     * set resources
     * @param resources 资源信息
     * @return this
     */
    public GetCustomerResourcesReturnObj withResources(GetCustomerResourcesResources resources) {
        this.resources = resources;
        return this;
    }

    public GetCustomerResourcesResources getResources() {
        return resources;
    }

    public void setResources(GetCustomerResourcesResources resources) {
        this.resources = resources;
    }
}
