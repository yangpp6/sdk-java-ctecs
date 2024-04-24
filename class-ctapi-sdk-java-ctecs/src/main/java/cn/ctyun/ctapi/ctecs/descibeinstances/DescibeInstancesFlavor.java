package cn.ctyun.ctapi.ctecs.descibeinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一台或多台云主机详细信息>
 * Entity: DescibeInstancesFlavor
 */
public class DescibeInstancesFlavor {
    /**
     * flavorID
     * 规格ID
     */
    private String flavorID;
    /**
     * flavorName
     * 规格名称
     */
    private String flavorName;
    /**
     * flavorCPU
     * VCPU
     */
    private Integer flavorCPU;
    /**
     * flavorRAM
     * 内存
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
     * @param flavorID 规格ID
     * @return this
     */
    public DescibeInstancesFlavor withFlavorID(String flavorID) {
        this.flavorID = flavorID;
        return this;
    }

    /**
     * set flavorName
     * @param flavorName 规格名称
     * @return this
     */
    public DescibeInstancesFlavor withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * set flavorCPU
     * @param flavorCPU VCPU
     * @return this
     */
    public DescibeInstancesFlavor withFlavorCPU(Integer flavorCPU) {
        this.flavorCPU = flavorCPU;
        return this;
    }

    /**
     * set flavorRAM
     * @param flavorRAM 内存
     * @return this
     */
    public DescibeInstancesFlavor withFlavorRAM(Integer flavorRAM) {
        this.flavorRAM = flavorRAM;
        return this;
    }

    /**
     * set gpuType
     * @param gpuType GPU类型，取值范围：T4、V100、V100S、A10、A100、atlas 300i pro、mlu370-s4，支持类型会随着功能升级增加
     * @return this
     */
    public DescibeInstancesFlavor withGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    /**
     * set gpuCount
     * @param gpuCount GPU数目
     * @return this
     */
    public DescibeInstancesFlavor withGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }

    /**
     * set gpuVendor
     * @param gpuVendor GPU名称
     * @return this
     */
    public DescibeInstancesFlavor withGpuVendor(String gpuVendor) {
        this.gpuVendor = gpuVendor;
        return this;
    }

    /**
     * set videoMemSize
     * @param videoMemSize 显存大小
     * @return this
     */
    public DescibeInstancesFlavor withVideoMemSize(Integer videoMemSize) {
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
