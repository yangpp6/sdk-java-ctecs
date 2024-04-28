package cn.ctyun.ctapi.ctecs.ecsbackupusage;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查看云主机备份空间占用大小>
 * Entity: EcsBackupUsageReturnObj
 */
public class EcsBackupUsageReturnObj {
    /**
     * usage
     * 备份占用空间大小，单位为B
     */
    private Integer usage;

    /**
     * set usage
     * @param usage 备份占用空间大小，单位为B
     * @return this
     */
    public EcsBackupUsageReturnObj withUsage(Integer usage) {
        this.usage = usage;
        return this;
    }

    public Integer getUsage() {
        return usage;
    }

    public void setUsage(Integer usage) {
        this.usage = usage;
    }
}
