package cn.ctyun.ctapi.ctecs.ecsliteflavorlist;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <查询轻量型云主机的规格套餐资源>
 * Request: EcsLiteFlavorListRequest
 */
public class EcsLiteFlavorListRequest extends CTRequest {
    public EcsLiteFlavorListRequest() {
        super("GET", "application/json", "/v4/ecs/lite/flavor/list");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsLiteFlavorListRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set flavorSetType
     * @param flavorSetType 规格套餐类型，取值范围：<br />fix：固定套餐<br />band：带宽套餐
     * @return this
     */
    public EcsLiteFlavorListRequest withFlavorSetType(String flavorSetType) {
        queryParam.put("flavorSetType", flavorSetType);
        return this;
    }
}
