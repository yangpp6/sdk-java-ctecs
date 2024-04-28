package cn.ctyun.ctapi.ctecs.regioncustomerresources;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-根据regionID查询用户资源>
 * Entity: RegionCustomerResourcesVM
 */
public class RegionCustomerResourcesVM {
    /**
     * vm_shutd_count
     * 已关机云主机数量
     */
    private Integer vm_shutd_count;
    /**
     * expire_count
     * 过期云主机数量
     */
    private Integer expire_count;
    /**
     * expire_running_count
     * 已过期的运行中云主机数量
     */
    private Integer expire_running_count;
    /**
     * expire_shutd_count
     * 已过期的关机云主机数量
     */
    private Integer expire_shutd_count;
    /**
     * vm_running_count
     * 运行中云主机数量
     */
    private Integer vm_running_count;
    /**
     * total_count
     * 云主机总数
     */
    private Integer total_count;
    /**
     * cpu_count
     * CPU总数
     */
    private Integer cpu_count;
    /**
     * memory_count
     * 总内存大小
     */
    private Integer memory_count;
    /**
     * detail_total_count
     * 云主机总数
     */
    private Integer detail_total_count;

    /**
     * set vm_shutd_count
     * @param vm_shutd_count 已关机云主机数量
     * @return this
     */
    public RegionCustomerResourcesVM withVm_shutd_count(Integer vm_shutd_count) {
        this.vm_shutd_count = vm_shutd_count;
        return this;
    }

    /**
     * set expire_count
     * @param expire_count 过期云主机数量
     * @return this
     */
    public RegionCustomerResourcesVM withExpire_count(Integer expire_count) {
        this.expire_count = expire_count;
        return this;
    }

    /**
     * set expire_running_count
     * @param expire_running_count 已过期的运行中云主机数量
     * @return this
     */
    public RegionCustomerResourcesVM withExpire_running_count(Integer expire_running_count) {
        this.expire_running_count = expire_running_count;
        return this;
    }

    /**
     * set expire_shutd_count
     * @param expire_shutd_count 已过期的关机云主机数量
     * @return this
     */
    public RegionCustomerResourcesVM withExpire_shutd_count(Integer expire_shutd_count) {
        this.expire_shutd_count = expire_shutd_count;
        return this;
    }

    /**
     * set vm_running_count
     * @param vm_running_count 运行中云主机数量
     * @return this
     */
    public RegionCustomerResourcesVM withVm_running_count(Integer vm_running_count) {
        this.vm_running_count = vm_running_count;
        return this;
    }

    /**
     * set total_count
     * @param total_count 云主机总数
     * @return this
     */
    public RegionCustomerResourcesVM withTotal_count(Integer total_count) {
        this.total_count = total_count;
        return this;
    }

    /**
     * set cpu_count
     * @param cpu_count CPU总数
     * @return this
     */
    public RegionCustomerResourcesVM withCpu_count(Integer cpu_count) {
        this.cpu_count = cpu_count;
        return this;
    }

    /**
     * set memory_count
     * @param memory_count 总内存大小
     * @return this
     */
    public RegionCustomerResourcesVM withMemory_count(Integer memory_count) {
        this.memory_count = memory_count;
        return this;
    }

    /**
     * set detail_total_count
     * @param detail_total_count 云主机总数
     * @return this
     */
    public RegionCustomerResourcesVM withDetail_total_count(Integer detail_total_count) {
        this.detail_total_count = detail_total_count;
        return this;
    }

    public Integer getVm_shutd_count() {
        return vm_shutd_count;
    }

    public void setVm_shutd_count(Integer vm_shutd_count) {
        this.vm_shutd_count = vm_shutd_count;
    }

    public Integer getExpire_count() {
        return expire_count;
    }

    public void setExpire_count(Integer expire_count) {
        this.expire_count = expire_count;
    }

    public Integer getExpire_running_count() {
        return expire_running_count;
    }

    public void setExpire_running_count(Integer expire_running_count) {
        this.expire_running_count = expire_running_count;
    }

    public Integer getExpire_shutd_count() {
        return expire_shutd_count;
    }

    public void setExpire_shutd_count(Integer expire_shutd_count) {
        this.expire_shutd_count = expire_shutd_count;
    }

    public Integer getVm_running_count() {
        return vm_running_count;
    }

    public void setVm_running_count(Integer vm_running_count) {
        this.vm_running_count = vm_running_count;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public Integer getCpu_count() {
        return cpu_count;
    }

    public void setCpu_count(Integer cpu_count) {
        this.cpu_count = cpu_count;
    }

    public Integer getMemory_count() {
        return memory_count;
    }

    public void setMemory_count(Integer memory_count) {
        this.memory_count = memory_count;
    }

    public Integer getDetail_total_count() {
        return detail_total_count;
    }

    public void setDetail_total_count(Integer detail_total_count) {
        this.detail_total_count = detail_total_count;
    }
}
