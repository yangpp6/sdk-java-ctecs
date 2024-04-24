package cn.ctyun.ctapi.ctecs.liveresizeflavorlist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询云主机支持的热变配规格信息>
 * Entity: LiveResizeFlavorListFlavorList
 */
public class LiveResizeFlavorListFlavorList {
    /**
     * cpuInfo
     * cpu架构
     */
    private String cpuInfo;
    /**
     * baseBandwidth
     * 基准带宽
     */
    private Float baseBandwidth;
    /**
     * flavorName
     * 云主机规格名称
     */
    private String flavorName;
    /**
     * flavorType
     * 规格类型，取值范围：[CPU、CPU_S6、CPU_C6、CPU_M6、CPU_S3、CPU_C3、CPU_M3、CPU_IP3、GPU_N_T4_V、GPU_N_V100、GPU_N_V100_V、GPU_N_P2V_RENMIN、GPU_N_PI7、GPU_N_G7_V、GPU_N_V100、GPU_N_T4_JX]，支持类型会随着功能升级增加
     */
    private String flavorType;
    /**
     * flavorSeries
     * 云主机规格系列，规格系列说明：<br />s（通用性），<br />c（计算增强型），<br />m（内存优化型），<br />hs（海光通用型），<br />hc（海光计算增强型），<br />hm（海光内存优化型），<br />fs（飞腾通用型），<br />fc（飞腾计算增强型），<br />fm（飞腾内存优化型），<br />ks（鲲鹏通用型），<br />kc（鲲鹏计算增强型），<br />kc（鲲鹏内存优化型），<br />p（GPU计算加速型），<br />g（GPU图像加速基础型），<br />ip3（超高IO型）
     */
    private String flavorSeries;
    /**
     * nicMultiQueue
     * 网卡多队列数目
     */
    private Integer nicMultiQueue;
    /**
     * pps
     * 最大收发包限制
     */
    private Integer pps;
    /**
     * flavorCPU
     * VCPU个数
     */
    private Integer flavorCPU;
    /**
     * flavorRAM
     * 内存
     */
    private Integer flavorRAM;
    /**
     * bandwidth
     * 带宽
     */
    private Float bandwidth;
    /**
     * flavorID
     * 云主机规格ID，您可以调用[flavorID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8327&data=87)查看最新的天翼云具体资源池的云主机规格列表
     */
    private String flavorID;

    /**
     * set cpuInfo
     * @param cpuInfo cpu架构
     * @return this
     */
    public LiveResizeFlavorListFlavorList withCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
        return this;
    }

    /**
     * set baseBandwidth
     * @param baseBandwidth 基准带宽
     * @return this
     */
    public LiveResizeFlavorListFlavorList withBaseBandwidth(Float baseBandwidth) {
        this.baseBandwidth = baseBandwidth;
        return this;
    }

    /**
     * set flavorName
     * @param flavorName 云主机规格名称
     * @return this
     */
    public LiveResizeFlavorListFlavorList withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * set flavorType
     * @param flavorType 规格类型，取值范围：[CPU、CPU_S6、CPU_C6、CPU_M6、CPU_S3、CPU_C3、CPU_M3、CPU_IP3、GPU_N_T4_V、GPU_N_V100、GPU_N_V100_V、GPU_N_P2V_RENMIN、GPU_N_PI7、GPU_N_G7_V、GPU_N_V100、GPU_N_T4_JX]，支持类型会随着功能升级增加
     * @return this
     */
    public LiveResizeFlavorListFlavorList withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * set flavorSeries
     * @param flavorSeries 云主机规格系列，规格系列说明：<br />s（通用性），<br />c（计算增强型），<br />m（内存优化型），<br />hs（海光通用型），<br />hc（海光计算增强型），<br />hm（海光内存优化型），<br />fs（飞腾通用型），<br />fc（飞腾计算增强型），<br />fm（飞腾内存优化型），<br />ks（鲲鹏通用型），<br />kc（鲲鹏计算增强型），<br />kc（鲲鹏内存优化型），<br />p（GPU计算加速型），<br />g（GPU图像加速基础型），<br />ip3（超高IO型）
     * @return this
     */
    public LiveResizeFlavorListFlavorList withFlavorSeries(String flavorSeries) {
        this.flavorSeries = flavorSeries;
        return this;
    }

    /**
     * set nicMultiQueue
     * @param nicMultiQueue 网卡多队列数目
     * @return this
     */
    public LiveResizeFlavorListFlavorList withNicMultiQueue(Integer nicMultiQueue) {
        this.nicMultiQueue = nicMultiQueue;
        return this;
    }

    /**
     * set pps
     * @param pps 最大收发包限制
     * @return this
     */
    public LiveResizeFlavorListFlavorList withPps(Integer pps) {
        this.pps = pps;
        return this;
    }

    /**
     * set flavorCPU
     * @param flavorCPU VCPU个数
     * @return this
     */
    public LiveResizeFlavorListFlavorList withFlavorCPU(Integer flavorCPU) {
        this.flavorCPU = flavorCPU;
        return this;
    }

    /**
     * set flavorRAM
     * @param flavorRAM 内存
     * @return this
     */
    public LiveResizeFlavorListFlavorList withFlavorRAM(Integer flavorRAM) {
        this.flavorRAM = flavorRAM;
        return this;
    }

    /**
     * set bandwidth
     * @param bandwidth 带宽
     * @return this
     */
    public LiveResizeFlavorListFlavorList withBandwidth(Float bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set flavorID
     * @param flavorID 云主机规格ID，您可以调用[flavorID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8327&data=87)查看最新的天翼云具体资源池的云主机规格列表
     * @return this
     */
    public LiveResizeFlavorListFlavorList withFlavorID(String flavorID) {
        this.flavorID = flavorID;
        return this;
    }

    public String getCpuInfo() {
        return cpuInfo;
    }

    public void setCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public Float getBaseBandwidth() {
        return baseBandwidth;
    }

    public void setBaseBandwidth(Float baseBandwidth) {
        this.baseBandwidth = baseBandwidth;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public String getFlavorSeries() {
        return flavorSeries;
    }

    public void setFlavorSeries(String flavorSeries) {
        this.flavorSeries = flavorSeries;
    }

    public Integer getNicMultiQueue() {
        return nicMultiQueue;
    }

    public void setNicMultiQueue(Integer nicMultiQueue) {
        this.nicMultiQueue = nicMultiQueue;
    }

    public Integer getPps() {
        return pps;
    }

    public void setPps(Integer pps) {
        this.pps = pps;
    }

    public Integer getFlavorCPU() {
        return flavorCPU;
    }

    public void setFlavorCPU(Integer flavorCPU) {
        this.flavorCPU = flavorCPU;
    }

    public Integer getFlavorRAM() {
        return flavorRAM;
    }

    public void setFlavorRAM(Integer flavorRAM) {
        this.flavorRAM = flavorRAM;
    }

    public Float getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Float bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getFlavorID() {
        return flavorID;
    }

    public void setFlavorID(String flavorID) {
        this.flavorID = flavorID;
    }
}
