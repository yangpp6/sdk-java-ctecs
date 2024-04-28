package cn.ctyun.ctapi.ctecs.regioncheckdemand;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询资源池产品可售信息>
 * Entity: RegionCheckDemandReturnObj
 */
public class RegionCheckDemandReturnObj {
    /**
     * satisfied
     * 是否可售
     */
    private Boolean satisfied;
    /**
     * sellout
     * 是否售罄
     */
    private Boolean sellout;
    /**
     * hasQuota
     * 用户配额余量是否满足(paas带channel的调用不会返回)
     */
    private Boolean hasQuota;
    /**
     * quotaInfo
     * 产品用户配额信息(paas带channel的调用不会返回)
     */
    private Object quotaInfo;
    /**
     * usedInfo
     * 用户已用量信息(paas带channel的调用不会返回)
     */
    private Object usedInfo;

    /**
     * set satisfied
     * @param satisfied 是否可售
     * @return this
     */
    public RegionCheckDemandReturnObj withSatisfied(Boolean satisfied) {
        this.satisfied = satisfied;
        return this;
    }

    /**
     * set sellout
     * @param sellout 是否售罄
     * @return this
     */
    public RegionCheckDemandReturnObj withSellout(Boolean sellout) {
        this.sellout = sellout;
        return this;
    }

    /**
     * set hasQuota
     * @param hasQuota 用户配额余量是否满足(paas带channel的调用不会返回)
     * @return this
     */
    public RegionCheckDemandReturnObj withHasQuota(Boolean hasQuota) {
        this.hasQuota = hasQuota;
        return this;
    }

    /**
     * set quotaInfo
     * @param quotaInfo 产品用户配额信息(paas带channel的调用不会返回)
     * @return this
     */
    public RegionCheckDemandReturnObj withQuotaInfo(Object quotaInfo) {
        this.quotaInfo = quotaInfo;
        return this;
    }

    /**
     * set usedInfo
     * @param usedInfo 用户已用量信息(paas带channel的调用不会返回)
     * @return this
     */
    public RegionCheckDemandReturnObj withUsedInfo(Object usedInfo) {
        this.usedInfo = usedInfo;
        return this;
    }

    public Boolean getSatisfied() {
        return satisfied;
    }

    public void setSatisfied(Boolean satisfied) {
        this.satisfied = satisfied;
    }

    public Boolean getSellout() {
        return sellout;
    }

    public void setSellout(Boolean sellout) {
        this.sellout = sellout;
    }

    public Boolean getHasQuota() {
        return hasQuota;
    }

    public void setHasQuota(Boolean hasQuota) {
        this.hasQuota = hasQuota;
    }

    public Object getQuotaInfo() {
        return quotaInfo;
    }

    public void setQuotaInfo(Object quotaInfo) {
        this.quotaInfo = quotaInfo;
    }

    public Object getUsedInfo() {
        return usedInfo;
    }

    public void setUsedInfo(Object usedInfo) {
        this.usedInfo = usedInfo;
    }
}
