package cn.ctyun.ctapi.ctecs.backupbatchupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机备份信息>
 * Entity: BackupBatchUpdateRequestBody
 */
public class BackupBatchUpdateRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * updateInfo
     * 云主机备份更新信息
     */
    private BackupBatchUpdateUpdateInfo[] updateInfo;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public BackupBatchUpdateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set updateInfo
     * @param updateInfo 云主机备份更新信息
     * @return this
     */
    public BackupBatchUpdateRequestBody withUpdateInfo(BackupBatchUpdateUpdateInfo[] updateInfo) {
        this.updateInfo = updateInfo;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public BackupBatchUpdateUpdateInfo[] getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(BackupBatchUpdateUpdateInfo[] updateInfo) {
        this.updateInfo = updateInfo;
    }
}
