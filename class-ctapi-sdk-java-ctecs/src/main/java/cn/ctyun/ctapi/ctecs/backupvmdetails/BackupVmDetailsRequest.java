package cn.ctyun.ctapi.ctecs.backupvmdetails;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-云主机备份查询虚机>
 * Request: BackupVmDetailsRequest
 */
public class BackupVmDetailsRequest extends CTRequest {
    public BackupVmDetailsRequest() {
        super("GET", "application/json", "/v4/ecs/backup/instance-details");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public BackupVmDetailsRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set instanceID
     * @param instanceID 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a>
     * @return this
     */
    public BackupVmDetailsRequest withInstanceID(String instanceID) {
        queryParam.put("instanceID", instanceID);
        return this;
    }
}
