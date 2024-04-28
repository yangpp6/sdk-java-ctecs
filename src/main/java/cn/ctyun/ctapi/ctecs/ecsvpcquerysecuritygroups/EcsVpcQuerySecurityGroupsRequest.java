package cn.ctyun.ctapi.ctecs.ecsvpcquerysecuritygroups;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询用户安全组列表>
 * Request: EcsVpcQuerySecurityGroupsRequest
 */
public class EcsVpcQuerySecurityGroupsRequest extends CTRequest {
    public EcsVpcQuerySecurityGroupsRequest() {
        super("GET", "application/json", "/v4/ecs/vpc/query-security-groups");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsVpcQuerySecurityGroupsRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set vpcID
     * @param vpcID 虚拟私有云ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028310">产品定义-虚拟私有云</a>来了解虚拟私有云<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4814&data=94">查询VPC列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4811&data=94">创建VPC</a><br />注：在多可用区类型资源池下，vpcID通常以“vpc-”开头，非多可用区类型资源池vpcID为uuid格式
     * @return this
     */
    public EcsVpcQuerySecurityGroupsRequest withVpcID(String vpcID) {
        queryParam.put("vpcID", vpcID);
        return this;
    }

    /**
     * <Query param> set queryContent
     * @param queryContent 模糊匹配查询内容（匹配字段：id、name）
     * @return this
     */
    public EcsVpcQuerySecurityGroupsRequest withQueryContent(String queryContent) {
        queryParam.put("queryContent", queryContent);
        return this;
    }

    /**
     * <Query param> set projectID
     * @param projectID 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目</a>了解如何创建企业项目
     * @return this
     */
    public EcsVpcQuerySecurityGroupsRequest withProjectID(String projectID) {
        queryParam.put("projectID", projectID);
        return this;
    }

    /**
     * <Query param> set instanceID
     * @param instanceID 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>
     * @return this
     */
    public EcsVpcQuerySecurityGroupsRequest withInstanceID(String instanceID) {
        queryParam.put("instanceID", instanceID);
        return this;
    }

    /**
     * <Query param> set pageNumber
     * @param pageNumber 页码，取值范围：正整数（≥1），注：旧字段，后续可能废弃；默认值为1
     * @return this
     */
    public EcsVpcQuerySecurityGroupsRequest withPageNumber(Integer pageNumber) {
        queryParam.put("pageNumber", pageNumber);
        return this;
    }

    /**
     * <Query param> set pageNo
     * @param pageNo 页码，取值范围：正整数（≥1），注：默认值为1
     * @return this
     */
    public EcsVpcQuerySecurityGroupsRequest withPageNo(Integer pageNo) {
        queryParam.put("pageNo", pageNo);
        return this;
    }

    /**
     * <Query param> set pageSize
     * @param pageSize 每页记录数目，取值范围：[1, 50]，注：默认值为10
     * @return this
     */
    public EcsVpcQuerySecurityGroupsRequest withPageSize(Integer pageSize) {
        queryParam.put("pageSize", pageSize);
        return this;
    }
}
