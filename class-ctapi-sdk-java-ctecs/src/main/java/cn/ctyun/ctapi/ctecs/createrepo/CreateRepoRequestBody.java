package cn.ctyun.ctapi.ctecs.createrepo;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份存储库>
 * Entity: CreateRepoRequestBody
 */
public class CreateRepoRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://www.ctyun.cn/document/10026730/10040588">资源池列表查询</a>
     */
    private String regionID;
    /**
     * projectID
     * 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目<a/>了解如何创建企业项目<br />注：默认值为"0"
     */
    private String projectID;
    /**
     * repositoryName
     * 云主机备份存储库名称，满足以下规则：只能由数字、字母、-组成，不能以数字和-开头、且不能以-结尾，长度为2-63字符
     */
    private String repositoryName;
    /**
     * cycleCount
     * 订购时长，该参数需要与cycleType一同使用<br />注：最长订购周期为60个月（5年）
     */
    private Integer cycleCount;
    /**
     * cycleType
     * 订购周期类型，取值范围：<br />MONTH：按月<br />YEAR：按年<br />最长订购周期为5年
     */
    private String cycleType;
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;
    /**
     * size
     * 云主机备份存储库容量，单位GB，取值范围：[100-1024000]，默认值100
     */
    private Integer size;
    /**
     * autoRenewStatus
     * 是否自动续订，取值范围：<br />0（不续费），<br />1（自动续费），<br />注：按月购买，自动续订周期为1个月；按年购买，自动续订周期为1年
     */
    private Integer autoRenewStatus;
    /**
     * payVoucherPrice
     * 代金券，满足以下规则：两位小数，不足两位自动补0，超过两位小数无效；不可为负数；字段为0时表示不使用代金券
     */
    private Float payVoucherPrice;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://www.ctyun.cn/document/10026730/10040588">资源池列表查询</a>
     * @return this
     */
    public CreateRepoRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目<a/>了解如何创建企业项目<br />注：默认值为"0"
     * @return this
     */
    public CreateRepoRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set repositoryName
     * @param repositoryName 云主机备份存储库名称，满足以下规则：只能由数字、字母、-组成，不能以数字和-开头、且不能以-结尾，长度为2-63字符
     * @return this
     */
    public CreateRepoRequestBody withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * set cycleCount
     * @param cycleCount 订购时长，该参数需要与cycleType一同使用<br />注：最长订购周期为60个月（5年）
     * @return this
     */
    public CreateRepoRequestBody withCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 订购周期类型，取值范围：<br />MONTH：按月<br />YEAR：按年<br />最长订购周期为5年
     * @return this
     */
    public CreateRepoRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public CreateRepoRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set size
     * @param size 云主机备份存储库容量，单位GB，取值范围：[100-1024000]，默认值100
     * @return this
     */
    public CreateRepoRequestBody withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * set autoRenewStatus
     * @param autoRenewStatus 是否自动续订，取值范围：<br />0（不续费），<br />1（自动续费），<br />注：按月购买，自动续订周期为1个月；按年购买，自动续订周期为1年
     * @return this
     */
    public CreateRepoRequestBody withAutoRenewStatus(Integer autoRenewStatus) {
        this.autoRenewStatus = autoRenewStatus;
        return this;
    }

    /**
     * set payVoucherPrice
     * @param payVoucherPrice 代金券，满足以下规则：两位小数，不足两位自动补0，超过两位小数无效；不可为负数；字段为0时表示不使用代金券
     * @return this
     */
    public CreateRepoRequestBody withPayVoucherPrice(Float payVoucherPrice) {
        this.payVoucherPrice = payVoucherPrice;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public Integer getCycleCount() {
        return cycleCount;
    }

    public void setCycleCount(Integer cycleCount) {
        this.cycleCount = cycleCount;
    }

    public String getCycleType() {
        return cycleType;
    }

    public void setCycleType(String cycleType) {
        this.cycleType = cycleType;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getAutoRenewStatus() {
        return autoRenewStatus;
    }

    public void setAutoRenewStatus(Integer autoRenewStatus) {
        this.autoRenewStatus = autoRenewStatus;
    }

    public Float getPayVoucherPrice() {
        return payVoucherPrice;
    }

    public void setPayVoucherPrice(Float payVoucherPrice) {
        this.payVoucherPrice = payVoucherPrice;
    }
}
