package cn.ctyun.ctapi.ctecs.ecsquerysnapshot;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机快照个数统计>
 * Entity: EcsQuerySnapshotReturnObj
 */
public class EcsQuerySnapshotReturnObj {
    /**
     * results
     * 分页明细
     */
    private EcsQuerySnapshotResults[] results;

    /**
     * set results
     * @param results 分页明细
     * @return this
     */
    public EcsQuerySnapshotReturnObj withResults(EcsQuerySnapshotResults[] results) {
        this.results = results;
        return this;
    }

    public EcsQuerySnapshotResults[] getResults() {
        return results;
    }

    public void setResults(EcsQuerySnapshotResults[] results) {
        this.results = results;
    }
}
