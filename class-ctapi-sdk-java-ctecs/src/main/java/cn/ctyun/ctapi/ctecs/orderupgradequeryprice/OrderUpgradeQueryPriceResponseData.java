package cn.ctyun.ctapi.ctecs.orderupgradequeryprice;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-升级订单询价(根据资源uuid查询)>
 * Entity: OrderUpgradeQueryPriceResponseData
 */
public class OrderUpgradeQueryPriceResponseData {
    /**
     * statusCode
     * 返回状态码(800为成功，900为失败)
     */
    private Integer statusCode;
    /**
     * errorCode
     * 具体错误码标志
     */
    private String errorCode;
    /**
     * message
     * 失败时的错误信息
     */
    private String message;
    /**
     * description
     * 失败时的错误描述
     */
    private String description;
    /**
     * returnObj
     * 成功时返回的数据，参见returnObj对象结构
     */
    private OrderUpgradeQueryPriceReturnObj returnObj;
    /**
     * error
     * 错误码，为product.module.code三段式码。请求成功时不返回该字段
     */
    private String error;

    /**
     * set statusCode
     * @param statusCode 返回状态码(800为成功，900为失败)
     * @return this
     */
    public OrderUpgradeQueryPriceResponseData withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set errorCode
     * @param errorCode 具体错误码标志
     * @return this
     */
    public OrderUpgradeQueryPriceResponseData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * set message
     * @param message 失败时的错误信息
     * @return this
     */
    public OrderUpgradeQueryPriceResponseData withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * set description
     * @param description 失败时的错误描述
     * @return this
     */
    public OrderUpgradeQueryPriceResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set returnObj
     * @param returnObj 成功时返回的数据，参见returnObj对象结构
     * @return this
     */
    public OrderUpgradeQueryPriceResponseData withReturnObj(OrderUpgradeQueryPriceReturnObj returnObj) {
        this.returnObj = returnObj;
        return this;
    }

    /**
     * set error
     * @param error 错误码，为product.module.code三段式码。请求成功时不返回该字段
     * @return this
     */
    public OrderUpgradeQueryPriceResponseData withError(String error) {
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

    public OrderUpgradeQueryPriceReturnObj getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(OrderUpgradeQueryPriceReturnObj returnObj) {
        this.returnObj = returnObj;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
