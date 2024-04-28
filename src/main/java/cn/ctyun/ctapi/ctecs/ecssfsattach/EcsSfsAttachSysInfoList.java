package cn.ctyun.ctapi.ctecs.ecssfsattach;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <云主机挂载文件系统>
 * Entity: EcsSfsAttachSysInfoList
 */
public class EcsSfsAttachSysInfoList {
    /**
     * fileSysID
     * 文件系统id
     */
    private String fileSysID;
    /**
     * fileSysRoute
     * 文件系统地址（固定值，每一个文件都有相对应的文件系统地址）
     */
    private String fileSysRoute;
    /**
     * mountPoint
     * 挂载点，即：本地挂载路径（云主机上用于挂载文件系统的本地路径)<br />linux镜像云主机使用限制：<br />1、单目录的长度不超过255个字符，总长度不能超过4095个字符； <br />2、必须以/开头，由数字，字母，点，下划线，减号组成，通过/（斜杠）分割<br />3、不能是系统路径：/, /bin, /usr, /boot, /dev, /etc, /lib, /lib64, /proc, /run, /sys, /var，/tmp，/sbin<br />推荐在/mnt下新建本地路径作为挂载路径，如：/mnt/docs. <br />windows镜像云主机实用限制：<br />只能输入E~Z（大写）内的单个字母作为盘符
     */
    private String mountPoint;
    /**
     * option
     * 挂载参数：<br />linux云主机对应两个挂载参数（vers表示文件系统版本，可选3和4，建议取值3）vers=3,async,nolock,noatime,nodiratime,wsize=1048576,rsize=1048576,timeo=600 vers=4,async,nolock,noatime,nodiratime,wsize=1048576,rsize=1048576,timeo=600<br />windows云主机对应一个挂载参数：net use<br />注：<br />当linux云主机的协议类型选择NFSv3时，对应的option为vers3，当其协议类型选择NFSv4时，option应选vers4（即 protocol和option为对应关系）<br />windows云主机的协议类型CIFS，对应的option为：net use
     */
    private String option;
    /**
     * autoMount
     * 是否开机自动挂载(true/false)，当云主机重启时会自动挂载文件系统，默认为false
     */
    private Boolean autoMount;
    /**
     * protocol
     * 文件协议类型，linux协议类型为：NFSv3、NFSv4，windows协议类型为：CIFS
     */
    private String protocol;

    /**
     * set fileSysID
     * @param fileSysID 文件系统id
     * @return this
     */
    public EcsSfsAttachSysInfoList withFileSysID(String fileSysID) {
        this.fileSysID = fileSysID;
        return this;
    }

    /**
     * set fileSysRoute
     * @param fileSysRoute 文件系统地址（固定值，每一个文件都有相对应的文件系统地址）
     * @return this
     */
    public EcsSfsAttachSysInfoList withFileSysRoute(String fileSysRoute) {
        this.fileSysRoute = fileSysRoute;
        return this;
    }

    /**
     * set mountPoint
     * @param mountPoint 挂载点，即：本地挂载路径（云主机上用于挂载文件系统的本地路径)<br />linux镜像云主机使用限制：<br />1、单目录的长度不超过255个字符，总长度不能超过4095个字符； <br />2、必须以/开头，由数字，字母，点，下划线，减号组成，通过/（斜杠）分割<br />3、不能是系统路径：/, /bin, /usr, /boot, /dev, /etc, /lib, /lib64, /proc, /run, /sys, /var，/tmp，/sbin<br />推荐在/mnt下新建本地路径作为挂载路径，如：/mnt/docs. <br />windows镜像云主机实用限制：<br />只能输入E~Z（大写）内的单个字母作为盘符
     * @return this
     */
    public EcsSfsAttachSysInfoList withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    /**
     * set option
     * @param option 挂载参数：<br />linux云主机对应两个挂载参数（vers表示文件系统版本，可选3和4，建议取值3）vers=3,async,nolock,noatime,nodiratime,wsize=1048576,rsize=1048576,timeo=600 vers=4,async,nolock,noatime,nodiratime,wsize=1048576,rsize=1048576,timeo=600<br />windows云主机对应一个挂载参数：net use<br />注：<br />当linux云主机的协议类型选择NFSv3时，对应的option为vers3，当其协议类型选择NFSv4时，option应选vers4（即 protocol和option为对应关系）<br />windows云主机的协议类型CIFS，对应的option为：net use
     * @return this
     */
    public EcsSfsAttachSysInfoList withOption(String option) {
        this.option = option;
        return this;
    }

    /**
     * set autoMount
     * @param autoMount 是否开机自动挂载(true/false)，当云主机重启时会自动挂载文件系统，默认为false
     * @return this
     */
    public EcsSfsAttachSysInfoList withAutoMount(Boolean autoMount) {
        this.autoMount = autoMount;
        return this;
    }

    /**
     * set protocol
     * @param protocol 文件协议类型，linux协议类型为：NFSv3、NFSv4，windows协议类型为：CIFS
     * @return this
     */
    public EcsSfsAttachSysInfoList withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getFileSysID() {
        return fileSysID;
    }

    public void setFileSysID(String fileSysID) {
        this.fileSysID = fileSysID;
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

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
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
}
