package cn.ctyun.ctapi.ctecs.getcustomerquotas;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-用户配额查询>
 * Entity: GetCustomerQuotasReturnObj
 */
public class GetCustomerQuotasReturnObj {
    /**
     * quotas
     * 配额信息
     */
    private GetCustomerQuotasQuotas quotas;

    /**
     * set quotas
     * @param quotas 配额信息
     * @return this
     */
    public GetCustomerQuotasReturnObj withQuotas(GetCustomerQuotasQuotas quotas) {
        this.quotas = quotas;
        return this;
    }

    public GetCustomerQuotasQuotas getQuotas() {
        return quotas;
    }

    public void setQuotas(GetCustomerQuotasQuotas quotas) {
        this.quotas = quotas;
    }
}
