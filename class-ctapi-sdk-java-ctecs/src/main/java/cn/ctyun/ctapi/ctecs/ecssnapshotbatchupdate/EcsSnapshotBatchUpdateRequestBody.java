package cn.ctyun.ctapi.ctecs.ecssnapshotbatchupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机快照信息>
 * Entity: EcsSnapshotBatchUpdateRequestBody
 */
public class EcsSnapshotBatchUpdateRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * updateInfo
     * 云主机备份更新信息
     */
    private EcsSnapshotBatchUpdateUpdateInfo[] updateInfo;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsSnapshotBatchUpdateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set updateInfo
     * @param updateInfo 云主机备份更新信息
     * @return this
     */
    public EcsSnapshotBatchUpdateRequestBody withUpdateInfo(EcsSnapshotBatchUpdateUpdateInfo[] updateInfo) {
        this.updateInfo = updateInfo;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public EcsSnapshotBatchUpdateUpdateInfo[] getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(EcsSnapshotBatchUpdateUpdateInfo[] updateInfo) {
        this.updateInfo = updateInfo;
    }
}
