package cn.ctyun.ctapi.ctecs.regionproducts;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-资源池产品信息查询>
 * Entity: RegionProductsDetails
 */
public class RegionProductsDetails {
    /**
     * storageType
     * 不同az可用区的存储类型
     */
    private RegionProductsStorageType[] storageType;

    /**
     * set storageType
     * @param storageType 不同az可用区的存储类型
     * @return this
     */
    public RegionProductsDetails withStorageType(RegionProductsStorageType[] storageType) {
        this.storageType = storageType;
        return this;
    }

    public RegionProductsStorageType[] getStorageType() {
        return storageType;
    }

    public void setStorageType(RegionProductsStorageType[] storageType) {
        this.storageType = storageType;
    }
}
