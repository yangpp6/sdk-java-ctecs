package cn.ctyun.ctapi.ctecs.createinstance;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机>
 * Entity: CreateInstanceNetworkCardList
 */
public class CreateInstanceNetworkCardList {
    /**
     * nicName
     * 长度2~32，支持拉丁字母、中文、数字、下划线、连字符，中文或英文字母开头，不能以http:或https:开头
     */
    private String nicName;
    /**
     * fixedIP
     * 内网IPv4地址，注：不可使用已占用IP
     */
    private String fixedIP;
    /**
     * isMaster
     * 是否主网卡，取值范围：<br />true（表示主网卡），<br />false（表示扩展网卡）<br />注：只能含有一个主网卡
     */
    private Boolean isMaster;
    /**
     * subnetID
     * 子网ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10098380">基本概念</a>来查找子网的相关定义 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=8659&data=94">查询子网列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4812&data=94">创建子网</a><br />注：在多可用区类型资源池下，subnetID通常以“subnet-”开头，非多可用区类型资源池subnetID为uuid格式
     */
    private String subnetID;

    /**
     * set nicName
     * @param nicName 长度2~32，支持拉丁字母、中文、数字、下划线、连字符，中文或英文字母开头，不能以http:或https:开头
     * @return this
     */
    public CreateInstanceNetworkCardList withNicName(String nicName) {
        this.nicName = nicName;
        return this;
    }

    /**
     * set fixedIP
     * @param fixedIP 内网IPv4地址，注：不可使用已占用IP
     * @return this
     */
    public CreateInstanceNetworkCardList withFixedIP(String fixedIP) {
        this.fixedIP = fixedIP;
        return this;
    }

    /**
     * set isMaster
     * @param isMaster 是否主网卡，取值范围：<br />true（表示主网卡），<br />false（表示扩展网卡）<br />注：只能含有一个主网卡
     * @return this
     */
    public CreateInstanceNetworkCardList withIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * set subnetID
     * @param subnetID 子网ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10098380">基本概念</a>来查找子网的相关定义 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=8659&data=94">查询子网列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4812&data=94">创建子网</a><br />注：在多可用区类型资源池下，subnetID通常以“subnet-”开头，非多可用区类型资源池subnetID为uuid格式
     * @return this
     */
    public CreateInstanceNetworkCardList withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    public String getNicName() {
        return nicName;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

    public String getFixedIP() {
        return fixedIP;
    }

    public void setFixedIP(String fixedIP) {
        this.fixedIP = fixedIP;
    }

    public Boolean getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
    }

    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }
}
