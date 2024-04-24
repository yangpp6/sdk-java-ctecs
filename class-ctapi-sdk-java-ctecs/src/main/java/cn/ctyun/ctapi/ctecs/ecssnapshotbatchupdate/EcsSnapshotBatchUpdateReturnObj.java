package cn.ctyun.ctapi.ctecs.ecssnapshotbatchupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机快照信息>
 * Entity: EcsSnapshotBatchUpdateReturnObj
 */
public class EcsSnapshotBatchUpdateReturnObj {
    /**
     * snapshotIDList
     * 云主机快照ID
     */
    private String[] snapshotIDList;

    /**
     * set snapshotIDList
     * @param snapshotIDList 云主机快照ID
     * @return this
     */
    public EcsSnapshotBatchUpdateReturnObj withSnapshotIDList(String[] snapshotIDList) {
        this.snapshotIDList = snapshotIDList;
        return this;
    }

    public String[] getSnapshotIDList() {
        return snapshotIDList;
    }

    public void setSnapshotIDList(String[] snapshotIDList) {
        this.snapshotIDList = snapshotIDList;
    }
}
