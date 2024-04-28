package cn.ctyun.ctapi.ctecs.regionproducts;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-资源池产品信息查询>
 * Entity: RegionProductsReturnObj
 */
public class RegionProductsReturnObj {
    /**
     * azList
     * az分区列表
     */
    private RegionProductsAzList[] azList;

    /**
     * set azList
     * @param azList az分区列表
     * @return this
     */
    public RegionProductsReturnObj withAzList(RegionProductsAzList[] azList) {
        this.azList = azList;
        return this;
    }

    public RegionProductsAzList[] getAzList() {
        return azList;
    }

    public void setAzList(RegionProductsAzList[] azList) {
        this.azList = azList;
    }
}
