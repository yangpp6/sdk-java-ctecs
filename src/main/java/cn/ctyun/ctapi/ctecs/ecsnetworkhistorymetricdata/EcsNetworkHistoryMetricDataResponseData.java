package cn.ctyun.ctapi.ctecs.ecsnetworkhistorymetricdata;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询指定时间段内的网卡监控数据>
 * Entity: EcsNetworkHistoryMetricDataResponseData
 */
public class EcsNetworkHistoryMetricDataResponseData {
    /**
     * statusCode
     * 返回码状态(800为成功，900为失败)，默认值：800
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
     * 失败或成功时的描述，一般为英文描述
     */
    private String message;
    /**
     * msgDesc
     * 失败或成功时的描述，一般为中文描述
     */
    private String msgDesc;
    /**
     * returnObj
     * 返回参数，参考表returnObj
     */
    private EcsNetworkHistoryMetricDataReturnObj returnObj;

    /**
     * set statusCode
     * @param statusCode 返回码状态(800为成功，900为失败)，默认值：800
     * @return this
     */
    public EcsNetworkHistoryMetricDataResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 错误码，为product.module.code三段式码
     * @return this
     */
    public EcsNetworkHistoryMetricDataResponseData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set error
     * @param error 错误码，为product.module.code三段式码
     * @return this
     */
    public EcsNetworkHistoryMetricDataResponseData withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * set message
     * @param message 失败或成功时的描述，一般为英文描述
     * @return this
     */
    public EcsNetworkHistoryMetricDataResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set msgDesc
     * @param msgDesc 失败或成功时的描述，一般为中文描述
     * @return this
     */
    public EcsNetworkHistoryMetricDataResponseData withMsgDesc(String msgDesc) {
        this.msgDesc = msgDesc;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 返回参数，参考表returnObj
     * @return this
     */
    public EcsNetworkHistoryMetricDataResponseData withReturnObj(EcsNetworkHistoryMetricDataReturnObj returnObj) {
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

    public String getMsgDesc() {
        return msgDesc;
    }

    public void setMsgDesc(String msgDesc) {
        this.msgDesc = msgDesc;
    }

    public EcsNetworkHistoryMetricDataReturnObj getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(EcsNetworkHistoryMetricDataReturnObj returnObj) {
        this.returnObj = returnObj;
    }
}
