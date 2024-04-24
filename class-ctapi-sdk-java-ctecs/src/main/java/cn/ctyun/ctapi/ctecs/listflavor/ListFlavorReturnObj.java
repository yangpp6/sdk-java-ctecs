package cn.ctyun.ctapi.ctecs.listflavor;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个云主机规格资源>
 * Entity: ListFlavorReturnObj
 */
public class ListFlavorReturnObj {
    /**
     * flavorList
     * 规格列表
     */
    private ListFlavorFlavorList[] flavorList;

    /**
     * set flavorList
     * @param flavorList 规格列表
     * @return this
     */
    public ListFlavorReturnObj withFlavorList(ListFlavorFlavorList[] flavorList) {
        this.flavorList = flavorList;
        return this;
    }

    public ListFlavorFlavorList[] getFlavorList() {
        return flavorList;
    }

    public void setFlavorList(ListFlavorFlavorList[] flavorList) {
        this.flavorList = flavorList;
    }
}
