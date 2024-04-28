package cn.ctyun.ctapi.ctecs.createbackuppolicy;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份策略>
 * Entity: CreateBackupPolicyResponseData
 */
public class CreateBackupPolicyResponseData {
    /**
     * statusCode
     * 返回状态码（800为成功，900为失败）
     */
    private Integer statusCode;
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
     * 错误信息的本地化描述（中文）
     */
    private String description;
    /**
     * returnObj
     * 返回对象
     */
    private CreateBackupPolicyReturnObj returnObj;

    /**
     * set statusCode
     * @param statusCode 返回状态码（800为成功，900为失败）
     * @return this
     */
    public CreateBackupPolicyResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 错误码，为product.module.code三段式码
     * @return this
     */
    public CreateBackupPolicyResponseData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set error
     * @param error 错误码，为product.module.code三段式码
     * @return this
     */
    public CreateBackupPolicyResponseData withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * set message
     * @param message 错误信息的英文描述
     * @return this
     */
    public CreateBackupPolicyResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description 错误信息的本地化描述（中文）
     * @return this
     */
    public CreateBackupPolicyResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 返回对象
     * @return this
     */
    public CreateBackupPolicyResponseData withReturnObj(CreateBackupPolicyReturnObj returnObj) {
        this.returnObj = returnObj;
        return this;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
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

    public CreateBackupPolicyReturnObj getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(CreateBackupPolicyReturnObj returnObj) {
        this.returnObj = returnObj;
    }
}
