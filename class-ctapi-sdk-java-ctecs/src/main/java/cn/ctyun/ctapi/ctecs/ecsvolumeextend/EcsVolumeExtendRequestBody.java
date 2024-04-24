package cn.ctyun.ctapi.ctecs.ecsvolumeextend;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-扩容云硬盘>
 * Entity: EcsVolumeExtendRequestBody
 */
public class EcsVolumeExtendRequestBody {
    /**
     * diskSize
     * 变配后的磁盘大小。当前仅支持变更磁盘大小
     */
    private Integer diskSize;
    /**
     * resourceID
     * 云硬盘资源ID
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
     * set diskSize
     * @param diskSize 变配后的磁盘大小。当前仅支持变更磁盘大小
     * @return this
     */
    public EcsVolumeExtendRequestBody withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * set resourceID
     * @param resourceID 云硬盘资源ID
     * @return this
     */
    public EcsVolumeExtendRequestBody withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsVolumeExtendRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public EcsVolumeExtendRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
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
