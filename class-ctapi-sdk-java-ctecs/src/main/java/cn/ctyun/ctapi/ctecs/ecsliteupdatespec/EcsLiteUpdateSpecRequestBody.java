package cn.ctyun.ctapi.ctecs.ecsliteupdatespec;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <变配轻量型云主机>
 * Entity: EcsLiteUpdateSpecRequestBody
 */
public class EcsLiteUpdateSpecRequestBody {
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * instanceID
     * 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11981&data=87">查询轻量型云主机列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11980&data=87">创建轻量型云主机</a>
     */
    private String instanceID;
    /**
     * flavorSetType
     * 规格套餐类型，取值范围：<br />fix：固定套餐<br />band：带宽套餐
     */
    private String flavorSetType;
    /**
     * flavorName
     * 规格套餐名称，<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11998&data=87">查询轻量型云主机的规格套餐资源</a>
     */
    private String flavorName;
    /**
     * bootDiskSize
     * 系统盘大小，带宽套餐时填写，单位：GiB，取值范围获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11998&data=87">查询轻量型云主机的规格套餐资源</a>
     */
    private Integer bootDiskSize;
    /**
     * bandwidth
     * 带宽大小带，带宽套餐时填写，单位：Mbit/s。取值范围获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11998&data=87">查询轻量型云主机的规格套餐资源</a>
     */
    private Integer bandwidth;

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public EcsLiteUpdateSpecRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsLiteUpdateSpecRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11981&data=87">查询轻量型云主机列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11980&data=87">创建轻量型云主机</a>
     * @return this
     */
    public EcsLiteUpdateSpecRequestBody withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set flavorSetType
     * @param flavorSetType 规格套餐类型，取值范围：<br />fix：固定套餐<br />band：带宽套餐
     * @return this
     */
    public EcsLiteUpdateSpecRequestBody withFlavorSetType(String flavorSetType) {
        this.flavorSetType = flavorSetType;
        return this;
    }

    /**
     * set flavorName
     * @param flavorName 规格套餐名称，<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11998&data=87">查询轻量型云主机的规格套餐资源</a>
     * @return this
     */
    public EcsLiteUpdateSpecRequestBody withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * set bootDiskSize
     * @param bootDiskSize 系统盘大小，带宽套餐时填写，单位：GiB，取值范围获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11998&data=87">查询轻量型云主机的规格套餐资源</a>
     * @return this
     */
    public EcsLiteUpdateSpecRequestBody withBootDiskSize(Integer bootDiskSize) {
        this.bootDiskSize = bootDiskSize;
        return this;
    }

    /**
     * set bandwidth
     * @param bandwidth 带宽大小带，带宽套餐时填写，单位：Mbit/s。取值范围获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11998&data=87">查询轻量型云主机的规格套餐资源</a>
     * @return this
     */
    public EcsLiteUpdateSpecRequestBody withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getFlavorSetType() {
        return flavorSetType;
    }

    public void setFlavorSetType(String flavorSetType) {
        this.flavorSetType = flavorSetType;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public Integer getBootDiskSize() {
        return bootDiskSize;
    }

    public void setBootDiskSize(Integer bootDiskSize) {
        this.bootDiskSize = bootDiskSize;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }
}
