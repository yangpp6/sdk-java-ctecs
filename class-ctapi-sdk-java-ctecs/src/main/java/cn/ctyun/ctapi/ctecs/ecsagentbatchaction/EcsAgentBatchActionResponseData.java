package cn.ctyun.ctapi.ctecs.ecsagentbatchaction;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <操作云主机监控插件>
 * Entity: EcsAgentBatchActionResponseData
 */
public class EcsAgentBatchActionResponseData {
    /**
     * statusCode
     * 返回状态码（800为成功，900为失败）
     */
    private Integer statusCode;
    /**
     * errorCode
     * 业务细分码，为product.module.code三段式码
     */
    private String errorCode;
    /**
     * error
     * 错误码，为product.module.code三段式码
     */
    private String error;
    /**
     * message
     * 失败或成功时的描述，一般为英文描述
     */
    private String message;
    /**
     * description
     * 失败或成功时的描述，一般为中文描述
     */
    private String description;
    /**
     * returnObj
     * 返回参数，参考表returnObj
     */
    private EcsAgentBatchActionReturnObj returnObj;

    /**
     * set statusCode
     * @param statusCode 返回状态码（800为成功，900为失败）
     * @return this
     */
    public EcsAgentBatchActionResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 业务细分码，为product.module.code三段式码
     * @return this
     */
    public EcsAgentBatchActionResponseData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set error
     * @param error 错误码，为product.module.code三段式码
     * @return this
     */
    public EcsAgentBatchActionResponseData withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * set message
     * @param message 失败或成功时的描述，一般为英文描述
     * @return this
     */
    public EcsAgentBatchActionResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description 失败或成功时的描述，一般为中文描述
     * @return this
     */
    public EcsAgentBatchActionResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 返回参数，参考表returnObj
     * @return this
     */
    public EcsAgentBatchActionResponseData withReturnObj(EcsAgentBatchActionReturnObj returnObj) {
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

    public EcsAgentBatchActionReturnObj getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(EcsAgentBatchActionReturnObj returnObj) {
        this.returnObj = returnObj;
    }
}
