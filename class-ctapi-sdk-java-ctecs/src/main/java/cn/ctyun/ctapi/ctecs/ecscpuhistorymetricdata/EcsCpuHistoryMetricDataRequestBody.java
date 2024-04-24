package cn.ctyun.ctapi.ctecs.ecscpuhistorymetricdata;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询指定时间段内的CPU监控数据>
 * Entity: EcsCpuHistoryMetricDataRequestBody
 */
public class EcsCpuHistoryMetricDataRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * deviceIDList
     * 云主机ID列表，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>
     */
    private String[] deviceIDList;
    /**
     * period
     * 聚合周期，单位秒，注：默认值为300
     */
    private Integer period;
    /**
     * startTime
     * 必传参数，查询起始时间戳
     */
    private String startTime;
    /**
     * endTime
     * 必传参数，查询终止时间戳
     */
    private String endTime;
    /**
     * pageNo
     * 页码，取值范围：正整数（≥1），注：默认值为1
     */
    private Integer pageNo;
    /**
     * page
     * 页码，取值范围：正整数（≥1），注：默认值为1，后续该字段可能废弃
     */
    private Integer page;
    /**
     * pageSize
     * 每页记录数目，取值范围：[1, 50]，注：默认值为10
     */
    private Integer pageSize;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsCpuHistoryMetricDataRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set deviceIDList
     * @param deviceIDList 云主机ID列表，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>
     * @return this
     */
    public EcsCpuHistoryMetricDataRequestBody withDeviceIDList(String[] deviceIDList) {
        this.deviceIDList = deviceIDList;
        return this;
    }

    /**
     * set period
     * @param period 聚合周期，单位秒，注：默认值为300
     * @return this
     */
    public EcsCpuHistoryMetricDataRequestBody withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * set startTime
     * @param startTime 必传参数，查询起始时间戳
     * @return this
     */
    public EcsCpuHistoryMetricDataRequestBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set endTime
     * @param endTime 必传参数，查询终止时间戳
     * @return this
     */
    public EcsCpuHistoryMetricDataRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set pageNo
     * @param pageNo 页码，取值范围：正整数（≥1），注：默认值为1
     * @return this
     */
    public EcsCpuHistoryMetricDataRequestBody withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * set page
     * @param page 页码，取值范围：正整数（≥1），注：默认值为1，后续该字段可能废弃
     * @return this
     */
    public EcsCpuHistoryMetricDataRequestBody withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * set pageSize
     * @param pageSize 每页记录数目，取值范围：[1, 50]，注：默认值为10
     * @return this
     */
    public EcsCpuHistoryMetricDataRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String[] getDeviceIDList() {
        return deviceIDList;
    }

    public void setDeviceIDList(String[] deviceIDList) {
        this.deviceIDList = deviceIDList;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
