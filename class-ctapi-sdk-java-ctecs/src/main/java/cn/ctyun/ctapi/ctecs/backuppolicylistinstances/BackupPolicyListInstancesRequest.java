package cn.ctyun.ctapi.ctecs.backuppolicylistinstances;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份策略绑定云主机信息>
 * Request: BackupPolicyListInstancesRequest
 */
public class BackupPolicyListInstancesRequest extends CTRequest {
    public BackupPolicyListInstancesRequest() {
        super("GET", "application/json", "/v4/ecs/backup-policy/list-instances");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public BackupPolicyListInstancesRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set policyID
     * @param policyID 云主机备份策略ID，32字节<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=6924&data=100">查询云主机备份策略列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=6914&data=100">创建云主机备份策略</a>
     * @return this
     */
    public BackupPolicyListInstancesRequest withPolicyID(String policyID) {
        queryParam.put("policyID", policyID);
        return this;
    }

    /**
     * <Query param> set instanceName
     * @param instanceName 云主机名称，模糊过滤
     * @return this
     */
    public BackupPolicyListInstancesRequest withInstanceName(String instanceName) {
        queryParam.put("instanceName", instanceName);
        return this;
    }

    /**
     * <Query param> set pageNo
     * @param pageNo 页码，取值范围：正整数（≥1），注：默认值为1
     * @return this
     */
    public BackupPolicyListInstancesRequest withPageNo(Integer pageNo) {
        queryParam.put("pageNo", pageNo);
        return this;
    }

    /**
     * <Query param> set pageSize
     * @param pageSize 每页记录数目，取值范围：[1, 50]，注：默认值为10
     * @return this
     */
    public BackupPolicyListInstancesRequest withPageSize(Integer pageSize) {
        queryParam.put("pageSize", pageSize);
        return this;
    }
}
