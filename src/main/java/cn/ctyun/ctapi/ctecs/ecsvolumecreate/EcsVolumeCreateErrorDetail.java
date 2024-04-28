package cn.ctyun.ctapi.ctecs.ecsvolumecreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建一块按量付费或包年包月云硬盘>
 * Entity: EcsVolumeCreateErrorDetail
 */
public class EcsVolumeCreateErrorDetail {
    /**
     * masterOrderID
     * 主订单ID。调用方在拿到masterOrderID之后，可以使用materOrderID进一步确认订单状态及资源状态
     */
    private String masterOrderID;
    /**
     * bssErrCode
     * bss错误明细码，包含于bss格式化JSON错误信息中
     */
    private String bssErrCode;
    /**
     * bssErrMs
     * bss错误信息，包含于bss格式化JSON错误信息中
     */
    private String bssErrMs;
    /**
     * bssOrigErr
     * 无法明确解码bss错误信息时，原样透出的bss错误信息
     */
    private String bssOrigErr;
    /**
     * bssErrPrefixHint
     * bss格式化JSON错误信息的前置提示信息
     */
    private String bssErrPrefixHint;

    /**
     * set masterOrderID
     * @param masterOrderID 主订单ID。调用方在拿到masterOrderID之后，可以使用materOrderID进一步确认订单状态及资源状态
     * @return this
     */
    public EcsVolumeCreateErrorDetail withMasterOrderID(String masterOrderID) {
        this.masterOrderID = masterOrderID;
        return this;
    }

    /**
     * set bssErrCode
     * @param bssErrCode bss错误明细码，包含于bss格式化JSON错误信息中
     * @return this
     */
    public EcsVolumeCreateErrorDetail withBssErrCode(String bssErrCode) {
        this.bssErrCode = bssErrCode;
        return this;
    }

    /**
     * set bssErrMs
     * @param bssErrMs bss错误信息，包含于bss格式化JSON错误信息中
     * @return this
     */
    public EcsVolumeCreateErrorDetail withBssErrMs(String bssErrMs) {
        this.bssErrMs = bssErrMs;
        return this;
    }

    /**
     * set bssOrigErr
     * @param bssOrigErr 无法明确解码bss错误信息时，原样透出的bss错误信息
     * @return this
     */
    public EcsVolumeCreateErrorDetail withBssOrigErr(String bssOrigErr) {
        this.bssOrigErr = bssOrigErr;
        return this;
    }

    /**
     * set bssErrPrefixHint
     * @param bssErrPrefixHint bss格式化JSON错误信息的前置提示信息
     * @return this
     */
    public EcsVolumeCreateErrorDetail withBssErrPrefixHint(String bssErrPrefixHint) {
        this.bssErrPrefixHint = bssErrPrefixHint;
        return this;
    }

    public String getMasterOrderID() {
        return masterOrderID;
    }

    public void setMasterOrderID(String masterOrderID) {
        this.masterOrderID = masterOrderID;
    }

    public String getBssErrCode() {
        return bssErrCode;
    }

    public void setBssErrCode(String bssErrCode) {
        this.bssErrCode = bssErrCode;
    }

    public String getBssErrMs() {
        return bssErrMs;
    }

    public void setBssErrMs(String bssErrMs) {
        this.bssErrMs = bssErrMs;
    }

    public String getBssOrigErr() {
        return bssOrigErr;
    }

    public void setBssOrigErr(String bssOrigErr) {
        this.bssOrigErr = bssOrigErr;
    }

    public String getBssErrPrefixHint() {
        return bssErrPrefixHint;
    }

    public void setBssErrPrefixHint(String bssErrPrefixHint) {
        this.bssErrPrefixHint = bssErrPrefixHint;
    }
}
