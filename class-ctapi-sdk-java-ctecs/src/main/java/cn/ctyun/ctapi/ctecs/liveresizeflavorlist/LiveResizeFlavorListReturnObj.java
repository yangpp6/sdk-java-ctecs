package cn.ctyun.ctapi.ctecs.liveresizeflavorlist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询云主机支持的热变配规格信息>
 * Entity: LiveResizeFlavorListReturnObj
 */
public class LiveResizeFlavorListReturnObj {
    /**
     * flavorList
     * 规格列表
     */
    private LiveResizeFlavorListFlavorList[] flavorList;

    /**
     * set flavorList
     * @param flavorList 规格列表
     * @return this
     */
    public LiveResizeFlavorListReturnObj withFlavorList(LiveResizeFlavorListFlavorList[] flavorList) {
        this.flavorList = flavorList;
        return this;
    }

    public LiveResizeFlavorListFlavorList[] getFlavorList() {
        return flavorList;
    }

    public void setFlavorList(LiveResizeFlavorListFlavorList[] flavorList) {
        this.flavorList = flavorList;
    }
}
