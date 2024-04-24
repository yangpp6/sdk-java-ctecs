package cn.ctyun.ctapi.ctecs.snapshotpolicyexecute;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-立即执行云主机快照策略>
 * Entity: SnapshotPolicyExecuteReturnObj
 */
public class SnapshotPolicyExecuteReturnObj {
    /**
     * snapshotPolicyID
     * 执行的云主机快照策略ID
     */
    private String snapshotPolicyID;

    /**
     * set snapshotPolicyID
     * @param snapshotPolicyID 执行的云主机快照策略ID
     * @return this
     */
    public SnapshotPolicyExecuteReturnObj withSnapshotPolicyID(String snapshotPolicyID) {
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
