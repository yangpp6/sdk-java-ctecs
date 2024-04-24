package cn.ctyun.ctapi.ctecs.volumeshow;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <云硬盘信息查询>
 * Request: VolumeShowRequest
 */
public class VolumeShowRequest extends CTRequest {
    public VolumeShowRequest() {
        super("GET", "application/json", "/v4/ecs/volume/show");
    }

    /**
     * <Query param> set diskID
     * @param diskID 云硬盘ID。您可以查看<a href="https://www.ctyun.cn/document/10027696/10027930">产品定义-云硬盘</a>来了解云硬盘 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=35&api=7338&data=48">云硬盘列表查询</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=35&api=7332&data=48">创建云硬盘</a>
     * @return this
     */
    public VolumeShowRequest withDiskID(String diskID) {
        queryParam.put("diskID", diskID);
        return this;
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8317&data=87">查询账户启用的资源池信息</a>
     * @return this
     */
    public VolumeShowRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }
}
