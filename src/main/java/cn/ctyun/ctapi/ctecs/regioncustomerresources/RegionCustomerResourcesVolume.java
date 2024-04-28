package cn.ctyun.ctapi.ctecs.regioncustomerresources;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-根据regionID查询用户资源>
 * Entity: RegionCustomerResourcesVolume
 */
public class RegionCustomerResourcesVolume {
    /**
     * vo_root_count
     * 系统盘数量
     */
    private Integer vo_root_count;
    /**
     * vo_disk_count
     * 数据盘数量
     */
    private Integer vo_disk_count;
    /**
     * total_count
     * 磁盘总数
     */
    private Integer total_count;
    /**
     * detail_total_count
     * 磁盘总数
     */
    private Integer detail_total_count;
    /**
     * total_size
     * 磁盘总大小
     */
    private Integer total_size;
    /**
     * vo_disk_size
     * 数据盘大小
     */
    private Integer vo_disk_size;
    /**
     * vo_root_size
     * 系统盘大小
     */
    private Integer vo_root_size;

    /**
     * set vo_root_count
     * @param vo_root_count 系统盘数量
     * @return this
     */
    public RegionCustomerResourcesVolume withVo_root_count(Integer vo_root_count) {
        this.vo_root_count = vo_root_count;
        return this;
    }

    /**
     * set vo_disk_count
     * @param vo_disk_count 数据盘数量
     * @return this
     */
    public RegionCustomerResourcesVolume withVo_disk_count(Integer vo_disk_count) {
        this.vo_disk_count = vo_disk_count;
        return this;
    }

    /**
     * set total_count
     * @param total_count 磁盘总数
     * @return this
     */
    public RegionCustomerResourcesVolume withTotal_count(Integer total_count) {
        this.total_count = total_count;
        return this;
    }

    /**
     * set detail_total_count
     * @param detail_total_count 磁盘总数
     * @return this
     */
    public RegionCustomerResourcesVolume withDetail_total_count(Integer detail_total_count) {
        this.detail_total_count = detail_total_count;
        return this;
    }

    /**
     * set total_size
     * @param total_size 磁盘总大小
     * @return this
     */
    public RegionCustomerResourcesVolume withTotal_size(Integer total_size) {
        this.total_size = total_size;
        return this;
    }

    /**
     * set vo_disk_size
     * @param vo_disk_size 数据盘大小
     * @return this
     */
    public RegionCustomerResourcesVolume withVo_disk_size(Integer vo_disk_size) {
        this.vo_disk_size = vo_disk_size;
        return this;
    }

    /**
     * set vo_root_size
     * @param vo_root_size 系统盘大小
     * @return this
     */
    public RegionCustomerResourcesVolume withVo_root_size(Integer vo_root_size) {
        this.vo_root_size = vo_root_size;
        return this;
    }

    public Integer getVo_root_count() {
        return vo_root_count;
    }

    public void setVo_root_count(Integer vo_root_count) {
        this.vo_root_count = vo_root_count;
    }

    public Integer getVo_disk_count() {
        return vo_disk_count;
    }

    public void setVo_disk_count(Integer vo_disk_count) {
        this.vo_disk_count = vo_disk_count;
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

    public Integer getTotal_size() {
        return total_size;
    }

    public void setTotal_size(Integer total_size) {
        this.total_size = total_size;
    }

    public Integer getVo_disk_size() {
        return vo_disk_size;
    }

    public void setVo_disk_size(Integer vo_disk_size) {
        this.vo_disk_size = vo_disk_size;
    }

    public Integer getVo_root_size() {
        return vo_root_size;
    }

    public void setVo_root_size(Integer vo_root_size) {
        this.vo_root_size = vo_root_size;
    }
}
