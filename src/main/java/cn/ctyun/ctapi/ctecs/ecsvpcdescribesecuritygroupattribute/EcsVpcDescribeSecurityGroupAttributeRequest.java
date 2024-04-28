package cn.ctyun.ctapi.ctecs.ecsvpcdescribesecuritygroupattribute;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询用户安全组详情>
 * Request: EcsVpcDescribeSecurityGroupAttributeRequest
 */
public class EcsVpcDescribeSecurityGroupAttributeRequest extends CTRequest {
    public EcsVpcDescribeSecurityGroupAttributeRequest() {
        super("GET", "application/json", "/v4/ecs/vpc/describe-security-group-attribute");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set snapshotID
     * @param snapshotID 云主机快照ID，<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8349&data=87">查询云主机快照列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8352&data=87">创建云主机快照</a>
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeRequest withSnapshotID(String snapshotID) {
        queryParam.put("snapshotID", snapshotID);
        return this;
    }
}
