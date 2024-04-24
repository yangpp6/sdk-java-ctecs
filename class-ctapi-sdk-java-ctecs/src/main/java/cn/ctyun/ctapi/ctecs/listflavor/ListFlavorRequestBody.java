package cn.ctyun.ctapi.ctecs.listflavor;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个云主机规格资源>
 * Entity: ListFlavorRequestBody
 */
public class ListFlavorRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * azName
     * 可用区名称，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解可用区 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a><br />注：查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空（即为单可用区，本字段填写default）
     */
    private String azName;
    /**
     * flavorType
     *  规格类型，取值范围：[CPU、CPU_C3、CPU_C6、CPU_C7、CPU_c7ne、CPU_C8、CPU_D3、CPU_FC1、CPU_FM1、CPU_FS1、CPU_HC1、CPU_HM1、CPU_HS1、CPU_IP3、CPU_IR3、CPU_IP3_2、CPU_IR3_2、CPU_KC1、CPU_KM1、CPU_KS1、CPU_M2、CPU_M3、CPU_M6、CPU_M7、CPU_M8、CPU_S2、CPU_S3、CPU_S6、CPU_S7、CPU_S8、CPU_s8r、GPU_N_V100_V_FMGQ、GPU_N_V100_V、GPU_N_V100S_V、GPU_N_V100S_V_FMGQ、GPU_N_T4_V、GPU_N_G7_V、GPU_N_V100、GPU_N_V100_SHIPINYUN、GPU_N_V100_SUANFA、GPU_N_P2V_RENMIN、GPU_N_V100S、GPU_N_T4、GPU_N_T4_AIJISUAN、GPU_N_T4_ASR、GPU_N_T4_JX、GPU_N_T4_SHIPINYUN、GPU_N_T4_SUANFA、GPU_N_T4_YUNYOUXI、GPU_N_PI7、GPU_N_P8A、GPU_A_PAK1、GPU_C_PCH1]，支持类型会随着功能升级增加 
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
     * 内存大小，单位为GB
     */
    private Integer flavorRAM;
    /**
     * flavorArch
     * 指令集架构
     */
    private String flavorArch;
    /**
     * flavorSeries
     * 规格系列
     */
    private String flavorSeries;
    /**
     * flavorID
     * 云主机规格ID，您可以通过<a href="https://www.ctyun.cn/document/10026730/10118193">规格说明</a>了解弹性云主机的选型基本信息<br />
     */
    private String flavorID;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public ListFlavorRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解可用区 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a><br />注：查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空（即为单可用区，本字段填写default）
     * @return this
     */
    public ListFlavorRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set flavorType
     * @param flavorType  规格类型，取值范围：[CPU、CPU_C3、CPU_C6、CPU_C7、CPU_c7ne、CPU_C8、CPU_D3、CPU_FC1、CPU_FM1、CPU_FS1、CPU_HC1、CPU_HM1、CPU_HS1、CPU_IP3、CPU_IR3、CPU_IP3_2、CPU_IR3_2、CPU_KC1、CPU_KM1、CPU_KS1、CPU_M2、CPU_M3、CPU_M6、CPU_M7、CPU_M8、CPU_S2、CPU_S3、CPU_S6、CPU_S7、CPU_S8、CPU_s8r、GPU_N_V100_V_FMGQ、GPU_N_V100_V、GPU_N_V100S_V、GPU_N_V100S_V_FMGQ、GPU_N_T4_V、GPU_N_G7_V、GPU_N_V100、GPU_N_V100_SHIPINYUN、GPU_N_V100_SUANFA、GPU_N_P2V_RENMIN、GPU_N_V100S、GPU_N_T4、GPU_N_T4_AIJISUAN、GPU_N_T4_ASR、GPU_N_T4_JX、GPU_N_T4_SHIPINYUN、GPU_N_T4_SUANFA、GPU_N_T4_YUNYOUXI、GPU_N_PI7、GPU_N_P8A、GPU_A_PAK1、GPU_C_PCH1]，支持类型会随着功能升级增加 
     * @return this
     */
    public ListFlavorRequestBody withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * set flavorName
     * @param flavorName 规格名称
     * @return this
     */
    public ListFlavorRequestBody withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * set flavorCPU
     * @param flavorCPU VCPU个数
     * @return this
     */
    public ListFlavorRequestBody withFlavorCPU(Integer flavorCPU) {
        this.flavorCPU = flavorCPU;
        return this;
    }

    /**
     * set flavorRAM
     * @param flavorRAM 内存大小，单位为GB
     * @return this
     */
    public ListFlavorRequestBody withFlavorRAM(Integer flavorRAM) {
        this.flavorRAM = flavorRAM;
        return this;
    }

    /**
     * set flavorArch
     * @param flavorArch 指令集架构
     * @return this
     */
    public ListFlavorRequestBody withFlavorArch(String flavorArch) {
        this.flavorArch = flavorArch;
        return this;
    }

    /**
     * set flavorSeries
     * @param flavorSeries 规格系列
     * @return this
     */
    public ListFlavorRequestBody withFlavorSeries(String flavorSeries) {
        this.flavorSeries = flavorSeries;
        return this;
    }

    /**
     * set flavorID
     * @param flavorID 云主机规格ID，您可以通过<a href="https://www.ctyun.cn/document/10026730/10118193">规格说明</a>了解弹性云主机的选型基本信息<br />
     * @return this
     */
    public ListFlavorRequestBody withFlavorID(String flavorID) {
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
