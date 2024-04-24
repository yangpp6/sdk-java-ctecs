package cn.ctyun.ctapi.ctecs.queryresizeflavor;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机可变配的规格>
 * Entity: QueryResizeFlavorRequestBody
 */
public class QueryResizeFlavorRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;
    /**
     * flavorID
     * 云主机规格ID
     */
    private String flavorID;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public QueryResizeFlavorRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public QueryResizeFlavorRequestBody withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set flavorID
     * @param flavorID 云主机规格ID
     * @return this
     */
    public QueryResizeFlavorRequestBody withFlavorID(String flavorID) {
        this.flavorID = flavorID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getFlavorID() {
        return flavorID;
    }

    public void setFlavorID(String flavorID) {
        this.flavorID = flavorID;
    }
}
