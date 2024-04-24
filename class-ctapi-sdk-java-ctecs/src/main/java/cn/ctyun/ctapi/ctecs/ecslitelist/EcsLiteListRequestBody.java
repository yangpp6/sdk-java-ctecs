package cn.ctyun.ctapi.ctecs.ecslitelist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询轻量型云主机列表>
 * Entity: EcsLiteListRequestBody
 */
public class EcsLiteListRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
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
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsLiteListRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set pageNo
     * @param pageNo 页码，取值范围：正整数（≥1），注：默认值为1
     * @return this
     */
    public EcsLiteListRequestBody withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * set pageSize
     * @param pageSize 每页记录数目，取值范围：[1, 50]，注：默认值为10
     * @return this
     */
    public EcsLiteListRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
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
