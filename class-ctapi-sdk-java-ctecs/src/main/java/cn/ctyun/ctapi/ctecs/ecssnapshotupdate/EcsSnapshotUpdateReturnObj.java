package cn.ctyun.ctapi.ctecs.ecssnapshotupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-更新云主机快照信息>
 * Entity: EcsSnapshotUpdateReturnObj
 */
public class EcsSnapshotUpdateReturnObj {
    /**
     * snapshotID
     * 云主机快照ID
     */
    private String snapshotID;

    /**
     * set snapshotID
     * @param snapshotID 云主机快照ID
     * @return this
     */
    public EcsSnapshotUpdateReturnObj withSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }

    public String getSnapshotID() {
        return snapshotID;
    }

    public void setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
    }
}
