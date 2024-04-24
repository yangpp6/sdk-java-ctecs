package cn.ctyun.ctapi.ctecs.resubscribeinstance;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-续订云主机>
 * Entity: ResubscribeInstanceRequestBody
 */
public class ResubscribeInstanceRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span><a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * instanceID
     * 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a>
     */
    private String instanceID;
    /**
     * cycleCount
     * 订购时长，该参数需要与cycleType一同使用<br />注：最长订购周期为60个月（5年）
     */
    private Integer cycleCount;
    /**
     * cycleType
     * 订购周期类型，取值范围：<br />MONTH：按月，<br />YEAR：按年
     */
    private String cycleType;
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;
    /**
     * payVoucherPrice
     * 代金券，满足以下规则：两位小数，不足两位自动补0，超过两位小数无效；不可为负数；字段为0时表示不使用代金券
     */
    private Float payVoucherPrice;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span><a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public ResubscribeInstanceRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a>
     * @return this
     */
    public ResubscribeInstanceRequestBody withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set cycleCount
     * @param cycleCount 订购时长，该参数需要与cycleType一同使用<br />注：最长订购周期为60个月（5年）
     * @return this
     */
    public ResubscribeInstanceRequestBody withCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 订购周期类型，取值范围：<br />MONTH：按月，<br />YEAR：按年
     * @return this
     */
    public ResubscribeInstanceRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public ResubscribeInstanceRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set payVoucherPrice
     * @param payVoucherPrice 代金券，满足以下规则：两位小数，不足两位自动补0，超过两位小数无效；不可为负数；字段为0时表示不使用代金券
     * @return this
     */
    public ResubscribeInstanceRequestBody withPayVoucherPrice(Float payVoucherPrice) {
        this.payVoucherPrice = payVoucherPrice;
        return this;
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

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public Float getPayVoucherPrice() {
        return payVoucherPrice;
    }

    public void setPayVoucherPrice(Float payVoucherPrice) {
        this.payVoucherPrice = payVoucherPrice;
    }
}
