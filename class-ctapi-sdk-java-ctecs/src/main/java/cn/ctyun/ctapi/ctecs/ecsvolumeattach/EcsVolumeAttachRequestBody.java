package cn.ctyun.ctapi.ctecs.ecsvolumeattach;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-为云主机挂载云硬盘>
 * Entity: EcsVolumeAttachRequestBody
 */
public class EcsVolumeAttachRequestBody {
    /**
     * resourceID
     * 资源ID
     */
    private String resourceID;
    /**
     * regionID
     * 如本地语境支持保存regionID，那么建议传递
     */
    private String regionID;
    /**
     * instanceUUID
     * 云主机resourceUUID
     */
    private String instanceUUID;

    /**
     * set resourceID
     * @param resourceID 资源ID
     * @return this
     */
    public EcsVolumeAttachRequestBody withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * set regionID
     * @param regionID 如本地语境支持保存regionID，那么建议传递
     * @return this
     */
    public EcsVolumeAttachRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set instanceUUID
     * @param instanceUUID 云主机resourceUUID
     * @return this
     */
    public EcsVolumeAttachRequestBody withInstanceUUID(String instanceUUID) {
        this.instanceUUID = instanceUUID;
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

    public String getInstanceUUID() {
        return instanceUUID;
    }

    public void setInstanceUUID(String instanceUUID) {
        this.instanceUUID = instanceUUID;
    }
}
