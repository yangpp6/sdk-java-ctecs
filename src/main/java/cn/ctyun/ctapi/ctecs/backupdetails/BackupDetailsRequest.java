package cn.ctyun.ctapi.ctecs.backupdetails;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份详情>
 * Request: BackupDetailsRequest
 */
public class BackupDetailsRequest extends CTRequest {
    public BackupDetailsRequest() {
        super("GET", "application/json", "/v4/ecs/backup/details");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public BackupDetailsRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set instanceBackupID
     * @param instanceBackupID 云主机备份ID，您可以查看<a href="https://www.ctyun.cn/document/10051003/10051023">产品定义-云主机备份</a>来了解云主机备份<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=6910&data=100">查询云主机备份列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=8332&data=100">创建云主机备份</a>
     * @return this
     */
    public BackupDetailsRequest withInstanceBackupID(String instanceBackupID) {
        queryParam.put("instanceBackupID", instanceBackupID);
        return this;
    }
}