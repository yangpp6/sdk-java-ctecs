package cn.ctyun.ctapi.ctecs.snapshotbatchupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机快照>
 * Entity: SnapshotBatchUpdateRequestBody
 */
public class SnapshotBatchUpdateRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * updateInfo
     * 批量更新信息列表
     */
    private SnapshotBatchUpdateUpdateInfo[] updateInfo;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public SnapshotBatchUpdateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set updateInfo
     * @param updateInfo 批量更新信息列表
     * @return this
     */
    public SnapshotBatchUpdateRequestBody withUpdateInfo(SnapshotBatchUpdateUpdateInfo[] updateInfo) {
        this.updateInfo = updateInfo;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public SnapshotBatchUpdateUpdateInfo[] getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(SnapshotBatchUpdateUpdateInfo[] updateInfo) {
        this.updateInfo = updateInfo;
    }
}
