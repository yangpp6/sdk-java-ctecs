package cn.ctyun.ctapi.ctecs.volumestatistics;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取用户云硬盘统计信息>
 * Entity: VolumeStatisticsReturnObj
 */
public class VolumeStatisticsReturnObj {
    /**
     * volumeStatistics
     * 统计明细
     */
    private VolumeStatisticsVolumeStatistics volumeStatistics;

    /**
     * set volumeStatistics
     * @param volumeStatistics 统计明细
     * @return this
     */
    public VolumeStatisticsReturnObj withVolumeStatistics(VolumeStatisticsVolumeStatistics volumeStatistics) {
        this.volumeStatistics = volumeStatistics;
        return this;
    }

    public VolumeStatisticsVolumeStatistics getVolumeStatistics() {
        return volumeStatistics;
    }

    public void setVolumeStatistics(VolumeStatisticsVolumeStatistics volumeStatistics) {
        this.volumeStatistics = volumeStatistics;
    }
}
