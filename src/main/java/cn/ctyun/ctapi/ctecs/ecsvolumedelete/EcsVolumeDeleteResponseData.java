package cn.ctyun.ctapi.ctecs.ecsvolumedelete;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-释放一块按量付费云硬盘>
 * Entity: EcsVolumeDeleteResponseData
 */
public class EcsVolumeDeleteResponseData {
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
    private EcsVolumeDeleteReturnObj returnObj;
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
    public EcsVolumeDeleteResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set message
     * @param message 失败时的错误描述，一般为英文描述
     * @return this
     */
    public EcsVolumeDeleteResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description 失败时的错误描述，一般为中文描述
     * @return this
     */
    public EcsVolumeDeleteResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 返回参数
     * @return this
     */
    public EcsVolumeDeleteResponseData withReturnObj(EcsVolumeDeleteReturnObj returnObj) {
        this.returnObj = returnObj;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 业务细分码，为product.module.code三段式码，详见**错误码说明**
     * @return this
     */
    public EcsVolumeDeleteResponseData withErrorCode(String errorCode) {
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

    public EcsVolumeDeleteReturnObj getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(EcsVolumeDeleteReturnObj returnObj) {
        this.returnObj = returnObj;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
