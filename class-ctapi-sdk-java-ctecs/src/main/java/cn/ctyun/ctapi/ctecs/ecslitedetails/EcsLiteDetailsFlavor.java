package cn.ctyun.ctapi.ctecs.ecslitedetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询轻量型云主机详情>
 * Entity: EcsLiteDetailsFlavor
 */
public class EcsLiteDetailsFlavor {
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
     * set flavorID
     * @param flavorID 规格ID
     * @return this
     */
    public EcsLiteDetailsFlavor withFlavorID(String flavorID) {
        this.flavorID = flavorID;
        return this;
    }

    /**
     * set flavorName
     * @param flavorName 规格名称
     * @return this
     */
    public EcsLiteDetailsFlavor withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * set flavorCPU
     * @param flavorCPU VCPU
     * @return this
     */
    public EcsLiteDetailsFlavor withFlavorCPU(Integer flavorCPU) {
        this.flavorCPU = flavorCPU;
        return this;
    }

    /**
     * set flavorRAM
     * @param flavorRAM 内存
     * @return this
     */
    public EcsLiteDetailsFlavor withFlavorRAM(Integer flavorRAM) {
        this.flavorRAM = flavorRAM;
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
}
