package cn.ctyun.ctapi.ctecs.ecssnapshotbatchupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机快照信息>
 * Entity: EcsSnapshotBatchUpdateUpdateInfo
 */
public class EcsSnapshotBatchUpdateUpdateInfo {
    /**
     * snapshotID
     * 云主机快照ID
     */
    private String snapshotID;
    /**
     * name
     * 云主机快照名称，长度为2~63个字符
     */
    private String name;
    /**
     * description
     * 云主机快照描述
     */
    private String description;

    /**
     * set snapshotID
     * @param snapshotID 云主机快照ID
     * @return this
     */
    public EcsSnapshotBatchUpdateUpdateInfo withSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }

    /**
     * set name
     * @param name 云主机快照名称，长度为2~63个字符
     * @return this
     */
    public EcsSnapshotBatchUpdateUpdateInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * set description
     * @param description 云主机快照描述
     * @return this
     */
    public EcsSnapshotBatchUpdateUpdateInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getSnapshotID() {
        return snapshotID;
    }

    public void setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
