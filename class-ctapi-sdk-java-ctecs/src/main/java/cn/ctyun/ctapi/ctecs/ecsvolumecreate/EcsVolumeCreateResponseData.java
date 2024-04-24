package cn.ctyun.ctapi.ctecs.ecsvolumecreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建一块按量付费或包年包月云硬盘>
 * Entity: EcsVolumeCreateResponseData
 */
public class EcsVolumeCreateResponseData {
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
     * returnObj
     * 返回参数
     */
    private EcsVolumeCreateReturnObj returnObj;
    /**
     * errorCode
     * 业务细分码，为product.module.code三段式码，详见**错误码说明**.
     */
    private String errorCode;
    /**
     * errorDetail
     * 错误明细。一般情况下，会对订单侧(bss)的云硬盘订单业务相关的错误做明确的错误映射和提升，有唯一对应的errorCode。其他订单侧(bss)的错误，以ebs.order.procFailed的errorCode统一映射返回，并在errorDetail中返回订单侧的详细错误信息
     */
    private EcsVolumeCreateErrorDetail errorDetail;

    /**
     * set statusCode
     * @param statusCode 返回状态码(800为成功，900为处理中或失败)
     * @return this
     */
    public EcsVolumeCreateResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set message
     * @param message 失败时的错误描述，一般为英文描述
     * @return this
     */
    public EcsVolumeCreateResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description 失败时的错误描述，一般为中文描述
     * @return this
     */
    public EcsVolumeCreateResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 返回参数
     * @return this
     */
    public EcsVolumeCreateResponseData withReturnObj(EcsVolumeCreateReturnObj returnObj) {
        this.returnObj = returnObj;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 业务细分码，为product.module.code三段式码，详见**错误码说明**.
     * @return this
     */
    public EcsVolumeCreateResponseData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set errorDetail
     * @param errorDetail 错误明细。一般情况下，会对订单侧(bss)的云硬盘订单业务相关的错误做明确的错误映射和提升，有唯一对应的errorCode。其他订单侧(bss)的错误，以ebs.order.procFailed的errorCode统一映射返回，并在errorDetail中返回订单侧的详细错误信息
     * @return this
     */
    public EcsVolumeCreateResponseData withErrorDetail(EcsVolumeCreateErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
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

    public EcsVolumeCreateReturnObj getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(EcsVolumeCreateReturnObj returnObj) {
        this.returnObj = returnObj;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public EcsVolumeCreateErrorDetail getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(EcsVolumeCreateErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
    }
}
