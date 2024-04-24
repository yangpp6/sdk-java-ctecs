package cn.ctyun.ctapi.ctecs.descibeinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一台或多台云主机详细信息>
 * Entity: DescibeInstancesRequestBody
 */
public class DescibeInstancesRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * azName
     * 可用区名称，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解可用区 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a><br />注：查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空（即为单可用区，本字段填写default）
     */
    private String azName;
    /**
     * projectID
     * 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目</a>了解如何创建企业项目
     */
    private String projectID;
    /**
     * pageNo
     * 页码，取值范围：正整数（≥1），注：默认值为1
     */
    private Integer pageNo;
    /**
     * pageSize
     * 每页记录数目，取值范围：[1, 50]，注：默认值为10
     */
    private Integer pageSize;
    /**
     * state
     * 云主机状态，取值范围：<br />active（开机），<br/> shutoff（关机），<br /> expired（已到期）<br />注：该参数大小写不敏感（如active可填写为ACTIVE）
     */
    private String state;
    /**
     * keyword
     * 关键字，对部分参数进行模糊查询，包含：instanceName、displayName、instanceID、privateIP
     */
    private String keyword;
    /**
     * instanceName
     * 云主机名称，精准匹配
     */
    private String instanceName;
    /**
     * instanceIDList
     * 云主机ID列表，多台使用英文逗号分割，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br/><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>
     */
    private String instanceIDList;
    /**
     * securityGroupID
     * 安全组ID，模糊匹配，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关信息 <br />获取： <br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a>
     */
    private String securityGroupID;
    /**
     * labelList
     * 标签信息列表
     */
    private DescibeInstancesLabelList[] labelList;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public DescibeInstancesRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解可用区 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a><br />注：查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空（即为单可用区，本字段填写default）
     * @return this
     */
    public DescibeInstancesRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目</a>了解如何创建企业项目
     * @return this
     */
    public DescibeInstancesRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set pageNo
     * @param pageNo 页码，取值范围：正整数（≥1），注：默认值为1
     * @return this
     */
    public DescibeInstancesRequestBody withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * set pageSize
     * @param pageSize 每页记录数目，取值范围：[1, 50]，注：默认值为10
     * @return this
     */
    public DescibeInstancesRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set state
     * @param state 云主机状态，取值范围：<br />active（开机），<br/> shutoff（关机），<br /> expired（已到期）<br />注：该参数大小写不敏感（如active可填写为ACTIVE）
     * @return this
     */
    public DescibeInstancesRequestBody withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * set keyword
     * @param keyword 关键字，对部分参数进行模糊查询，包含：instanceName、displayName、instanceID、privateIP
     * @return this
     */
    public DescibeInstancesRequestBody withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称，精准匹配
     * @return this
     */
    public DescibeInstancesRequestBody withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set instanceIDList
     * @param instanceIDList 云主机ID列表，多台使用英文逗号分割，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br/><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>
     * @return this
     */
    public DescibeInstancesRequestBody withInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
        return this;
    }

    /**
     * set securityGroupID
     * @param securityGroupID 安全组ID，模糊匹配，您可以查看<a href="https://www.ctyun.cn/document/10026755/10028520">安全组概述</a>了解安全组相关信息 <br />获取： <br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4817&data=94">查询用户安全组列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=18&api=4821&data=94">创建安全组</a>
     * @return this
     */
    public DescibeInstancesRequestBody withSecurityGroupID(String securityGroupID) {
        this.securityGroupID = securityGroupID;
        return this;
    }

    /**
     * set labelList
     * @param labelList 标签信息列表
     * @return this
     */
    public DescibeInstancesRequestBody withLabelList(DescibeInstancesLabelList[] labelList) {
        this.labelList = labelList;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getInstanceIDList() {
        return instanceIDList;
    }

    public void setInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
    }

    public String getSecurityGroupID() {
        return securityGroupID;
    }

    public void setSecurityGroupID(String securityGroupID) {
        this.securityGroupID = securityGroupID;
    }

    public DescibeInstancesLabelList[] getLabelList() {
        return labelList;
    }

    public void setLabelList(DescibeInstancesLabelList[] labelList) {
        this.labelList = labelList;
    }
}
