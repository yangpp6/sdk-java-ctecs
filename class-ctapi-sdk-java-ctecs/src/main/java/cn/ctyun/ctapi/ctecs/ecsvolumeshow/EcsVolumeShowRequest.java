package cn.ctyun.ctapi.ctecs.ecsvolumeshow;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询已将创建好的云硬盘>
 * Request: EcsVolumeShowRequest
 */
public class EcsVolumeShowRequest extends CTRequest {
    public EcsVolumeShowRequest() {
        super("GET", "application/json", "/v4/ecs/volume_show");
    }

    /**
     * <Query param> set resourceID
     * @param resourceID 云硬盘资源ID
     * @return this
     */
    public EcsVolumeShowRequest withResourceID(String resourceID) {
        queryParam.put("resourceID", resourceID);
        return this;
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8314&data=87">资源池可用区查询</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsVolumeShowRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }
}
