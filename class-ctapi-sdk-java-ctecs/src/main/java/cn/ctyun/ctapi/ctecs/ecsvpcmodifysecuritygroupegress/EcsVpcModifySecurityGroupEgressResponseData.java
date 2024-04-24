package cn.ctyun.ctapi.ctecs.ecsvpcmodifysecuritygroupegress;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-修改安全组出方向规则描述>
 * Entity: EcsVpcModifySecurityGroupEgressResponseData
 */
public class EcsVpcModifySecurityGroupEgressResponseData {
    /**
     * statusCode
     * 返回状态码（800为成功，900为失败）
     */
    private Integer statusCode;
    /**
     * message
     * statusCode为900时的错误信息，英文
     */
    private String message;
    /**
     * description
     * statusCode为900时的错误信息，中文
     */
    private String description;
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
     * set statusCode
     * @param statusCode 返回状态码（800为成功，900为失败）
     * @return this
     */
    public EcsVpcModifySecurityGroupEgressResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set message
     * @param message statusCode为900时的错误信息，英文
     * @return this
     */
    public EcsVpcModifySecurityGroupEgressResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description statusCode为900时的错误信息，中文
     * @return this
     */
    public EcsVpcModifySecurityGroupEgressResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 错误码，为product.module.code三段式码
     * @return this
     */
    public EcsVpcModifySecurityGroupEgressResponseData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set error
     * @param error 错误码，为product.module.code三段式码
     * @return this
     */
    public EcsVpcModifySecurityGroupEgressResponseData withError(String error) {
        this.error = error;
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
}