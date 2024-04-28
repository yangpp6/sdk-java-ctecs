package cn.ctyun.ctapi.ctecs.ecsquerysnapshot;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机快照个数统计>
 * Entity: EcsQuerySnapshotRequestBody
 */
public class EcsQuerySnapshotRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * instanceIDList
     * 云主机实例ID列表，多台使用英文逗号分割
     */
    private String instanceIDList;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsQuerySnapshotRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set instanceIDList
     * @param instanceIDList 云主机实例ID列表，多台使用英文逗号分割
     * @return this
     */
    public EcsQuerySnapshotRequestBody withInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getInstanceIDList() {
        return instanceIDList;
    }

    public void setInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
    }
}
