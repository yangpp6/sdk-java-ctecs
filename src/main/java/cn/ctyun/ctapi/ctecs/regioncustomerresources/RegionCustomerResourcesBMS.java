package cn.ctyun.ctapi.ctecs.regioncustomerresources;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-根据regionID查询用户资源>
 * Entity: RegionCustomerResourcesBMS
 */
public class RegionCustomerResourcesBMS {
    /**
     * total_count
     * 物理机总数
     */
    private Integer total_count;
    /**
     * detail_total_count
     * 物理机总数
     */
    private Integer detail_total_count;
    /**
     * memory_count
     * 固定为0
     */
    private Integer memory_count;
    /**
     * cpu_count
     * 固定为0
     */
    private Integer cpu_count;
    /**
     * bm_shutd_count
     * 固定为0
     */
    private Integer bm_shutd_count;
    /**
     * expire_running_count
     * 固定为0
     */
    private Integer expire_running_count;
    /**
     * bm_running_count
     * 固定为0
     */
    private Integer bm_running_count;
    /**
     * expire_count
     * 固定为0
     */
    private Integer expire_count;
    /**
     * expire_shutd_count
     * 固定为0
     */
    private Integer expire_shutd_count;

    /**
     * set total_count
     * @param total_count 物理机总数
     * @return this
     */
    public RegionCustomerResourcesBMS withTotal_count(Integer total_count) {
        this.total_count = total_count;
        return this;
    }

    /**
     * set detail_total_count
     * @param detail_total_count 物理机总数
     * @return this
     */
    public RegionCustomerResourcesBMS withDetail_total_count(Integer detail_total_count) {
        this.detail_total_count = detail_total_count;
        return this;
    }

    /**
     * set memory_count
     * @param memory_count 固定为0
     * @return this
     */
    public RegionCustomerResourcesBMS withMemory_count(Integer memory_count) {
        this.memory_count = memory_count;
        return this;
    }

    /**
     * set cpu_count
     * @param cpu_count 固定为0
     * @return this
     */
    public RegionCustomerResourcesBMS withCpu_count(Integer cpu_count) {
        this.cpu_count = cpu_count;
        return this;
    }

    /**
     * set bm_shutd_count
     * @param bm_shutd_count 固定为0
     * @return this
     */
    public RegionCustomerResourcesBMS withBm_shutd_count(Integer bm_shutd_count) {
        this.bm_shutd_count = bm_shutd_count;
        return this;
    }

    /**
     * set expire_running_count
     * @param expire_running_count 固定为0
     * @return this
     */
    public RegionCustomerResourcesBMS withExpire_running_count(Integer expire_running_count) {
        this.expire_running_count = expire_running_count;
        return this;
    }

    /**
     * set bm_running_count
     * @param bm_running_count 固定为0
     * @return this
     */
    public RegionCustomerResourcesBMS withBm_running_count(Integer bm_running_count) {
        this.bm_running_count = bm_running_count;
        return this;
    }

    /**
     * set expire_count
     * @param expire_count 固定为0
     * @return this
     */
    public RegionCustomerResourcesBMS withExpire_count(Integer expire_count) {
        this.expire_count = expire_count;
        return this;
    }

    /**
     * set expire_shutd_count
     * @param expire_shutd_count 固定为0
     * @return this
     */
    public RegionCustomerResourcesBMS withExpire_shutd_count(Integer expire_shutd_count) {
        this.expire_shutd_count = expire_shutd_count;
        return this;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public Integer getDetail_total_count() {
        return detail_total_count;
    }

    public void setDetail_total_count(Integer detail_total_count) {
        this.detail_total_count = detail_total_count;
    }

    public Integer getMemory_count() {
        return memory_count;
    }

    public void setMemory_count(Integer memory_count) {
        this.memory_count = memory_count;
    }

    public Integer getCpu_count() {
        return cpu_count;
    }

    public void setCpu_count(Integer cpu_count) {
        this.cpu_count = cpu_count;
    }

    public Integer getBm_shutd_count() {
        return bm_shutd_count;
    }

    public void setBm_shutd_count(Integer bm_shutd_count) {
        this.bm_shutd_count = bm_shutd_count;
    }

    public Integer getExpire_running_count() {
        return expire_running_count;
    }

    public void setExpire_running_count(Integer expire_running_count) {
        this.expire_running_count = expire_running_count;
    }

    public Integer getBm_running_count() {
        return bm_running_count;
    }

    public void setBm_running_count(Integer bm_running_count) {
        this.bm_running_count = bm_running_count;
    }

    public Integer getExpire_count() {
        return expire_count;
    }

    public void setExpire_count(Integer expire_count) {
        this.expire_count = expire_count;
    }

    public Integer getExpire_shutd_count() {
        return expire_shutd_count;
    }

    public void setExpire_shutd_count(Integer expire_shutd_count) {
        this.expire_shutd_count = expire_shutd_count;
    }
}
