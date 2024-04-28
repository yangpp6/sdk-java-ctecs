package cn.ctyun.ctapi.ctecs.ecsfixiplist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机的固定IP列表>
 * Request: EcsFixIpListRequest
 */
public class EcsFixIpListRequest extends CTRequest {
    public EcsFixIpListRequest() {
        super("GET", "application/json", "/v4/ecs/fix-ip-list");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsFixIpListRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set azName
     * @param azName 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a>获取可用区信息，查询结果中zoneList内返回存在可用区名称（即多可用区，本字段填写实际可用区名称），若查询结果中zoneList为空（即为单可用区，本字段填写default）。
     * @return this
     */
    public EcsFixIpListRequest withAzName(String azName) {
        queryParam.put("azName", azName);
        return this;
    }

    /**
     * <Query param> set ID
     * @param ID 云主机ID。
     * @return this
     */
    public EcsFixIpListRequest withID(String ID) {
        queryParam.put("ID", ID);
        return this;
    }
}
