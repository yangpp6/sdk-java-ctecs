package cn.ctyun.ctapi.ctecs.ecsdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一台或多台云主机详细信息>
 * Entity: EcsDetailsRequestBody
 */
public class EcsDetailsRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * azName
     * 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a>获取可用区信息，查询结果中zoneList内返回存在可用区名称（即多可用区，本字段填写实际可用区名称），若查询结果中zoneList为空（即为单可用区，本字段填写default）。
     */
    private String azName;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;
    /**
     * pageNo
     * 页码，取值范围：大于等于1，默认值为1
     */
    private Integer pageNo;
    /**
     * pageSize
     * 每页记录数目 ，取值范围:[1~50]，默认值为10，单页最大记录不超过50
     */
    private Integer pageSize;
    /**
     * status
     * 云主机状态,虚机状态，大小写不敏感，参数可选 'active' 'shutoff' 'expired'
     */
    private String status;
    /**
     * keyword
     * 关键字, name、displayName、ID、privateIP 对这些字段模糊查询
     */
    private String keyword;
    /**
     * name
     * 云主机名称，精准匹配实例名称
     */
    private String name;
    /**
     * ID
     * 云主机ID,建议使用instanceIDList,该参数后续将会下线
     */
    private String ID;
    /**
     * instanceIDList
     * 云主机ID列表，多体则使用英文逗号分割（如果填写该参数同时填写ID参数，则以该参数为准）
     */
    private String instanceIDList;
    /**
     * sgUUID
     * 安全组ID，模糊匹配
     */
    private String sgUUID;
    /**
     * vpcID
     * 虚拟网络ID
     */
    private String vpcID;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsDetailsRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a>获取可用区信息，查询结果中zoneList内返回存在可用区名称（即多可用区，本字段填写实际可用区名称），若查询结果中zoneList为空（即为单可用区，本字段填写default）。
     * @return this
     */
    public EcsDetailsRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public EcsDetailsRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set pageNo
     * @param pageNo 页码，取值范围：大于等于1，默认值为1
     * @return this
     */
    public EcsDetailsRequestBody withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * set pageSize
     * @param pageSize 每页记录数目 ，取值范围:[1~50]，默认值为10，单页最大记录不超过50
     * @return this
     */
    public EcsDetailsRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set status
     * @param status 云主机状态,虚机状态，大小写不敏感，参数可选 'active' 'shutoff' 'expired'
     * @return this
     */
    public EcsDetailsRequestBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * set keyword
     * @param keyword 关键字, name、displayName、ID、privateIP 对这些字段模糊查询
     * @return this
     */
    public EcsDetailsRequestBody withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * set name
     * @param name 云主机名称，精准匹配实例名称
     * @return this
     */
    public EcsDetailsRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * set ID
     * @param ID 云主机ID,建议使用instanceIDList,该参数后续将会下线
     * @return this
     */
    public EcsDetailsRequestBody withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set instanceIDList
     * @param instanceIDList 云主机ID列表，多体则使用英文逗号分割（如果填写该参数同时填写ID参数，则以该参数为准）
     * @return this
     */
    public EcsDetailsRequestBody withInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
        return this;
    }

    /**
     * set sgUUID
     * @param sgUUID 安全组ID，模糊匹配
     * @return this
     */
    public EcsDetailsRequestBody withSgUUID(String sgUUID) {
        this.sgUUID = sgUUID;
        return this;
    }

    /**
     * set vpcID
     * @param vpcID 虚拟网络ID
     * @return this
     */
    public EcsDetailsRequestBody withVpcID(String vpcID) {
        this.vpcID = vpcID;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getInstanceIDList() {
        return instanceIDList;
    }

    public void setInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
    }

    public String getSgUUID() {
        return sgUUID;
    }

    public void setSgUUID(String sgUUID) {
        this.sgUUID = sgUUID;
    }

    public String getVpcID() {
        return vpcID;
    }

    public void setVpcID(String vpcID) {
        this.vpcID = vpcID;
    }
}
