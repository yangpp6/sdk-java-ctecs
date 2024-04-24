package cn.ctyun.ctapi.ctecs.ecsportsassignipv6;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-网卡关联多个IPv6地址>
 * Entity: EcsPortsAssignIpv6RequestBody
 */
public class EcsPortsAssignIpv6RequestBody {
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * networkInterfaceID
     * 网卡ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10197673">弹性网卡-弹性网卡基本知识</a>来了解弹性网卡<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=5802&data=94">查询弹性网卡列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=5789&data=94">创建弹性网卡</a>
     */
    private String networkInterfaceID;
    /**
     * ipv6AddressesCount
     * Ipv6地址数量，新增自动分配地址的IPv6的数量，与ipv6Addresses二选一
     */
    private Integer ipv6AddressesCount;
    /**
     * ipv6Addresses
     * IPv6地址列表，新增指定地址的IPv6列表，与ipv6AddressesCount二选一
     */
    private String[] ipv6Addresses;

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public EcsPortsAssignIpv6RequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsPortsAssignIpv6RequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set networkInterfaceID
     * @param networkInterfaceID 网卡ID，您可以查看<a href="https://www.ctyun.cn/document/10026755/10197673">弹性网卡-弹性网卡基本知识</a>来了解弹性网卡<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=5802&data=94">查询弹性网卡列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=5789&data=94">创建弹性网卡</a>
     * @return this
     */
    public EcsPortsAssignIpv6RequestBody withNetworkInterfaceID(String networkInterfaceID) {
        this.networkInterfaceID = networkInterfaceID;
        return this;
    }

    /**
     * set ipv6AddressesCount
     * @param ipv6AddressesCount Ipv6地址数量，新增自动分配地址的IPv6的数量，与ipv6Addresses二选一
     * @return this
     */
    public EcsPortsAssignIpv6RequestBody withIpv6AddressesCount(Integer ipv6AddressesCount) {
        this.ipv6AddressesCount = ipv6AddressesCount;
        return this;
    }

    /**
     * set ipv6Addresses
     * @param ipv6Addresses IPv6地址列表，新增指定地址的IPv6列表，与ipv6AddressesCount二选一
     * @return this
     */
    public EcsPortsAssignIpv6RequestBody withIpv6Addresses(String[] ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
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

    public String getNetworkInterfaceID() {
        return networkInterfaceID;
    }

    public void setNetworkInterfaceID(String networkInterfaceID) {
        this.networkInterfaceID = networkInterfaceID;
    }

    public Integer getIpv6AddressesCount() {
        return ipv6AddressesCount;
    }

    public void setIpv6AddressesCount(Integer ipv6AddressesCount) {
        this.ipv6AddressesCount = ipv6AddressesCount;
    }

    public String[] getIpv6Addresses() {
        return ipv6Addresses;
    }

    public void setIpv6Addresses(String[] ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
    }
}
