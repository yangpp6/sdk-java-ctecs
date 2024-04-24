package cn.ctyun.ctapi.ctecs.regionproducts;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-资源池产品信息查询>
 * Entity: RegionProductsStorageType
 */
public class RegionProductsStorageType {
    /**
     * type
     * 存储类型
     */
    private String type;
    /**
     * name
     * 类型名称
     */
    private String name;

    /**
     * set type
     * @param type 存储类型
     * @return this
     */
    public RegionProductsStorageType withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * set name
     * @param name 类型名称
     * @return this
     */
    public RegionProductsStorageType withName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
