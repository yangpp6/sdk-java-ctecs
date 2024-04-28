package cn.ctyun.ctapi.ctecs.snapshotpolicylist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照策略列表>
 * Entity: SnapshotPolicyListRequestBody
 */
public class SnapshotPolicyListRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * pageNo
     * 页码，取值范围：正整数（≥1），注：默认值为1
     */
    private Integer pageNo;
    /**
     * pageSize
     * 每页记录数目，取值范围：[1, 50]，注：默认值为10
     */
    private Integer pageSize;
    /**
     * snapshotPolicyStatus
     * 快照策略状态，是否启用，取值范围：0（不启用），<br />1（启用）<br />注：默认值1（启用）
     */
    private Integer snapshotPolicyStatus;
    /**
     * queryContent
     * 模糊匹配查询内容（匹配字段：snapshotPolicyID、snapshotPolicyName）
     */
    private String queryContent;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public SnapshotPolicyListRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set pageNo
     * @param pageNo 页码，取值范围：正整数（≥1），注：默认值为1
     * @return this
     */
    public SnapshotPolicyListRequestBody withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * set pageSize
     * @param pageSize 每页记录数目，取值范围：[1, 50]，注：默认值为10
     * @return this
     */
    public SnapshotPolicyListRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set snapshotPolicyStatus
     * @param snapshotPolicyStatus 快照策略状态，是否启用，取值范围：0（不启用），<br />1（启用）<br />注：默认值1（启用）
     * @return this
     */
    public SnapshotPolicyListRequestBody withSnapshotPolicyStatus(Integer snapshotPolicyStatus) {
        this.snapshotPolicyStatus = snapshotPolicyStatus;
        return this;
    }

    /**
     * set queryContent
     * @param queryContent 模糊匹配查询内容（匹配字段：snapshotPolicyID、snapshotPolicyName）
     * @return this
     */
    public SnapshotPolicyListRequestBody withQueryContent(String queryContent) {
        this.queryContent = queryContent;
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

    public Integer getSnapshotPolicyStatus() {
        return snapshotPolicyStatus;
    }

    public void setSnapshotPolicyStatus(Integer snapshotPolicyStatus) {
        this.snapshotPolicyStatus = snapshotPolicyStatus;
    }

    public String getQueryContent() {
        return queryContent;
    }

    public void setQueryContent(String queryContent) {
        this.queryContent = queryContent;
    }
}
