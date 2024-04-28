package cn.ctyun.ctapi.ctecs.listflavor;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个云主机规格资源>
 * Entity: ListFlavorFlavorList
 */
public class ListFlavorFlavorList {
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
     *  规格类型，取值范围：[CPU、CPU_C3、CPU_C6、CPU_C7、CPU_c7ne、CPU_C8、CPU_D3、CPU_FC1、CPU_FM1、CPU_FS1、CPU_HC1、CPU_HM1、CPU_HS1、CPU_IP3、CPU_IR3、CPU_IP3_2、CPU_IR3_2、CPU_KC1、CPU_KM1、CPU_KS1、CPU_M2、CPU_M3、CPU_M6、CPU_M7、CPU_M8、CPU_S2、CPU_S3、CPU_S6、CPU_S7、CPU_S8、CPU_s8r、GPU_N_V100_V_FMGQ、GPU_N_V100_V、GPU_N_V100S_V、GPU_N_V100S_V_FMGQ、GPU_N_T4_V、GPU_N_G7_V、GPU_N_V100、GPU_N_V100_SHIPINYUN、GPU_N_V100_SUANFA、GPU_N_P2V_RENMIN、GPU_N_V100S、GPU_N_T4、GPU_N_T4_AIJISUAN、GPU_N_T4_ASR、GPU_N_T4_JX、GPU_N_T4_SHIPINYUN、GPU_N_T4_SUANFA、GPU_N_T4_YUNYOUXI、GPU_N_PI7、GPU_N_P8A、GPU_A_PAK1、GPU_C_PCH1]，支持类型会随着功能升级增加 
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
     * 云主机规格ID
     */
    private String flavorID;
    /**
     * gpuVendor
     * GPU厂商
     */
    private String gpuVendor;
    /**
     * videoMemSize
     * GPU显存大小
     */
    private Integer videoMemSize;
    /**
     * gpuType
     * GPU类型，取值范围：T4、V100、V100S、A10、A100、atlas 300i pro、mlu370-s4，支持类型会随着功能升级增加
     */
    private String gpuType;
    /**
     * gpuCount
     * GPU设备数量
     */
    private Integer gpuCount;
    /**
     * available
     * 是否可用（true：可用；false：不可用，已售罄）
     */
    private Boolean available;
    /**
     * azList
     * 多az名称列表（非多可用区为\["default"\]）
     */
    private String[] azList;
    /**
     * flavorSeriesName
     * 规格系列名称，参照参数flavorSeries说明
     */
    private String flavorSeriesName;

    /**
     * set cpuInfo
     * @param cpuInfo cpu架构
     * @return this
     */
    public ListFlavorFlavorList withCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
        return this;
    }

    /**
     * set baseBandwidth
     * @param baseBandwidth 基准带宽
     * @return this
     */
    public ListFlavorFlavorList withBaseBandwidth(Float baseBandwidth) {
        this.baseBandwidth = baseBandwidth;
        return this;
    }

    /**
     * set flavorName
     * @param flavorName 云主机规格名称
     * @return this
     */
    public ListFlavorFlavorList withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * set flavorType
     * @param flavorType  规格类型，取值范围：[CPU、CPU_C3、CPU_C6、CPU_C7、CPU_c7ne、CPU_C8、CPU_D3、CPU_FC1、CPU_FM1、CPU_FS1、CPU_HC1、CPU_HM1、CPU_HS1、CPU_IP3、CPU_IR3、CPU_IP3_2、CPU_IR3_2、CPU_KC1、CPU_KM1、CPU_KS1、CPU_M2、CPU_M3、CPU_M6、CPU_M7、CPU_M8、CPU_S2、CPU_S3、CPU_S6、CPU_S7、CPU_S8、CPU_s8r、GPU_N_V100_V_FMGQ、GPU_N_V100_V、GPU_N_V100S_V、GPU_N_V100S_V_FMGQ、GPU_N_T4_V、GPU_N_G7_V、GPU_N_V100、GPU_N_V100_SHIPINYUN、GPU_N_V100_SUANFA、GPU_N_P2V_RENMIN、GPU_N_V100S、GPU_N_T4、GPU_N_T4_AIJISUAN、GPU_N_T4_ASR、GPU_N_T4_JX、GPU_N_T4_SHIPINYUN、GPU_N_T4_SUANFA、GPU_N_T4_YUNYOUXI、GPU_N_PI7、GPU_N_P8A、GPU_A_PAK1、GPU_C_PCH1]，支持类型会随着功能升级增加 
     * @return this
     */
    public ListFlavorFlavorList withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * set flavorSeries
     * @param flavorSeries 云主机规格系列，规格系列说明：<br />s（通用性），<br />c（计算增强型），<br />m（内存优化型），<br />hs（海光通用型），<br />hc（海光计算增强型），<br />hm（海光内存优化型），<br />fs（飞腾通用型），<br />fc（飞腾计算增强型），<br />fm（飞腾内存优化型），<br />ks（鲲鹏通用型），<br />kc（鲲鹏计算增强型），<br />kc（鲲鹏内存优化型），<br />p（GPU计算加速型），<br />g（GPU图像加速基础型），<br />ip3（超高IO型）
     * @return this
     */
    public ListFlavorFlavorList withFlavorSeries(String flavorSeries) {
        this.flavorSeries = flavorSeries;
        return this;
    }

    /**
     * set nicMultiQueue
     * @param nicMultiQueue 网卡多队列数目
     * @return this
     */
    public ListFlavorFlavorList withNicMultiQueue(Integer nicMultiQueue) {
        this.nicMultiQueue = nicMultiQueue;
        return this;
    }

    /**
     * set pps
     * @param pps 最大收发包限制
     * @return this
     */
    public ListFlavorFlavorList withPps(Integer pps) {
        this.pps = pps;
        return this;
    }

    /**
     * set flavorCPU
     * @param flavorCPU VCPU个数
     * @return this
     */
    public ListFlavorFlavorList withFlavorCPU(Integer flavorCPU) {
        this.flavorCPU = flavorCPU;
        return this;
    }

    /**
     * set flavorRAM
     * @param flavorRAM 内存
     * @return this
     */
    public ListFlavorFlavorList withFlavorRAM(Integer flavorRAM) {
        this.flavorRAM = flavorRAM;
        return this;
    }

    /**
     * set bandwidth
     * @param bandwidth 带宽
     * @return this
     */
    public ListFlavorFlavorList withBandwidth(Float bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set flavorID
     * @param flavorID 云主机规格ID
     * @return this
     */
    public ListFlavorFlavorList withFlavorID(String flavorID) {
        this.flavorID = flavorID;
        return this;
    }

    /**
     * set gpuVendor
     * @param gpuVendor GPU厂商
     * @return this
     */
    public ListFlavorFlavorList withGpuVendor(String gpuVendor) {
        this.gpuVendor = gpuVendor;
        return this;
    }

    /**
     * set videoMemSize
     * @param videoMemSize GPU显存大小
     * @return this
     */
    public ListFlavorFlavorList withVideoMemSize(Integer videoMemSize) {
        this.videoMemSize = videoMemSize;
        return this;
    }

    /**
     * set gpuType
     * @param gpuType GPU类型，取值范围：T4、V100、V100S、A10、A100、atlas 300i pro、mlu370-s4，支持类型会随着功能升级增加
     * @return this
     */
    public ListFlavorFlavorList withGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    /**
     * set gpuCount
     * @param gpuCount GPU设备数量
     * @return this
     */
    public ListFlavorFlavorList withGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }

    /**
     * set available
     * @param available 是否可用（true：可用；false：不可用，已售罄）
     * @return this
     */
    public ListFlavorFlavorList withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * set azList
     * @param azList 多az名称列表（非多可用区为\["default"\]）
     * @return this
     */
    public ListFlavorFlavorList withAzList(String[] azList) {
        this.azList = azList;
        return this;
    }

    /**
     * set flavorSeriesName
     * @param flavorSeriesName 规格系列名称，参照参数flavorSeries说明
     * @return this
     */
    public ListFlavorFlavorList withFlavorSeriesName(String flavorSeriesName) {
        this.flavorSeriesName = flavorSeriesName;
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

    public String getGpuVendor() {
        return gpuVendor;
    }

    public void setGpuVendor(String gpuVendor) {
        this.gpuVendor = gpuVendor;
    }

    public Integer getVideoMemSize() {
        return videoMemSize;
    }

    public void setVideoMemSize(Integer videoMemSize) {
        this.videoMemSize = videoMemSize;
    }

    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    public Integer getGpuCount() {
        return gpuCount;
    }

    public void setGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String[] getAzList() {
        return azList;
    }

    public void setAzList(String[] azList) {
        this.azList = azList;
    }

    public String getFlavorSeriesName() {
        return flavorSeriesName;
    }

    public void setFlavorSeriesName(String flavorSeriesName) {
        this.flavorSeriesName = flavorSeriesName;
    }
}
