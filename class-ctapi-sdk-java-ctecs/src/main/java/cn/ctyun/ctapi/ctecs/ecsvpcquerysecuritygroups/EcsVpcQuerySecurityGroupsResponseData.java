package cn.ctyun.ctapi.ctecs.ecsvpcquerysecuritygroups;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询用户安全组列表>
 * Entity: EcsVpcQuerySecurityGroupsResponseData
 */
public class EcsVpcQuerySecurityGroupsResponseData {
    /**
     * totalCount
     * 列表条目数
     */
    private Integer totalCount;
    /**
     * currentCount
     * 分页查询时每页的行数
     */
    private Integer currentCount;
    /**
     * totalPage
     * 总页数
     */
    private Integer totalPage;
    /**
     * statusCode
     * 返回状态码（800为成功，900为失败）
     */
    private Integer statusCode;
    /**
     * returnObj
     * 详细结果
     */
    private EcsVpcQuerySecurityGroupsReturnObj[] returnObj;
    /**
     * errorCode
     * 错误码，为product.module.code三段式码
     */
    private String errorCode;
    /**
     * error
     * 错误码，为product.module.code三段式码
     */
    private String error;
    /**
     * message
     * 错误信息的英文描述
     */
    private String message;
    /**
     * description
     * 失败时的错误描述，一般为中文描述。
     */
    private String description;

    /**
     * set totalCount
     * @param totalCount 列表条目数
     * @return this
     */
    public EcsVpcQuerySecurityGroupsResponseData withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set currentCount
     * @param currentCount 分页查询时每页的行数
     * @return this
     */
    public EcsVpcQuerySecurityGroupsResponseData withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set totalPage
     * @param totalPage 总页数
     * @return this
     */
    public EcsVpcQuerySecurityGroupsResponseData withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set statusCode
     * @param statusCode 返回状态码（800为成功，900为失败）
     * @return this
     */
    public EcsVpcQuerySecurityGroupsResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 详细结果
     * @return this
     */
    public EcsVpcQuerySecurityGroupsResponseData withReturnObj(EcsVpcQuerySecurityGroupsReturnObj[] returnObj) {
        this.returnObj = returnObj;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 错误码，为product.module.code三段式码
     * @return this
     */
    public EcsVpcQuerySecurityGroupsResponseData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set error
     * @param error 错误码，为product.module.code三段式码
     * @return this
     */
    public EcsVpcQuerySecurityGroupsResponseData withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * set message
     * @param message 错误信息的英文描述
     * @return this
     */
    public EcsVpcQuerySecurityGroupsResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description 失败时的错误描述，一般为中文描述。
     * @return this
     */
    public EcsVpcQuerySecurityGroupsResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public EcsVpcQuerySecurityGroupsReturnObj[] getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(EcsVpcQuerySecurityGroupsReturnObj[] returnObj) {
        this.returnObj = returnObj;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
