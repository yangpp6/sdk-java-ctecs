package cn.ctyun.ctapi.ctecs.ecslitecreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <创建轻量型云主机>
 * Entity: EcsLiteCreateRequestBody
 */
public class EcsLiteCreateRequestBody {
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
     * displayName
     * 云主机显示名称，长度为2~15字符
     */
    private String displayName;
    /**
     * flavorSetType
     * 规格套餐类型，取值范围：<br />fix（固定套餐）<br />band（带宽套餐）
     */
    private String flavorSetType;
    /**
     * flavorName
     * 规格套餐名称，<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11998&data=87">查询轻量型云主机的规格套餐资源</a>
     */
    private String flavorName;
    /**
     * imageID
     * 镜像ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10030151">镜像概述</a>来了解云主机镜像<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=23&api=4763&data=89">查询可以使用的镜像资源</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=23&api=4765&data=89">创建私有镜像（云主机系统盘）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=23&api=5230&data=89">创建私有镜像（云主机数据盘）</a><br />注：同一镜像名称在不同资源池的镜像ID是不同的，调用前需确认镜像ID是否归属当前资源池
     */
    private String imageID;
    /**
     * cycleCount
     * 订购时长，该参数需要与cycleType一同使用<br />注：最长订购周期为60个月（5年）；cycleType与cycleCount一起填写
     */
    private Integer cycleCount;
    /**
     * cycleType
     * 订购周期类型，取值范围：<br />MONTH：按月，<br />YEAR：按年。注：cycleType与cycleCount一起填写
     */
    private String cycleType;
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
     * dataDiskList
     * 数据盘信息列表，注：同一云主机下最多可挂载8块数据盘
     */
    private EcsLiteCreateDisks[] dataDiskList;
    /**
     * userPassword
     * 用户密码，满足以下规则：<br />长度在8～30个字符;<br />必须包含大写字母、小写字母、数字以及特殊符号中的三项;<br />特殊符号可选：()\`~!@#$%^&*_-+=\｜{}[]:;'<>,.?/ 且不能以斜线号/开头
     */
    private String userPassword;
    /**
     * autoRenewStatus
     * 本参数表示是否自动续订,取值范围：<br />0（不续费），<br />1（自动续费）。<br />注：按月购买，自动续订周期为1个月；按年购买，自动续订周期为1年
     */
    private Integer autoRenewStatus;

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public EcsLiteCreateRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsLiteCreateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set displayName
     * @param displayName 云主机显示名称，长度为2~15字符
     * @return this
     */
    public EcsLiteCreateRequestBody withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set flavorSetType
     * @param flavorSetType 规格套餐类型，取值范围：<br />fix（固定套餐）<br />band（带宽套餐）
     * @return this
     */
    public EcsLiteCreateRequestBody withFlavorSetType(String flavorSetType) {
        this.flavorSetType = flavorSetType;
        return this;
    }

    /**
     * set flavorName
     * @param flavorName 规格套餐名称，<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11998&data=87">查询轻量型云主机的规格套餐资源</a>
     * @return this
     */
    public EcsLiteCreateRequestBody withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * set imageID
     * @param imageID 镜像ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10030151">镜像概述</a>来了解云主机镜像<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=23&api=4763&data=89">查询可以使用的镜像资源</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=23&api=4765&data=89">创建私有镜像（云主机系统盘）</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=23&api=5230&data=89">创建私有镜像（云主机数据盘）</a><br />注：同一镜像名称在不同资源池的镜像ID是不同的，调用前需确认镜像ID是否归属当前资源池
     * @return this
     */
    public EcsLiteCreateRequestBody withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    /**
     * set cycleCount
     * @param cycleCount 订购时长，该参数需要与cycleType一同使用<br />注：最长订购周期为60个月（5年）；cycleType与cycleCount一起填写
     * @return this
     */
    public EcsLiteCreateRequestBody withCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 订购周期类型，取值范围：<br />MONTH：按月，<br />YEAR：按年。注：cycleType与cycleCount一起填写
     * @return this
     */
    public EcsLiteCreateRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set bootDiskSize
     * @param bootDiskSize 系统盘大小，带宽套餐时填写，单位：GiB，取值范围获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11998&data=87">查询轻量型云主机的规格套餐资源</a>
     * @return this
     */
    public EcsLiteCreateRequestBody withBootDiskSize(Integer bootDiskSize) {
        this.bootDiskSize = bootDiskSize;
        return this;
    }

    /**
     * set bandwidth
     * @param bandwidth 带宽大小带，带宽套餐时填写，单位：Mbit/s。取值范围获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11998&data=87">查询轻量型云主机的规格套餐资源</a>
     * @return this
     */
    public EcsLiteCreateRequestBody withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set dataDiskList
     * @param dataDiskList 数据盘信息列表，注：同一云主机下最多可挂载8块数据盘
     * @return this
     */
    public EcsLiteCreateRequestBody withDataDiskList(EcsLiteCreateDisks[] dataDiskList) {
        this.dataDiskList = dataDiskList;
        return this;
    }

    /**
     * set userPassword
     * @param userPassword 用户密码，满足以下规则：<br />长度在8～30个字符;<br />必须包含大写字母、小写字母、数字以及特殊符号中的三项;<br />特殊符号可选：()\`~!@#$%^&*_-+=\｜{}[]:;'<>,.?/ 且不能以斜线号/开头
     * @return this
     */
    public EcsLiteCreateRequestBody withUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    /**
     * set autoRenewStatus
     * @param autoRenewStatus 本参数表示是否自动续订,取值范围：<br />0（不续费），<br />1（自动续费）。<br />注：按月购买，自动续订周期为1个月；按年购买，自动续订周期为1年
     * @return this
     */
    public EcsLiteCreateRequestBody withAutoRenewStatus(Integer autoRenewStatus) {
        this.autoRenewStatus = autoRenewStatus;
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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public Integer getCycleCount() {
        return cycleCount;
    }

    public void setCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
    }

    public String getCycleType() {
        return cycleType;
    }

    public void setCycleType(String cycleType) {
        this.cycleType = cycleType;
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

    public EcsLiteCreateDisks[] getDataDiskList() {
        return dataDiskList;
    }

    public void setDataDiskList(EcsLiteCreateDisks[] dataDiskList) {
        this.dataDiskList = dataDiskList;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getAutoRenewStatus() {
        return autoRenewStatus;
    }

    public void setAutoRenewStatus(Integer autoRenewStatus) {
        this.autoRenewStatus = autoRenewStatus;
    }
}
