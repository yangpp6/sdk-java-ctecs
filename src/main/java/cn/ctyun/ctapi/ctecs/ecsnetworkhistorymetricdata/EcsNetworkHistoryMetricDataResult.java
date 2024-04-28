package cn.ctyun.ctapi.ctecs.ecsnetworkhistorymetricdata;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询指定时间段内的网卡监控数据>
 * Entity: EcsNetworkHistoryMetricDataResult
 */
public class EcsNetworkHistoryMetricDataResult {
    /**
     * fUID
     * 唯一键
     */
    private String fUID;
    /**
     * fuserLastUpdated
     * 用户最近更新时间
     */
    private String fuserLastUpdated;
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * deviceUUID
     * 云主机ID
     */
    private String deviceUUID;

    /**
     * set fUID
     * @param fUID 唯一键
     * @return this
     */
    public EcsNetworkHistoryMetricDataResult withFUID(String fUID) {
        this.fUID = fUID;
        return this;
    }

    /**
     * set fuserLastUpdated
     * @param fuserLastUpdated 用户最近更新时间
     * @return this
     */
    public EcsNetworkHistoryMetricDataResult withFuserLastUpdated(String fuserLastUpdated) {
        this.fuserLastUpdated = fuserLastUpdated;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsNetworkHistoryMetricDataResult withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set deviceUUID
     * @param deviceUUID 云主机ID
     * @return this
     */
    public EcsNetworkHistoryMetricDataResult withDeviceUUID(String deviceUUID) {
        this.deviceUUID = deviceUUID;
        return this;
    }

    public String getFUID() {
        return fUID;
    }

    public void setFUID(String fUID) {
        this.fUID = fUID;
    }

    public String getFuserLastUpdated() {
        return fuserLastUpdated;
    }

    public void setFuserLastUpdated(String fuserLastUpdated) {
        this.fuserLastUpdated = fuserLastUpdated;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getDeviceUUID() {
        return deviceUUID;
    }

    public void setDeviceUUID(String deviceUUID) {
        this.deviceUUID = deviceUUID;
    }
}
