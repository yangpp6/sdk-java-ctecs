package cn.ctyun.ctapi.ctecs.ecsvolumeupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-修改云硬盘属性>
 * Entity: EcsVolumeUpdateRequestBody
 */
public class EcsVolumeUpdateRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8317&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * name
     * 云盘名称
     */
    private String name;
    /**
     * resourceID
     * 云硬盘资源ID
     */
    private String resourceID;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8317&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsVolumeUpdateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set name
     * @param name 云盘名称
     * @return this
     */
    public EcsVolumeUpdateRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * set resourceID
     * @param resourceID 云硬盘资源ID
     * @return this
     */
    public EcsVolumeUpdateRequestBody withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }
}
