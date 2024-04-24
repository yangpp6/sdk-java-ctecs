package cn.ctyun.ctapi.ctecs.ecsagentbatchaction;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <操作云主机监控插件>
 * Entity: EcsAgentBatchActionActionInfo
 */
public class EcsAgentBatchActionActionInfo {
    /**
     * instanceID
     * 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>
     */
    private String instanceID;
    /**
     * systemType
     * 云主机的系统类型,有linux和windows
     */
    private String systemType;
    /**
     * systemArch
     * 云主机的CPU架构,CPU架构有<br />amd64: AMD64、x86-64、x64，<br />arm64: ARM64、AARCH64
     */
    private String systemArch;
    /**
     * systemVersion
     * 云主机系统版本
     */
    private String systemVersion;

    /**
     * set instanceID
     * @param instanceID 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>
     * @return this
     */
    public EcsAgentBatchActionActionInfo withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set systemType
     * @param systemType 云主机的系统类型,有linux和windows
     * @return this
     */
    public EcsAgentBatchActionActionInfo withSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }

    /**
     * set systemArch
     * @param systemArch 云主机的CPU架构,CPU架构有<br />amd64: AMD64、x86-64、x64，<br />arm64: ARM64、AARCH64
     * @return this
     */
    public EcsAgentBatchActionActionInfo withSystemArch(String systemArch) {
        this.systemArch = systemArch;
        return this;
    }

    /**
     * set systemVersion
     * @param systemVersion 云主机系统版本
     * @return this
     */
    public EcsAgentBatchActionActionInfo withSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public String getSystemArch() {
        return systemArch;
    }

    public void setSystemArch(String systemArch) {
        this.systemArch = systemArch;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }
}
