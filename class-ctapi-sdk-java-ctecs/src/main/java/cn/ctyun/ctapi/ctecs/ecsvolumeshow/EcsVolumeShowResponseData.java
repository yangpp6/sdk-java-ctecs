package cn.ctyun.ctapi.ctecs.ecsvolumeshow;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询已将创建好的云硬盘>
 * Entity: EcsVolumeShowResponseData
 */
public class EcsVolumeShowResponseData {
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
    private EcsVolumeShowReturnObj returnObj;
    /**
     * errorCode
     * 业务细分码，为product.module.code三段式码，详见**错误码说明**
     */
    private String errorCode;

    /**
     * set statusCode
     * @param statusCode 返回状态码(800为成功，900为处理中或失败)
     * @return this
     */
    public EcsVolumeShowResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set message
     * @param message 失败时的错误描述，一般为英文描述
     * @return this
     */
    public EcsVolumeShowResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description 失败时的错误描述，一般为中文描述
     * @return this
     */
    public EcsVolumeShowResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 返回参数
     * @return this
     */
    public EcsVolumeShowResponseData withReturnObj(EcsVolumeShowReturnObj returnObj) {
        this.returnObj = returnObj;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 业务细分码，为product.module.code三段式码，详见**错误码说明**
     * @return this
     */
    public EcsVolumeShowResponseData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
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

    public EcsVolumeShowReturnObj getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(EcsVolumeShowReturnObj returnObj) {
        this.returnObj = returnObj;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
