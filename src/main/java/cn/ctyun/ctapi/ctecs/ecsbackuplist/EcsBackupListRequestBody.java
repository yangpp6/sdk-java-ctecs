package cn.ctyun.ctapi.ctecs.ecsbackuplist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份列表>
 * Entity: EcsBackupListRequestBody
 */
public class EcsBackupListRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * pageNo
     * 页码，取值范围：大于等于1，默认值为1
     */
    private Integer pageNo;
    /**
     * pageSize
     * 每页记录数目，取值范围：[1~50]，默认值为10，单页最大记录不超过50
     */
    private Integer pageSize;
    /**
     * ID
     * 云主机ID
     */
    private String ID;
    /**
     * repositoryID
     * 备份存储库ID
     */
    private String repositoryID;
    /**
     * instanceBackupID
     * 云主机备份ID
     */
    private String instanceBackupID;
    /**
     * queryContent
     * 模糊匹配查询内容（可是ID或者名称）
     */
    private String queryContent;
    /**
     * status
     * 云主机备份状态
     */
    private String status;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsBackupListRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set pageNo
     * @param pageNo 页码，取值范围：大于等于1，默认值为1
     * @return this
     */
    public EcsBackupListRequestBody withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * set pageSize
     * @param pageSize 每页记录数目，取值范围：[1~50]，默认值为10，单页最大记录不超过50
     * @return this
     */
    public EcsBackupListRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set ID
     * @param ID 云主机ID
     * @return this
     */
    public EcsBackupListRequestBody withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set repositoryID
     * @param repositoryID 备份存储库ID
     * @return this
     */
    public EcsBackupListRequestBody withRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
        return this;
    }

    /**
     * set instanceBackupID
     * @param instanceBackupID 云主机备份ID
     * @return this
     */
    public EcsBackupListRequestBody withInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
        return this;
    }

    /**
     * set queryContent
     * @param queryContent 模糊匹配查询内容（可是ID或者名称）
     * @return this
     */
    public EcsBackupListRequestBody withQueryContent(String queryContent) {
        this.queryContent = queryContent;
        return this;
    }

    /**
     * set status
     * @param status 云主机备份状态
     * @return this
     */
    public EcsBackupListRequestBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public EcsBackupListRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
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

    public String getRepositoryID() {
        return repositoryID;
    }

    public void setRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
    }

    public String getInstanceBackupID() {
        return instanceBackupID;
    }

    public void setInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
    }

    public String getQueryContent() {
        return queryContent;
    }

    public void setQueryContent(String queryContent) {
        this.queryContent = queryContent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }
}
