package cn.ctyun.ctapi.ctecs.volumeattach;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <挂载云硬盘>
 * Entity: VolumeAttachResponseData
 */
public class VolumeAttachResponseData {
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
     * 返回参数
     */
    private VolumeAttachReturnObj returnObj;
    /**
     * error
     * 错误码，为product.module.code三段式码
     */
    private String error;

    /**
     * set statusCode
     * @param statusCode 返回状态码（800为成功，900为失败）
     * @return this
     */
    public VolumeAttachResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 错误码，为product.module.code三段式码
     * @return this
     */
    public VolumeAttachResponseData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set message
     * @param message 失败时的错误描述，一般为英文描述
     * @return this
     */
    public VolumeAttachResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description 失败时的错误描述，一般为中文描述
     * @return this
     */
    public VolumeAttachResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 返回参数
     * @return this
     */
    public VolumeAttachResponseData withReturnObj(VolumeAttachReturnObj returnObj) {
        this.returnObj = returnObj;
        return this;
    }

    /**
     * set error
     * @param error 错误码，为product.module.code三段式码
     * @return this
     */
    public VolumeAttachResponseData withError(String error) {
        this.error = error;
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

    public VolumeAttachReturnObj getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(VolumeAttachReturnObj returnObj) {
        this.returnObj = returnObj;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}