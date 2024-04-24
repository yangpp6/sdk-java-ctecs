package cn.ctyun.ctapi.ctecs.ecsvolumedelete;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-释放一块按量付费云硬盘>
 * Entity: EcsVolumeDeleteRequestBody
 */
public class EcsVolumeDeleteRequestBody {
    /**
     * resourceID
     * 资源ID
     */
    private String resourceID;
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;

    /**
     * set resourceID
     * @param resourceID 资源ID
     * @return this
     */
    public EcsVolumeDeleteRequestBody withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsVolumeDeleteRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public EcsVolumeDeleteRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
}
