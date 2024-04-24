package cn.ctyun.ctapi.ctecs.ecsstatuslist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-获取多台云主机的状态信息>
 * Request: EcsStatusListRequest
 */
public class EcsStatusListRequest extends CTRequest {
    public EcsStatusListRequest() {
        super("GET", "application/json", "/v4/ecs/status-list");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsStatusListRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set azName
     * @param azName 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a>获取可用区信息，查询结果中zoneList内返回存在可用区名称（即多a可用区，本字段填写实际可用区名称），若查询结果中zoneList为空（即为单可用区，本字段填写default）。
     * @return this
     */
    public EcsStatusListRequest withAzName(String azName) {
        queryParam.put("azName", azName);
        return this;
    }

    /**
     * <Query param> set instanceIDList
     * @param instanceIDList 云主机ID列表，多台使用英文逗号分割（不填则返回所有云主机状态信息）
     * @return this
     */
    public EcsStatusListRequest withInstanceIDList(String instanceIDList) {
        queryParam.put("instanceIDList", instanceIDList);
        return this;
    }

    /**
     * <Query param> set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public EcsStatusListRequest withProjectID(String projectID) {
        queryParam.put("projectID", projectID);
        return this;
    }

    /**
     * <Query param> set pageNo
     * @param pageNo 页码，取值范围：大于等于1，默认值为1
     * @return this
     */
    public EcsStatusListRequest withPageNo(String pageNo) {
        queryParam.put("pageNo", pageNo);
        return this;
    }

    /**
     * <Query param> set pageSize
     * @param pageSize 每页记录数目，取值范围:[1~50]，默认值为10，单页最大记录不超过50
     * @return this
     */
    public EcsStatusListRequest withPageSize(String pageSize) {
        queryParam.put("pageSize", pageSize);
        return this;
    }
}
