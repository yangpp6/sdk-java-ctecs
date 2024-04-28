package cn.ctyun.ctapi.ctecs.ecssnapshotstatus;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照状态>
 * Entity: EcsSnapshotStatusRequestBody
 */
public class EcsSnapshotStatusRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * snapshotID
     * 云主机快照ID
     */
    private String snapshotID;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsSnapshotStatusRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set snapshotID
     * @param snapshotID 云主机快照ID
     * @return this
     */
    public EcsSnapshotStatusRequestBody withSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getSnapshotID() {
        return snapshotID;
    }

    public void setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
    }
}
