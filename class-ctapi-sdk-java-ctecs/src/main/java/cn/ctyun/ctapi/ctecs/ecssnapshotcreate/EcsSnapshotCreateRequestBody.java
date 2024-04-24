package cn.ctyun.ctapi.ctecs.ecssnapshotcreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机快照>
 * Entity: EcsSnapshotCreateRequestBody
 */
public class EcsSnapshotCreateRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * ID
     * 云主机ID
     */
    private String ID;
    /**
     * name
     * 云主机快照名称, 满足以下规则：长度在2～63个字符,包含字母（区分大小写）、数字和特殊字符（~!@#$%^*_-+{[]}:,.?）的组合
     */
    private String name;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsSnapshotCreateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set ID
     * @param ID 云主机ID
     * @return this
     */
    public EcsSnapshotCreateRequestBody withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set name
     * @param name 云主机快照名称, 满足以下规则：长度在2～63个字符,包含字母（区分大小写）、数字和特殊字符（~!@#$%^*_-+{[]}:,.?）的组合
     * @return this
     */
    public EcsSnapshotCreateRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
