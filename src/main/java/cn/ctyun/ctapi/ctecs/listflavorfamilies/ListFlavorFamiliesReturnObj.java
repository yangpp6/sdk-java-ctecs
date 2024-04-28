package cn.ctyun.ctapi.ctecs.listflavorfamilies;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机规格族列表>
 * Entity: ListFlavorFamiliesReturnObj
 */
public class ListFlavorFamiliesReturnObj {
    /**
     * flavorFamilyList
     * 规格族列表
     */
    private String[] flavorFamilyList;

    /**
     * set flavorFamilyList
     * @param flavorFamilyList 规格族列表
     * @return this
     */
    public ListFlavorFamiliesReturnObj withFlavorFamilyList(String[] flavorFamilyList) {
        this.flavorFamilyList = flavorFamilyList;
        return this;
    }

    public String[] getFlavorFamilyList() {
        return flavorFamilyList;
    }

    public void setFlavorFamilyList(String[] flavorFamilyList) {
        this.flavorFamilyList = flavorFamilyList;
    }
}
