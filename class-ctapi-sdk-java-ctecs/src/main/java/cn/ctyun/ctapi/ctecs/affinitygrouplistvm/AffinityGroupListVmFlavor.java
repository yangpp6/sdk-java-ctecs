package cn.ctyun.ctapi.ctecs.affinitygrouplistvm;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组内的云主机>
 * Entity: AffinityGroupListVmFlavor
 */
public class AffinityGroupListVmFlavor {
    /**
     * flavorID
     * 云主机规格ID，您可以调用<a href="https://www.ctyun.cn/document/10026730/10118193">规格说明</a>了解弹性云主机的选型基本信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8327&data=87">查询一个或多个云主机规格资源</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10040174">查询一个或多个云主机规格资源（旧版）
     */
    private String flavorID;
    /**
     * flavorName
     * 规格名称
     */
    private String flavorName;
    /**
     * flavorCPU
     * VCPU数量
     */
    private Integer flavorCPU;
    /**
     * flavorRAM
     * 内存大小，单位为GB
     */
    private Integer flavorRAM;
    /**
     * gpuType
     * GPU类型，取值范围：T4、V100、V100S、A10、A100、atlas 300i pro、mlu370-s4，支持类型会随着功能升级增加
     */
    private String gpuType;
    /**
     * gpuCount
     * GPU数目
     */
    private Integer gpuCount;
    /**
     * gpuVendor
     * GPU名称
     */
    private String gpuVendor;
    /**
     * videoMemSize
     * 显存大小
     */
    private Integer videoMemSize;

    /**
     * set flavorID
     * @param flavorID 云主机规格ID，您可以调用<a href="https://www.ctyun.cn/document/10026730/10118193">规格说明</a>了解弹性云主机的选型基本信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8327&data=87">查询一个或多个云主机规格资源</a><br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://www.ctyun.cn/document/10026730/10040174">查询一个或多个云主机规格资源（旧版）
     * @return this
     */
    public AffinityGroupListVmFlavor withFlavorID(String flavorID) {
        this.flavorID = flavorID;
        return this;
    }

    /**
     * set flavorName
     * @param flavorName 规格名称
     * @return this
     */
    public AffinityGroupListVmFlavor withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * set flavorCPU
     * @param flavorCPU VCPU数量
     * @return this
     */
    public AffinityGroupListVmFlavor withFlavorCPU(Integer flavorCPU) {
        this.flavorCPU = flavorCPU;
        return this;
    }

    /**
     * set flavorRAM
     * @param flavorRAM 内存大小，单位为GB
     * @return this
     */
    public AffinityGroupListVmFlavor withFlavorRAM(Integer flavorRAM) {
        this.flavorRAM = flavorRAM;
        return this;
    }

    /**
     * set gpuType
     * @param gpuType GPU类型，取值范围：T4、V100、V100S、A10、A100、atlas 300i pro、mlu370-s4，支持类型会随着功能升级增加
     * @return this
     */
    public AffinityGroupListVmFlavor withGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    /**
     * set gpuCount
     * @param gpuCount GPU数目
     * @return this
     */
    public AffinityGroupListVmFlavor withGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }

    /**
     * set gpuVendor
     * @param gpuVendor GPU名称
     * @return this
     */
    public AffinityGroupListVmFlavor withGpuVendor(String gpuVendor) {
        this.gpuVendor = gpuVendor;
        return this;
    }

    /**
     * set videoMemSize
     * @param videoMemSize 显存大小
     * @return this
     */
    public AffinityGroupListVmFlavor withVideoMemSize(Integer videoMemSize) {
        this.videoMemSize = videoMemSize;
        return this;
    }

    public String getFlavorID() {
        return flavorID;
    }

    public void setFlavorID(String flavorID) {
        this.flavorID = flavorID;
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
}
