package cn.ctyun.ctapi.ctecs.ecsportslist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询网卡列表>
 * Request: EcsPortsListRequest
 */
public class EcsPortsListRequest extends CTRequest {
    public EcsPortsListRequest() {
        super("GET", "application/json", "/v4/ecs/ports/list");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsPortsListRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set vpcID
     * @param vpcID 虚拟私有云ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028310">产品定义-虚拟私有云</a>来了解虚拟私有云<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4814&data=94">查询VPC列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4811&data=94">创建VPC</a><br />注：在多可用区类型资源池下，vpcID通常以“vpc-”开头，非多可用区类型资源池vpcID为uuid格式
     * @return this
     */
    public EcsPortsListRequest withVpcID(String vpcID) {
        queryParam.put("vpcID", vpcID);
        return this;
    }

    /**
     * <Query param> set deviceID
     * @param deviceID 关联设备id，即云主机id，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a>
     * @return this
     */
    public EcsPortsListRequest withDeviceID(String deviceID) {
        queryParam.put("deviceID", deviceID);
        return this;
    }

    /**
     * <Query param> set subnetID
     * @param subnetID 所属子网ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028310">产品定义-子网</a>来了解子网<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=8659&data=94">查询子网列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4812&data=94">创建子网</a>
     * @return this
     */
    public EcsPortsListRequest withSubnetID(String subnetID) {
        queryParam.put("subnetID", subnetID);
        return this;
    }

    /**
     * <Query param> set pageNumber
     * @param pageNumber 页码，取值范围：正整数（≥1），注：默认值为1。建议使用pageNo，该字段未来将会下线。
     * @return this
     */
    public EcsPortsListRequest withPageNumber(String pageNumber) {
        queryParam.put("pageNumber", pageNumber);
        return this;
    }

    /**
     * <Query param> set pageSize
     * @param pageSize 每页记录数目，取值范围：[1, 50]，注：默认值为10
     * @return this
     */
    public EcsPortsListRequest withPageSize(String pageSize) {
        queryParam.put("pageSize", pageSize);
        return this;
    }

    /**
     * <Query param> set pageNo
     * @param pageNo 页码，取值范围：正整数（≥1），注：默认值为1
     * @return this
     */
    public EcsPortsListRequest withPageNo(String pageNo) {
        queryParam.put("pageNo", pageNo);
        return this;
    }
}
