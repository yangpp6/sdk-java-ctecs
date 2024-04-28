package cn.ctyun.ctapi.ctecs.regionproducts;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-资源池产品信息查询>
 * Entity: RegionProductsAzList
 */
public class RegionProductsAzList {
    /**
     * azName
     * 可用区名称
     */
    private String azName;
    /**
     * azDisplayName
     * 可用区展示名
     */
    private String azDisplayName;
    /**
     * details
     * 可用区详细信息
     */
    private RegionProductsDetails details;

    /**
     * set azName
     * @param azName 可用区名称
     * @return this
     */
    public RegionProductsAzList withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set azDisplayName
     * @param azDisplayName 可用区展示名
     * @return this
     */
    public RegionProductsAzList withAzDisplayName(String azDisplayName) {
        this.azDisplayName = azDisplayName;
        return this;
    }

    /**
     * set details
     * @param details 可用区详细信息
     * @return this
     */
    public RegionProductsAzList withDetails(RegionProductsDetails details) {
        this.details = details;
        return this;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public String getAzDisplayName() {
        return azDisplayName;
    }

    public void setAzDisplayName(String azDisplayName) {
        this.azDisplayName = azDisplayName;
    }

    public RegionProductsDetails getDetails() {
        return details;
    }

    public void setDetails(RegionProductsDetails details) {
        this.details = details;
    }
}
