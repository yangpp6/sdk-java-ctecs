package cn.ctyun.ctapi.ctecs.ecsnetworklatestmetricdata;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机的网卡实时监控数据>
 * Entity: EcsNetworkLatestMetricDataItemList
 */
public class EcsNetworkLatestMetricDataItemList {
    /**
     * samplingTime
     * 监控获取时间
     */
    private Integer samplingTime;
    /**
     * net_in_bytes_rate
     * 网络流入速率（bit/s）
     */
    private String net_in_bytes_rate;
    /**
     * net_out_bytes_rate
     * 网络流出速率（bit/s）
     */
    private String net_out_bytes_rate;
    /**
     * network_incoming_packets_rate_inband
     * 网卡包接收的正确率（%）
     */
    private String network_incoming_packets_rate_inband;
    /**
     * network_outing_packets_rate_inband
     * 网卡包发送的正确率（%）
     */
    private String network_outing_packets_rate_inband;
    /**
     * network_incoming_errs_rate_inband
     * 接收误包率（%）
     */
    private String network_incoming_errs_rate_inband;
    /**
     * network_outing_drop_rate_inband
     * 发送丢包率（%）
     */
    private String network_outing_drop_rate_inband;
    /**
     * network_outing_errs_rate_inband
     * 发送误包率（%）
     */
    private String network_outing_errs_rate_inband;
    /**
     * network_incoming_drop_rate_inband
     * 接收丢包率（%）
     */
    private String network_incoming_drop_rate_inband;

    /**
     * set samplingTime
     * @param samplingTime 监控获取时间
     * @return this
     */
    public EcsNetworkLatestMetricDataItemList withSamplingTime(Integer samplingTime) {
        this.samplingTime = samplingTime;
        return this;
    }

    /**
     * set net_in_bytes_rate
     * @param net_in_bytes_rate 网络流入速率（bit/s）
     * @return this
     */
    public EcsNetworkLatestMetricDataItemList withNet_in_bytes_rate(String net_in_bytes_rate) {
        this.net_in_bytes_rate = net_in_bytes_rate;
        return this;
    }

    /**
     * set net_out_bytes_rate
     * @param net_out_bytes_rate 网络流出速率（bit/s）
     * @return this
     */
    public EcsNetworkLatestMetricDataItemList withNet_out_bytes_rate(String net_out_bytes_rate) {
        this.net_out_bytes_rate = net_out_bytes_rate;
        return this;
    }

    /**
     * set network_incoming_packets_rate_inband
     * @param network_incoming_packets_rate_inband 网卡包接收的正确率（%）
     * @return this
     */
    public EcsNetworkLatestMetricDataItemList withNetwork_incoming_packets_rate_inband(String network_incoming_packets_rate_inband) {
        this.network_incoming_packets_rate_inband = network_incoming_packets_rate_inband;
        return this;
    }

    /**
     * set network_outing_packets_rate_inband
     * @param network_outing_packets_rate_inband 网卡包发送的正确率（%）
     * @return this
     */
    public EcsNetworkLatestMetricDataItemList withNetwork_outing_packets_rate_inband(String network_outing_packets_rate_inband) {
        this.network_outing_packets_rate_inband = network_outing_packets_rate_inband;
        return this;
    }

    /**
     * set network_incoming_errs_rate_inband
     * @param network_incoming_errs_rate_inband 接收误包率（%）
     * @return this
     */
    public EcsNetworkLatestMetricDataItemList withNetwork_incoming_errs_rate_inband(String network_incoming_errs_rate_inband) {
        this.network_incoming_errs_rate_inband = network_incoming_errs_rate_inband;
        return this;
    }

    /**
     * set network_outing_drop_rate_inband
     * @param network_outing_drop_rate_inband 发送丢包率（%）
     * @return this
     */
    public EcsNetworkLatestMetricDataItemList withNetwork_outing_drop_rate_inband(String network_outing_drop_rate_inband) {
        this.network_outing_drop_rate_inband = network_outing_drop_rate_inband;
        return this;
    }

    /**
     * set network_outing_errs_rate_inband
     * @param network_outing_errs_rate_inband 发送误包率（%）
     * @return this
     */
    public EcsNetworkLatestMetricDataItemList withNetwork_outing_errs_rate_inband(String network_outing_errs_rate_inband) {
        this.network_outing_errs_rate_inband = network_outing_errs_rate_inband;
        return this;
    }

    /**
     * set network_incoming_drop_rate_inband
     * @param network_incoming_drop_rate_inband 接收丢包率（%）
     * @return this
     */
    public EcsNetworkLatestMetricDataItemList withNetwork_incoming_drop_rate_inband(String network_incoming_drop_rate_inband) {
        this.network_incoming_drop_rate_inband = network_incoming_drop_rate_inband;
        return this;
    }

    public Integer getSamplingTime() {
        return samplingTime;
    }

    public void setSamplingTime(Integer samplingTime) {
        this.samplingTime = samplingTime;
    }

    public String getNet_in_bytes_rate() {
        return net_in_bytes_rate;
    }

    public void setNet_in_bytes_rate(String net_in_bytes_rate) {
        this.net_in_bytes_rate = net_in_bytes_rate;
    }

    public String getNet_out_bytes_rate() {
        return net_out_bytes_rate;
    }

    public void setNet_out_bytes_rate(String net_out_bytes_rate) {
        this.net_out_bytes_rate = net_out_bytes_rate;
    }

    public String getNetwork_incoming_packets_rate_inband() {
        return network_incoming_packets_rate_inband;
    }

    public void setNetwork_incoming_packets_rate_inband(String network_incoming_packets_rate_inband) {
        this.network_incoming_packets_rate_inband = network_incoming_packets_rate_inband;
    }

    public String getNetwork_outing_packets_rate_inband() {
        return network_outing_packets_rate_inband;
    }

    public void setNetwork_outing_packets_rate_inband(String network_outing_packets_rate_inband) {
        this.network_outing_packets_rate_inband = network_outing_packets_rate_inband;
    }

    public String getNetwork_incoming_errs_rate_inband() {
        return network_incoming_errs_rate_inband;
    }

    public void setNetwork_incoming_errs_rate_inband(String network_incoming_errs_rate_inband) {
        this.network_incoming_errs_rate_inband = network_incoming_errs_rate_inband;
    }

    public String getNetwork_outing_drop_rate_inband() {
        return network_outing_drop_rate_inband;
    }

    public void setNetwork_outing_drop_rate_inband(String network_outing_drop_rate_inband) {
        this.network_outing_drop_rate_inband = network_outing_drop_rate_inband;
    }

    public String getNetwork_outing_errs_rate_inband() {
        return network_outing_errs_rate_inband;
    }

    public void setNetwork_outing_errs_rate_inband(String network_outing_errs_rate_inband) {
        this.network_outing_errs_rate_inband = network_outing_errs_rate_inband;
    }

    public String getNetwork_incoming_drop_rate_inband() {
        return network_incoming_drop_rate_inband;
    }

    public void setNetwork_incoming_drop_rate_inband(String network_incoming_drop_rate_inband) {
        this.network_incoming_drop_rate_inband = network_incoming_drop_rate_inband;
    }
}
