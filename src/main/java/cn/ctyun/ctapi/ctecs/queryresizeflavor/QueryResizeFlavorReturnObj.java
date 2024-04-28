package cn.ctyun.ctapi.ctecs.queryresizeflavor;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机可变配的规格>
 * Entity: QueryResizeFlavorReturnObj
 */
public class QueryResizeFlavorReturnObj {
    /**
     * support
     * 规格是否支持，true表示支持变配到此规格
     */
    private Boolean support;

    /**
     * set support
     * @param support 规格是否支持，true表示支持变配到此规格
     * @return this
     */
    public QueryResizeFlavorReturnObj withSupport(Boolean support) {
        this.support = support;
        return this;
    }

    public Boolean getSupport() {
        return support;
    }

    public void setSupport(Boolean support) {
        this.support = support;
    }
}
