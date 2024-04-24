package cn.ctyun.ctapi.ctecs.ecsportslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询网卡列表>
 * Entity: EcsPortsListResponseData
 */
public class EcsPortsListResponseData {
    /**
     * statusCode
     * 返回状态码（800为成功，900为失败）
     */
    private Integer statusCode;
    /**
     * message
     * statusCode为900时的错误信息, 英文
     */
    private String message;
    /**
     * description
     * statusCode为900时的错误信息，中文
     */
    private String description;
    /**
     * returnObj
     * 接口业务数据
     */
    private EcsPortsListReturnObj[] returnObj;
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
     * currentCount
     * 当前页记录数目
     */
    private Integer currentCount;
    /**
     * totalCount
     * 总记录数
     */
    private Integer totalCount;
    /**
     * totalPage
     * 总页数
     */
    private Integer totalPage;

    /**
     * set statusCode
     * @param statusCode 返回状态码（800为成功，900为失败）
     * @return this
     */
    public EcsPortsListResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set message
     * @param message statusCode为900时的错误信息, 英文
     * @return this
     */
    public EcsPortsListResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description statusCode为900时的错误信息，中文
     * @return this
     */
    public EcsPortsListResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 接口业务数据
     * @return this
     */
    public EcsPortsListResponseData withReturnObj(EcsPortsListReturnObj[] returnObj) {
        this.returnObj = returnObj;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 错误码，为product.module.code三段式码
     * @return this
     */
    public EcsPortsListResponseData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set error
     * @param error 错误码，为product.module.code三段式码
     * @return this
     */
    public EcsPortsListResponseData withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * set currentCount
     * @param currentCount 当前页记录数目
     * @return this
     */
    public EcsPortsListResponseData withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set totalCount
     * @param totalCount 总记录数
     * @return this
     */
    public EcsPortsListResponseData withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set totalPage
     * @param totalPage 总页数
     * @return this
     */
    public EcsPortsListResponseData withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
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

    public EcsPortsListReturnObj[] getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(EcsPortsListReturnObj[] returnObj) {
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

    public Integer getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
