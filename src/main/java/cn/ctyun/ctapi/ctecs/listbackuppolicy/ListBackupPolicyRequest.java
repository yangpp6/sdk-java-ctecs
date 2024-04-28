package cn.ctyun.ctapi.ctecs.listbackuppolicy;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份策略列表>
 * Request: ListBackupPolicyRequest
 */
public class ListBackupPolicyRequest extends CTRequest {
    public ListBackupPolicyRequest() {
        super("GET", "application/json", "/v4/ecs/backup-policy/list");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public ListBackupPolicyRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set policyID
     * @param policyID 云主机备份策略ID，32字节<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=6924&data=100">查询云主机备份策略列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=6914&data=100">创建云主机备份策略</a>
     * @return this
     */
    public ListBackupPolicyRequest withPolicyID(String policyID) {
        queryParam.put("policyID", policyID);
        return this;
    }

    /**
     * <Query param> set policyName
     * @param policyName 云主机备份策略名称。满足以下规则：只能由数字、英文字母、中划线-、下划线_、点.组成，长度为2-64字符<br />注：在所有资源池不可重复。模糊过滤，存在policyID过滤参数时此参数无效
     * @return this
     */
    public ListBackupPolicyRequest withPolicyName(String policyName) {
        queryParam.put("policyName", policyName);
        return this;
    }

    /**
     * <Query param> set projectID
     * @param projectID 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目</a>了解如何创建企业项目
     * @return this
     */
    public ListBackupPolicyRequest withProjectID(String projectID) {
        queryParam.put("projectID", projectID);
        return this;
    }

    /**
     * <Query param> set pageNo
     * @param pageNo 页码，取值范围：正整数（≥1），注：默认值为1
     * @return this
     */
    public ListBackupPolicyRequest withPageNo(Integer pageNo) {
        queryParam.put("pageNo", pageNo);
        return this;
    }

    /**
     * <Query param> set pageSize
     * @param pageSize 每页记录数目，取值范围：[1, 50]，注：默认值为10
     * @return this
     */
    public ListBackupPolicyRequest withPageSize(Integer pageSize) {
        queryParam.put("pageSize", pageSize);
        return this;
    }
}
