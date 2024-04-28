package cn.ctyun.ctapi.ctecs.ecsinstancelist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机列表>
 * Entity: EcsInstanceListFlavor
 */
public class EcsInstanceListFlavor {
    /**
     * flavorID
     * 规格ID
     */
    private String flavorID;
    /**
     * specName
     * 规格名称
     */
    private String specName;
    /**
     * vcpu
     * VCPU
     */
    private Integer vcpu;
    /**
     * ram
     * 内存
     */
    private Integer ram;
    /**
     * gpuType
     * GPU类型
     */
    private String gpuType;
    /**
     * gpuCount
     * GPU数目
     */
    private Integer gpuCount;
    /**
     * gpuName
     * GPU名称
     */
    private String gpuName;
    /**
     * memory
     * GPU显存大小
     */
    private Integer memory;

    /**
     * set flavorID
     * @param flavorID 规格ID
     * @return this
     */
    public EcsInstanceListFlavor withFlavorID(String flavorID) {
        this.flavorID = flavorID;
        return this;
    }

    /**
     * set specName
     * @param specName 规格名称
     * @return this
     */
    public EcsInstanceListFlavor withSpecName(String specName) {
        this.specName = specName;
        return this;
    }

    /**
     * set vcpu
     * @param vcpu VCPU
     * @return this
     */
    public EcsInstanceListFlavor withVcpu(Integer vcpu) {
        this.vcpu = vcpu;
        return this;
    }

    /**
     * set ram
     * @param ram 内存
     * @return this
     */
    public EcsInstanceListFlavor withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * set gpuType
     * @param gpuType GPU类型
     * @return this
     */
    public EcsInstanceListFlavor withGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    /**
     * set gpuCount
     * @param gpuCount GPU数目
     * @return this
     */
    public EcsInstanceListFlavor withGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }

    /**
     * set gpuName
     * @param gpuName GPU名称
     * @return this
     */
    public EcsInstanceListFlavor withGpuName(String gpuName) {
        this.gpuName = gpuName;
        return this;
    }

    /**
     * set memory
     * @param memory GPU显存大小
     * @return this
     */
    public EcsInstanceListFlavor withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    public String getFlavorID() {
        return flavorID;
    }

    public void setFlavorID(String flavorID) {
        this.flavorID = flavorID;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public Integer getVcpu() {
        return vcpu;
    }

    public void setVcpu(Integer vcpu) {
        this.vcpu = vcpu;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
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

    public String getGpuName() {
        return gpuName;
    }

    public void setGpuName(String gpuName) {
        this.gpuName = gpuName;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }
}
