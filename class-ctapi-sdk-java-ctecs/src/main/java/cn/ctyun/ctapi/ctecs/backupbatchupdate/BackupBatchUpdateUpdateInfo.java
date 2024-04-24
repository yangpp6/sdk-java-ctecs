package cn.ctyun.ctapi.ctecs.backupbatchupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机备份信息>
 * Entity: BackupBatchUpdateUpdateInfo
 */
public class BackupBatchUpdateUpdateInfo {
    /**
     * instanceBackupID
     * 云主机备份ID，您可以查看<a href="https://www.ctyun.cn/document/10051003/10051023">产品定义-云主机备份</a>来了解云主机备份<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=6910&data=100">查询云主机备份</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=8332&data=100">创建云主机备份</a>
     */
    private String instanceBackupID;
    /**
     * instanceBackupName
     * 云主机备份名称。满足以下规则：以大小写字母开头，可包含数字，‘_’或‘-’，长度为2-63字符<br />注：在所有资源池不可重复（instanceBackupName与instanceBackupDescription参数需要二选一）
     */
    private String instanceBackupName;
    /**
     * instanceBackupDescription
     * 云主机备份描述。（instanceBackupName与instanceBackupDescription参数需要二选一）
     */
    private String instanceBackupDescription;

    /**
     * set instanceBackupID
     * @param instanceBackupID 云主机备份ID，您可以查看<a href="https://www.ctyun.cn/document/10051003/10051023">产品定义-云主机备份</a>来了解云主机备份<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=6910&data=100">查询云主机备份</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=14&api=8332&data=100">创建云主机备份</a>
     * @return this
     */
    public BackupBatchUpdateUpdateInfo withInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
        return this;
    }

    /**
     * set instanceBackupName
     * @param instanceBackupName 云主机备份名称。满足以下规则：以大小写字母开头，可包含数字，‘_’或‘-’，长度为2-63字符<br />注：在所有资源池不可重复（instanceBackupName与instanceBackupDescription参数需要二选一）
     * @return this
     */
    public BackupBatchUpdateUpdateInfo withInstanceBackupName(String instanceBackupName) {
        this.instanceBackupName = instanceBackupName;
        return this;
    }

    /**
     * set instanceBackupDescription
     * @param instanceBackupDescription 云主机备份描述。（instanceBackupName与instanceBackupDescription参数需要二选一）
     * @return this
     */
    public BackupBatchUpdateUpdateInfo withInstanceBackupDescription(String instanceBackupDescription) {
        this.instanceBackupDescription = instanceBackupDescription;
        return this;
    }

    public String getInstanceBackupID() {
        return instanceBackupID;
    }

    public void setInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
    }

    public String getInstanceBackupName() {
        return instanceBackupName;
    }

    public void setInstanceBackupName(String instanceBackupName) {
        this.instanceBackupName = instanceBackupName;
    }

    public String getInstanceBackupDescription() {
        return instanceBackupDescription;
    }

    public void setInstanceBackupDescription(String instanceBackupDescription) {
        this.instanceBackupDescription = instanceBackupDescription;
    }
}
