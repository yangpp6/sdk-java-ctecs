package cn.ctyun.ctapi.ctecs.batchresetpassword;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量重置云主机密码>
 * Entity: BatchResetPasswordResponseData
 */
public class BatchResetPasswordResponseData {
    /**
     * statusCode
     * 返回状态码(800为成功，900为失败)
     */
    private Integer statusCode;
    /**
     * errorCode
     * 业务细分码，为product.module.code三段式码，详见**错误码说明**
     */
    private String errorCode;
    /**
     * error
     * 错误码，为product.module.code三段式码，详见**错误码说明**
     */
    private String error;
    /**
     * message
     * 失败时的错误描述，一般为英文描述
     */
    private String message;
    /**
     * description
     * 失败时的错误描述，一般为中文描述
     */
    private String description;
    /**
     * returnObj
     * 成功时返回的数据
     */
    private BatchResetPasswordReturnObj returnObj;

    /**
     * set statusCode
     * @param statusCode 返回状态码(800为成功，900为失败)
     * @return this
     */
    public BatchResetPasswordResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 业务细分码，为product.module.code三段式码，详见**错误码说明**
     * @return this
     */
    public BatchResetPasswordResponseData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set error
     * @param error 错误码，为product.module.code三段式码，详见**错误码说明**
     * @return this
     */
    public BatchResetPasswordResponseData withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * set message
     * @param message 失败时的错误描述，一般为英文描述
     * @return this
     */
    public BatchResetPasswordResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description 失败时的错误描述，一般为中文描述
     * @return this
     */
    public BatchResetPasswordResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 成功时返回的数据
     * @return this
     */
    public BatchResetPasswordResponseData withReturnObj(BatchResetPasswordReturnObj returnObj) {
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

    public BatchResetPasswordReturnObj getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(BatchResetPasswordReturnObj returnObj) {
        this.returnObj = returnObj;
    }
}
