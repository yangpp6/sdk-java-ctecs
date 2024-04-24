package cn.ctyun.ctapi.ctecs.getcustomerresources;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-用户已有资源查询>
 * Entity: GetCustomerResourcesNAT
 */
public class GetCustomerResourcesNAT {
    /**
     * total_count
     * nat总数
     */
    private Integer total_count;
    /**
     * detail_total_count
     * nat总数
     */
    private Integer detail_total_count;
    /**
     * detail
     * 对应资源池id下的数量
     */
    private Object detail;

    /**
     * set total_count
     * @param total_count nat总数
     * @return this
     */
    public GetCustomerResourcesNAT withTotal_count(Integer total_count) {
        this.total_count = total_count;
        return this;
    }

    /**
     * set detail_total_count
     * @param detail_total_count nat总数
     * @return this
     */
    public GetCustomerResourcesNAT withDetail_total_count(Integer detail_total_count) {
        this.detail_total_count = detail_total_count;
        return this;
    }

    /**
     * set detail
     * @param detail 对应资源池id下的数量
     * @return this
     */
    public GetCustomerResourcesNAT withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public Integer getDetail_total_count() {
        return detail_total_count;
    }

    public void setDetail_total_count(Integer detail_total_count) {
        this.detail_total_count = detail_total_count;
    }

    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }
}
