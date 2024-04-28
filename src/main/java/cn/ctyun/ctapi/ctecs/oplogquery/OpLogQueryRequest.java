package cn.ctyun.ctapi.ctecs.oplogquery;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询用户资源操作日志>
 * Request: OpLogQueryRequest
 */
public class OpLogQueryRequest extends CTRequest {
    public OpLogQueryRequest() {
        super("GET", "application/json", "/v4/op-log/query");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public OpLogQueryRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set product
     * @param product 查询的产品,默认compute,（compute主机，volume磁盘，network网络，monitor监控）
     * @return this
     */
    public OpLogQueryRequest withProduct(String product) {
        queryParam.put("product", product);
        return this;
    }

    /**
     * <Query param> set actionType
     * @param actionType 操作动作类型
     * @return this
     */
    public OpLogQueryRequest withActionType(String actionType) {
        queryParam.put("actionType", actionType);
        return this;
    }

    /**
     * <Query param> set action
     * @param action 操作动作
     * @return this
     */
    public OpLogQueryRequest withAction(String action) {
        queryParam.put("action", action);
        return this;
    }

    /**
     * <Query param> set delegateType
     * @param delegateType 委托类型，1表示获取所有用户操作,非1指获取用户自己的操作  。
     * @return this
     */
    public OpLogQueryRequest withDelegateType(String delegateType) {
        queryParam.put("delegateType", delegateType);
        return this;
    }

    /**
     * <Query param> set queryContent
     * @param queryContent 模糊查询<br />关联资源id，或者资源name或者操作日志id
     * @return this
     */
    public OpLogQueryRequest withQueryContent(String queryContent) {
        queryParam.put("queryContent", queryContent);
        return this;
    }

    /**
     * <Query param> set pageNo
     * @param pageNo 页码，默认1
     * @return this
     */
    public OpLogQueryRequest withPageNo(Integer pageNo) {
        queryParam.put("pageNo", pageNo);
        return this;
    }

    /**
     * <Query param> set pageSize
     * @param pageSize 每页数量，默认10
     * @return this
     */
    public OpLogQueryRequest withPageSize(Integer pageSize) {
        queryParam.put("pageSize", pageSize);
        return this;
    }
}
