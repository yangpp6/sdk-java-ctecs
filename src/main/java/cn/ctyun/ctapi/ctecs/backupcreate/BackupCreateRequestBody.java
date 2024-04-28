package cn.ctyun.ctapi.ctecs.backupcreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份>
 * Entity: BackupCreateRequestBody
 */
public class BackupCreateRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * instanceID
     * 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a>
     */
    private String instanceID;
    /**
     * instanceBackupName
     * 云主机备份名称。满足以下规则：以大小写字母开头，可包含数字，‘_’或‘-’，长度为2-63字符
     */
    private String instanceBackupName;
    /**
     * instanceBackupDescription
     * 云主机备份描述，字符长度不超过256字符
     */
    private String instanceBackupDescription;
    /**
     * repositoryID
     * 云主机备份存储库ID，您可以查看<a href="https://www.ctyun.cn/document/10026751/10033742">产品定义-存储库</a>来了解存储库<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://www.ctyun.cn/document/10051003/10118051">查询存储库</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://www.ctyun.cn/document/10051003/10117907">创建存储库</a>
     */
    private String repositoryID;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public BackupCreateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a>
     * @return this
     */
    public BackupCreateRequestBody withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set instanceBackupName
     * @param instanceBackupName 云主机备份名称。满足以下规则：以大小写字母开头，可包含数字，‘_’或‘-’，长度为2-63字符
     * @return this
     */
    public BackupCreateRequestBody withInstanceBackupName(String instanceBackupName) {
        this.instanceBackupName = instanceBackupName;
        return this;
    }

    /**
     * set instanceBackupDescription
     * @param instanceBackupDescription 云主机备份描述，字符长度不超过256字符
     * @return this
     */
    public BackupCreateRequestBody withInstanceBackupDescription(String instanceBackupDescription) {
        this.instanceBackupDescription = instanceBackupDescription;
        return this;
    }

    /**
     * set repositoryID
     * @param repositoryID 云主机备份存储库ID，您可以查看<a href="https://www.ctyun.cn/document/10026751/10033742">产品定义-存储库</a>来了解存储库<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://www.ctyun.cn/document/10051003/10118051">查询存储库</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://www.ctyun.cn/document/10051003/10117907">创建存储库</a>
     * @return this
     */
    public BackupCreateRequestBody withRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
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

    public String getRepositoryID() {
        return repositoryID;
    }

    public void setRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
    }
}
