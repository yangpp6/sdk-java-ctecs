package cn.ctyun.ctapi.ctecs.volumestatistics;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-获取用户云硬盘统计信息>
 * Request: VolumeStatisticsRequest
 */
public class VolumeStatisticsRequest extends CTRequest {
    public VolumeStatisticsRequest() {
        super("GET", "application/json", "/v4/ecs/volume/statistics");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public VolumeStatisticsRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set projectID
     * @param projectID 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目</a>了解如何创建企业项目
     * @return this
     */
    public VolumeStatisticsRequest withProjectID(String projectID) {
        queryParam.put("projectID", projectID);
        return this;
    }
}
