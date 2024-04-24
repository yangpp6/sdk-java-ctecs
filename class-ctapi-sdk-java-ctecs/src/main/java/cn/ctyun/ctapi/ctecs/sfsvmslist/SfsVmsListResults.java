package cn.ctyun.ctapi.ctecs.sfsvmslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询文件系统关联虚机列表>
 * Entity: SfsVmsListResults
 */
public class SfsVmsListResults {
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;
    /**
     * option
     * 挂载参数
     */
    private String option;
    /**
     * fileSysRoute
     * 文件系统绝对路径
     */
    private String fileSysRoute;
    /**
     * mountPoint
     * 挂载点
     */
    private String mountPoint;
    /**
     * autoMount
     * 是否开机自动挂载
     */
    private Boolean autoMount;
    /**
     * protocol
     * 挂载协议
     */
    private String protocol;
    /**
     * fileSysID
     * 文件系统ID
     */
    private String fileSysID;
    /**
     * vmInfo
     * 虚机信息
     */
    private SfsVmsListVmInfo vmInfo;

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public SfsVmsListResults withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set option
     * @param option 挂载参数
     * @return this
     */
    public SfsVmsListResults withOption(String option) {
        this.option = option;
        return this;
    }

    /**
     * set fileSysRoute
     * @param fileSysRoute 文件系统绝对路径
     * @return this
     */
    public SfsVmsListResults withFileSysRoute(String fileSysRoute) {
        this.fileSysRoute = fileSysRoute;
        return this;
    }

    /**
     * set mountPoint
     * @param mountPoint 挂载点
     * @return this
     */
    public SfsVmsListResults withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    /**
     * set autoMount
     * @param autoMount 是否开机自动挂载
     * @return this
     */
    public SfsVmsListResults withAutoMount(Boolean autoMount) {
        this.autoMount = autoMount;
        return this;
    }

    /**
     * set protocol
     * @param protocol 挂载协议
     * @return this
     */
    public SfsVmsListResults withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * set fileSysID
     * @param fileSysID 文件系统ID
     * @return this
     */
    public SfsVmsListResults withFileSysID(String fileSysID) {
        this.fileSysID = fileSysID;
        return this;
    }

    /**
     * set vmInfo
     * @param vmInfo 虚机信息
     * @return this
     */
    public SfsVmsListResults withVmInfo(SfsVmsListVmInfo vmInfo) {
        this.vmInfo = vmInfo;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
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

    public Boolean getAutoMount() {
        return autoMount;
    }

    public void setAutoMount(Boolean autoMount) {
        this.autoMount = autoMount;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getFileSysID() {
        return fileSysID;
    }

    public void setFileSysID(String fileSysID) {
        this.fileSysID = fileSysID;
    }

    public SfsVmsListVmInfo getVmInfo() {
        return vmInfo;
    }

    public void setVmInfo(SfsVmsListVmInfo vmInfo) {
        this.vmInfo = vmInfo;
    }
}
