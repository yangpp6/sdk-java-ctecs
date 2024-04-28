package cn.ctyun.ctapi.ctecs.regioncustomerquotas;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-根据regionID查询用户配额>
 * Entity: RegionCustomerQuotasReturnObj
 */
public class RegionCustomerQuotasReturnObj {
    /**
     * quotas
     * 配额信息
     */
    private RegionCustomerQuotasQuotas quotas;

    /**
     * set quotas
     * @param quotas 配额信息
     * @return this
     */
    public RegionCustomerQuotasReturnObj withQuotas(RegionCustomerQuotasQuotas quotas) {
        this.quotas = quotas;
        return this;
    }

    public RegionCustomerQuotasQuotas getQuotas() {
        return quotas;
    }

    public void setQuotas(RegionCustomerQuotasQuotas quotas) {
        this.quotas = quotas;
    }
}
