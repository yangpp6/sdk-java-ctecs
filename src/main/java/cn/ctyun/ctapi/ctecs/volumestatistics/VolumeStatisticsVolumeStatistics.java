package cn.ctyun.ctapi.ctecs.volumestatistics;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取用户云硬盘统计信息>
 * Entity: VolumeStatisticsVolumeStatistics
 */
public class VolumeStatisticsVolumeStatistics {
    /**
     * totalCount
     * 云硬盘总数
     */
    private Integer totalCount;
    /**
     * rootDiskCount
     * 系统盘数量
     */
    private Integer rootDiskCount;
    /**
     * dataDiskCount
     * 数据盘数量
     */
    private Integer dataDiskCount;
    /**
     * totalSize
     * 云硬盘总大小，单位为GB
     */
    private Integer totalSize;
    /**
     * rootDiskSize
     * 系统盘大小，单位为GB
     */
    private Integer rootDiskSize;
    /**
     * dataDiskSize
     * 数据盘大小，单位为GB
     */
    private Integer dataDiskSize;

    /**
     * set totalCount
     * @param totalCount 云硬盘总数
     * @return this
     */
    public VolumeStatisticsVolumeStatistics withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set rootDiskCount
     * @param rootDiskCount 系统盘数量
     * @return this
     */
    public VolumeStatisticsVolumeStatistics withRootDiskCount(Integer rootDiskCount) {
        this.rootDiskCount = rootDiskCount;
        return this;
    }

    /**
     * set dataDiskCount
     * @param dataDiskCount 数据盘数量
     * @return this
     */
    public VolumeStatisticsVolumeStatistics withDataDiskCount(Integer dataDiskCount) {
        this.dataDiskCount = dataDiskCount;
        return this;
    }

    /**
     * set totalSize
     * @param totalSize 云硬盘总大小，单位为GB
     * @return this
     */
    public VolumeStatisticsVolumeStatistics withTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * set rootDiskSize
     * @param rootDiskSize 系统盘大小，单位为GB
     * @return this
     */
    public VolumeStatisticsVolumeStatistics withRootDiskSize(Integer rootDiskSize) {
        this.rootDiskSize = rootDiskSize;
        return this;
    }

    /**
     * set dataDiskSize
     * @param dataDiskSize 数据盘大小，单位为GB
     * @return this
     */
    public VolumeStatisticsVolumeStatistics withDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getRootDiskCount() {
        return rootDiskCount;
    }

    public void setRootDiskCount(Integer rootDiskCount) {
        this.rootDiskCount = rootDiskCount;
    }

    public Integer getDataDiskCount() {
        return dataDiskCount;
    }

    public void setDataDiskCount(Integer dataDiskCount) {
        this.dataDiskCount = dataDiskCount;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public Integer getRootDiskSize() {
        return rootDiskSize;
    }

    public void setRootDiskSize(Integer rootDiskSize) {
        this.rootDiskSize = rootDiskSize;
    }

    public Integer getDataDiskSize() {
        return dataDiskSize;
    }

    public void setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
    }
}
