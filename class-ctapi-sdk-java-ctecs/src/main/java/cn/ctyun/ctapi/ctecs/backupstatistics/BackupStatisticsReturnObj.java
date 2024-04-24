package cn.ctyun.ctapi.ctecs.backupstatistics;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机备份查询虚机磁盘大小>
 * Entity: BackupStatisticsReturnObj
 */
public class BackupStatisticsReturnObj {
    /**
     * totalDiskSize
     * 云主机磁盘占用大小，单位GB
     */
    private Integer totalDiskSize;

    /**
     * set totalDiskSize
     * @param totalDiskSize 云主机磁盘占用大小，单位GB
     * @return this
     */
    public BackupStatisticsReturnObj withTotalDiskSize(Integer totalDiskSize) {
        this.totalDiskSize = totalDiskSize;
        return this;
    }

    public Integer getTotalDiskSize() {
        return totalDiskSize;
    }

    public void setTotalDiskSize(Integer totalDiskSize) {
        this.totalDiskSize = totalDiskSize;
    }
}
