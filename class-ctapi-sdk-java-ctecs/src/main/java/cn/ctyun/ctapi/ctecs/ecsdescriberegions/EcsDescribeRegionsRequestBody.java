package cn.ctyun.ctapi.ctecs.ecsdescriberegions;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询账户启用的资源池信息>
 * Entity: EcsDescribeRegionsRequestBody
 */
public class EcsDescribeRegionsRequestBody {
    /**
     * statusCode
     * 返回状态码（800 为成功，900 为失败）。
     默认值 800。
     */
    private String statusCode;
    /**
     * errorCode
     * 错误码，为 product.module.code 三段式码。
     */
    private String errorCode;
    /**
     * message
     * 失败时的错误描述，一般为英文描述。
     */
    private String message;
    /**
     * description
     * 失败时的错误描述，一般为中文描述。
     */
    private String description;
    /**
     * returnObj
     * 启用的资源池信息。
     */
    private String returnObj;
    /**
     * error
     * 错误码，为product.module.code三段式码。请求成功时不返回该字段
     */
    private String error;

    /**
     * set statusCode
     * @param statusCode 返回状态码（800 为成功，900 为失败）。
     默认值 800。
     * @return this
     */
    public EcsDescribeRegionsRequestBody withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 错误码，为 product.module.code 三段式码。
     * @return this
     */
    public EcsDescribeRegionsRequestBody withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set message
     * @param message 失败时的错误描述，一般为英文描述。
     * @return this
     */
    public EcsDescribeRegionsRequestBody withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description 失败时的错误描述，一般为中文描述。
     * @return this
     */
    public EcsDescribeRegionsRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 启用的资源池信息。
     * @return this
     */
    public EcsDescribeRegionsRequestBody withReturnObj(String returnObj) {
        this.returnObj = returnObj;
        return this;
    }

    /**
     * set error
     * @param error 错误码，为product.module.code三段式码。请求成功时不返回该字段
     * @return this
     */
    public EcsDescribeRegionsRequestBody withError(String error) {
        this.error = error;
        return this;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
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

    public String getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(String returnObj) {
        this.returnObj = returnObj;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
