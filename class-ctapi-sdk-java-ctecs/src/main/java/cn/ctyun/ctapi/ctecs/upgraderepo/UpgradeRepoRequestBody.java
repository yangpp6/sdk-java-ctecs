package cn.ctyun.ctapi.ctecs.upgraderepo;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-扩容云主机备份存储库>
 * Entity: UpgradeRepoRequestBody
 */
public class UpgradeRepoRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://www.ctyun.cn/document/10026730/10040588">资源池列表查询</a>
     */
    private String regionID;
    /**
     * repositoryID
     * 云主机备份存储库ID，您可以查看<a href="https://www.ctyun.cn/document/10026751/10033742">产品定义-存储库</a>来了解存储库<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://www.ctyun.cn/document/10026751/10071347">查询存储库列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://www.ctyun.cn/document/10026751/10071346">创建存储库</a>
     */
    private String repositoryID;
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;
    /**
     * size
     * 云主机备份存储库的容量（此容量非增量扩容，是指扩容后存储库大小即最终存储库大小），单位GB，取值范围：[100-1024000]，默认值100
     */
    private Integer size;
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
    public UpgradeRepoRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set repositoryID
     * @param repositoryID 云主机备份存储库ID，您可以查看<a href="https://www.ctyun.cn/document/10026751/10033742">产品定义-存储库</a>来了解存储库<br /> 获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://www.ctyun.cn/document/10026751/10071347">查询存储库列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a  href="https://www.ctyun.cn/document/10026751/10071346">创建存储库</a>
     * @return this
     */
    public UpgradeRepoRequestBody withRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
        return this;
    }

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public UpgradeRepoRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set size
     * @param size 云主机备份存储库的容量（此容量非增量扩容，是指扩容后存储库大小即最终存储库大小），单位GB，取值范围：[100-1024000]，默认值100
     * @return this
     */
    public UpgradeRepoRequestBody withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * set payVoucherPrice
     * @param payVoucherPrice 代金券，满足以下规则：两位小数，不足两位自动补0，超过两位小数无效；不可为负数；字段为0时表示不使用代金券
     * @return this
     */
    public UpgradeRepoRequestBody withPayVoucherPrice(Float payVoucherPrice) {
        this.payVoucherPrice = payVoucherPrice;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getRepositoryID() {
        return repositoryID;
    }

    public void setRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
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

    public Float getPayVoucherPrice() {
        return payVoucherPrice;
    }

    public void setPayVoucherPrice(Float payVoucherPrice) {
        this.payVoucherPrice = payVoucherPrice;
    }
}
