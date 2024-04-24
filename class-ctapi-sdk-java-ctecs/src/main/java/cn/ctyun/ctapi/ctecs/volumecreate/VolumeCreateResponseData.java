package cn.ctyun.ctapi.ctecs.volumecreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <创建一块按量付费或包年包月云硬盘>
 * Entity: VolumeCreateResponseData
 */
public class VolumeCreateResponseData {
    /**
     * statusCode
     * 返回状态码(800为成功，900为处理中或失败)
     */
    private Integer statusCode;
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
     * errorCode
     * 错误码，为product.module.code三段式码
     */
    private String errorCode;
    /**
     * errorDetail
     * 错误明细。一般情况下，会对订单侧(bss)的云硬盘订单业务相关的错误做明确的错误映射和提升，有唯一对应的errorCode。其他订单侧(bss)的错误，以ebs.order.procFailed的errorCode统一映射返回，并在errorDetail中返回订单侧的详细错误信息
     */
    private VolumeCreateErrorDetail errorDetail;
    /**
     * returnObj
     * 返回参数
     */
    private VolumeCreateReturnObj returnObj;
    /**
     * error
     * 错误码，为product.module.code三段式码
     */
    private String error;

    /**
     * set statusCode
     * @param statusCode 返回状态码(800为成功，900为处理中或失败)
     * @return this
     */
    public VolumeCreateResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set message
     * @param message 失败时的错误描述，一般为英文描述
     * @return this
     */
    public VolumeCreateResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description 失败时的错误描述，一般为中文描述
     * @return this
     */
    public VolumeCreateResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 错误码，为product.module.code三段式码
     * @return this
     */
    public VolumeCreateResponseData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set errorDetail
     * @param errorDetail 错误明细。一般情况下，会对订单侧(bss)的云硬盘订单业务相关的错误做明确的错误映射和提升，有唯一对应的errorCode。其他订单侧(bss)的错误，以ebs.order.procFailed的errorCode统一映射返回，并在errorDetail中返回订单侧的详细错误信息
     * @return this
     */
    public VolumeCreateResponseData withErrorDetail(VolumeCreateErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 返回参数
     * @return this
     */
    public VolumeCreateResponseData withReturnObj(VolumeCreateReturnObj returnObj) {
        this.returnObj = returnObj;
        return this;
    }

    /**
     * set error
     * @param error 错误码，为product.module.code三段式码
     * @return this
     */
    public VolumeCreateResponseData withError(String error) {
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

    public VolumeCreateErrorDetail getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(VolumeCreateErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
    }

    public VolumeCreateReturnObj getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(VolumeCreateReturnObj returnObj) {
        this.returnObj = returnObj;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
