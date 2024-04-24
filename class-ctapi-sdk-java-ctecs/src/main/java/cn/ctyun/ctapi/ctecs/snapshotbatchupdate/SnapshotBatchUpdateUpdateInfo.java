package cn.ctyun.ctapi.ctecs.snapshotbatchupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机快照>
 * Entity: SnapshotBatchUpdateUpdateInfo
 */
public class SnapshotBatchUpdateUpdateInfo {
    /**
     * snapshotID
     * 云主机快照ID，<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8349&data=87">查询云主机快照列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8352&data=87">创建云主机快照</a>
     */
    private String snapshotID;
    /**
     * snapshotName
     * 云主机快照名称。满足以下规则：不能使用中文，且长度为2-63字符
     */
    private String snapshotName;
    /**
     * snapshotDescription
     * 云主机快照描述，字符长度不超过256字符
     */
    private String snapshotDescription;

    /**
     * set snapshotID
     * @param snapshotID 云主机快照ID，<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8349&data=87">查询云主机快照列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8352&data=87">创建云主机快照</a>
     * @return this
     */
    public SnapshotBatchUpdateUpdateInfo withSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }

    /**
     * set snapshotName
     * @param snapshotName 云主机快照名称。满足以下规则：不能使用中文，且长度为2-63字符
     * @return this
     */
    public SnapshotBatchUpdateUpdateInfo withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    /**
     * set snapshotDescription
     * @param snapshotDescription 云主机快照描述，字符长度不超过256字符
     * @return this
     */
    public SnapshotBatchUpdateUpdateInfo withSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
        return this;
    }

    public String getSnapshotID() {
        return snapshotID;
    }

    public void setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
    }

    public String getSnapshotName() {
        return snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    public String getSnapshotDescription() {
        return snapshotDescription;
    }

    public void setSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
    }
}
