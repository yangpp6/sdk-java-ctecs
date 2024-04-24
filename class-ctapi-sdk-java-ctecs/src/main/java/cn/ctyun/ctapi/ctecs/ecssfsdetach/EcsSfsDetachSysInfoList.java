package cn.ctyun.ctapi.ctecs.ecssfsdetach;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <云主机卸载文件系统>
 * Entity: EcsSfsDetachSysInfoList
 */
public class EcsSfsDetachSysInfoList {
    /**
     * fileSysRoute
     * 文件系统地址（固定值，每一个文件都有相对应的文件系统地址）
     */
    private String fileSysRoute;
    /**
     * mountPoint
     * 挂载点
     */
    private String mountPoint;

    /**
     * set fileSysRoute
     * @param fileSysRoute 文件系统地址（固定值，每一个文件都有相对应的文件系统地址）
     * @return this
     */
    public EcsSfsDetachSysInfoList withFileSysRoute(String fileSysRoute) {
        this.fileSysRoute = fileSysRoute;
        return this;
    }

    /**
     * set mountPoint
     * @param mountPoint 挂载点
     * @return this
     */
    public EcsSfsDetachSysInfoList withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    public String getFileSysRoute() {
        return fileSysRoute;
    }

    public void setFileSysRoute(String fileSysRoute) {
        this.fileSysRoute = fileSysRoute;
    }

    public String getMountPoint() {
        return mountPoint;
    }

    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }
}
