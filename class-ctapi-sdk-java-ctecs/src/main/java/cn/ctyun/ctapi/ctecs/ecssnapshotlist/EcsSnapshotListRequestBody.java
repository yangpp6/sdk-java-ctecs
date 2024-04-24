package cn.ctyun.ctapi.ctecs.ecssnapshotlist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照列表>
 * Entity: EcsSnapshotListRequestBody
 */
public class EcsSnapshotListRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;
    /**
     * pageNo
     * 页码，取值范围：大于等于1，默认值为1
     */
    private Integer pageNo;
    /**
     * pageSize
     * 每页记录数目，取值范围:[1~50]，默认值为10，单页最大记录不超过50
     */
    private Integer pageSize;
    /**
     * ID
     * 云主机ID
     */
    private String ID;
    /**
     * status
     * 云主机快照状态，<br />pending: 创建中, <br />available: 可用， <br />restoring: 恢复中，<br />error：错误
     */
    private String status;
    /**
     * snapshotID
     * 云主机快照ID
     */
    private String snapshotID;
    /**
     * keyword
     * 模糊查询查询内容,支持字段有ID、snapshotID、name
     */
    private String keyword;
    /**
     * name
     * 云主机快照名称
     */
    private String name;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsSnapshotListRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public EcsSnapshotListRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set pageNo
     * @param pageNo 页码，取值范围：大于等于1，默认值为1
     * @return this
     */
    public EcsSnapshotListRequestBody withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * set pageSize
     * @param pageSize 每页记录数目，取值范围:[1~50]，默认值为10，单页最大记录不超过50
     * @return this
     */
    public EcsSnapshotListRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set ID
     * @param ID 云主机ID
     * @return this
     */
    public EcsSnapshotListRequestBody withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set status
     * @param status 云主机快照状态，<br />pending: 创建中, <br />available: 可用， <br />restoring: 恢复中，<br />error：错误
     * @return this
     */
    public EcsSnapshotListRequestBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * set snapshotID
     * @param snapshotID 云主机快照ID
     * @return this
     */
    public EcsSnapshotListRequestBody withSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }

    /**
     * set keyword
     * @param keyword 模糊查询查询内容,支持字段有ID、snapshotID、name
     * @return this
     */
    public EcsSnapshotListRequestBody withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * set name
     * @param name 云主机快照名称
     * @return this
     */
    public EcsSnapshotListRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSnapshotID() {
        return snapshotID;
    }

    public void setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
