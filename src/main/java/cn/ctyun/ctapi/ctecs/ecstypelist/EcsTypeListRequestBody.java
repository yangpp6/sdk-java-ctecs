package cn.ctyun.ctapi.ctecs.ecstypelist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个云主机规格资源>
 * Entity: EcsTypeListRequestBody
 */
public class EcsTypeListRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * azName
     * 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a>获取可用区信息，查询结果中zoneList内返回存在可用区名称（即多a可用区，本字段填写实际可用区名称），若查询结果中zoneList为空（即为单可用区，本字段填写default）。
     */
    private String azName;
    /**
     * flavorType
     * 规格类型，取值范围：[CPU、CPU_C3、CPU_C6、CPU_C7、CPU_c7ne、CPU_C8、CPU_D3、CPU_FC1、CPU_FM1、CPU_FS1、CPU_HC1、CPU_HM1、CPU_HS1、CPU_IP3、CPU_IR3、CPU_IP3_2、CPU_IR3_2、CPU_KC1、CPU_KM1、CPU_KS1、CPU_M2、CPU_M3、CPU_M6、CPU_M7、CPU_M8、CPU_S2、CPU_S3、CPU_S6、CPU_S7、CPU_S8、CPU_s8r、GPU_N_V100_V_FMGQ、GPU_N_V100_V、GPU_N_V100S_V、GPU_N_V100S_V_FMGQ、GPU_N_T4_V、GPU_N_G7_V、GPU_N_V100、GPU_N_V100_SHIPINYUN、GPU_N_V100_SUANFA、GPU_N_P2V_RENMIN、GPU_N_V100S、GPU_N_T4、GPU_N_T4_AIJISUAN、GPU_N_T4_ASR、GPU_N_T4_JX、GPU_N_T4_SHIPINYUN、GPU_N_T4_SUANFA、GPU_N_T4_YUNYOUXI、GPU_N_PI7、GPU_N_P8A、GPU_A_PAK1、GPU_C_PCH1]，支持类型会随着功能升级增加
     */
    private String flavorType;
    /**
     * flavorName
     * 规格名称
     */
    private String flavorName;
    /**
     * flavorCPU
     * VCPU个数
     */
    private Integer flavorCPU;
    /**
     * flavorRAM
     * 内存大小，单位为G
     */
    private Integer flavorRAM;
    /**
     * flavorArch
     * 指令集架构
     */
    private String flavorArch;
    /**
     * flavorSeries
     * 云主机规格系列，取值范围：<br />s：通用型，<br />c：计算增强型，<br />m：内存优化型，<br />hs：海光通用型，<br />hc：海光计算增强型，<br />hm：海光内存型，<br />fs：飞腾通用型，<br />fc：飞腾计算增强型，<br />fm：飞腾内存优化型，<br />ks：鲲鹏通用型，<br />kc：鲲鹏计算增强型，<br />km：鲲鹏内存优化型，<br />g：GPU图形加速基础型，<br />p：GPU计算加速型，<br />ip3：超高IO型
     */
    private String flavorSeries;
    /**
     * flavorID
     * 规格ID
     */
    private String flavorID;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsTypeListRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a>获取可用区信息，查询结果中zoneList内返回存在可用区名称（即多a可用区，本字段填写实际可用区名称），若查询结果中zoneList为空（即为单可用区，本字段填写default）。
     * @return this
     */
    public EcsTypeListRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set flavorType
     * @param flavorType 规格类型，取值范围：[CPU、CPU_C3、CPU_C6、CPU_C7、CPU_c7ne、CPU_C8、CPU_D3、CPU_FC1、CPU_FM1、CPU_FS1、CPU_HC1、CPU_HM1、CPU_HS1、CPU_IP3、CPU_IR3、CPU_IP3_2、CPU_IR3_2、CPU_KC1、CPU_KM1、CPU_KS1、CPU_M2、CPU_M3、CPU_M6、CPU_M7、CPU_M8、CPU_S2、CPU_S3、CPU_S6、CPU_S7、CPU_S8、CPU_s8r、GPU_N_V100_V_FMGQ、GPU_N_V100_V、GPU_N_V100S_V、GPU_N_V100S_V_FMGQ、GPU_N_T4_V、GPU_N_G7_V、GPU_N_V100、GPU_N_V100_SHIPINYUN、GPU_N_V100_SUANFA、GPU_N_P2V_RENMIN、GPU_N_V100S、GPU_N_T4、GPU_N_T4_AIJISUAN、GPU_N_T4_ASR、GPU_N_T4_JX、GPU_N_T4_SHIPINYUN、GPU_N_T4_SUANFA、GPU_N_T4_YUNYOUXI、GPU_N_PI7、GPU_N_P8A、GPU_A_PAK1、GPU_C_PCH1]，支持类型会随着功能升级增加
     * @return this
     */
    public EcsTypeListRequestBody withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * set flavorName
     * @param flavorName 规格名称
     * @return this
     */
    public EcsTypeListRequestBody withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * set flavorCPU
     * @param flavorCPU VCPU个数
     * @return this
     */
    public EcsTypeListRequestBody withFlavorCPU(Integer flavorCPU) {
        this.flavorCPU = flavorCPU;
        return this;
    }

    /**
     * set flavorRAM
     * @param flavorRAM 内存大小，单位为G
     * @return this
     */
    public EcsTypeListRequestBody withFlavorRAM(Integer flavorRAM) {
        this.flavorRAM = flavorRAM;
        return this;
    }

    /**
     * set flavorArch
     * @param flavorArch 指令集架构
     * @return this
     */
    public EcsTypeListRequestBody withFlavorArch(String flavorArch) {
        this.flavorArch = flavorArch;
        return this;
    }

    /**
     * set flavorSeries
     * @param flavorSeries 云主机规格系列，取值范围：<br />s：通用型，<br />c：计算增强型，<br />m：内存优化型，<br />hs：海光通用型，<br />hc：海光计算增强型，<br />hm：海光内存型，<br />fs：飞腾通用型，<br />fc：飞腾计算增强型，<br />fm：飞腾内存优化型，<br />ks：鲲鹏通用型，<br />kc：鲲鹏计算增强型，<br />km：鲲鹏内存优化型，<br />g：GPU图形加速基础型，<br />p：GPU计算加速型，<br />ip3：超高IO型
     * @return this
     */
    public EcsTypeListRequestBody withFlavorSeries(String flavorSeries) {
        this.flavorSeries = flavorSeries;
        return this;
    }

    /**
     * set flavorID
     * @param flavorID 规格ID
     * @return this
     */
    public EcsTypeListRequestBody withFlavorID(String flavorID) {
        this.flavorID = flavorID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
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

    public String getFlavorArch() {
        return flavorArch;
    }

    public void setFlavorArch(String flavorArch) {
        this.flavorArch = flavorArch;
    }

    public String getFlavorSeries() {
        return flavorSeries;
    }

    public void setFlavorSeries(String flavorSeries) {
        this.flavorSeries = flavorSeries;
    }

    public String getFlavorID() {
        return flavorID;
    }

    public void setFlavorID(String flavorID) {
        this.flavorID = flavorID;
    }
}
