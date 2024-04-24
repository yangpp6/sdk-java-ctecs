package cn.ctyun.ctapi.ctecs.regionlist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-资源池列表查询>
 * Entity: RegionListReturnObj
 */
public class RegionListReturnObj {
    /**
     * regionList
     * 资源池对象
     */
    private RegionListRegionList[] regionList;

    /**
     * set regionList
     * @param regionList 资源池对象
     * @return this
     */
    public RegionListReturnObj withRegionList(RegionListRegionList[] regionList) {
        this.regionList = regionList;
        return this;
    }

    public RegionListRegionList[] getRegionList() {
        return regionList;
    }

    public void setRegionList(RegionListRegionList[] regionList) {
        this.regionList = regionList;
    }
}
