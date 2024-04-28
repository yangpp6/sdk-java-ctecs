package cn.ctyun.ctapi.ctecs.ecsagentbatchaction;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <操作云主机监控插件>
 * Entity: EcsAgentBatchActionRequestBody
 */
public class EcsAgentBatchActionRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * action
     * 执行的动作，可执行的动作有<br />update: 升级或安装，<br />start: 启动，<br />stop: 停止，<br />remove: 卸载
     */
    private String action;
    /**
     * actionInfo
     * 云主机操作信息
     */
    private EcsAgentBatchActionActionInfo[] actionInfo;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsAgentBatchActionRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set action
     * @param action 执行的动作，可执行的动作有<br />update: 升级或安装，<br />start: 启动，<br />stop: 停止，<br />remove: 卸载
     * @return this
     */
    public EcsAgentBatchActionRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * set actionInfo
     * @param actionInfo 云主机操作信息
     * @return this
     */
    public EcsAgentBatchActionRequestBody withActionInfo(EcsAgentBatchActionActionInfo[] actionInfo) {
        this.actionInfo = actionInfo;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public EcsAgentBatchActionActionInfo[] getActionInfo() {
        return actionInfo;
    }

    public void setActionInfo(EcsAgentBatchActionActionInfo[] actionInfo) {
        this.actionInfo = actionInfo;
    }
}
