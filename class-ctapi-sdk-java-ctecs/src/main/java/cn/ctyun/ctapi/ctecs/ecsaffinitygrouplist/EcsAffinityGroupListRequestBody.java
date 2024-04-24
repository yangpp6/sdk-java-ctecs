package cn.ctyun.ctapi.ctecs.ecsaffinitygrouplist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组列表或者详情>
 * Entity: EcsAffinityGroupListRequestBody
 */
public class EcsAffinityGroupListRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * azName
     * 可用区名称。
     */
    private String azName;
    /**
     * affinityGroupID
     * 云主机组ID
     */
    private String affinityGroupID;
    /**
     * queryContent
     * 模糊匹配查询内容，可根据ID或者名称进行过滤
     */
    private String queryContent;
    /**
     * pageNo
     * 页码，取值范围：大于等于1，默认值为1
     */
    private Integer pageNo;
    /**
     * pageSize
     * 每页记录数目。<br/>取值范围：[1~50]。<br/>默认值为10。
     */
    private Integer pageSize;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsAffinityGroupListRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称。
     * @return this
     */
    public EcsAffinityGroupListRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set affinityGroupID
     * @param affinityGroupID 云主机组ID
     * @return this
     */
    public EcsAffinityGroupListRequestBody withAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
        return this;
    }

    /**
     * set queryContent
     * @param queryContent 模糊匹配查询内容，可根据ID或者名称进行过滤
     * @return this
     */
    public EcsAffinityGroupListRequestBody withQueryContent(String queryContent) {
        this.queryContent = queryContent;
        return this;
    }

    /**
     * set pageNo
     * @param pageNo 页码，取值范围：大于等于1，默认值为1
     * @return this
     */
    public EcsAffinityGroupListRequestBody withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * set pageSize
     * @param pageSize 每页记录数目。<br/>取值范围：[1~50]。<br/>默认值为10。
     * @return this
     */
    public EcsAffinityGroupListRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public String getAffinityGroupID() {
        return affinityGroupID;
    }

    public void setAffinityGroupID(String affinityGroupID) {
        this.affinityGroupID = affinityGroupID;
    }

    public String getQueryContent() {
        return queryContent;
    }

    public void setQueryContent(String queryContent) {
        this.queryContent = queryContent;
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
}
