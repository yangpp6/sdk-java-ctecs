package cn.ctyun.ctapi.ctecs.snapshotdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取云主机快照详情>
 * Entity: SnapshotDetailsReturnObj
 */
public class SnapshotDetailsReturnObj {
    /**
     * results
     * 分页明细
     */
    private SnapshotDetailsResults[] results;

    /**
     * set results
     * @param results 分页明细
     * @return this
     */
    public SnapshotDetailsReturnObj withResults(SnapshotDetailsResults[] results) {
        this.results = results;
        return this;
    }

    public SnapshotDetailsResults[] getResults() {
        return results;
    }

    public void setResults(SnapshotDetailsResults[] results) {
        this.results = results;
    }
}
