package cn.ctyun.ctapi.ctecs.ecsvolumedetach;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-卸载按量付费云硬盘>
 * Entity: EcsVolumeDetachRequestBody
 */
public class EcsVolumeDetachRequestBody {
    /**
     * resourceID
     * 云硬盘资源ID
     */
    private String resourceID;
    /**
     * regionID
     * 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8317&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * instanceUUID
     * 云主机资源ID
     */
    private String instanceUUID;

    /**
     * set resourceID
     * @param resourceID 云硬盘资源ID
     * @return this
     */
    public EcsVolumeDetachRequestBody withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8317&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsVolumeDetachRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set instanceUUID
     * @param instanceUUID 云主机资源ID
     * @return this
     */
    public EcsVolumeDetachRequestBody withInstanceUUID(String instanceUUID) {
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
