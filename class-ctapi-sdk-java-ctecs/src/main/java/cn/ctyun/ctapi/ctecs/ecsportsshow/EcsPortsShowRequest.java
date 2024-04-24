package cn.ctyun.ctapi.ctecs.ecsportsshow;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询网卡信息>
 * Request: EcsPortsShowRequest
 */
public class EcsPortsShowRequest extends CTRequest {
    public EcsPortsShowRequest() {
        super("GET", "application/json", "/v4/ecs/ports/show");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsPortsShowRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set networkInterfaceID
     * @param networkInterfaceID 网卡ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10197673">弹性网卡-弹性网卡基本知识</a>来了解弹性网卡<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=5802&data=94">查询弹性网卡列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=5789&data=94">创建弹性网卡</a>
     * @return this
     */
    public EcsPortsShowRequest withNetworkInterfaceID(String networkInterfaceID) {
        queryParam.put("networkInterfaceID", networkInterfaceID);
        return this;
    }
}
