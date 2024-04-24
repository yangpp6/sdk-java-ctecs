package cn.ctyun.ctapi.ctecs.ecsagentbatchdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询云主机监控插件信息>
 * Entity: EcsAgentBatchDetailsResponseData
 */
public class EcsAgentBatchDetailsResponseData {
    /**
     * statusCode
     * 返回码状态(800为成功，900为失败)，默认值：800
     */
    private Integer statusCode;
    /**
     * errorCode
     * 业务细分码，为product.module.code三段式码，详见错误码说明
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
    private EcsAgentBatchDetailsReturnObj returnObj;

    /**
     * set statusCode
     * @param statusCode 返回码状态(800为成功，900为失败)，默认值：800
     * @return this
     */
    public EcsAgentBatchDetailsResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 业务细分码，为product.module.code三段式码，详见错误码说明
     * @return this
     */
    public EcsAgentBatchDetailsResponseData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set error
     * @param error 错误码，为product.module.code三段式码
     * @return this
     */
    public EcsAgentBatchDetailsResponseData withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * set message
     * @param message 失败或成功时的描述，一般为英文描述
     * @return this
     */
    public EcsAgentBatchDetailsResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description 失败或成功时的描述，一般为中文描述
     * @return this
     */
    public EcsAgentBatchDetailsResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 返回参数，参考表returnObj
     * @return this
     */
    public EcsAgentBatchDetailsResponseData withReturnObj(EcsAgentBatchDetailsReturnObj returnObj) {
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

    public EcsAgentBatchDetailsReturnObj getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(EcsAgentBatchDetailsReturnObj returnObj) {
        this.returnObj = returnObj;
    }
}