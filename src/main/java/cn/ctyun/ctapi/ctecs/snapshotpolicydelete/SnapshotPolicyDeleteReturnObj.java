package cn.ctyun.ctapi.ctecs.snapshotpolicydelete;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-删除云主机快照策略>
 * Entity: SnapshotPolicyDeleteReturnObj
 */
public class SnapshotPolicyDeleteReturnObj {
    /**
     * snapshotPolicyID
     * 所删除的云主机快照策略ID
     */
    private String snapshotPolicyID;

    /**
     * set snapshotPolicyID
     * @param snapshotPolicyID 所删除的云主机快照策略ID
     * @return this
     */
    public SnapshotPolicyDeleteReturnObj withSnapshotPolicyID(String snapshotPolicyID) {
        this.snapshotPolicyID = snapshotPolicyID;
        return this;
    }

    public String getSnapshotPolicyID() {
        return snapshotPolicyID;
    }

    public void setSnapshotPolicyID(String snapshotPolicyID) {
        this.snapshotPolicyID = snapshotPolicyID;
    }
}
