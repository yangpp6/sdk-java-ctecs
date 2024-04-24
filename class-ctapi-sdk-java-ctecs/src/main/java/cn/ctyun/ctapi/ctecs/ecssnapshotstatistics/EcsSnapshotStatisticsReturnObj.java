package cn.ctyun.ctapi.ctecs.ecssnapshotstatistics;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <云主机快照个数统计>
 * Entity: EcsSnapshotStatisticsReturnObj
 */
public class EcsSnapshotStatisticsReturnObj {
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;
    /**
     * count
     * 云主机快照个数
     */
    private Integer count;

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public EcsSnapshotStatisticsReturnObj withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set count
     * @param count 云主机快照个数
     * @return this
     */
    public EcsSnapshotStatisticsReturnObj withCount(Integer count) {
        this.count = count;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
