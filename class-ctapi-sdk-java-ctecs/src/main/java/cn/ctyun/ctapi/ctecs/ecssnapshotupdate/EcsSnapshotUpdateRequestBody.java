package cn.ctyun.ctapi.ctecs.ecssnapshotupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-更新云主机快照信息>
 * Entity: EcsSnapshotUpdateRequestBody
 */
public class EcsSnapshotUpdateRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     */
    private String regionID;
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
     * set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsSnapshotUpdateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set snapshotID
     * @param snapshotID 云主机快照ID
     * @return this
     */
    public EcsSnapshotUpdateRequestBody withSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }

    /**
     * set name
     * @param name 云主机快照名称，长度为2~63个字符
     * @return this
     */
    public EcsSnapshotUpdateRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * set description
     * @param description 云主机快照描述
     * @return this
     */
    public EcsSnapshotUpdateRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
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
