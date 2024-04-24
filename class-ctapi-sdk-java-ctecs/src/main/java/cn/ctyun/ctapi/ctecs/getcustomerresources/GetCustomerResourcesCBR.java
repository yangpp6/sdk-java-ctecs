package cn.ctyun.ctapi.ctecs.getcustomerresources;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-用户已有资源查询>
 * Entity: GetCustomerResourcesCBR
 */
public class GetCustomerResourcesCBR {
    /**
     * total_count
     * 云主机备份总数
     */
    private Integer total_count;
    /**
     * detail_total_count
     * 云主机备份总数
     */
    private Integer detail_total_count;
    /**
     * total_size
     * 云主机备份总大小
     */
    private Integer total_size;
    /**
     * detail
     * 对应资源池id下的数量
     */
    private Object detail;

    /**
     * set total_count
     * @param total_count 云主机备份总数
     * @return this
     */
    public GetCustomerResourcesCBR withTotal_count(Integer total_count) {
        this.total_count = total_count;
        return this;
    }

    /**
     * set detail_total_count
     * @param detail_total_count 云主机备份总数
     * @return this
     */
    public GetCustomerResourcesCBR withDetail_total_count(Integer detail_total_count) {
        this.detail_total_count = detail_total_count;
        return this;
    }

    /**
     * set total_size
     * @param total_size 云主机备份总大小
     * @return this
     */
    public GetCustomerResourcesCBR withTotal_size(Integer total_size) {
        this.total_size = total_size;
        return this;
    }

    /**
     * set detail
     * @param detail 对应资源池id下的数量
     * @return this
     */
    public GetCustomerResourcesCBR withDetail(Object detail) {
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

    public Integer getTotal_size() {
        return total_size;
    }

    public void setTotal_size(Integer total_size) {
        this.total_size = total_size;
    }

    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }
}
