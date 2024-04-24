package cn.ctyun.ctapi.ctecs.snapshotstatus;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取云主机快照状态>
 * Entity: SnapshotStatusReturnObj
 */
public class SnapshotStatusReturnObj {
    /**
     * snapshotStatus
     * 云主机快照状态，<br />pending: 创建中, <br />available: 可用， <br />restoring: 恢复中，<br />error：错误
     */
    private String snapshotStatus;

    /**
     * set snapshotStatus
     * @param snapshotStatus 云主机快照状态，<br />pending: 创建中, <br />available: 可用， <br />restoring: 恢复中，<br />error：错误
     * @return this
     */
    public SnapshotStatusReturnObj withSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
        return this;
    }

    public String getSnapshotStatus() {
        return snapshotStatus;
    }

    public void setSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
    }
}
