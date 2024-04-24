package cn.ctyun.ctapi.ctecs.ecstypelist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个云主机规格资源>
 * Entity: EcsTypeListFlavors
 */
public class EcsTypeListFlavors {
    /**
     * cpuinfo
     * cpu架构
     */
    private String cpuinfo;
    /**
     * bandwidth_base
     * 基准带宽
     */
    private Float bandwidth_base;
    /**
     * name
     * 云主机规格名称
     */
    private String name;
    /**
     * flavor_type
     * 规格种类
     */
    private String flavor_type;
    /**
     * series
     * 云主机规格系列
     */
    private String series;
    /**
     * multiqueue
     * 网卡多队列数目
     */
    private Integer multiqueue;
    /**
     * pps
     * 最大收发包限制
     */
    private Integer pps;
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
     * bandwidth
     * 带宽
     */
    private Float bandwidth;
    /**
     * id
     * 云主机规格ID
     */
    private String id;
    /**
     * gpu_name
     * GPU厂商
     */
    private String gpu_name;
    /**
     * video_memory
     * GPU显存大小
     */
    private Integer video_memory;
    /**
     * gpu_type
     * GPU类型，取值范围：T4、V100、V100S、A10、A100、atlas 300i pro、mlu370-s4，支持类型会随着功能升级增加
     */
    private String gpu_type;
    /**
     * gpu_count
     * GPU设备数量
     */
    private Integer gpu_count;
    /**
     * available
     * 是否可用（true：可用；false：不可用，已售罄）
     */
    private Boolean available;

    /**
     * set cpuinfo
     * @param cpuinfo cpu架构
     * @return this
     */
    public EcsTypeListFlavors withCpuinfo(String cpuinfo) {
        this.cpuinfo = cpuinfo;
        return this;
    }

    /**
     * set bandwidth_base
     * @param bandwidth_base 基准带宽
     * @return this
     */
    public EcsTypeListFlavors withBandwidth_base(Float bandwidth_base) {
        this.bandwidth_base = bandwidth_base;
        return this;
    }

    /**
     * set name
     * @param name 云主机规格名称
     * @return this
     */
    public EcsTypeListFlavors withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * set flavor_type
     * @param flavor_type 规格种类
     * @return this
     */
    public EcsTypeListFlavors withFlavor_type(String flavor_type) {
        this.flavor_type = flavor_type;
        return this;
    }

    /**
     * set series
     * @param series 云主机规格系列
     * @return this
     */
    public EcsTypeListFlavors withSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * set multiqueue
     * @param multiqueue 网卡多队列数目
     * @return this
     */
    public EcsTypeListFlavors withMultiqueue(Integer multiqueue) {
        this.multiqueue = multiqueue;
        return this;
    }

    /**
     * set pps
     * @param pps 最大收发包限制
     * @return this
     */
    public EcsTypeListFlavors withPps(Integer pps) {
        this.pps = pps;
        return this;
    }

    /**
     * set vcpu
     * @param vcpu VCPU
     * @return this
     */
    public EcsTypeListFlavors withVcpu(Integer vcpu) {
        this.vcpu = vcpu;
        return this;
    }

    /**
     * set ram
     * @param ram 内存
     * @return this
     */
    public EcsTypeListFlavors withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * set bandwidth
     * @param bandwidth 带宽
     * @return this
     */
    public EcsTypeListFlavors withBandwidth(Float bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set id
     * @param id 云主机规格ID
     * @return this
     */
    public EcsTypeListFlavors withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * set gpu_name
     * @param gpu_name GPU厂商
     * @return this
     */
    public EcsTypeListFlavors withGpu_name(String gpu_name) {
        this.gpu_name = gpu_name;
        return this;
    }

    /**
     * set video_memory
     * @param video_memory GPU显存大小
     * @return this
     */
    public EcsTypeListFlavors withVideo_memory(Integer video_memory) {
        this.video_memory = video_memory;
        return this;
    }

    /**
     * set gpu_type
     * @param gpu_type GPU类型，取值范围：T4、V100、V100S、A10、A100、atlas 300i pro、mlu370-s4，支持类型会随着功能升级增加
     * @return this
     */
    public EcsTypeListFlavors withGpu_type(String gpu_type) {
        this.gpu_type = gpu_type;
        return this;
    }

    /**
     * set gpu_count
     * @param gpu_count GPU设备数量
     * @return this
     */
    public EcsTypeListFlavors withGpu_count(Integer gpu_count) {
        this.gpu_count = gpu_count;
        return this;
    }

    /**
     * set available
     * @param available 是否可用（true：可用；false：不可用，已售罄）
     * @return this
     */
    public EcsTypeListFlavors withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    public String getCpuinfo() {
        return cpuinfo;
    }

    public void setCpuinfo(String cpuinfo) {
        this.cpuinfo = cpuinfo;
    }

    public Float getBandwidth_base() {
        return bandwidth_base;
    }

    public void setBandwidth_base(Float bandwidth_base) {
        this.bandwidth_base = bandwidth_base;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor_type() {
        return flavor_type;
    }

    public void setFlavor_type(String flavor_type) {
        this.flavor_type = flavor_type;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Integer getMultiqueue() {
        return multiqueue;
    }

    public void setMultiqueue(Integer multiqueue) {
        this.multiqueue = multiqueue;
    }

    public Integer getPps() {
        return pps;
    }

    public void setPps(Integer pps) {
        this.pps = pps;
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

    public Float getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Float bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGpu_name() {
        return gpu_name;
    }

    public void setGpu_name(String gpu_name) {
        this.gpu_name = gpu_name;
    }

    public Integer getVideo_memory() {
        return video_memory;
    }

    public void setVideo_memory(Integer video_memory) {
        this.video_memory = video_memory;
    }

    public String getGpu_type() {
        return gpu_type;
    }

    public void setGpu_type(String gpu_type) {
        this.gpu_type = gpu_type;
    }

    public Integer getGpu_count() {
        return gpu_count;
    }

    public void setGpu_count(Integer gpu_count) {
        this.gpu_count = gpu_count;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
