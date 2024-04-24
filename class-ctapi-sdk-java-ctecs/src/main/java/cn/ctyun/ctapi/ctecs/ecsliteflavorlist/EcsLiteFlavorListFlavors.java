package cn.ctyun.ctapi.ctecs.ecsliteflavorlist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询轻量型云主机的规格套餐资源>
 * Entity: EcsLiteFlavorListFlavors
 */
public class EcsLiteFlavorListFlavors {
    /**
     * flavorSetType
     * 规格套餐类型，取值范围：<br />fix：固定套餐<br />band：带宽套餐
     */
    private String flavorSetType;
    /**
     * flavorName
     * 规格套餐名称
     */
    private String flavorName;
    /**
     * flavorSeries
     * 规格系列
     */
    private String flavorSeries;
    /**
     * flavorType
     * 规格类型
     */
    private String flavorType;
    /**
     * flavorRAM
     * 内存大小，单位为G
     */
    private Integer flavorRAM;
    /**
     * flavorCPU
     * VCPU个数
     */
    private Integer flavorCPU;
    /**
     * flavorBandwidth
     * 固定套餐带宽大小，当flavorSetType为fix时展示
     */
    private Integer flavorBandwidth;
    /**
     * flavorBootDiskSize
     * 固定套餐系统盘大小，当flavorSetType为fix时展示
     */
    private Integer flavorBootDiskSize;
    /**
     * flavorBandwidthList
     * 带宽套餐带宽大小取值列表，当flavorSetType为band时展示
     */
    private Integer[] flavorBandwidthList;
    /**
     * flavorBootDiskSizeList
     * 带宽套餐系统盘大小取值列表，当flavorSetType为band时展示
     */
    private Integer[] flavorBootDiskSizeList;

    /**
     * set flavorSetType
     * @param flavorSetType 规格套餐类型，取值范围：<br />fix：固定套餐<br />band：带宽套餐
     * @return this
     */
    public EcsLiteFlavorListFlavors withFlavorSetType(String flavorSetType) {
        this.flavorSetType = flavorSetType;
        return this;
    }

    /**
     * set flavorName
     * @param flavorName 规格套餐名称
     * @return this
     */
    public EcsLiteFlavorListFlavors withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * set flavorSeries
     * @param flavorSeries 规格系列
     * @return this
     */
    public EcsLiteFlavorListFlavors withFlavorSeries(String flavorSeries) {
        this.flavorSeries = flavorSeries;
        return this;
    }

    /**
     * set flavorType
     * @param flavorType 规格类型
     * @return this
     */
    public EcsLiteFlavorListFlavors withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * set flavorRAM
     * @param flavorRAM 内存大小，单位为G
     * @return this
     */
    public EcsLiteFlavorListFlavors withFlavorRAM(Integer flavorRAM) {
        this.flavorRAM = flavorRAM;
        return this;
    }

    /**
     * set flavorCPU
     * @param flavorCPU VCPU个数
     * @return this
     */
    public EcsLiteFlavorListFlavors withFlavorCPU(Integer flavorCPU) {
        this.flavorCPU = flavorCPU;
        return this;
    }

    /**
     * set flavorBandwidth
     * @param flavorBandwidth 固定套餐带宽大小，当flavorSetType为fix时展示
     * @return this
     */
    public EcsLiteFlavorListFlavors withFlavorBandwidth(Integer flavorBandwidth) {
        this.flavorBandwidth = flavorBandwidth;
        return this;
    }

    /**
     * set flavorBootDiskSize
     * @param flavorBootDiskSize 固定套餐系统盘大小，当flavorSetType为fix时展示
     * @return this
     */
    public EcsLiteFlavorListFlavors withFlavorBootDiskSize(Integer flavorBootDiskSize) {
        this.flavorBootDiskSize = flavorBootDiskSize;
        return this;
    }

    /**
     * set flavorBandwidthList
     * @param flavorBandwidthList 带宽套餐带宽大小取值列表，当flavorSetType为band时展示
     * @return this
     */
    public EcsLiteFlavorListFlavors withFlavorBandwidthList(Integer[] flavorBandwidthList) {
        this.flavorBandwidthList = flavorBandwidthList;
        return this;
    }

    /**
     * set flavorBootDiskSizeList
     * @param flavorBootDiskSizeList 带宽套餐系统盘大小取值列表，当flavorSetType为band时展示
     * @return this
     */
    public EcsLiteFlavorListFlavors withFlavorBootDiskSizeList(Integer[] flavorBootDiskSizeList) {
        this.flavorBootDiskSizeList = flavorBootDiskSizeList;
        return this;
    }

    public String getFlavorSetType() {
        return flavorSetType;
    }

    public void setFlavorSetType(String flavorSetType) {
        this.flavorSetType = flavorSetType;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public String getFlavorSeries() {
        return flavorSeries;
    }

    public void setFlavorSeries(String flavorSeries) {
        this.flavorSeries = flavorSeries;
    }

    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public Integer getFlavorRAM() {
        return flavorRAM;
    }

    public void setFlavorRAM(Integer flavorRAM) {
        this.flavorRAM = flavorRAM;
    }

    public Integer getFlavorCPU() {
        return flavorCPU;
    }

    public void setFlavorCPU(Integer flavorCPU) {
        this.flavorCPU = flavorCPU;
    }

    public Integer getFlavorBandwidth() {
        return flavorBandwidth;
    }

    public void setFlavorBandwidth(Integer flavorBandwidth) {
        this.flavorBandwidth = flavorBandwidth;
    }

    public Integer getFlavorBootDiskSize() {
        return flavorBootDiskSize;
    }

    public void setFlavorBootDiskSize(Integer flavorBootDiskSize) {
        this.flavorBootDiskSize = flavorBootDiskSize;
    }

    public Integer[] getFlavorBandwidthList() {
        return flavorBandwidthList;
    }

    public void setFlavorBandwidthList(Integer[] flavorBandwidthList) {
        this.flavorBandwidthList = flavorBandwidthList;
    }

    public Integer[] getFlavorBootDiskSizeList() {
        return flavorBootDiskSizeList;
    }

    public void setFlavorBootDiskSizeList(Integer[] flavorBootDiskSizeList) {
        this.flavorBootDiskSizeList = flavorBootDiskSizeList;
    }
}
