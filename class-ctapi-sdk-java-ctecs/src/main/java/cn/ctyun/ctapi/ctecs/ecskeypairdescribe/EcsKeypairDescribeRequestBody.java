package cn.ctyun.ctapi.ctecs.ecskeypairdescribe;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个密钥对>
 * Entity: EcsKeypairDescribeRequestBody
 */
public class EcsKeypairDescribeRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;
    /**
     * name
     * 密钥对名称。
     */
    private String name;
    /**
     * pageNo
     * 页码，取值范围：大于等于1，默认值为1
     */
    private Integer pageNo;
    /**
     * pageSize
     * 每页记录数目，取值范围:[1~50]，默认值为10，单页最大记录不超过50
     */
    private Integer pageSize;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsKeypairDescribeRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public EcsKeypairDescribeRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set name
     * @param name 密钥对名称。
     * @return this
     */
    public EcsKeypairDescribeRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * set pageNo
     * @param pageNo 页码，取值范围：大于等于1，默认值为1
     * @return this
     */
    public EcsKeypairDescribeRequestBody withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * set pageSize
     * @param pageSize 每页记录数目，取值范围:[1~50]，默认值为10，单页最大记录不超过50
     * @return this
     */
    public EcsKeypairDescribeRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
