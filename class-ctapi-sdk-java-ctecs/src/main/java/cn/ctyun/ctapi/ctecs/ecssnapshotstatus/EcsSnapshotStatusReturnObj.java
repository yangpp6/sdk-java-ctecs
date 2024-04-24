package cn.ctyun.ctapi.ctecs.ecssnapshotstatus;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照状态>
 * Entity: EcsSnapshotStatusReturnObj
 */
public class EcsSnapshotStatusReturnObj {
    /**
     * status
     * 云主机快照状态，<br />pending: 创建中, <br />available: 可用， <br />restoring: 恢复中，<br />error：错误
     */
    private String status;

    /**
     * set status
     * @param status 云主机快照状态，<br />pending: 创建中, <br />available: 可用， <br />restoring: 恢复中，<br />error：错误
     * @return this
     */
    public EcsSnapshotStatusReturnObj withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
